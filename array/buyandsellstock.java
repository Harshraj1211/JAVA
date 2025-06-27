package array;
import java.util.*;
public class buyandsellstock {
    public static int buyandsellstock(int price[],int days){
        int buyingprice=Integer.MAX_VALUE; // initilisaing buying price to maximum.
        int maxprofit=0;
        int i=0;
        for(i=0 ; i<days ; i++){
            if(buyingprice<price[i]){
                int profit=price[i]-buyingprice;
                maxprofit=Math.max(maxprofit,profit);
            }
            else{
                buyingprice=price[i];
            }
        }
        return maxprofit;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter count of the days : ");
        int days=sc.nextInt();
        int price[]=new int[days];
        int i=0;
        System.out.println("Enter price of the stock : ");
        for(i=0 ; i<days ; i++){
            price[i]=sc.nextInt();
        }
        System.out.println("Maximum profit : "+buyandsellstock(price,days));
    }
}
