package solid.singleResponsibility;

public class Transaction {

    public void depositMoney(int money, String accountNumber){
        AccountService service = new AccountService();
        Account a= service.getAccount();
        a.setBalance(a.getBalance()+money);
        service.setAccount(a);

    }

}
