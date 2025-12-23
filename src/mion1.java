public class mion1 {
    public static void ArrayArrangement1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) minIndex = j;
            }
            int tamp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tamp;
        }
        for (int i = 0; i <arr.length ; i++) {
        System.out.print(arr[i]+ " ");
        }
    }
    public static void ArrayArrangement2(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]>arr[i+1]){
                    int tamp=arr[j];
                    arr[j]=arr[i+1];
                    arr[i+1]=tamp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 4, 1, 2};
        ArrayArrangement1(arr);

    }
}
