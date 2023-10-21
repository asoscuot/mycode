package a20230821;

public class Homework02 {
    public static void main(String[] args) {
        String[]strs = {"tom","mary","jack","zoom"};
        A02 a02 = new A02();
        int index = a02.find("lst",strs);
        System.out.println("查找的索引为：" + index);
    }
}
//编写类A02,定义方法find，实现查找某字符串是否在数组中，并返回索引，找不到则返回-1
class A02{
    public int find(String str,String[] strs){
        for (int i = 0; i < strs.length; i++) {
            if(str.equals(strs[i])){
                return i;
            }
        }
        return -1;
    }
}

