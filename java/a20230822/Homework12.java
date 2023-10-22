package a20230822;

public class Homework12 {
  
    public static void main(String[] args) {
        Circle c1 = new Circle();
        PassObject po = new PassObject();
        po.printArea(c1,5);
    }
}
//将对象作为参数传递给方法
//（1）定义一个circle类，包含一个double型的radius属性代表圆的半径，findArea()方法返回圆的面积
//（2）定义一个类PassObject，在类中定义一个方法printArea(),该方法定义如下：public void printArea(Circle c,int times);
//（3）在printArea()方法中打印输出从1到times之间的每一个整数值，以及对应的面积
//（4）在main方法中调用printArea()方法，调用完毕后输出当前半径值

class Circle{
    double radius;

    public double findArea(){
        return Math.PI * radius * radius;
    }

    //添加方法setRadius,修改对象的半径值
    public void setRadius(double radius){
        this.radius = radius;
    }
}

class PassObject{
    public void printArea(Circle c,int times){
        for (int i = 1; i <= times; i++) {
            System.out.println("radius\t\t" + "Area");
            c.setRadius(i);
            System.out.println((double)i + "\t\t" + c.findArea());
        }
    }
}
