import java.util.Scanner;

public class Projectone {
    public static void main (String[]args){
        int MinsU, AccNmber;

        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your account number: ");
        AccNmber= sc.nextInt();

        System.out.println("Please enter the amount of minutes used");
        MinsU=sc.nextInt();

        System.out.print("Please choose the correct letter for your plan: \na: Regular \nb: Premium \n");
        String plan= sc.nextLine();
        char option= sc.nextLine().toUpperCase().toLowerCase(). charAt(0);

        switch (option) {
            case 'a'-> System.out.println("You chose the Regular plan.");
            case 'b'->System.out.println("You choose the Premium plan.");
            default->System.out.println("Error please type a for the regular plan OR b for the premium plan");

        }
        System.out.println(""+"");
        System.out.println("Account Number: "+AccNmber);
        System.out.println("Minutes used: "+MinsU);

    }

}
