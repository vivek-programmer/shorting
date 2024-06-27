import java.util.*;
public class insertion {
    public static void shorted (int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int pre=i-1;
            while (pre>=0&&arr[pre]>curr) {
                arr[pre+1]=arr[pre];
                pre--;
            }
            arr[pre+1]=curr;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"");        }
    }
    public static void main(String[] args) {
        int arr []={2,5,3,6,2,7};
        shorted(arr);
        
    }
}
