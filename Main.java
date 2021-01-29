import javax.swing.*;
import java.awt.event.*;

class Main 
{
  public static void main(String[] args) 
  {
    JFrame frame1 = new JFrame("JFrame here");
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //MUST HAVE THIS LINE
    frame1.setSize(500,500);

    //-------Button1--------
    JButton startButton = new JButton("Start");
    startButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        System.out.println("Start the charade!");
      }//what the button will do

    });//end of ActionListener
    frame1.add(startButton);
    frame1.setVisible(true);

  }//end main method
}//end class Main