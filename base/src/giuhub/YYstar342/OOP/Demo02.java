package giuhub.YYstar342.OOP;

public class Demo02 {
    public static void main(String[] args) {
        //创建Person类的对象
        Person person1 = new Person("小红",18);
        Person person2 = new Person("小兰",19);

        //调用对象的方法
        person1.introduce();
        person2.introduce() ;

    }
}