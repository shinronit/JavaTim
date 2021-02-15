public class VipCustomer {
    private String name;
    private int creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("Customer",0000000,"Customer@gmail.com");
    }

    public VipCustomer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    public VipCustomer(String name, int creditLimit){
        this(name,creditLimit,"unknown@gmail.com");
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
