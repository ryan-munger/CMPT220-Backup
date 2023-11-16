public class Problem1 {
    public static void main(String[] args) {
        PaymentGateway paypal = new PayPal("john.doe@marist.edu", "password");
        paypal.processPayment(100.00);
        paypal.refundPayment(100.00);
        PaymentGateway creditCard = new CreditCard("1234567890123456", "12/2020");
        creditCard.processPayment(100.00);
        creditCard.refundPayment(100.00);
    }
}
