package string;
import java.util.*;
public class getshortedpath {
    public static float getshortedpath(String str){
        int i=0;
        int j=0;
        int x=0;
        int y=0;
        for(i=0 ; i<str.length() ; i++){
            char path=str.charAt(i);
            if(path== 'S' || path== 's'){
                y--;
            }
            else if(path== 'N' || path== 'n'){
                y++;
            }
            else if(path== 'E' || path== 'e'){
                x--;
            }
            else if(path== 'W' || path== 'w'){
                x++;
            }
        }
        int x2=x*x;
        int y2=y*y;         // distence between 2 point in any quadrant is = sqrt(squar of(x2-x1)+squar of(y2-y1))

        return (float)Math.sqrt(x2+y2);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter path : ");
        System.out.println("W for West,E for East,N for North,S for South.");
        String str=sc.nextLine();
        System.out.println(getshortedpath(str));
    }
}
