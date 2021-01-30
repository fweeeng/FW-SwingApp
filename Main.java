import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.ListIterator;

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
    ArrayList<String> groceries = new ArrayList<>();
    ListIterator iter8 = groceries.listIterator();


    //-------Panel 1 for textfields--------
    JPanel panel1 = new JPanel(new GridLayout(15,2,10,5));

    //-------Panel 2 for shareTipBttn--------
    JPanel panel2 = new JPanel(new GridLayout(5,5,5,5));

    //-------Label1-Start/Prompt--------
    JLabel randTip = new JLabel("<-- Get a tip for grocery shopping");

    //-------Label2--------
    JLabel label2 = new JLabel("Remove an item once you have it in your cart:");

    //-------Label3-List------
    JLabel list = new JLabel("Grocery List: ");

    //-------Textfield1-needItemName------
    JTextField needItemName = new JTextField(10);

    //-------Textfield2-haveItemName------
    JTextField haveItemName = new JTextField(10);

    //-------Button1-shareTipBttn-------
    ImageIcon cartIcon = new ImageIcon("cartIcon.png", "cart");
    JButton shareTipBttn = new JButton(cartIcon);
    shareTipBttn.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        String[] tips = {"Always Shop with a List", "Never Shop on Sunday Afternoons", "Always Grab Meat and Dairy Items Last", "Always Grab Perishable Items from the Back of the Shelf"};
        String rand = tips[(int)(Math.random()*tips.length)];
        randTip.setText(rand);
      }//what the button will do

    });//end of ActionListener

    //-------Button2-addNeedItem--------
    JButton addNeedItem = new JButton("Add item");
    addNeedItem.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        //add item to list
        groceries.add(needItemName.getText());
        System.out.println(groceries);
        needItemName.setText("");
      }
    });

    //--------Button3-removeItem-------
    JButton removeItem = new JButton("Remove item");
    removeItem.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        //remove item
        groceries.remove(haveItemName.getText());
        System.out.println(groceries);
        haveItemName.setText("");
      }
    });
    
    panel2.add(shareTipBttn);//button1

    panel1.add(randTip);//label1
    panel1.add(needItemName);//textfield1
    panel1.add(addNeedItem);//button2
    panel1.add(label2);//label2

    panel1.add(haveItemName);//textfield2
    panel1.add(removeItem);//button3
    panel1.add(list);//label3


    frame1.setVisible(true);
    frame1.getContentPane().add(BorderLayout.CENTER,panel1);
    frame1.getContentPane().add(BorderLayout.WEST,panel2);
    
    //JPanel panel2 = new JPanel(new BorderLayout(10,10));

  }//end main method

}//end class Main