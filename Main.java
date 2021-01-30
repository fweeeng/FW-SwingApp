import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
//import java.util.ArrayList;
//import java.util.ListIterator;

class Main 
{
  public static void main(String[] args) 
  {
    //
    JFrame frame1 = new JFrame("JFrame here");
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //MUST HAVE THIS LINE
    frame1.setSize(500,500);
    //frame1.setVisible(true);
    //

    //-------Panel 1 to hold buttons--------
    JPanel panel1 = new JPanel(new GridLayout(7,2,10,5));
    //-------Panel 2--------
    JPanel panel2 = new JPanel(new GridLayout(7,2,5,5));
    //-------Panel 3--------
    JPanel panel3 = new JPanel(new BorderLayout(1,1));

    //-------Label1--------
    JLabel label1 = new JLabel("label");

    //-------Label2--------
    JLabel label2 = new JLabel("label2");

    //-------Textfield1------
    JTextField textField1 = new JTextField(10);

    //-------Textfield2------
    JTextField textField2 = new JTextField(10);

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
    //frame1.add(startButton);

    //--------Button3--------
    JButton button3 = new JButton("Button3");
    button3.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        System.out.println("This is button3.");
      }
    });

    //=========Image 1========
    ImageIcon busImg = new ImageIcon("magicSchoolBus2.jpg", "The Magic School Bus!");
    JLabel magicBusPic = new JLabel(busImg);

    panel2.add(startButton);

    panel1.add(label1);
    panel1.add(textField1);
    panel1.add(button2);

    panel1.add(textField2);
    panel1.add(button3);
    panel1.add(label2);
    panel3.add(magicBusPic);

    //panel3.add(PIC);


    frame1.setVisible(true);
    frame1.getContentPane().add(BorderLayout.CENTER,panel1);
    frame1.getContentPane().add(BorderLayout.WEST,panel2);
    frame1.getContentPane().add(BorderLayout.SOUTH,panel3);
    
    //JPanel panel2 = new JPanel(new BorderLayout(10,10));

  }//end main method

}//end class Main