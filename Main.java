import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
//import java.util.ArrayList;
//import java.util.ListIterator;

class Main 
{
  public static void main(String[] args) 
  {
    JFrame frame1 = new JFrame("JFrame here");
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //MUST HAVE THIS LINE
    frame1.setSize(500,500);
    frame1.setVisible(true);

    //-------Panel to hold buttons--------
    JPanel panel1 = new JPanel(new GridLayout(2,2,20,20));

    //-------Label 1 --------


    //-------Button1--------
    JButton startButton = new JButton("Start");
    startButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        System.out.println("Start the charade!");
      }//what the button will do

    });//end of ActionListener

    //-------Button2---------
    JButton button2 = new JButton("Button2");
    button2.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        System.out.println("This is button2.");
      }
    });
    frame1.add(startButton);
    frame1.setVisible(true);

    panel1.add(startButton);
    panel1.add(button2);

    frame1.getContentPane().add(BorderLayout.NORTH,panel1);
    //JPanel panel2 = new JPanel(new BorderLayout(10,10));

  }//end main method
}//end class Main