package a20230826.encap;

public class AccountText {
    public static void main(String[] args) {
        Account account1 = new Account();//第一种方法：创建对象时用的是无参构造器
        account1.setName("jack");
        account1.setBalance(60);
        account1.setPwd("123456");

        account1.showInfo();

        Account smith = new Account("tom", 50, "234567");//第二种方法：创建对象时用的是有参构造器
        smith.showInfo();
    }
}
