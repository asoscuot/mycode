package a20230826.encap;
//创建程序，在其中定义两个类，Account和AccountText类体会java的封装性，
//1.Account类要求具有属性：姓名（长度为2位3位4位），余额（必须 > 20），密码（必须是6位）如果不满足
//则给出提示信息，并给默认值
//2.通过set方法给Account属性赋值
//3.在AccountText类中测试

public class Account {
    private String name;
    private double balance;
    private String pwd;

    //一般提供两个构造器
    public Account() {
    }

    public Account(String name, double balance, String pwd) {
       this.setName(name);
       this.setBalance(balance);
       this.setPwd(pwd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() <= 4 && name.length() >= 2){
            this.name = name;
        }else{
            System.out.println("输入的名字有误，自动设置为默认名字");
            this.name = "小明";
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance >= 20){
            this.balance = balance;
        }else{
            System.out.println("余额必须大于20");
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if(pwd.length() == 6){
            this.pwd = pwd;
        }else{
            System.out.println("密码设置失败，必须是六位数密码，自动默认密码为000000");
            this.pwd ="000000";
        }
    }

    public void showInfo(){
        System.out.println("输入的信息如下：name=" + name + "\t余额=" + balance + "\t密码=" + pwd);
    }
}

