
/**
 * StringTheory.java 
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */

public class StringTheory 
{
   public static void main(String[] args)
   {
       String text = "Hello";
       System.out.println(text.length());
       //length of hello is 5, indexed 0-4(h is 0, o is 4)
       
       System.out.println(text.charAt(0));
       System.out.println(text.charAt(4));
       System.out.println(text.charAt(text.length()-1));
       System.out.println(text.indexOf("e"));
       System.out.println(text.indexOf("l"));//indexOf looks for only the first occurance
       System.out.println(text.indexOf("b"));//gives -1, default for letter not in String
       System.out.println(text.indexOf("h"));//gives -1, because treats UpperCase and LowerCase differently
       
       int x = 5;
       int y = 7;
       System.out.println(x==y);
       
       String w = "Brett";
       String w2 = "John";
       System.out.println(w.equals(w2));//can't use == with Strings
       
       String w3 = "brett";
       System.out.println(w.equals(w3));//false uppercase
       System.out.println(w.equalsIgnoreCase(w3));
       
       String a = "aardvark";
       String a2 = "brontosaurus";
       System.out.println(a.compareTo(a2)); // -1
       System.out.println(a2.compareTo(a)); // -1
       String a3 = "emu";
       System.out.println(a2.compareTo(a3));// -4, compareTo takes the difference between the first letter of both words
       System.out.println("Emu".compareTo(a3));// -32
       String a4 = "ant";
       String a5 = "anteaters";
       System.out.println(a4.compareTo(a5));
       String a6 = "narwhal";
       System.out.println(a6.substring(3)); // returns whal
       
       System.out.println(a6.substring(a6.length()-1));// prints the last letter
       //one substring method you put in the value(start)
       System.out.println(a6.substring(0,2));
       //Second substring prints a range of letters (start, end)
       System.out.println(a6.substring(3,5)); //prints out wh
       System.out.println(a6.substring(3,7)); //print whal because 7 is exclusive
       System.out.println(a6.substring(3,8)); //out of bounds
    }
}
