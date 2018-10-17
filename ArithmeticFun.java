
/**
 * Write a description of class ArithmeticFun here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArithmeticFun
{
    public static void main(String[] args)
       {
        int x = 3;
        int y = 2;
        System.out.println(x/y);//1
        System.out.println((double)x/y);//1.5
        x=x+1;
        x +=1;
        x++;
        x--;
        System.out.println(x);//5
        //////////ORDER MATTERS/////////////
        System.out.println(x++);//5
        System.out.println(++x);//7
    
    
    
    
       }
}
