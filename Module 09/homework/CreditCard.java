public class CreditCard extends PaymentGateway {
    private String cardNumber;
    private String expiryDate;

    public CreditCard(String cardNumber, String expiryDate) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    @Override
    public void processPayment(double amount) {
        // TODO Auto-generated method stub
        System.out.println("Processing payment of " + amount + " with Credit Card " + cardNumber + " that expires on "
                + expiryDate);
    }

    @Override
    public void refundPayment(double amount) {
        // TODO Auto-generated method stub
        System.out.println("Refunding payment of " + amount + " with Credit Card " + cardNumber + " that expires on "
                + expiryDate);
    }

}
