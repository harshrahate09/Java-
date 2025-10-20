import java.util.*;
class Demo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int temp = n ;
        while(temp!=0){
            int digit = temp % 10;
            rev = rev * 10 + digit ;
            temp = temp / 10 ;
        }
        System.out.println(rev);
        if(n == rev){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}