// WAP to delete an element from array specified by user. if element is not found print a 
// message “Element is not found”

import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size : ");
        int size=sc.nextInt();
        int[] array=new int[size];
        int size1=0;
        int[] array1=new int[size1];
        System.out.println("Enter : ");
        for(int i = 0; i < size ; i++) {
            array[i]=sc.nextInt();
        }

        System.out.println("Enter number : ");
        int n=sc.nextInt();

        for (int i = 0; i < size ; i++) {
            if(array[i]==n){
                continue;    
            }
            else{
                array1[i]=array[i];
            }
        }
        System.out.println("after remove : ");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }


    }    
}