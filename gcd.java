import java.util.*;
public class gcd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        while (a != b){
            if(a>b){
                a=a-b;
            }else{
                b=b-a;
            }
        }
        System.out.println("gdc is :"+b);
    }
}