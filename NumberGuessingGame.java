import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
        static int at = 0;
        public static int inp(int n) {
            at++;
            if(at>10) {
                System.out.println("Defeat");
                return 1;
            }
            Scanner sc = new Scanner(System.in);
            System.out.print("Guess the number between 0 to 100: ");
            int x = sc.nextInt();
            check(x, n);
            return 0;
        }

        public static void check(int x, int n) {

            if(x==n) {
                System.out.println("Victory");
            }
            else if(x<n) {
                System.out.println("Guessed number is less than random number");
                if(10-at>0) {
                    System.out.println(10-at +" trials left");
                }
                else {
                    System.out.println("No trials left");
                }
                inp(n);
            }
            else if(x>n) {
                System.out.println("Guessed number is greater than random number");
                if(10-at>0) {
                    System.out.println(10-at +" trials left");
                }
                else {
                    System.out.println("No trials left");
                }
                inp(n);
            }
        }

        public static void main(String[] args) {
            Random s = new Random();
            int n = s.nextInt(100);
            inp(n);
        }
}
