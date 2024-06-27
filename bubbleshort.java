import java.util.*;
public class bubbleshort {
    public static void bubble(int arr[]) {
        int swap=0;
        for(int i=0;i<arr.length-1;i++){
            if (swap==0&&i==1){
                System.out.println("alreay shorted");
                break;
            }
            for(int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int a=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=a;
                    swap++;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"");
        }
        
    }
public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    bubble(arr);

}
    
}