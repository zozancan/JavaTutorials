package LoopControlStatements;

public class ForLoop {

    public static void main(String[] args) {
        for (int x =0; x<10; x++) {
            System.out.println("Captain America!" +x);
        }

        //sample

        //use for-each style for on a two dimensional array.

        int sum =0;
        int nums [] [] = new int[3][5];

        //give nums some values
        for (int i = 0; i<3; i++)
            for (int j = 0; j<5; j++)
                nums[i][j] = (i+1)*(j+1);

            //use for-each for to display and sum the values
        for (int z[] : nums) {
            for (int y : z) {
                System.out.println("Value is: " +y);
                sum +=y;
            }
        }
        System.out.println("Summation: " + sum);
    }
}
