/**
 *
 * This Program has been done by
 *
 * @author Hacker's Deepak Prajapati
 *
 */
package alphabetpattern;

import java.util.Scanner;

public class Z {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num: ");
        int n = sc.nextInt();
        int i, j;
        int num = (n % 2 == 0) ? (num = n + 1) : (n);
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= num; j++) {
                if (i == 1 || i == num
                        || i + j == num + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
