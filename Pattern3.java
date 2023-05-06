package QUESTIONS.Patterns;

public class Pattern3 {
    public static void main(String[] args) {
        pattern3(5);
    }
    static void pattern3(int n) {
        for(int row = 1; row <= n; row++) {
            //for every row run the column
            for(int col = 0; col <= n - row; col++) { //or can use col <= n - row + 1 keeping col = 0 (or) can keep row = 0 and col = 1 ; col <= n - row
                System.out.print("* ");
            }
            //when one rwo is printed we need to add new line 
            System.out.println();
        }
        /*
         *  * * * * *
         *  * * * *
         *  * * *
         *  * *
         *  *
         */
    }
}
