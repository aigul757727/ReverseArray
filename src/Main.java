public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ",");
            }
        }
    }
}