package a20230822;

public class Homework09 {
    public static void main(String[] args) {
        music music = new music("半岛铁盒",319);
        music.play();
        System.out.println(music.getInfo());
    }
}
//定义music类，里面有音乐名name，音乐时长time属性，并有播放play功能和返回本身属性信息的功能方法getInfo
class music{
    String name;
    int times;

    public music(String name, int times) {
        this.name = name;
        this.times = times;
    }

    public void play(){
        System.out.println("歌曲" + name + "正在播放中...");
    }

    public String getInfo(){
        return "歌曲名" + name + "时长" + times + "秒";
    }
}
