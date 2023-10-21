package a20230821;

public class Homework03 {
    public static void main(String[] args) {
        book book1 = new book("西游记",180);
        System.out.println("这本书的价格为：" + book1.updatePrice(book1));
    }
}
//编写类book，定义方法updatePrice，实现更改某本书的价格，如果价格 > 150，则更改为150
//如果价格 > 100，则更改为100.否则不变
class book{
    String name;
    double Price;

    public book(String name,double Price){
        this.name = name;
        this.Price = Price;
    }

    public double updatePrice(book b){
        //如果方法中没有Price局部变量，那么this.price等价price
        if(this.Price > 150){
            this.Price = 150;
        }else if(this.Price >100){
            this.Price = 100;
        }
        return this.Price;
    }

}
