package giuhub.YYstar342.ArrayList;

import java.util.ArrayList;

public class Demo04 {

    //main方法中定义一个集合，存入三个对象
    /*定义一个方法，根据id查找对应对象信息
    存在 返回索引,反之返回-1*/

    public static void main(String[] args) {
        //创建集合
        ArrayList<User> list = new ArrayList<>();

        //创建对象
        User u1 = new User("h001", "zhangsan", 123);
        User u2 = new User("h002", "lisi", 1234);
        User u3 = new User("h003", "wangwu", 12345);

        //添加元素
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //查找索引
        int Index=getIndex(list,"h001");
        System.out.println(Index);
    }



        //方法
    public static int getIndex(ArrayList<User> list,String id){
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            String str=user.getId();
            if(str.equals(id)){
                return i;
            }
        }
        return -1;
    }
}