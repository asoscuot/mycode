package a20230831;

public class polyDetail03 {
    public static void main(String[] args) {
        AA aa = new BB();//向上转型
        System.out.println(aa instanceof BB);
        System.out.println(aa instanceof AA);

        BB bb = (BB) aa;//向下转型
        System.out.println(bb instanceof BB);
        System.out.println(bb instanceof AA);
    }
}
//instanceOf比较操作符，用于判断对象的运行类型是否为xx类型或者xx类型的子类型
class AA{

}

class BB extends AA{

}