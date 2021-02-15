public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount RonitAccount = new BankAccount();//("1212157",5000,"Ronit","Test@shinmails.com","478789789789");
        RonitAccount.DepositFunds(100000);
        RonitAccount.WithdrawFunds(100000);
        System.out.println(RonitAccount.getAccountNumber());
    }
}
