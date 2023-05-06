package QUESTIONS.Patterns;

public class Pattern4 {
    public static void main(String[] args) {
        pattern4(5);
    }
    static void pattern4(int n) {
        for(int row = 1; row <= n; row++) {
            //for every row run the column
            for(int col = 1; col <= row; col++) { //or can use col <= n - row + 1 keeping col = 0 (or) can keep row = 0 and col = 1 ; col <= n - row
                System.out.print(col + " ");
            }
            //when one row is printed we need to add new line 
            System.out.println();
        }
        /*
         *  1 
         *  1 2
         *  1 2 3
         *  1 2 3 4
         *  1 2 3 4 5
         */
    }
}
