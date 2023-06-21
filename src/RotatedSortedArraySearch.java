public class RotatedSortedArraySearch {
    public static void printArr(int[] arr){
        for( int i= 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int searchTarget(int[] arr, int target, int si, int ei){
        int mid = si + (ei-si)/2;
        if(si>ei){
            return Integer.MIN_VALUE;
        }
        if(target == arr[mid]){
            return mid;
        }
        if(arr[si] < arr[mid]){
            if(arr[si] <= target && target <= arr[mid]){
                return searchTarget(arr, target, si, mid -1 );
            }
            else{
                return searchTarget(arr, target, mid +1, ei);
            }
        }
        else{
            if(arr[mid] <= target && target <= arr[ei] ){
                return searchTarget(arr, target, mid +1, ei);
            }
            else{
                return searchTarget(arr, target, mid -1, si);
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {6,7,8,9,10,1,2,3};
        int target = 2;
        printArr(arr);
        System.out.println(searchTarget(arr, target, 0, arr.length -1));

    }
}
