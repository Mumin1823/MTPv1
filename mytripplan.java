package mytripplan;
import java.util.Scanner;
public class mytripplan {
    public static void main(String[]args){
        System.out.println("Welcome to Vacation Planner!");
        yourinfo();
        travellingbudget();
        time();
        distance();
    }

    public static void yourinfo(){

        System.out.println("What is your name?");
        String name;
        Scanner input=new Scanner(System.in);
         name=input.next();
         System.out.println("Nice to meet you "+name+","+"Where are you travelling?");
         String place=input.next();
         System.out.println("Great! "+place+" sounds like a great trip");
        System.out.println("*****************************************************");

    }

    public static void travellingbudget(){

        System.out.println("How many days are you going to spend travelling?");
        Scanner spend=new Scanner(System.in);
        int days=spend.nextInt();
        System.out.println("How much money in USD,are you planning to spend on your trip?");
        int money=spend.nextInt();
        System.out.println("What is the three letter currency symbol for your travel destination?");
        String currency=spend.next();
        System.out.println("How many "+currency+" are there in 1 USD?");
        double rate=spend.nextDouble();

        int hours=days*24;
        int minutes=hours*60;
        double pds=money/days;
        double BDT=money*rate;
        double CBDT=BDT/days;
        System.out.println("If you are travelling for "+ days+" days that is the same as "+hours+" hours or "+minutes+" minutes");
        System.out.println("If you are going to spend $"+money+" USD that means per day you can spend up to $"+pds+" USD");
        System.out.println("Your total budgets in BDT is "+BDT+" BDT, which per day is "+CBDT+" BDT");
        System.out.println("*****************************************************");

    }
    public static void time(){

        System.out.println("What is the time difference,in hours,between your home and your destination?");
        Scanner time=new Scanner(System.in);
        int timedif=time.nextInt();
        System.out.println("That mean that when it is midnight at home it will be "+timedif+":00 in your travel destination and when it is noon at home it will be "+(timedif+12)+":00");
        System.out.println("*****************************************************");
    }
    public static void distance(){
        Scanner distance=new Scanner(System.in);
        System.out.println("What is the square distance country in km?");
        int areakm=distance.nextInt();
        double areamiles=areakm*0.386102158;
        System.out.println("In miles2 that is "+areamiles);
        System.out.println("*****************************************************");

    }

}
