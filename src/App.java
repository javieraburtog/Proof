import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter the interest rate: ");
        double interestRate = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        double numYears = scanner.nextDouble();

        double monthlyInterest = interestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterest * Math.pow((1 + monthlyInterest), numYears) / (Math.pow((1 + monthlyInterest), numYears) - 1);

        System.out.println("The monthly payment is: " + monthlyPayment);

        System.out.println("Javier, June 2024");

        System.out.println("Javier, June 2024 , 11111");
        System.out.println("Javier, August 2024");


    }


}
