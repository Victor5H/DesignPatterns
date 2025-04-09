package solid.singleResponsibility;

public class AccountService {
    private Account account;


    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    // so on

// but this should not be a part of account service
//    since the account service is only resposible to update account details,
//    the only resposiblity
//    to make deposit another class should be made like transaction
    public void deposit(){
        //transfer money
    }

}
