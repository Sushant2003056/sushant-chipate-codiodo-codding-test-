import java.util.*;
import java.util.Scanner;
public class P2 {

    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        System.out.println("factors of "+a+"(Excluding 1 and )"+a+"are:");
        if(a>0){
        for(int i=2;i<=a/2;i++){
            if(a%i==0){
            System.out.print(" "+i);
            count=1;
            }
        }
    }
    if(count==0){
        System.out.print("None(The number is prime or has no factors other than 1 and itself)");
    }
    }
}