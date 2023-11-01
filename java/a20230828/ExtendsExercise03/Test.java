package a20230828.ExtendsExercise03;
/*
编写Computer类，包含CPU,内存，硬盘等属性，getDetail用于返回Computer类的详细信息
编写Pc子类，继承Computer类，添加特有属性（品牌brand）
编写NotePad子类，继承Computer类，添加特有属性（演示color）
编写Test类，在main方法中创建Pc和NotePad对象，分别给对象中特有的属性赋值
以及从Computer类继承的属性赋值，并使用方法打印输出信息
 */
public class Test {
    public static void main(String[] args) {
        Pc pc = new Pc("inter", 16, 500, "IBM");
        System.out.println(pc.printInfo());

        NotePad notePad = new NotePad("inter", 32, 1000, "白色");
        System.out.println(notePad.printInfo());
    }
}

class Computer{
    private String Cpu;
    private int memory;
    private int disk;

    public Computer() {
    }

    public Computer(String cpu, int memory, int disk) {
        this.Cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public String getCpu() {
        return Cpu;
    }

    public void setCpu(String cpu) {
        Cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    public String getDetail(){
        return "Cpu=" + Cpu + "内存为" + memory + "硬盘为" + disk;
    }
}

class Pc extends Computer{
    private String brand;

    public Pc(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String printInfo(){
        return "信息如下：" + getDetail() + "品牌为" + brand;
    }
}

class NotePad extends Computer{
    private String color;

    public NotePad(String cpu, int memory, int disk, String color) {
        super(cpu, memory, disk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String printInfo(){
        return "信息如下：" + getDetail() + "颜色为" + color;
    }
}
