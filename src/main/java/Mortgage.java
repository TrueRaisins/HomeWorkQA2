public class Mortgage {
    public static void main(String[] args) {
        final int MortgageSize = 26500000;
        final double FirstPaymentPercent = 0.04; // первый платеж в процентах
        double FirstPayment = MortgageSize * FirstPaymentPercent;

        System.out.println(FirstPayment);
    }
}