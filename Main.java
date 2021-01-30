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
    JFrame frame1 = new JFrame("Grocery List & Tips");
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //MUST HAVE THIS LINE
    frame1.setSize(800,800);
    //frame1.setVisible(true);
    //

    //-------Panel 1 for textfields--------
    JPanel panel1 = new JPanel(new GridLayout(15,2,10,5));
    //-------Panel 2 for shareTipBttn--------
    JPanel panel2 = new JPanel(new GridLayout(5,5,5,5));

    //-------Label1-Start/Prompt--------
    JLabel randTip = new JLabel("<-- Get a tip for grocery shopping");

    //-------Label2--------
    JLabel label2 = new JLabel("Add another tip to save for future shopping trips:");

    //-------Label3-List------
    JLabel list = new JLabel("Grocery List: ");

    //-------Textfield1-needItem------
    JTextField needItem = new JTextField(10);

    //-------Textfield2-newTip------
    JTextField newTip = new JTextField(10);

    //-------Button1-shareTipBttn-------
    ImageIcon cartIcon = new ImageIcon("cartIcon.png", "cart");
    JButton shareTipBttn = new JButton(cartIcon);
    shareTipBttn.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        //share tip - change label1 to random tip
        System.out.println("Share tip");
      }//what the button will do

    });//end of ActionListener

    //-------Button2-addNeedItem--------
    JButton addNeedItem = new JButton("Add item");
    addNeedItem.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        //add item to list
        System.out.println("Add item");
      }
    });

    //--------Button3-addTip-------
    JButton addTip = new JButton("Add new tip");
    addTip.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        //add a tip
        System.out.println("Add a tip");
      }
    });
    
    panel2.add(shareTipBttn);//button1

    panel1.add(randTip);//label1
    panel1.add(needItem);//textfield1
    panel1.add(addNeedItem);//button2
    panel1.add(label2);//label2

    panel1.add(newTip);//textfield2
    panel1.add(addTip);//button3
    panel1.add(list);//label3


    frame1.setVisible(true);
    frame1.getContentPane().add(BorderLayout.CENTER,panel1);
    frame1.getContentPane().add(BorderLayout.WEST,panel2);
    frame1.getContentPane().add(BorderLayout.SOUTH,panel3);
    
    //JPanel panel2 = new JPanel(new BorderLayout(10,10));

  }//end main method

}//end class Main