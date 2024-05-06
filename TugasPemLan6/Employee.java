package TugasPemLan6;

public class Employee implements Payable {
    Integer registrationNumber;
    String name;
    Integer salaryPerMonth;
    Invoice[] invoices;

    public Employee(Integer registrationNumber, String name, Integer salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    @Override
    public double getPayableAmount() {
        double totalInvoiceAmount = 0;
        for (Invoice invoice : invoices) {
            totalInvoiceAmount += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalInvoiceAmount;
    }

    public void printInvoices() {
        System.out.println("=====Invoices for Employee " + name +"=====");
        System.out.println();
        for (Invoice invoice : invoices) {
            System.out.println(invoice);
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Registration Number : " + registrationNumber +
                "\nName                : " + name +
                "\nSalary Per Month    : $" + salaryPerMonth;
    }
}
