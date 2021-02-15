public class BankAccount {

    private String AccountNumber;
    private int balance;
    private String CustomerName;
    private String Email;
    private String PhoneNumber;

    public BankAccount(){
        this("000000",00,"CustomerName","Someone@shinmails.com","9898989898");
    }

    public BankAccount(String accountNumber, int balance, String customerName, String email, String phoneNumber) {
        AccountNumber = accountNumber;
        this.balance = balance;
        CustomerName = customerName;
        Email = email;
        PhoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
    public void DepositFunds(int MoneyToDeposit) {
        System.out.println("Money Deposited Successfully");
        System.out.println("Old Balance : " + balance);
        this.balance += MoneyToDeposit;
        System.out.println("New Balance : " + balance);
    }
    public void WithdrawFunds(int MoneyToWithDraw){
        if(balance>=MoneyToWithDraw){
            System.out.println("Withdraw In progress");
            System.out.println("Old Balance : " + balance);
            balance -= MoneyToWithDraw;
            System.out.println(MoneyToWithDraw + " was successfully withdrawed");
            System.out.println("New Balance : " + balance);
        }else{
            System.out.println("Insufficient Funds cannot withdraw : " + MoneyToWithDraw);
        }
    }
}
