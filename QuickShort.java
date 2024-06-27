public class QuickShort {
    public static void printArr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void QuicShort(int arr[],int s,int e){
        if (s>=e){
            return;
        }
        int pv=pivorted(arr,s,e);
        QuicShort(arr,s,pv-1);
        QuicShort(arr, pv+1, e);
    }
    public static int pivorted(int arr[],int s,int e){
        int piverte=arr[e];
        int i =s-1;
        for(int j=s;j<e;j++){
            if(arr[j]<=piverte){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=piverte;
        arr[e]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[]={23,24,5,224,5532,2,4};
        QuicShort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
