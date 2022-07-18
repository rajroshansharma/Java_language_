import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.*;
import java.lang.Math;

//-------My Exception-------

//customer id not found exception
class InvalidCustomerIdException extends Exception{
    public InvalidCustomerIdException(String msg){
        super(msg);
    }
}

//insufficient balance exception
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String msg){
        super(msg);
    }
}

//Transaction failed exception
class TransactionFailedException extends Exception{
    public TransactionFailedException(String msg){
        super(msg);
    }
}


public class Banking_System {

//  Main Method
    public static void main(String[] args) {
        int loginID = 4578;
        boolean var2;
        System.out.println("Please login :475444");
//      calling the method which returns true if transaction successful else false.
        var2 = payTo(1025,1024); //1025 is sender , 1024 is receiver

        if(var2){
            System.out.println("Transaction Successful!");
            System.out.println("Transaction details saved successfully.");
        }
        else {
            System.out.println("Transaction Failed!");
        }
    }

//  paying method
    public static boolean payTo(int fromCustId, int toCustId){
        Scanner in = new Scanner(System.in); // Creating a input object.

        // Sender's and receiver's balance
        int fromBal = 0;
        int toBal = 0;

        try {
            boolean validToId = false; //Becomes true we found the receiver's id in db;
            boolean validFromId = false; //Becomes true we found the sender's id in db;
            boolean transferableAmt = false; // Becomes true when transferring amount is less than the available balance.

            //getting connections
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_banking_system","root","macraj123");
            Statement stm = con.createStatement();
            ResultSet re = stm.executeQuery("select * from bankcustomer");

            //validating the customer id.
            while (re.next()){
                int id = re.getInt("cust_id");
                if(id == toCustId){
                    validToId = true;
                    toBal = re.getInt("cust_balance"); // Getting the balance of that particular customer(receiver)

                }
                if (id == fromCustId){
                    validFromId = true;
                    fromBal = re.getInt("cust_balance"); // Getting the balance of that particular customer(sender)
                }
            }

//          checking if both the customer id is correct.
            if (!(validToId && validFromId)){
                throw new InvalidCustomerIdException("InvalidCustomerIdException");
            }

//          taking input amount to be transferred
            int amt = 0;
            System.out.println("Enter the amount to transfer");
            amt = in.nextInt();

//          Checking if the sender's account have the balance
            try{
                if (amt > fromBal){
                    throw new InsufficientBalanceException("InsufficientBalanceException");
                }
                else {
                    transferableAmt = true;
                }
            }
            catch (Exception InsufficientBalanceException){
                InsufficientBalanceException.printStackTrace(); //prints the errors
                return false;
            }

//          Steps Making transaction
            /*
            * 1. subtracting amt from customer & adding amt to customer
            * 2. using a sql query to update the changes in the database*/
            fromBal = fromBal - amt; // subtracting the amount from sender's account.
            toBal = toBal + amt; //adding the amount to receiver's account.

            //Transaction management system(updating part)
            try{
                String updateFromRecord = "UPDATE bankcustomer SET cust_balance = " + fromBal + " WHERE cust_id = "+fromCustId+";";
                String updateToRecord = "UPDATE bankcustomer SET cust_balance = " + toBal + " WHERE cust_id = "+toCustId+";";

                stm.executeUpdate(updateToRecord);
                stm.executeUpdate(updateFromRecord);
            }
            catch(Exception TransactionFailedException){
                TransactionFailedException.printStackTrace();
                con.rollback();
                return false;
            }
            finally {
                //Updating the transaction details table.
                boolean send_details_saved = false;
                boolean receive_details_saved = false;
                //updating the transaction details table in perspective of senders.
                send_details_saved = updateTransactionTable(fromCustId, 0, amt, true);

                //updating the transaction details table in perspective of receiver.
                receive_details_saved = updateTransactionTable(toCustId, amt, 0, true);

                //Release all the resources
                con.close();
            }


        }
        catch (Exception InvalidCustomerIdException){
//            System.out.println(InvalidCustomerIdException);
            return false;
        }
        return true;
    }

//  method for updating the transaction table
    public static boolean updateTransactionTable(int cust_id,int amt_credit, int amt_debit, boolean status){
        //generating transaction id
        String trans_id = "BAR";
        int min = 200;
        int max = 800;
        int b = (int)(Math.random()*(max-min+1)+min); //using random method
        String b_ran = Integer.toString(b);
        trans_id = trans_id + b_ran; // transaction id is here

        //generating date
        Date d=new Date();
        String trans_date = d.toString(); // date is here

        ////checking if the transaction details are saved or not printing the message.
        boolean details_saved = false;

        try{
            //getting connections
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_banking_system","root","macraj123");

            //creating a prepared statement and a firing sql query.
            String sql_insert_query = "INSERT INTO transactiondetailes VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement psmt = con.prepareStatement(sql_insert_query);

            //validating / changing values according to the scenario and inserting the value.
            psmt.setInt(1, cust_id);
            psmt.setString(2, trans_id);
            psmt.setInt(3, amt_credit);
            psmt.setInt(4, amt_debit);
            psmt.setString(5, trans_date);
            psmt.setString(6,"India");
            psmt.setString(7, "Transfer");
            psmt.setString(8, "success");

            //firing the query with the values.
            psmt.executeUpdate();

            //confirming transaction details updated successfully
            details_saved = true;

            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

        return false;
    }


}

