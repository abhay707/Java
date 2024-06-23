import java.util.*;

// Take an array of names as input from the user and print them on the screen.

// public class array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the size of an array: ");
//         int size = sc.nextInt();
//         sc.nextLine();

//         String arr[] = new String[size];
//         System.out.println("Enter the name of the students: ");
        
//         for(int i = 0;i < size;i++){
//             arr[i] = sc.nextLine();    
//         }

//         for (int i = 0; i < size; i++) {
//             System.out.println(arr[i]);;
//         }

//     }
// }


// Find the maximum & minimum number in an array of integers. 

// public class array {
//     public static void main(String[] args) {
//         int max = -1;
//         Scanner sc = new Scanner(System.in);


//         int size = sc.nextInt();
//         int arr[] = new int[size];

//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();    
//         }

//         for(int i = 0;i<size;i++){
//             if(arr[i]>max){
//                 max = arr[i];
//             }
//         }

//         System.out.println(max);
//     }
// }


// Take an array of numbers as input and check if it is an array sorted in ascending order.
public class array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();    
        }

        for(int i = 0;i<size-1;i++){
            if(arr[i] < arr[i+1]){
                System.out.println("Sorted");
                break;
            }else{
                System.out.println("Not sorted");
            }
        }
    }
}