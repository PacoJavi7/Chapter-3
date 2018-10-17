import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
 * Rounding.java 
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */

public class Round2 
{
   public static void main(String[] args)
   {
       double d = Double.parseDouble(JOptionPane.showInputDialog("Insert Number"));
       d = Math.round((d*1000))/1000.0;
       JOptionPane.showMessageDialog(null,d);
       
       DecimalFormat round = new DecimalFormat("#.##");
       double a = Double.parseDouble(JOptionPane.showInputDialog("Insert Number"));
       a = Double.parseDouble(round.format(a));
       JOptionPane.showMessageDialog(null,a);
   }
}
