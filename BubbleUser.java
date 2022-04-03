import java.util.Scanner;

public class BubbleUser {
    public static void main(String args[]){
        int n,i,j,a[],temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        n=sc.nextInt();
        a=new int[n];
        System.out.print("Enter Elements : ");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(i=0;i<n;i++)
            System.out.print(a[i] + " ");
    }
}
