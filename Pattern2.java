package QUESTIONS.Patterns;
/* patterns are important bcoz it improves thought process
 * prerequistes 
 * -> loops
 * tricks -> how to approach a prob
 *  -> STEP 1: run outer for loop the no of times you are having lines
 *   -> i.e no of lines = no of rows = now of times the outer loop will run  
 *  -> STEP 2 : how many columns are there at each row 
 *   -> identify for every row no check how many colums are there or types of element in column
 *  -> STEP 3 : what you need to print
*/

public class Pattern2 {
    public static void main(String[] args) {
        pattern2(4);
    }
    static void pattern2(int n) {
        for(int row = 1; row <= n; row++) {
            //for every row run the column
            for(int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            //when one rwo is printed w543e need to add new line 
            System.out.println();
        }
        /*
         *  *
         *  * *
         *  * * *
         *  * * * *
         */
        
    }
    
}
