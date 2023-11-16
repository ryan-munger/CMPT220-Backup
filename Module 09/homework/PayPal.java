public class PayPal extends PaymentGateway {
    private String email;
    private String password;

    public PayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void processPayment(double amount) {
        // TODO Auto-generated method stub
        System.out.println("Processing payment of " + amount + " with PayPal for account " + email);
    }

    @Override
    public void refundPayment(double amount) {
        // TODO Auto-generated method stub
        System.out.println("Refunding payment of " + amount + " with PayPal for account " + email);
    }

}
