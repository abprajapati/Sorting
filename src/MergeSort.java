public class MergeSort {
    public void mergeSort(int[] arr, int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1, ei);
        merge(arr, si, ei, mid);

    }
    public void merge(int[] arr, int si, int ei, int mid){
        int i = si;
        int j = mid+1;
        int k = 0;
        int[] temp = new int[ei-si+1];


        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        for(k=0, i = si; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
    public void printArray(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + "->");
        }
        System.out.print("null");
        System.out.println();

    }
public static void main(String[] args){
    int[] arr = {3,2,8,9,4,7};
    MergeSort mergeSort = new MergeSort();
    mergeSort.printArray(arr);
    mergeSort.mergeSort(arr, 0, arr.length-1);
    mergeSort.printArray(arr);

}
}
