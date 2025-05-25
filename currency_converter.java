importjava.util.Scanner;
public class currency_converter{
  Run|Debug
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      System.out.println(x:"Welcome to Currency Converter!");
      System.out.println(x:"1. USD to Rupee");
      System.out.println(x:"2. Rupee to USD");
      System.out.println(x:"3. Euro to Rupee");
      System.out.println(x:"4. Rupee to Euro");
      System.out.println(s:"Enter your choice (1 or 2 or 3 or 4): ");
    int choice = scanner.nextInt();

    if (choice == 1) {
        System.out.println(s:"Enter the amount in USD: ");
      double USD = scanner.nextDouble();
      double Rupee = usdToRupee(USD);
        System.out.println("Converted amount in Rupee: " + Rupee);
    } else if (choice == 2) {
        System.out.println(s:"Enter the amount in Rupee: ");
      double Rupee = scanner.nextDouble();
      double USD = RupeeToUsd(Rupee);
  System.out.println("Converted amount in USD: " +USD);
    }

    else if (choice == 3) {
        System.out.println(s:"Enter the amount inEURO: ");
      double EURO= scanner.nextDouble();
      double Rupee = euroToRupee(EURO);
        System.out.println("Converted amount in USD: " +Rupee);
    }
    else if (choice == 4) {
        System.out.println(s:"Enter the amount in Rupee: ");
      dpuble Rupee = scanner.nextDouble();
      double EURO = RupeeToEURO(Rupee);
        System.out.println("Converted amount in USD: " +EURO);
    }
    else {
        System.out.println(x:"Invalid choice. Please select 1 or 2 or 3 or 4.");
    }
    scanner.close();
  }
  public static double usdToRupee(double USD) {
    return USD * 83.47;  //Date: 01/05/25
  }
    public static double RupeeToUsd(double Rupee) {
return Rupee * 0.0119804;  //Date: 01/05/2025
    }
    public static double euroToRupee(double EURO) {
return EURO *89.10;  //Date: 01/05/25
    }
  public static double RupeeToEuro(double Rupee) {
    return Rupee *0.0113;  //Date: 01/05/25
  }
}




  

