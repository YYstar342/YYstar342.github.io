package giuhub.YYstar342.OOP;

//预定义Person类
public class Person {
    //属性
    String name;
    int age;

    //构造同名方法
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    //方法
    public void introduce(){
        System.out.println("My name is "+name+",and I am"+age+"yeats old.");
    }
}

