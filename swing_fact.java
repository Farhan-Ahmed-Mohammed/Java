import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class swing_fact
{
    @SuppressWarnings("static-access")
    public static void main(String[] args)
    {
        JFrame f=new JFrame("Factorial");
        f.setBounds(10,10,500,500);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        JLabel l=new JLabel("  Enter a numbers :");
        JTextField tf=new JTextField(20);
        tf.setVisible(true);
        l.setVisible(true);
        JLabel result=new JLabel();
        JButton b=new JButton("Factorial");
        b.setVisible(true);
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                int n1=Integer.parseInt(tf.getText());
                result.setText("Result : "+fact(n1));

            }
        });
    
        f.add(l);
        f.add(tf);
        f.add(b);
        f.add(result);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
 
static int fact(int n1)
{
   if(n1==0 || n1==1)
   {
    return 1;
   }

   else
   {
    return n1*fact(n1-1);
   }
}
}