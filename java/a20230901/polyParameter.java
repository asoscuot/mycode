package a20230901;
/*
定义员工类Employee，包含姓名和月工资，以及计算年工资的方法getAnnual
普通员工和经理继承了员工，经理类多了奖金bonus属性和管理manage方法，普通员工多了work方法，
普通员工和经理类要求分别重写getAnnual方法

测试类中添加一个方法showEmpAnnual(Employee e),实现获取任何员工对象的年工资
并在main方法中调用该方法

测试类中添加一个普通方法，testWork，如果是普通员工，则调用work方法，如果是经理，则调用manage方法
 */
public class polyParameter {
    public static void main(String[] args) {
        worker tom = new worker("tom", 3000);
        manager jack = new manager("jack", 5000, 3000);

        polyParameter polyParameter = new polyParameter();

        polyParameter.showEmpAnnual(tom);
        polyParameter.showEmpAnnual(jack);

        polyParameter.testWork(tom);
        polyParameter.testWork(jack);
    }
    //测试类中添加一个方法showEmpAnnual(Employee e),实现获取任何员工对象的年工资
    public void showEmpAnnual(Employee e){
        System.out.println("年工资为" + e.getAnnual());//动态绑定机制发挥作用
    }

    //测试类中添加一个普通方法，testWork，如果是普通员工，则调用work方法，如果是经理，则调用manage方法
    public void testWork(Employee e){
        if(e instanceof worker){
            System.out.println(((worker) e).work());
        }else if(e instanceof manager){
            System.out.println(((manager) e).manage());
        }
    }
}
//定义员工类Employee，包含姓名和月工资，以及计算年工资的方法getAnnual
class Employee{
    private String name;
    private double monthSalary;

    public Employee(String name, double monthSalary) {
        this.name = name;
        this.monthSalary = monthSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;
    }

    public double getAnnual(){
        return  monthSalary * 12;
    }
}

//普通员工和经理继承了员工，经理类多了奖金bonus属性和管理manage方法，普通员工多了work方法
class worker extends Employee{
    public worker(String name, double monthSalary) {
        super(name, monthSalary);
    }

    public String work(){
        return "员工" + getName() + "正在工作";
    }

    //普通员工和经理类要求分别重写getAnnual方法

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}

class manager extends Employee{
    private double bonus;

    public manager(String name, double monthSalary, double bonus) {
        super(name, monthSalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String manage(){
        return "经理" + getName() + "正在管理员工";
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}
