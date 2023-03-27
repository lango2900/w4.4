import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a number between 1 and 100.");

        int n = scan.nextInt();

        if (n >= 1 && n <= 100) {

            System.out.println("Your number was:" + n);
        } else {
            System.out.println("you did not follow the rules!!!!!");
            return;
        }

        if (n % 3 == 0) {
            System.out.println("Triple");
        }  if (n % 5 == 0) {
            System.out.println("Pentagon");
        }  if (n % 5 == 0 && n % 3 == 0) {
            System.out.println("Fifteen");
        }

    }

}


