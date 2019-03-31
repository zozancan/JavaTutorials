package Arrays;

public class Arrays {
    public static void main(String[] args) {

        //Access the Elements of an Array
        String[] flowers = {"Lily", "Jasmine", "Daisy", "Rose"};
        System.out.println(flowers[0])
        // Outputs Lily

        //Change an Array Element
        String[] flowers = {"Lily", "Jasmine", "Daisy", "Rose"};
        flowers[0] = "Poppy";
        System.out.println(flowers[0]);
        // Now outputs Poppy instead of Lily

        //Array Length
        String[] flowers = {"Lily", "Jasmine", "Daisy", "Rose"};
        System.out.println(flowers.length);
        // Outputs 4

        //Multidimensional Arrays
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        int x = myNumbers[1][2];
        System.out.println(x); // Outputs 7

        //Example
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }

        }
    }
}


