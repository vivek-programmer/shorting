public class SearchInroatedArr {
    public static int Search(int arr[],int tar,int s,int e){
        if (s>e){
            return -1;
        }
        int mid =s+(e-s)/2;
        if(arr[mid]==tar){
            return mid;
        }
        if (arr[s]<=arr[mid]){
            if(arr[s]<=tar&&tar<=arr[mid]){
                return Search(arr, tar, s, mid-1);
            }
            else {
                return Search(arr, tar, mid+1, e);
            }
        }
        else {
            if(arr[mid]<=tar&&tar<=arr[e]){
                return Search(arr, tar, mid+1, e);
            }
            else {
                return Search(arr, tar, s, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={7,8,9,0,1,2,3};
        int m=Search(arr, 3, 0, arr.length-1);
        System.out.println(m);
    }
}
