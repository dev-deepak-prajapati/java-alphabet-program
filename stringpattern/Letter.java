/**
 *
 * This Program has been done by
 *
 * @author Hacker's Deepak Prajapati
 *
 */
package stringpattern;

public class Letter {

    public static void space() {
        for (int i = 1; i < 2; i++) {
            System.out.println();
        }
    }

    public static void A(int n) {
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

    public static void B(int n) {
        int i, j;
        int num = (n % 2 == 0) ? (num = n + 1) : (n);
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= num; j++) {
                if (j == 2 || i == 1 || (i == num / 2 + 1 && j != 1)
                        || i == num || j == num) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void C(int n) {
        int i, j;
        int num = (n % 2 == 0) ? (num = n + 1) : (n);
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= num; j++) {
                if (j == 1 || i == 1
                        || i == num) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void D(int n) {
        int i, j;
        int num = (n % 2 == 0) ? (num = n + 1) : (n);
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= num; j++) {
                if (j == 2 || i == 1 || i == num || j == num) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void E(int n) {
        int i, j;
        int num = (n % 2 == 0) ? (num = n + 1) : (n);
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= num; j++) {
                if (j == 1 || i == 1
                        || i == num || i == num / 2 + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void F(int n) {
        int i, j;
        int num = (n % 2 == 0) ? (num = n + 1) : (n);
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= num; j++) {
                if (j == 1 || i == 1
                        || i == num / 2 + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void G(int n) {
        int i, j;
        int num = (n % 2 == 0) ? (num = n + 1) : (n);
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= num; j++) {
                if (i == 1 || i == num || j == 1
                        || (j >= num / 2 + 1 && i == num / 2 + 1)
                        || (j == num && i >= num / 2 + 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void H(int n) {
        int i, j;
        int num = (n % 2 == 0) ? (num = n + 1) : (n);
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= num; j++) {
                if (j == 1 || j == num || i == num / 2 + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void I(int n) {
        int i, j;
        int num = (n % 2 == 0) ? (num = n + 1) : (n);
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= num; j++) {
                if (j == num / 2 + 1 || i == 1
                        || i == num) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void J(int n) {
        int i, j;
        int num = (n % 2 == 0) ? (num = n + 1) : (n);
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= num; j++) {
                if (j == num / 2 + 1 || i == 1
                        || (j == 1 && i >= num / 2 + 1)
                        || (i == num && j <= num / 2 + 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void K(int n) {
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

    public static void L(int n) {
        int i, j;
        int num = (n % 2 == 0) ? (num = n + 1) : (n);
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= num; j++) {
                if (i == num || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void M(int n) {
        int i, j;
        int num = (n % 2 == 0) ? (num = n + 1) : (n);
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= num; j++) {
                if (((i == j || i + j == num + 1) && i <= num / 2 + 1)
                        || j == num || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void N(int n) {
        int i, j;
        int num = (n % 2 == 0) ? (num = n + 1) : (n);
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= num; j++) {
                if (i == j || j == num || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void O(int n) {
        int i, j;
        int num = (n % 2 == 0) ? (num = n + 1) : (n);
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= num; j++) {
                if (i == 1 || i == num
                        || j == 1 || j == num) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void P(int n) {
        int i, j;
        int num = (n % 2 == 0) ? (num = n + 1) : (n);
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= num; j++) {
                if (j == 1 || i == 1 || i == num / 2 + 1
                        || (j == num && i <= num / 2 + 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void Q(int n) {
        int i, j, k;
        if (n < 6) {
            n = 6;
        }
        int num = (n % 2 == 0) ? (num = n + 1) : (n);
        for (i = 1; i <= num; i++) {
            k = num / 2 + 2;
            for (j = 1; j <= num; j++) {
                if (((j == 1 || j == num) && i < k) || i == 1 || i == k
                        || (j + 1 >= num / 2 + 1 && j == i)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void R(int n) {
        int i, j;
        int num = (n % 2 == 0) ? (num = n + 1) : (n);
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= num; j++) {
                if (j == 1 || i == 1 || i == num / 2 + 1
                        || (j == num && i <= num / 2 + 1)
                        || (j >= num / 2 + 1 && j == i)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void S(int n) {
        int i, j;
        int num = (n % 2 == 0) ? (num = n + 1) : (n);
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= num; j++) {
                if (i == 1 || i == num
                        || (j == 1 && i <= num / 2 + 1)
                        || (i == num / 2 + 1)
                        || (j == num && i >= num / 2 + 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void T(int n) {
        int i, j;
        int num = (n % 2 == 0) ? (num = n + 1) : (n);
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= num; j++) {
                if (j == num / 2 + 1 || i == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void U(int n) {
        int i, j;
        int num = (n % 2 == 0) ? (num = n + 1) : (n);
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= num; j++) {
                if (j == 1 || i == num || j == num) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void V(int n) {
        int i, j;
        int num = (n % 2 == 0) ? (num = n + 1) : (n);
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (j = num; j >= i; j--) {
                if (j == num || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void W(int n) {
        int i, j;
        int num = (n % 2 == 0) ? (num = n + 1) : (n);
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= num; j++) {
                if (((i == j || i + j == num + 1) && i >= num / 2 + 1)
                        || j == num || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void X(int n) {
        int i, j;
        int num = (n % 2 == 0) ? (num = n + 1) : (n);
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= num; j++) {
                if (i == j || i + j == num + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void Y(int n) {
        int i, j;
        int num = (n % 2 == 0) ? (num = n + 1) : (n);
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= num; j++) {
                if (((i == j || i + j == num + 1) && i <= num / 2 + 1)
                        || (j == num / 2 + 1 && i >= num / 2 + 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void Z(int n) {
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
