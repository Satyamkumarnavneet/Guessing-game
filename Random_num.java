package Project_p;
import java.util.Scanner;

public class Random_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userNumber = 0;
        int myNumber = (int)(Math.random()*100);
        do {
            System.out.print("Guess my number(1-100) : ");
            userNumber = sc.nextInt();
            if (userNumber == myNumber){
                System.out.println("WOWW....CORRECT NUMBER!!!");
                break;
            }
            else if (userNumber > myNumber){
                System.out.println("Your number is too large");
            }
            else {
                System.out.println("Your number is too small");
            }

        }while (userNumber >= 0);
        System.out.print("My number was : ");
        System.out.println(myNumber);

    }
}
