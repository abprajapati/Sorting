public class CountingSort {

    public static void printArr(int[] arr){
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void countSorting(int[] arr){
        Integer largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }
        int[] countArr = new int[largest+1];

        for(int i = 0; i < arr.length; i++){
            countArr[arr[i]]++;
        }

        int j = 0;
        for(int i = 0; i< countArr.length; i++){
            while(countArr[i] > 0){
                arr[j] = i;
                countArr[i]--;
                j++;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {4,2,6,3,8,9,2,5};
        printArr(arr);
        countSorting(arr);
        printArr(arr);
    }
}
