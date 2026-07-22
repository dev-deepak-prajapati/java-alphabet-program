/**
 *
 * This Program has been done by
 *
 * @author Hacker's Deepak Prajapati
 *
 */
package stringpattern;

import java.util.Scanner;

public class StringsPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine().trim().toUpperCase();
        int patternSize = 6;
        for (char ch : str.toCharArray()) {
            switch (ch) {
                case ' ':
                    Letter.space();
                    Letter.space();
                    Letter.space();
                    break;
                case 'A':
                    Letter.A(patternSize);
                    Letter.space();
                    break;
                case 'B':
                    Letter.B(patternSize);
                    Letter.space();
                    break;
                case 'C':
                    Letter.C(patternSize);
                    Letter.space();
                    break;
                case 'D':
                    Letter.D(patternSize);
                    Letter.space();
                    break;
                case 'E':
                    Letter.E(patternSize);
                    Letter.space();
                    break;
                case 'F':
                    Letter.F(patternSize);
                    Letter.space();
                    break;
                case 'G':
                    Letter.G(patternSize);
                    Letter.space();
                    break;
                case 'H':
                    Letter.H(patternSize);
                    Letter.space();
                    break;
                case 'I':
                    Letter.I(patternSize);
                    Letter.space();
                    break;
                case 'J':
                    Letter.J(patternSize);
                    Letter.space();
                    break;
                case 'K':
                    Letter.K(patternSize);
                    Letter.space();
                    break;
                case 'L':
                    Letter.L(patternSize);
                    Letter.space();
                    break;
                case 'M':
                    Letter.M(patternSize);
                    Letter.space();
                    break;
                case 'N':
                    Letter.N(patternSize);
                    Letter.space();
                    break;
                case 'O':
                    Letter.O(patternSize);
                    Letter.space();
                    break;
                case 'P':
                    Letter.P(patternSize);
                    Letter.space();
                    break;
                case 'Q':
                    Letter.Q(patternSize);
                    Letter.space();
                    break;
                case 'R':
                    Letter.R(patternSize);
                    Letter.space();
                    break;
                case 'S':
                    Letter.S(patternSize);
                    Letter.space();
                    break;
                case 'T':
                    Letter.T(patternSize);
                    Letter.space();
                    break;
                case 'U':
                    Letter.U(patternSize);
                    Letter.space();
                    break;
                case 'V':
                    Letter.V(patternSize);
                    Letter.space();
                    break;
                case 'W':
                    Letter.W(patternSize);
                    Letter.space();
                    break;
                case 'X':
                    Letter.X(patternSize);
                    Letter.space();
                    break;
                case 'Y':
                    Letter.Y(patternSize);
                    Letter.space();
                    break;
                case 'Z':
                    Letter.Z(patternSize);
                    Letter.space();
                    break;
            }
        }
    }
}
