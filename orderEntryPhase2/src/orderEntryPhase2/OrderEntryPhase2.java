// Jaden Martin, CIS406, Course Project Phase 2
package orderEntryPhase2;
import java.util.Scanner;

public class OrderEntryPhase2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter item number (alphanumeric): ");		
		String itemNumber = scanner.nextLine();
		
		System.out.print("Enter item description (alphanumeric): ");	
		String itemDescription = scanner.nextLine();
		
		System.out.print("Enter the item price (decimal): ");		
		double itemPrice = scanner.nextDouble();
		
		System.out.print("Enter quantity ordered (integer): ");		
		int quantityOrdered = scanner.nextInt();
		
		double grossAmount = itemPrice * quantityOrdered;
		System.out.printf("Gross Amount: %.2f\n", grossAmount);
		
		System.out.print("Enter the tax percentage for the item (decimal): ");
		double taxPercent = scanner.nextDouble();
		
		double taxAmount = grossAmount * (taxPercent / 100);
		System.out.printf("Tax Amount: %.2f\n", taxAmount);
		
		System.out.print("Enter the discount percentage for the item (decimal): ");
		double discountPercent = scanner.nextDouble();
		
		double discountAmount = grossAmount * (discountPercent / 100);
		System.out.printf("Discount Amount: %.2f\n", discountAmount);
		
		double netAmount = grossAmount + taxAmount - discountAmount;
		System.out.printf("Net Amount: %.2f\n", netAmount);
		
		System.out.println("\nItem Details:");
		System.out.printf("%-15s%-20s%-15s%-20s%-15s%-15s%-18s%-20s%-15s\n",
				"Item Number", "Item Description", "Item Price", "Quantity Ordered", "Tax Percent", "Tax Amount", "Discount Percent", "Discount Amount", "Net Amount");
		System.out.printf("%-15s%-20s%-15.2f%-20d%-15.2f%-15.2f%-18.2f%-20.2f%-15.2f\n",
				itemNumber, itemDescription, itemPrice, quantityOrdered, taxPercent, taxAmount, discountPercent, discountAmount, netAmount);
		
		scanner.close();
	}

}
