package giuhub.YYstar342;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        System.out.println("简易计算器（支持加减乘除）");
        System.out.println("输入 'q' 退出程序");
        double num1=0.0f;
        double num2=0.0f;

        //while循环实现持续接收输入
        while (running) {
            System.out.println("请输入第一个数字: ");
            String input1 = scanner.next();
            if (input1.equals("q")) {
                running = false;
                System.out.println("程序已退出。");
                break;
            }

            num1 = Double.parseDouble(input1);// 将输入转换为数字


            System.out.println("请输入正确运算符(+,-,*,/):");
            String operator = scanner.next();
            if (operator.equals("q")) {
                running = false;
                System.out.println("程序已退出。");
                break;
            }


            System.out.println("请输入第二个数字");
            String input2 = scanner.next();
            if (input2.equals("q")) {
                running = false;
                System.out.println("程序已退出。");
                break;
            }
            num2 = Double.parseDouble(input2); // 将输入转换为数字


            //运算符计算
            double result = 0.0f;
            boolean validOperator = true; // 标记运算符是否有效
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;

                case "-":
                    result = num1 - num2;
                    break;

                case "*":
                    result = num1 * num2;
                    break;

                case "/":
                    if (num2 == 0) {
                        System.out.println("除数不为0");
                    } else {
                        result = num1 / num2;
                    }
                    break;

                default:
                    System.out.println("错误运算符！");
                    validOperator = false;
                    break;
            }

            if (validOperator) {
                System.out.println("结果为：" + result);
            }
        }


        scanner.close(); // 关闭 Scanner
    }
}
