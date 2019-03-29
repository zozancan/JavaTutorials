package ControlFlowStatements;

public class IfElse {

    public static void main(String[] args) {

        //First example
        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        }


       //Second example
        int number = -37;

        if (number>0) {
            System.out.println("Positive number!");
        } else {
            System.out.println("Negative number!");
        }


        //Third example
        int not=1;

        if (not>=0 && not<20) {
            System.out.println("Bad!");
        } else if (not>=20 && not<40) {
            System.out.println("Not bad!");
        } else if (not>=40 && not<60) {
            System.out.println("Middle!");
        } else {
            System.out.println("Awesome!");
        }

    }
}
