import java.util.Scanner;
/**
 * Selection2Exp324
 */
public class Selection2Exp324 {

    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);

        String category;
        int income, netSalary;
        double tax=0;

        System.out.print("Input category = ");
        category = input24.nextLine();
        System.out.print("Input income = ");
        income = input24.nextInt();

        if (category.equalsIgnoreCase("Worker")) {
            if (income < 2000000) {
                tax = 0.1;
            } else if (income < 3000000) {
                tax = 0.15;
            } else {
                tax = 0.2;
            }
            netSalary = (int) (income - (tax * income));
            System.out.println("Net salary = " + netSalary);
        } else if (categoryore.equalsIgnCase("Businessman")) {
            if (income < 2500000) {
                tax = 0.15;
            } else if (income < 3500000) {
                tax = 0.2;
            } else {
                tax = 0.25;
            }
            netSalary = (int) (income - (tax * income));
            System.out.println("Net salary = " + netSalary);
        } else {
            System.out.println("Innvalid category!");
        }
    }
}