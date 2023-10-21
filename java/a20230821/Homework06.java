package a20230821;

public class Homework06 {
    public static void main(String[] args) {
        Cale cale = new Cale(5, 0);

        System.out.println("和=" + cale.sum());
        System.out.println("差=" + cale.minus());
        System.out.println("积=" + cale.mul());
        Double res = cale.div();
        if(res != null){
            System.out.println("商=" + cale.div());
        }
        else{
            System.out.println("除数不能为零");
        }
    }
}
//变成创建一个Cale类，在其中定义两个变量表示两个操作数，定义四个方法分别实现求和，差，乘，商
//并创建两个对象分别测试

class Cale{
    double num1;
    double num2;

    public Cale(double num1,double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public double sum(){
        return num1 + num2;
    }

    public double minus(){
        return num1 - num2;
    }

    public double mul(){
        return num1 * num2;
    }

    public Double div(){
        if(num2 != 0){
            return num1/num2;
        }else{
            return null;
        }
    }
}
