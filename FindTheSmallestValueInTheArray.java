public class FindTheSmallestValueInTheArray {
    public static void main(String[] args) {
        System.out.println("find vaule smallest in array");
        int[] array = {65, 5, 6, 23, 5, 3, 2};

        int smallest = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                index = i + 1;
            }
            System.out.print(array[i] + "\t");
        }
        System.out.println("");
        System.out.println("vaule smallest in array is " + smallest + " in position " + index);
    }
}
