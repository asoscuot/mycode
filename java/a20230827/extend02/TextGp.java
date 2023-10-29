package a20230827.extend02;

import a20230826.extend01.Graduate;
import a20230826.extend01.pupil;

public class TextGp {
    public static void main(String[] args) {
        a20230826.extend01.pupil pupil = new pupil("小明", 10, 60);
        pupil.textInfo();
        pupil.showInfo();

        System.out.println("================================");

        a20230826.extend01.Graduate graduate = new Graduate("阿强", 20, 100);
        graduate.textInfo();
        graduate.showInfo();
    }
}
