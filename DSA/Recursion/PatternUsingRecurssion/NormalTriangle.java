package DSA.Recursion.PatternUsingRecurssion;

/*
*
**
***
****
*****
*/
public class NormalTriangle {
    public static void main(String[] args) {
        triangle(5, 0);
    }

    static void triangle(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            triangle(row, col + 1);
            System.out.print("* ");
        } else {
            triangle(--row, 0);
            System.out.println();
        }
    }
}
