package giuhub.YYstar342.Array;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] array={1,4,5,2,8,3,7};
        sort(array);//调用sort方法
        System.out.println(Arrays.toString(array));//调用toString
    }



    //冒泡排序
    public static void sort(int[] array) {
        boolean flag;
        for(int i=0;i<=array.length-1;i++){
            flag=false;
            for(int j=0;j<array.length-1-i;j++){
                if(array[j+1]>array[j]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag=true;
                }
                if(flag=false){
                    break;
                }
            }
        }
    }

}

//flag = false; 放在第一层循环的开始：
//每次外层循环开始时，flag 被重置为 false。
//这是因为每次外层循环都表示一次完整的遍历，我们需要重新检测这次遍历是否发生了交换。

//flag = true; 放在第二层循环的交换操作之后：
//当发生交换时，将 flag 设置为 true，表示本次遍历发生了交换。
//如果没有发生交换，flag 会保持 false。

//if (flag=false) 放在第一层循环的末尾：
//在内层循环结束后，检查 swapped 的值。
//如果 flag 为 false，说明本次遍历没有发生任何交换，数组已经有序。
//此时可以提前退出外层循环，避免不必要的遍历。