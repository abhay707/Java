import java.util.*;
public class pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //star pattern
        // for(int i = 0;i<num;i++){
        //     for(int j = 0;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println('\n');
        // }

        //inverted star pattern
        // for(int i = 0;i<num;i++){
        //     for (int j = num; j > i; j--) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //half pyramid pattern
        // for(int i=1;i<=num;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //half pyramid character pattern
        // char ch = 'A';
        // for(int i=1;i<=num;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }

    }
}