public class Main {
    public static void main(String[] args) {

        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        for (int arr = array.length - 1; arr >= 0; arr--) {
            System.out.print(array[arr]);
            if (arr != 0) {
                System.out.print(" , ");
            }else {
                System.out.print(" . ");
            }
        }
        System.out.println();
        for (int arr = array.length -1; arr>=0; arr--) {
            if (array[arr] % 2 == 0) {
                System.out.print(array[arr] + " . ");
            }
        }
        System.out.println();

        double[] array1 = {1.57, 7.654, 9.986};
        for (int arr1 = array1.length - 1; arr1 >= 0; arr1--) {
            System.out.print(array1[arr1]);
            if (arr1 != 0) {
                System.out.print(" , ");
            }else{
                System.out.print(" . ");
            }
        }
        System.out.println();


        int[] numbers = {1 , 2 , 3 , 4 , 5 , 6 , 0};
        for (int n = numbers.length - 1; n >=0 ; n--) {
            System.out.print(numbers[n]);
            if (n != 0) {
                System.out.print(" , ");
            }else{
                System.out.print(" . ");
            }
        }

    }
}
