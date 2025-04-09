package solid.liskovSubstitution;

public class HomeLoan implements SecureLoan{
    @Override
    public void foreCloseLoan() {
        System.out.println("foreclose loan");
    }

    @Override
    public void doPayment() {
        System.out.println("do payment");
    }
}
