import java.util.Scanner;
    public class SelectionSort{
        public static void printArray(int[]arr){  
        
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array Size:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array Elements:");
        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //int arr[] = {7,8,3,1,2};
        for(int i = 0;i<arr.length-1;i++){
            int smallest = i;// 0th index element
            for(int j = i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;

        }
        printArray(arr);
        
    }
}

