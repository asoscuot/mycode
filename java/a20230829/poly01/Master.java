package a20230829.poly01;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //运用多态解决喂食问题
    public String feed(Animal animal,Food food){
        return "主人" + name + "给" + animal.getName() + "喂食" + food.getName();
    }

//    //完成给狗喂食骨头
//    public String feed(Dog dog,Bone bone){
//        return "主人" + name + "给" + dog.getName() + "喂食" + bone.getName();
//    }
//
//    //完成给猫喂食黄花鱼
//    public String feed(Cat cat,Fish fish){
//        return "主人" + name + "给" + cat.getName() + "喂食" + fish.getName();
//    }
}
