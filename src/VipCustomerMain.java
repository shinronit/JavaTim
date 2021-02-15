public class VipCustomerMain {
    public static void main(String[] args) {
        VipCustomer Person1 = new VipCustomer("Person1",50000,"shincochan@shinmails.com");
        System.out.println(Person1.getName());

        VipCustomer Person2 = new VipCustomer("Person2",50000);
        System.out.println(Person2.getName());
        System.out.println(Person2.getEmailAddress());

        VipCustomer Person3 = new VipCustomer();
        System.out.println(Person3.getName());

    }
}
