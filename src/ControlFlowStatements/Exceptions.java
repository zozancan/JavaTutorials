package ControlFlowStatements;

public class Exceptions {
    public static void main(String[] args) {


        // int[] myNumbers = {1, 2, 3};
        //System.out.println(myNumbers[8]); // error!
        //If an error occurs, we can use try...catch to catch the error and execute some code to handle it:

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[8]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}
