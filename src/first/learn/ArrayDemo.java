package first.learn;

public class ArrayDemo {

    /*找出数组中最大的元素*/
    public static double max(double[] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    /*计算数组元素的平均值*/
    public static double average(double[] arr) {
        double sum = 0.0;
        int count = arr.length;
        for (int i = 0; i < count; i++) {
            sum += arr[i];
        }
        double average = sum / count;
        return average;
    }

    /*复制数组*/
    public static double[] copy(double[] arr) {
        double[] temp = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    /*颠倒数组元素的顺序*/
    public static void reverse(double[] arr) {
        for (int i = 0; i <= (arr.length - 1) / 2; i++) {
            double temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    /*打印数组元素*/
    public static void printArr(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
            if (i == arr.length - 1) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        double[] arr = {12.2, 23.1, 38.3, 11.5, 56.21, 8.9, 9.22};
        printArr(arr);
        reverse(arr);
        printArr(arr);
    }
}
