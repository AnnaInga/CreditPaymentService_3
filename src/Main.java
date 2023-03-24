public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        double interestRate = 9.99;
        int creditAmount = 1_000_000;
        int creditPeriod = 36;

        double monthlyInterestRate =  interestRate / 12 / 100;

        int monthlyPayment = service.calculate(monthlyInterestRate, creditAmount, creditPeriod);

        System.out.println("Ваш ежемесячный платеж составляет: " + monthlyPayment + " руб");
    }
}