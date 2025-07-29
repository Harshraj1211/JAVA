// WAP to enter an element 
// at specific position into 
// array. (Do not take a new array)

import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int size=sc.nextInt();
        int[] array=new int[size];
        int i=0;
        System.out.println("Enter Elements of the array : ");
        for(i=0 ; i<size ; i++){
            array[i]=sc.nextInt();
        }
        
        System.out.println("Enter An Element you won't to enter in to the array : ");
        int target=sc.nextInt();
        System.out.println("Enter position : ");
        int position=sc.nextInt();

        int[] array1=new int[size+1];
        
        System.out.println("Array before adding : ");

        for(i=0 ; i<size ; i++){
            System.out.println(array[i]);
        }

        for(i=0 ; i<size+1 ; i++){
            if(position!=i){
                array1[i]=array[i];
            }
            else{
                array1[i]=target;
            }
        }

        System.out.println("Array after adding the targer : ");

        for(i=0 ; i<size+1 ; i++){
            System.out.println(array1[i]);
        }
    }
}