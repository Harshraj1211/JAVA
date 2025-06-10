import java.util.*;
public class lab4_a3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int size=sc.nextInt();
        int array[]=new int[size];
        int i=0;
        int sum=0;
        int avg=0;
        System.out.println("Enter numbers : ");
        for(i=0 ; i<size ; i++){
            array[i]=sc.nextInt();
        }
        for(i=0 ; i<size ; i++){
            sum+=array[i];
        }
        avg=sum/size;
        System.out.println("SUM : " + sum);
        System.out.println("AVERAGE : " + avg);
    }
}
