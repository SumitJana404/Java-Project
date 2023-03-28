import java.util.*;

class Mainmenu
{
    void menu()
    {    
          
        System.out.println("\n...MAIN MENU...");
        System.out.println("\n1.Convert Currency");
        System.out.println("\n2.Convert Temperature");
        System.out.println("\n3.Convert Distance");
        System.out.println("\n4.Exit");

        int choice=0;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Your Choice : ");
        choice=sc.nextInt();

        switch(choice)
        {
            case 1: CurrencySubMenu obj2=new CurrencySubMenu();
                    obj2.CurrSubMenu();
                break;

            case 2: TempeSubMenu obj3=new TempeSubMenu();
                    obj3.TSubMenu();
                break;

            case 3: DistanceSubMenu obj4=new DistanceSubMenu();
                    obj4.DsubMenu();
                break;

            case 4: System.exit(0);
                break;
            
            default:  System.out.println("Invalid Input!!!");
                break;
        }

    }

}



class CurrencySubMenu
{
    void CurrSubMenu()
    {
        int choice2=0; 
        System.out.println("\nWELCOME TO CURRENCY CONVERTER");
        System.out.println("\n1.Convert Rs To Dollar");
        System.out.println("\n2.Convert Rs To Pound");
        System.out.println("\n3.Convert Rs To Euro");
        System.out.println("\n4.Convert Rs To Dirham");
        System.out.println("\n5.Convert Rs To Mark");
        System.out.println("\n6.Convert Rs To Yen");
        System.out.println("\n7.Exit to Main Menu");


        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Choice : ");
        choice2=sc.nextInt();

        switch(choice2)
        {
            case 1: CurrencyCalculator obj5=new CurrencyCalculator();
                    obj5.todollar();
                    break;
            case 2: CurrencyCalculator obj6=new CurrencyCalculator();
                    obj6.toeuro();
                    break;
            case 3: CurrencyCalculator obj7=new CurrencyCalculator();
                    obj7.topound();
                    break;
            case 4: CurrencyCalculator obj8=new CurrencyCalculator();
                    obj8.todirham();
                    break;
            case 5: CurrencyCalculator obj9=new CurrencyCalculator();
                    obj9.tomark();
                    break;
            case 6: CurrencyCalculator obj10=new CurrencyCalculator();
                    obj10.toyen();
                    break;
            case 7: Mainmenu obj=new Mainmenu();
                    obj.menu();
                    break;
            
        }
    }
}

class CurrencyCalculator
{
   // 1 rupee=0.013 usd  1 rupee=0.010 Pound 1 rupee=0.012 Euro 1 rupee=0.048 Dirham 1 rupee=0.0234 Mark 1 rupee=1.54 yen
   void todollar()
   {
       Scanner sc=new Scanner(System.in);
       float dollar=0,rupee=0;
       System.out.println("Enter Rupees : ");
       rupee=sc.nextFloat();

       dollar=(float) (rupee*0.013);
       System.out.println("Dollar = : "+dollar);

   }
   void toeuro()
   {
       Scanner sc=new Scanner(System.in);
       float euro=0,rupee=0;
       System.out.println("Enter Rupees : ");
       rupee=sc.nextFloat();

       euro=(float) (rupee*0.010);
       System.out.println("Euro = : "+euro);
   }
   void topound()
   {
       Scanner sc=new Scanner(System.in);
       float pound=0,rupee=0;
       System.out.println("Enter Rupees : ");
       rupee=sc.nextFloat();

       pound=(float) (rupee*0.012);
       System.out.println("Pound = : "+pound);
   }
   void todirham()
   {
       Scanner sc=new Scanner(System.in);
       float dirham=0,rupee=0;
       System.out.println("Enter Rupees : ");
       rupee=sc.nextFloat();

       dirham=(float) (rupee*0.048);
       System.out.println("Dirham = : "+dirham);
   }
   void tomark()
   {
       Scanner sc=new Scanner(System.in);
        float mark=0,rupee=0;
        System.out.println("Enter Rupees : ");
        rupee=sc.nextFloat();

        mark=(float) (rupee*0.0234); 
       System.out.println("Mark = : "+mark);
   }
   void toyen()
   {
       Scanner sc=new Scanner(System.in);
       float yen=0,rupee=0;
       System.out.println("Enter Rupees : ");
       yen=sc.nextFloat();

       yen=(float) (rupee*1.54);
       System.out.println("Yen = : "+yen);
   }
}




class TempeSubMenu
{
    void TSubMenu()
    {
        int choice3=0;
        System.out.println("\nWELCOME TO TEMPERATURE CONVERTER");
        System.out.println("\n1.Centigrade TO Fahrenheit");
        System.out.println("\n2.Fahrenheit To Centigrade");
        System.out.println("\n3.Exit to Main Menu");

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Choice : ");
        choice3=sc.nextInt();

        switch(choice3)
        {
            case 1: Temperature_Converter obj11=new Temperature_Converter();
                    obj11.tofahren();
                    break;
            case 2: Temperature_Converter obj12=new Temperature_Converter();
                    obj12.tocelci();
                    break;
            case 3: Mainmenu obj=new Mainmenu();
                    obj.menu();
                    break;
        }

    }
}
class  Temperature_Converter
{
    //F=(C*9/5)+32
    //C=(F-32)*5/9
    void tofahren()
    {
       Scanner sc=new Scanner(System.in);
       float celcius=0,fahren=0;
       System.out.println("Enter Temperature in Celcius : ");
       celcius=sc.nextFloat();

       fahren=(celcius*9/5)+32;
       System.out.println("Fahrenheit = : "+fahren);

    }
    void tocelci()
    {
       Scanner sc=new Scanner(System.in);
       float celcius=0,fahren=0;
       System.out.println("Enter Temperature in Fahrenheit : ");
       fahren=sc.nextFloat();

       celcius=(fahren-32)*5/9;
       System.out.println("Celcius = : "+celcius);

    }

}



class DistanceSubMenu
{
    void DsubMenu()
    {
        int choice4=0;
        System.out.println("\nWELCOME TO DISTANCE CONVERTER");
        System.out.println("\n1.Yards To Feet");
        System.out.println("\n2.Miles to KM");
        System.out.println("\n3.KM to Meter");
        System.out.println("\n4.Meter to Centimeter");
        System.out.println("\n5.Exit to Main Menu");

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Choice : ");
        choice4=sc.nextInt();

        switch(choice4)
        {
            case 1:  DistConverter obj14=new DistConverter();
                     obj14.yard_to_feet();
                     break;

            case 2:  DistConverter obj15=new DistConverter();
                     obj15.miles_to_km();
                     break;

            case 3:   DistConverter obj16=new DistConverter();
                      obj16.km_to_meter();
                      break;

            case 4:   DistConverter obj17=new DistConverter();
                      obj17.meter_to_cm();
                      break;

            case 5: Mainmenu obj=new Mainmenu();
                    obj.menu();
                    break;
        }
    }
}
class DistConverter
{
    //1 yard=3 Feet //1 miles=1.609 //1 km =1000 Meter //1 meter=100 cm

    void yard_to_feet()
    {
       Scanner sc=new Scanner(System.in);
       int yard=0,feet=0;
       System.out.println("Enter Yard : ");
       yard=sc.nextInt();

       feet=(yard*3);
       System.out.println("Feet = : "+feet);

    }
    void miles_to_km()
    {
       Scanner sc=new Scanner(System.in);
       float miles=0,km=0;
       System.out.println("Enter Miles : ");
       miles=sc.nextFloat();

       km=(float) (miles*1.609);
       System.out.println("KM = : "+km);

    }
    void km_to_meter()
    {
       Scanner sc=new Scanner(System.in);
       int km=0,meter=0;
       System.out.println("Enter KM : ");
       km=sc.nextInt();

       meter=(km*1000);
       System.out.println("Feet = : "+meter);


    }
    void meter_to_cm()
    {
        Scanner sc=new Scanner(System.in);
        int mtr=0,cm=0;
        System.out.println("Enter Meter : ");
        mtr=sc.nextInt();
 
        cm=(mtr*100);
        System.out.println("Feet = : "+cm);

    }

}




class Converter
{
    public static void main(String args[])
    {
        Mainmenu obj=new Mainmenu();
        obj.menu();

        CurrencySubMenu obj2=new CurrencySubMenu();
        obj2.CurrSubMenu();
            CurrencyCalculator obj5=new CurrencyCalculator();
            obj5.todollar();
            CurrencyCalculator obj6=new CurrencyCalculator();
            obj6.toeuro();
            CurrencyCalculator obj7=new CurrencyCalculator();
            obj7.topound();
            CurrencyCalculator obj8=new CurrencyCalculator();
            obj8.todirham();
            CurrencyCalculator obj9=new CurrencyCalculator();
            obj9.tomark();
            CurrencyCalculator obj10=new CurrencyCalculator();
            obj10.toyen();

        TempeSubMenu obj3=new TempeSubMenu();
        obj3.TSubMenu();
            Temperature_Converter obj11=new Temperature_Converter();
            obj11.tocelci();
            Temperature_Converter obj12=new Temperature_Converter();
            obj12.tofahren();


        DistanceSubMenu obj4=new DistanceSubMenu();
        obj4.DsubMenu();
            DistConverter obj14=new DistConverter();
            obj14.yard_to_feet();
            DistConverter obj15=new DistConverter();
            obj15.miles_to_km();
            DistConverter obj16=new DistConverter();
            obj16.km_to_meter();
            DistConverter obj17=new DistConverter();
            obj17.meter_to_cm();
           


        
    }
}
