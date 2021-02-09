import java.util.Scanner;

public class Projectone {


    public static void main (String[]args) {
        int MinsU = 0, AccNmber; //MinsU: Minutes used, AccNmber:Account number
        int PremExtMins; //Premium Extra Minutes
        int RegExtMins ; //Regular Extra Minutes
        double RegPMin=.20; //Regular per minutes (per cost of minutes over 50)
        double PremPMinD =.10;  //Premium per Minutes Daily
        double PremPMinN= .05; //Premium per Minutes Nights
        double TotCost=0; //Total Cost
        double TotPCost=0; //Total Premium Cost
        int RegMinsFree = 50;   // Regular Minutes
        int PremDMinsFree= 75; //Premium Daily Minutes Free
        int PremNMinsFree= 100; // Premium Night Minutes Free
        float RegCost = 10; //Regular Cost
        float PremCost = 25; //Premium Cost
        int DailyMin; // Daily Minutes

        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Please enter your account number: ");
        AccNmber = sc.nextInt();

        System.out.print("Please choose the correct letter for your plan: \na: Regular \nb: Premium \n");
        String plan= sc.nextLine();
        char option = sc.nextLine().toUpperCase().toLowerCase().charAt(0);

        switch (option) {
            case 'a' -> {
                System.out.println("You chose the Regular plan.");
                System.out.println("Please enter the amount of minutes service was used ");
                MinsU = sc.nextInt();
            }
            case 'b' ->
                System.out.println("You chose the Premium plan.");
            default -> System.out.println("Error please type a for the regular plan OR b for the premium plan");
        }



        if (option == 'a' && MinsU <= 50) {
            TotCost=RegCost;
            System.out.println(""+"");
            System.out.println("Account Number: " + AccNmber);
            System.out.println("You chose the Regular plan");
            System.out.println("The amount of minutes used: "+MinsU);
            System.out.println("The cost of your service is $"+TotCost);
        } else if (option == 'a') {
            RegExtMins = MinsU - RegMinsFree;
            TotCost = ((RegExtMins * RegPMin) + RegCost);
            System.out.println(""+"");
            System.out.println("Account Number: " + AccNmber);
            System.out.println("You chose the Regular plan");
            System.out.println("The amount of minutes used: "+MinsU);
            System.out.println("The cost of your service is $"+TotCost);
        }
        else
            System.out.println("What are the number of minutes the service was used during the day (6am-6pm) \n");
               DailyMin = sc.nextInt();
                System.out.println("What are the number of minutes the service was used during the night (6pm-6am) \n");
                int NightMin = sc.nextInt();


                if (DailyMin>75){
                    PremExtMins=DailyMin-PremDMinsFree;
                    TotPCost = ((PremExtMins * PremPMinD) + PremCost);
                    System.out.println("The total cost of your selected service is: " +TotPCost);
                }
                else if ( NightMin>100){
                PremExtMins=NightMin-PremNMinsFree;
                TotPCost = ((PremExtMins * PremPMinN) + PremCost);
                System.out.println("The total cost of your selected service is: " +TotPCost);
                }

                else if (DailyMin<=75 && NightMin<=100) {
                    TotPCost = PremCost;
                    System.out.println("The total cost of your service is: $" + TotPCost);
                }

                else if (DailyMin<=75 && NightMin>100){
                PremExtMins=NightMin-PremNMinsFree;
                TotPCost = ((PremExtMins * PremPMinN) + PremCost);
                System.out.println("The Total cost of your service is: "+TotPCost);
                 }

                else if (DailyMin>75 && NightMin<=100){
                PremExtMins=DailyMin-PremDMinsFree;
                TotPCost = ((PremExtMins * PremPMinD) + PremCost);
                System.out.println("The Total cost of your service is: "+TotPCost);
                }
                if (option=='b') {

                    System.out.println("" +
                            "");
                    System.out.println("Account Number: " + AccNmber);
                    System.out.println("Type of service: Premium");
                    MinsU = DailyMin + NightMin;
                    System.out.println("The amount of minutes used: " + MinsU);
                    System.out.println("The cost of your service is $" + TotPCost);
                }


            }
            catch(Exception ex){
            System.out.println(ex);
            }


    }


}









