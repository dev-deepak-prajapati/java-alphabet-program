/**
 *
 * This Program has been done by
 *
 * @author Hacker's Deepak Prajapati
 *
 */
package alphabetpattern;

import java.util.Scanner;

public class Q {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num: ");
        int n = sc.nextInt();
        int i, j, k;
        if(n<6){
            n=6;
        }
        int num = (n % 2 == 0) ? (num = n + 1) : (n);
        for (i = 1; i <= num; i++) {
            k = num / 2 + 2;
            for (j = 1; j <= num; j++) {
                if (((j == 1 || j == num)&& i<k) || i == 1 || i == k 
                        || (j + 1 >= num / 2 + 1 && j == i)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
