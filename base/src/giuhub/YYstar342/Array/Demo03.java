package giuhub.YYstar342.Array;

import java.util.Arrays;
import java.util.Random;

public class Demo03 {
    public static void main(String[] args) {
        int[] a=new int[10];
        int temp=0;
        Random randomnumber = new Random();
        for (int i = 0; i < a.length; i++) {
            int number = randomnumber.nextInt(50);
            a[i]=number;
        }
        System.out.println("交换前的数组为: "+Arrays.toString(a));
        for(int i=0,j=a.length-1;i<a.length;i++,j--){
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        System.out.println("交换后的数组为: "+Arrays.toString(a));
    }
}
