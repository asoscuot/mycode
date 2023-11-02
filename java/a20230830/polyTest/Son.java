package a20230830.polyTest;

public class Son extends Father{
    public int age = 10;

    public void test1(){
        System.out.println("儿子类的test1方法被调用...");
    }

    public void test2(){
        System.out.println("son类特有方法被调用...");
    }
}
