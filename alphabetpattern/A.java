/**
 *
 * This Program has been done by
 *
 * @author Hacker's Deepak Prajapati
 *
 */
package alphabetpattern;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num: ");
        int n = sc.nextInt();
        int i, j;
        int num = (n % 2 == 0) ? (num = n + 1) : (n);
        for (i = 1; i <= num; i++) {
            for (j = num; j >= i; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                if (j == 1 || i == num / 2 + 2 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
