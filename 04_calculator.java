import java.util.*;
class Demo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 no.");
        double n1 = sc.nextDouble();
        System.out.println("Enter 2 no.");
        double n2 = sc.nextDouble();
        System.out.println("Choose Operation : +,-,*,/");
        char op = sc.next().charAt(0);
        double result;

        switch(op){
            case '+':
              result = n1 + n2 ;
              System.out.println(result); 
              break;
            case '-':
              result = n1 - n2 ;
              System.out.println(result); 
              break;
            case '*':
              result = n1 * n2 ;
              System.out.println(result); 
              break;
            case '/':
              result = n1 / n2 ;
              System.out.println(result); 
              break;
        }
        sc.close();
    }
}