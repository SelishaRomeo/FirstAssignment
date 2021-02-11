import java.util.Random;
import java.util.Scanner;

public class QuestionTwo {
    public static void main (String[]args) {

        Random ran = new Random();
        int rannum = ran.nextInt(101);
        int num;
        int count = 0;
        int limit = 5;
        Scanner sc = new Scanner(System.in);



            do {
                System.out.println("Please input number: ");
                num = sc.nextInt();
                count++;

                if (rannum == num) {
                    System.out.println("Congratulations!!! You won :>)");
                    break;
                } else if (rannum > num) {
                    System.out.println("The number is higher");
                } else
                    System.out.println("The number is lower");
            }while(count<limit);

            if (count==limit&&rannum!=num){
            System.out.println("You Lose. Please try again");
            }

    }
}
