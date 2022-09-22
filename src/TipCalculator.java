// imports
import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculator {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    DecimalFormat formatter = new DecimalFormat("#.##");

    // Greeting and # of people with tip percentage
    System.out.println("Welcome to the tip calculator!");
    System.out.print("How many people are in your group? ");
    int numPeople = scan.nextInt();
    scan.nextLine();
    System.out.print("What is the tip percentage? (0-100): ");
    double tipPercent = scan.nextDouble();
    scan.nextLine();

    // costs in dollars and cents until -1 is entered
    double noTipBill = 0;
    double dishCost = 0;
    while (dishCost >= 0) {
        System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
        dishCost = scan.nextDouble();
        if (dishCost >= 0) {
            noTipBill += dishCost;
        }
        scan.nextLine();
    }

    // stored variables used in final prints
    double totalTip = .01 * tipPercent * noTipBill;
    double totalBill = totalTip + noTipBill;
    double perPersonNoTip = noTipBill / numPeople;
    double perPersonTip = totalTip / numPeople;
    double perPersonBill = totalBill / numPeople;

    // final prints using DecimalFormat
    System.out.println("------------------------------------");
    System.out.println("Total Bill Before Tip: $" + formatter.format(noTipBill));
    System.out.println("Tip Percentage: $" + formatter.format(tipPercent));
    System.out.println("Total Tip: $" + formatter.format(totalTip));
    System.out.println("Total Bill With Tip: $" + formatter.format(totalBill));
    System.out.println("Per Person Cost Before Tip: $" + formatter.format(perPersonNoTip));
    System.out.println("Tip Per Person: $" + formatter.format(perPersonTip));
    System.out.println("Total Cost Per Person: $" + formatter.format(perPersonBill));

    }
}
