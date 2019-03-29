package LoopControlStatements;

public class BreakContinue {

    public static void main(String[] args) {

        for (int number = 0; number < 10; number++) {
            if (number == 5) {
                break;
            }
            System.out.print(number);
        }
        System.out.println("");
        System.out.println("example 2 :");

        for (int number2 = 0; number2 < 10; number2++) {
            if (number2 == 5) {
                continue;
            }
            System.out.print(number2);
        }
    }

}
