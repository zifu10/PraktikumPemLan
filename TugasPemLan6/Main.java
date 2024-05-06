package TugasPemLan6;

public class Main {
    public static void main(String[] args) {
        Invoice[] invoices = {
                new Invoice("Product A", 2, 50),
                new Invoice("Product B", 3, 30)
        };

        Employee employee = new Employee(123456, "John", 2000, invoices);

        System.out.println("=====Employee Information=====");
        System.out.println(employee);
        System.out.println();
        employee.printInvoices();
        System.out.println("Total Salary after Deductions: $" + employee.getPayableAmount());
    }
}
