package solid.liskovSubstitution;

public class LoanPaymentService {
    public void doPayment(SecureLoan secureLoan){
        secureLoan.foreCloseLoan();
    }

    public static void main(String[] args) {
        LoanPaymentService loanPaymentService = new LoanPaymentService();
        loanPaymentService.doPayment(new HomeLoan());
//        loanPaymentService.doPayment();
    }
}
