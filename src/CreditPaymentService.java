public class CreditPaymentService {
    public int calculate(double monthlyInterestRate, int creditAmount, int creditPeriod) {

        double annuityRatio = (monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, creditPeriod)))/((Math.pow(1 + monthlyInterestRate,creditPeriod) - 1));
        int monthlyPayment = (int) (creditAmount * annuityRatio);

        return monthlyPayment;
    }
}
