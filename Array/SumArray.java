public class SumArray {
    public static void main(String[] args) {
        int[] array = {87, 98, 43, 54, 21, 45, 32, 12, 34};
        int total = 0;

        for (int counter = 0; counter > array.length; counter++){
        total += array[counter];
    }
        System.out.println("totat of array elements :" + total);
    }
}
