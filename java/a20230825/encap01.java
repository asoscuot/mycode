package a20230825;


import java.util.Scanner;

public class encap01 {
    public static void main(String[] args) {
/*
设置一个程序，有person类，不能随便查看人的年龄，工资等属性，并对设置的年龄进行合理的验证
年龄，工资不能随便查看，name的长度在2-6之间
 */
        Person p1 = new Person();
        p1.setName("jack");
        p1.setAge(25);
        p1.setSal(30000);

        System.out.println(p1.info());
        //通过构造器可以绕过get set方法的防护机制
        Person smith = new Person("smith", 30, 20000);
        System.out.println(smith.info());
    }
}

class Person{
    String name;//公开可见
    private int age;//私有，无法直接修改
    private double sal;//...

    public Person() {
    }
    //解决办法：将set方法写在构造器中
    public Person(String name, int age, double sal) {
      this.setName(name);
      this.setAge(age);
      this.setSal(sal);
    }

    //使用快捷键生成set方法和get方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 6){
            this.name = name;
        }else{
            System.out.println("名字长度有误，自动设置为默认名字");
            this.name = "小明";
        }
    }

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
        if(age <= 120 && age >=1){
            this.age = age;
        }else{
            System.out.println("年龄设置有误，自动设置为默认年龄...");
            this.age = 0;
        }
    }

    public Double getSal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("查看薪水需要输入用户密码，请在此键入：");
        int cnt = 0;
        for (int i = 0; i < 3; i++) {
            int code = scanner.nextInt();
            if(code == 123) {
                return sal;
            }else{
                cnt ++;
                if(cnt < 3) {
                    System.out.println("密码错误，请重试：");
                }else{
                    System.out.println("三次输入错误，无法查看薪水值");
                }
            }
        }
        return null;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    //输出信息的方法
    public String info(){
        return "信息为：name=" + name + "\t年龄=" + age + "\t薪水=" + getSal();
    }
}
/*
封装的基本步骤：
1.将属性进行私有化
2.提供一个公共的set方法，用于对属性判断并赋值
3.提供一个公共的get方法，用于获取属性的值
 */
