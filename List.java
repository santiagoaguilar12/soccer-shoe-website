/*Programmer: Santiago Aguilar
Program Description: Allows a user to browse a selection of cleat. Program will proceed to Details page, or back to home page
Date Created: 01/08/18
Date Revised : 01/23/18*/


import javax.swing.*;//imports necessary classes
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class List implements ActionListener
{
   JFrame frame;//declares variables of different types for each button, labe,or frame
   JPanel contentPane,logoPane,shoePane;
   JButton nike,adidas,puma,all;
   JLabel logo,listLab;
   JMenuBar menuBar;//declares menu bar, enu and menu items
   JMenu menu;
   JMenuItem back,home;
   public JButton[] shoeBtns=new JButton[10];//creates arrays of buttons and shoe objects
   public Shoe[] shoeObjs =new Shoe[10];

   public List()
   {
      frame = new JFrame("Santi's Soccer Store");//creates frame with text
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
      Font buttonFont = new Font("Monospaced", Font.BOLD, 20);//creates two different fonts to be used
      Font titleFont = new Font("Monospaced", Font.BOLD, 40);
      
      //creates a back and a home button in menu
   	menuBar=new JMenuBar();
      frame.setJMenuBar(menuBar);
      
      menu=new JMenu("Go To");
      menuBar.add(menu);
      
      back = new JMenuItem("Back");
      back.setActionCommand("back");
      back.addActionListener(this);
      menu.add(back);
      
      home = new JMenuItem("Home");
      home.setActionCommand("home");
      home.addActionListener(this);      
      menu.add(home);


   
   	
      contentPane = new JPanel();//creates main Panel
      contentPane.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));//sets border for spacing
      contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));//sets layout
      contentPane.setBackground(new Color(224, 224, 224));
   	
      logoPane = new JPanel();//creates panel for logo
      logoPane.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));//sets border for spacing
      logoPane.setBackground(new Color(224, 224, 224));
   
      shoePane = new JPanel();//creates panel for all cleats to be displayed
      shoePane.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));//sets border for spacing
      shoePane.setLayout(new GridLayout(0,4, 10, 5));//sets grid with a max of 4 columns   
      shoePane.setBackground(new Color(224, 224, 224));
   
      logo = new JLabel(new ImageIcon("background1.jpg"));//creates new label with a logo image
      logo.setAlignmentX(JLabel.CENTER_ALIGNMENT);//aliigns to center
      logo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0,0));//sets border for spacing
      logoPane.add(logo);//adds logo to logo pane
      contentPane.add(logoPane);//adds logoPane to contentPane
      
      listLab=new JLabel("Select Your Cleats");//creates Label with instructions
      listLab.setAlignmentX(JLabel.CENTER_ALIGNMENT);//aliigns to center
      listLab.setVerticalTextPosition(SwingConstants.TOP);//sets text position
      listLab.setHorizontalTextPosition(SwingConstants.CENTER);   
      listLab.setBorder(BorderFactory.createEmptyBorder(0, 0, 0,0));//sets border for spacing
      listLab.setFont(titleFont);//sets font
      contentPane.add(listLab);//adds to contentPane
        
   	
      CreateBtnArray itemBtns=new CreateBtnArray(shoeBtns);//sends shoeBtns to createBtn array
      shoeBtns=itemBtns.fillBtnArray();//fills shoebtns with shoe buttons
   	
      CreateObjArray itemObjs=new CreateObjArray(shoeObjs);//sends shoeObjs to createObj array
      shoeObjs=itemObjs.fillObjArray();//fills shoeObjs with shoe objects
         
      for(int y=0;y<10;y++)
      {
         if(Store.getChoice()==1)//if brand chosen before is nike
         {
            if((shoeObjs[y].getBrand()).equals("Nike"))//if brand of shoe object is nike
            {
               shoeBtns[y].addActionListener(this);//add action listener and add to shoe pane
               shoePane.add(shoeBtns[y]);
            
            }
         }
         else if(Store.getChoice()==2)//same as for nike but with adidas objects
         {
            if(shoeObjs[y].getBrand().equals("Adidas"))
            {
               shoeBtns[y].addActionListener(this);
               shoePane.add(shoeBtns[y]);
            
            }
         }
         else if(Store.getChoice()==3)//same as nike and adidas
         {
            if(shoeObjs[y].getBrand().equals("Puma"))
            {
               shoeBtns[y].addActionListener(this);
               shoePane.add(shoeBtns[y]);
            
            }			
         
         }
         else//if option 4 is chosen, which is all cleats
         {
            shoeBtns[y].addActionListener(this);
            shoePane.add(shoeBtns[y]);
         
         
         }
      
      }
   
   
   
      JScrollPane paneScr=new JScrollPane(shoePane);//creates a scrollPane and adds the shoe Pane to it
      paneScr.getVerticalScrollBar().setUnitIncrement(12);// sets unit increment for scroll bar
   	
      contentPane.add(paneScr);//adds scroll bar to content Pane   
      frame.setContentPane(contentPane);//sets content pane
      frame.setExtendedState(Frame.MAXIMIZED_BOTH);//maximizes frame   
      frame.setVisible(true);//shows frame
   
   
   }

//Handle a button
//Pre: none
//Post: A shoe has been seected. Matching detail page shown. Or the customer is sent back to home page
   public void actionPerformed(ActionEvent event)
   {
      String eventName = event.getActionCommand();//converrs actionCommand to a string      
      frame.setVisible(false);//hides frame
      if(eventName.equals("magista"))//sends shoe object to details page
      {
         Details start  = new Details(shoeObjs[0]);
      	
      }
      else if(eventName.equals("hypervenom"))
      {
         Details start  = new Details(shoeObjs[1]);//sends shoe object to details page
      	
      }
      
      else  if(eventName.equals("mercurial"))
      {
         Details start  = new Details(shoeObjs[2]);//sends shoe object to details page
      	
      }
      
      else  if(eventName.equals("tiempo"))
      {
         Details start  = new Details(shoeObjs[3]);//sends shoe object to details page
      	
      }
      
      else  if(eventName.equals("ace"))
      {
         Details start  = new Details(shoeObjs[4]);//sends shoe object to details page
      	
      }
      
      else  if(eventName.equals("x"))
      {
         Details start  = new Details(shoeObjs[5]);//sends shoe object to details page
      	
      }
      
      else  if(eventName.equals("nemeziz"))
      {
         Details start  = new Details(shoeObjs[6]);//sends shoe object to details page
      	
      }
      
      else  if(eventName.equals("copa"))
      {
         Details start  = new Details(shoeObjs[7]);//sends shoe object to details page
      	
      }
      
      else  if(eventName.equals("power"))
      {
         Details start  = new Details(shoeObjs[8]);//sends shoe object to details page
      	
      }
      else 	if(eventName.equals("speed"))
      {
         Details start  = new Details(shoeObjs[9]);//sends shoe object to details page
      	
      }
       else if(eventName.equals("back")|| eventName.equals("home"))
      {
         Store start= new Store();//sends customer back to home page
      }

   
      frame.setVisible(false);//hides frame
   
   
   }
   private static void runGUI()
   {
      try 
      {
         JFrame.setDefaultLookAndFeelDecorated(false);
      
      	if(Store.homeStarted()==true)
         {	
         List start  = new List();//creates and runs List class
      	}
         else
         {
            Store start = new Store();
         
         }
        					
      } 
      catch (Exception e)
      {
         e.printStackTrace();
      }   
   }

   public static void main(String[] args)
   //Methods that create and show a GUI should be run from
   //an event-dispatching thread.
   {
      javax.swing.SwingUtilities.invokeLater(
            new Runnable()
            {
               public void run()
               {
                  runGUI();
               }
            });
   }
}