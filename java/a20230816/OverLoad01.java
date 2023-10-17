package a20230816;

public class OverLoad01 {
    public static void main(String[] args) {
        MyCalculator mc = new MyCalculator();
        System.out.println(mc.calculator(1,2));
    }
}
//方法的重载允许在一个类中有相同的方法名，但是要求方法的形参列表不同

class MyCalculator{
    //这四个方法构成重载
    public int calculator(int n1,int n2){
            return n1 + n2;
        }
        public double calculator(int n1,double n2){
            return n1 + n2;
    }
    public double calculator(double n1,int n2){
        return n1 + n2;
    }
    public int calculator(int n1,int n2,int n3){
        return n1 + n2 + n3;
    }
}
/*
细节：
方法名必须相同；
形参必须不同；
返回类型无要求。如果两个方法名字相同，形参相同，但是返回类型不同，不构成方法的重载
 */