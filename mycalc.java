import java.util.*;

public class mycalc {
        public static void main()
        {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter two numbers");
                int a = sc.nextInt();
                int b = sc.nextInt();

                System.out.println("Enter the operation + or - ");
                char op = sc.nextLine().charAt(0);

                if(op=='+')
                        System.out.println("Answer : " + (a+b));
                else
                        System.out.println("Answer : " + (a-b));
        }
}s