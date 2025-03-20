package giuhub.YYstar342.Array;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Random;

public class Demo02 {
    public static void main(String[] args) {
        int[] a = new int[10];
        Random randomnember = new Random();
        Random randomIndex = new Random();
        for (int i = 0; i < a.length; i++) {
            int result1 = randomnember.nextInt(50);
            a[i] = result1;
        }
        System.out.println("打乱前数组为" + Arrays.toString(a));

        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            int result2 = randomIndex.nextInt(a.length);
            temp = a[i];
            a[i] = a[result2];
            a[result2] = temp;
        }
        System.out.println("打乱后的数组为： " + Arrays.toString(a));
    }
}

