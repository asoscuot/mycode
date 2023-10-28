package a20230826.extend01;
//模拟大学生考试情况
public class Graduate {
    public String name;
    public int age;
    private int score;

    public Graduate(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.setScore(score);
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void textInfo(){
        System.out.println("大学生" + name + "正在考试...");//只有这个方法和pupil类不一样
    }

    public void showInfo(){
        System.out.println("姓名=" + name + "\t年龄" + age + "\t考了" + score + "分");
    }
}
