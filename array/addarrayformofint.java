package array;
import java.util.*;
public class addarrayformofint {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int size=sc.nextInt();
        int array[]=new int[size];
        int i=0;
        int j=0;
        System.out.println("Enter ELements of the aray : ");
        for(i=0 ; i<size ; i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter TARGATE : ");
        int targate=sc.nextInt();
    }
}