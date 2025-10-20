import java.util.Scanner;
class Demo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i = 0 ; i<a.length ; i++){
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0 ; i<a.length ; i++){
            sum = sum + a[i];
        }
        System.out.println(sum);
         sc.close();
    }
}