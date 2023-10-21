package a20230821;

public class Homework05 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        System.out.println(circle1.girth());
        circle1.area();
    }
}
//定义一个圆类Circle，定义属性半径，提供现实圆周长的方法和显示圆面积的方法
class Circle{
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double girth(){
        return Math.PI * 2 * this.radius;
    }

    public void area(){
        System.out.println("这个圆的面积为：" + 3.14 * radius * radius);
    }
}
