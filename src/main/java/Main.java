public class Main {
    public static void main(String[] args) {
        final int apartmentPriceRub = 5000000;
        final double percentFirstPayment = 0.3;
        final double amountFirstPayment = apartmentPriceRub * percentFirstPayment;

        System.out.println("Сумма первоначального взноса: " + amountFirstPayment);
    }
}