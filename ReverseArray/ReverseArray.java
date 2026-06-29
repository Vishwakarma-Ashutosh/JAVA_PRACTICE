import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter size of the array");
        int size= scanner.nextInt();
        int[] arr = new int[size];
        int temp;

        System.out.println("enter the element you want to reverse");
        for (int i = 0; i < size; i++) {
            arr[i]=scanner.nextInt();

        }
        for(int i=0; i<arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("reversed array");
        for (int num:arr){
            System.out.println(num+"");
        }
scanner.close();
    }

}
