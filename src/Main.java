
        import java.text.NumberFormat;
        import java.util.Locale;
        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary, tax;

        System.out.print("Please enter your annual salary: R ");
        salary = sc.nextDouble();

        while (salary <= 0) {
            System.out.print("Please enter a valid amount: ");
            salary = sc.nextDouble();
        }

        System.out.println("Your Annual salary is: R " + formatCurrency(salary));

        if (salary <= 237100) {
            tax = salary * 0.18;
            System.out.println("Your Annual TAX is: R " + formatCurrency(tax));
        } else if (salary <= 370500) {
            tax = salary * 0.24 + 42678;
            System.out.println("Your Annual TAX is: R " + formatCurrency(tax));
        } else if (salary <= 512800) {
            tax = salary * 0.31 + 77362;
            System.out.println("Your Annual TAX is: R " + formatCurrency(tax));
        } else if (salary <= 673000) {
            tax = salary * 0.36 + 121475;
            System.out.println("Your Annual TAX is: R " + formatCurrency(tax));
        } else if (salary <= 857900) {
            tax = salary * 0.39 + 179147;
            System.out.println("Your Annual TAX is: R " + formatCurrency(tax));
        } else if (salary <= 1817000) {
            tax = salary * 0.41 + 251258;
            System.out.println("Your Annual TAX is: R " + formatCurrency(tax));
        } else if (salary > 1817000) {
            tax = salary * 0.45 + 644489;
            System.out.println("Your Annual TAX is: R " + formatCurrency(tax));
        }
    }

    private static String formatCurrency(double amount) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en", "ZA"));
        return nf.format(amount);
    }
}
