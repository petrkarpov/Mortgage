public class Main {
    public static void main(String[] args) {
        final int APARTMENT_PRICE_RUB = 5000000;
        final double PERCENT_FIRST_PAYMENT = 0.3;
        final double AMOUNT_FIRST_PAYMENT = APARTMENT_PRICE_RUB * PERCENT_FIRST_PAYMENT;

        System.out.println("Сумма первоначального взноса: " + AMOUNT_FIRST_PAYMENT);
    }
}