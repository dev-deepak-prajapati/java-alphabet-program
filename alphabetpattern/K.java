/**
 *
 * This Program has been done by
 *
 * @author Hacker's Deepak Prajapati
 *
 */
package alphabetpattern;

import java.util.Scanner;

public class K {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num: ");
        int n = sc.nextInt();
        int i, j, k, l;
        int num = (n % 2 == 0) ? (num = n + 1) : (n);
        for (i = 1; i <= num; i++) {
            k = num / 2 + 1;
            l = num / 2 + 1;
            for (j = 1; j <= num; j++) {
                if (j == 1 || (k + 1 == i) || (l - 1 == i)
                        || (j >= (k + (num / 2) + 1) 
                        && (i == 1 || i == num))) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                k--;
                l++;
            }
            System.out.println("");
        }
    }
}
