import java.util.*;
class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number :");
        int n = sc.nextInt();
        int temp = Math.abs(n);
        int count =0 ;
        if(temp==0){
            count = 1 ;
        }else{
            while(temp>0){
                temp = temp / 10;
                count++;
            }
        }
        System.out.println(count);
    }
}
