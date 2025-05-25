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
        System.out.println("")






  

