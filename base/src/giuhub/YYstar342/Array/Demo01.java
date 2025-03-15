package giuhub.YYstar342.Array;

public class Demo01 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        //调用反转数组
        int[] reverse=reverse(a);
        //打印数组
        printArray(reverse);
        }



        //打印数组元素
    public static void printArray(int[] a) {
        for(int i=0;i<=a.length-1;i++){
            System.out.println(a[i]);
        }
    }



    //反转数组
    public static int[] reverse(int[] a) {
        int[] result;
        result=new int[a.length];
        //反转操作
        for (int i = 0,j=result.length-1;
             i <a.length;
             i++,j--)
        {
           result[j]=a[i];
        }
    return result;
    }
}
