package solid.liskovSubstitution;

public class CreditCardLoad implements LoanPayment{
    @Override
    public void doPayment() {
        System.out.println("do payment");
    }
}
