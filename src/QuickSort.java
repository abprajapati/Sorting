public class QuickSort {
    public void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void quickSort(int[] arr, int si, int ei){
        if(si >= ei){
            return;
        }
        int pidx = partition(arr, si, ei);
        quickSort(arr, si, pidx - 1);
        quickSort(arr, pidx + 1, ei);
    }
    public int partition(int[] arr, int si, int ei){
        int pivot = arr[ei];
        int j = si - 1;
        for(int i= si; i < ei; i++){
            if(arr[i] < pivot){
                j++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        j++;
        int temp = arr[j];
        arr[j] = arr[ei];
        arr[ei] = temp;

        return j;
    }
    public static void main(String[] args){
        int[] arr = {4,7,1,8,-4,6};
        QuickSort quickSort = new QuickSort();
        quickSort.printArr(arr);
        quickSort.quickSort(arr, 0, arr.length -1);
        quickSort.printArr(arr);

    }
}
