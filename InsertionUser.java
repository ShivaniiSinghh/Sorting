import java.util.Scanner;
public class InsertionUser {
    public static void main(String args[]) {
        int m, k, l, arr[],tem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        m = sc.nextInt();
        arr = new int[m];
        System.out.print("Enter Elements : ");
        for(k=0;k<m;k++){
            arr[k]=sc.nextInt();
        }
        for(k=1;k<m;k++) {
            tem = arr[k];
            l = k;
            while (arr[l]>tem && l>-1) {
                arr[l] = arr[l+1];
                l--;
            }
            arr[l+1] = tem;
        }
        for(k=0;k<m;k++){
            System.out.println(arr[k]+" ");
        }
    }
}