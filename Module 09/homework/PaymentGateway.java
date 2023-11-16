public abstract class PaymentGateway {
    public abstract void processPayment(double amount);

    public abstract void refundPayment(double amount);
}