package a20230826.extend01;

public class TextGp {
    public static void main(String[] args) {
        pupil pupil = new pupil("小明", 10, 60);
        pupil.textInfo();
        pupil.showInfo();

        System.out.println("================================");

        Graduate graduate = new Graduate("阿强", 20, 100);
        graduate.textInfo();
        graduate.showInfo();
    }
    /**
     * 问题：编写的这两个类有很多属性和方法都是相同的，代码复用性低，如何解决？
     * ”继承“
     */
}
