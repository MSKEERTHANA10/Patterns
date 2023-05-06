package QUESTIONS.Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        pattern5(5);
    }
    static void pattern5(int n) {
        int count = 1;
        // runs 151 steps
        for(int row = 1; row < 2 * n; row++) {
            //for every row run the column
            if(row > n) {
                for(int col = 1; col <= n - count; col++) { //or can use col <= n - row + 1 keeping col = 0 (or) can keep row = 0 and col = 1 ; col <= n - row
                    System.out.print("* ");
                }
                count += 1;
            }
            if(row <= n)
            for(int col = 1; col <= row; col++) { //or can use col <= n - row + 1 keeping col = 0 (or) can keep row = 0 and col = 1 ; col <= n - row
                System.out.print("* ");
            }
            //when one row is printed we need to add new line 
            System.out.println();      
        }
        
        /*
         *    * 
         *    * * 
         *    * * * 
         *    * * * * 
         *    * * * * * 
         *    * * * *
         *    * * *
         *    * *
         *    *
         */
    }
    static void pattern5new(int n) {
        //runs 143 steps
        for(int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for(int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
