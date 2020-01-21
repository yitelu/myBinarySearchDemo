public class main {

    public static void main(String[] args) {

        System.out.println("Binary search on sorted array! ");

        int[] arr = {1,2,4,5,10,99,123};

        int len = arr.length-1;
        int targetInt = 123;

        goBinarySearch goBS = new goBinarySearch();
        int result = goBS.binarySearch(arr, 0, len, targetInt);

        if(result == -1)
            System.out.println(targetInt + " not found in the array via binary search");
        else
            System.out.println("found at array index: " + result);
    }
}
