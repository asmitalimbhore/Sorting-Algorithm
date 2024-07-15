import java.util.Scanner;
public class InsertionSort {
    public static void printArray(int a[]){
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("enter array Size:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];

        System.out.println("Enter the element");
        for(int i = 0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 1;i<a.length;i++){
            int current = a[i];
            int j = i-1;
            while(j>=0 && current <a[j]){
                a[j+1]=a[j];
                j--;            
        }
        a[j+1]=current;
    }
    //print sorted array
    printArray(a);
          
    }
    
}
