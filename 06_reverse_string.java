import java.util.*;
class Demo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();  
        StringBuilder sb = new StringBuilder(s);
        String rev = sb.reverse().toString();
        System.out.println(rev);
    }
}