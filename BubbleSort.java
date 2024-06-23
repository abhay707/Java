import java.util.*;
public class BubbleSort{

    // public static void main(String[] args) {
    //     int arr[] = {2,5,7,3,8};
    //     Arrays.sort(arr);
    //     for(int i = 0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the length of the array: ");
    //     int length = sc.nextInt();
    //     int arr[] = new int[length];
    //     for(int i = 0;i<length;i++){
    //         arr[i] = sc.nextInt();
    //     };
        

    //     for(int i = 0;i<arr.length;i++){
        
    //         System.out.print(arr[i]+" ");
                
    //     }
    // }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first array numbers: ");
        
        int first = sc.nextInt();
        System.out.println("Enter second array numbers: ");
        int second = sc.nextInt();
        
        int arr[][] = new int[first][second];
        for(int i = 0;i<first;++i){
            for(int j = 0;j<second;++j){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0;i<first;++i){
            for(int j = 0;j<second;++j){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}