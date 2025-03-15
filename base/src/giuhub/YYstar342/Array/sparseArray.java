package giuhub.YYstar342.Array;

public class sparseArray {

        // 将普通二维数组转换为稀疏数组
        public static int[][] tosparseArray(int[][] array) {
            // 统计非零元素的个数
            int count = 0;
            for (int[] row : array) {           //for-each循环，用于遍历二维数组每一行row
                for (int value : row) {         //遍历每一行row的元素
                    if (value != 0) {
                        count++;
                    }
                }
            }

            // 创建稀疏数组
            int[][] sparseArray = new int[count + 1][3];//创建二维数组存储稀疏数组，+1为存储原始数组 信息(行列值)，剩余count行存储元素
            sparseArray[0][0] = array.length;    // 原始数组的行数存储到稀疏数组第一行第一个
            sparseArray[0][1] = array[0].length; // 原始数组的列数存储的稀疏数组第一行第二个
            sparseArray[0][2] = count;           // 非零元素的个数......

            // 填充稀疏数组
            int index = 1;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] != 0) {
                        sparseArray[index][0] = i; // 行
                        sparseArray[index][1] = j; // 列
                        sparseArray[index][2] = array[i][j]; // 值
                        index++;
                    }
                }
            }

            return sparseArray;
        }

        // 将稀疏数组恢复为普通二维数组
        public static int[][] toNormalArray(int[][] sparseArray) {
            // 读取原始数组的行数和列数
            int rows = sparseArray[0][0];
            int cols = sparseArray[0][1];
            int[][] array = new int[rows][cols];

            // 填充非零元素
            for (int i = 1; i < sparseArray.length; i++) {
                int row = sparseArray[i][0];
                int col = sparseArray[i][1];
                int value = sparseArray[i][2];
                array[row][col] = value;
            }

            return array;
        }

        // 打印二维数组
        public static void printArray(int[][] array) {
            for (int[] row : array) {
                for (int value : row) {
                    System.out.printf("%d\t", value);
                }
                System.out.println();
            }
        }

        // 测试代码
        public static void main(String[] args) {
            // 原始数组
            int[][] array = {
                    {0, 0, 0, 0, 0},
                    {0, 2, 0, 0, 0},
                    {0, 0, 0, 0, 0},
                    {0, 0, 0, 3, 0},
                    {0, 0, 0, 0, 0}
            };

            System.out.println("原始数组:");
            printArray(array);

            // 转换为稀疏数组
            int[][] sparseArray = tosparseArray(array);
            System.out.println("稀疏数组:");
            printArray(sparseArray);

            // 恢复为普通数组
            int[][] recoveredArray = toNormalArray(sparseArray);
            System.out.println("恢复后的数组:");
            printArray(recoveredArray);
        }
    }
