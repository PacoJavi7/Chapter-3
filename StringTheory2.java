import javax.swing.JOptionPane;
/**
 * StringMethods.java 
 *
 * @author:
 * Assignment #: 2
 * 
 * Brief Program Description:
 * 
 *
 */

public class StringTheory2
 
{
   public static void main(String[] args)
   {
       // //FIRST LETTER AND LAST LETTER
       // String word = JOptionPane.showInputDialog("Type in a word");
       // String w1 = word.substring(0,1);
       // String w2 = word.substring(word.length()-1);
       // JOptionPane.showMessageDialog(null,"Original word: "+word+"\nFirst Letter: "+w1+"\nLast Letter: "+w2);
       
       // //EMAIL
       // String email = JOptionPane.showInputDialog("Username/Email");
       // int location = email.indexOf("@");
       // String address = email.substring(location);
       // JOptionPane.showMessageDialog(null,"Email address: "+address);
       
       // //FIRST LASTNAME
       // String name = JOptionPane.showInputDialog("Write your name");
       // int sep = name.indexOf(" ");
       // String first = name.substring(0,sep);
       // String last = name.substring(sep+1);
       // JOptionPane.showMessageDialog(null,"First name: "+ first +"\nLast Name: "+last);
       
       // //PASSWORD CHECK 
       // String p1 = JOptionPane.showInputDialog("Input Passowrd");
       // String p2 = JOptionPane.showInputDialog("Re-Type Password");
       
       // if (p2.equals(p1)){
       // JOptionPane.showMessageDialog(null, "It matches");
       // }else p2 = JOptionPane.showInputDialog("Incorrect, Enter Password");
       //DICTIONARY
       String one = JOptionPane.showInputDialog("Type in word 1");
       String two = JOptionPane.showInputDialog("Type in word 2");
       String three = JOptionPane.showInputDialog("Type in word 3");
       int w12 = one.compareToIgnoreCase(two);
       int w13 = one.compareToIgnoreCase(three);
       int w23 = two.compareToIgnoreCase(three);
       System.out.println(w12);
       System.out.println(w13);
       
    }
    }

