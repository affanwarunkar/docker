import java.util.*;
public class switch{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int button=sc.nextInt();

        switch (button) {
            case 1:
            System.out.println("namate");
                break;
              
            case 2:
            System.out.println("bonjour");
            break;
            
            case 3:
            System.out.println("assalamaleykum");
            break;

            default:
            System.out.println("invalid number");
                break;
        }
    }
}