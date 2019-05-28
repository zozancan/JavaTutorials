package ControlFlowStatements;

public class Switch {
    public static void main(String[] args) {

        //example

         int day =3;
         switch (day) {
             case 1:
                 System.out.println("Monday!");
                 break;
             case 2:
                 System.out.println("Tuesday!");
                 break;
             case 3:
                 System.out.println("Wednesday!");
                 break;
             case 4:
                 System.out.println("Thursday!");
                 break;
             case 5:
                 System.out.println("Friday!");
                 break;
             case 6:
                 System.out.println("Saturday!");
                 break;
             case 7:
                 System.out.println("Sunday!");
                 break;
         }

        //example

        for (int i=0; i<6; i++) {
            switch (i) {
                case 0:
                    System.out.println("i is zero.");
                    break;
                case 1:
                    System.out.println("i is one.");
                    break;
                case 2:
                    System.out.println("i is two");
                    break;
                case 3:
                    System.out.println("i is three.");
                    break;
                    default:
                        System.out.println("i is greater than 3.");
            }
        }


        //example

        int month = 4;
        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
                default:
                    season = "Bogus Month";
        }
        System.out.println("April is in the " + season + ".");
    }
}
