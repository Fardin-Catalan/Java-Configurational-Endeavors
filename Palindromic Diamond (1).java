import java.util.Scanner;
public class chatgpt_pattern_prob_1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the pattern:");
        int size=sc.nextInt(); 
        int n=size; 
        int temp=size-1;
        for(int i=1;i<=size;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int m=i-1;m>=1;m--){
                System.out.print(m);
            }
            for(int l=1;l<=n-i;l++){
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.print(" ");
        for(int i=temp;i>=1;i--){
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int l=i-1;l>=1;l--){
                System.out.print(l);
            }
            for(int m=1;m<=n-i;m++){
               System.out.print(" ");
            }
            System.out.println();
              System.out.print(" ");
        }
    }
}          