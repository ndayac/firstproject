
package pizzamaker;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class type extends JFrame implements ActionListener {

    JLabel Label2 = new JLabel("your prefered ingredients are: ");
    JLabel lLabel = new JLabel();
JButton Continue =new JButton ("Submit");
JButton Return =new JButton ("Return"); 
JPanel p2 = new JPanel();JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    
    ImageIcon image1 = new ImageIcon("C:\\Users\\King James\\Desktop\\PizzaMaker\\chick.png");
JLabel pic1 = new JLabel();
ImageIcon image2 = new ImageIcon("C:\\Users\\King James\\Desktop\\PizzaMaker\\Mveg.png");
JLabel pic2 = new JLabel();
ImageIcon image3 = new ImageIcon("C:\\Users\\King James\\Desktop\\PizzaMaker\\meat.png");
JLabel pic3 = new JLabel();
ImageIcon image4 = new ImageIcon("C:\\Users\\King James\\Desktop\\PizzaMaker\\pizza.png");
JLabel pic4 = new JLabel();
ImageIcon image5 = new ImageIcon("C:\\Users\\King James\\Desktop\\PizzaMaker\\pizza.png");
JLabel pic5 = new JLabel();
    public Object item;
    
    
     type(){
         
        setLayout(new FlowLayout(1));
        setTitle("Form2");
        setSize(500,550);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     
        
        pic1.setIcon(image1);
        //add(pic1);  
   add(p2); 
   add(p3);
   add(p4);
   p2.add(Label2);
  p2.add(lLabel); 
   
add(Continue);
add(Return);

Continue.addActionListener(this);
Return.addActionListener(this);
setVisible(true);}
     
    

  public void actionPerformed (ActionEvent e){ 
      if (e.getSource()==Continue){
            // Final f3 = new Final();
             dispose();
      
            JOptionPane.showMessageDialog(null,"Thanks for ordering. \n Your pizza is in process \n Please wait ");
            
             //dispose();
            
       }
             
            
       
            else if (e.getSource()== Return){
                      Project form = new Project();
      
  dispose();
  }
  
  }

    void setItem(String items) { 
        this.lLabel.setText(items);
       // if (item.isSelected()){
       // add(pic1);}
       //Project form =new Project();
           // if (this.item.isSelected(true)){
           //    JOptionPane.showMessageDialog(null,
        //"checked");}
      //add(pic1);
    }
    void setNme(String ing){
        
        //if (item.setSelected(true))
             if   (ing== "Cheese,  \n" || ing== "Chicken,  \n" && ing!= "beef,  \n" && ing!= "tomatoes,  \n"
                     && ing!= "bruccoli,  \n"&& ing!= "onion,  \n")
        {
            JLabel ck = new JLabel("You seem to have ordered a Chicken pizza: ");
            p3.add(ck);
        p4.add(pic1);}
             
             else if ( ing== "onion,  \n" && ing!= "Chicken,  \n" && ing!= "beef,  \n" && ing== "tomatoes,  \n"
                     && ing== "bruccoli,  \n" || ing== "Cheese,  \n")
        {
            JLabel veg = new JLabel("You seem to have ordered a vegetarian pizza: ");
            p3.add(veg);
        p4.add(pic2);}
             
             else if   (ing== "Cheese,  \n" && ing!= "Chicken,  \n" && ing== "beef,  \n" && ing!= "tomatoes,  \n"
                     && ing!= "bruccoli,  \n"|| ing== "onion,  \n")
        {
            JLabel meat = new JLabel("You seem to have ordered a Meat pizza: ");
            p3.add(meat);
        p4.add(pic3);}
    }
    
    
        
    
  
     //f2.setIconImage(image);

    //public  void setnme(ImageIcon image2, String items) {
        
       // if   (items== "Cheese,  \n")
      //  {
      //  add(pic1);}
        //return null;
    
   //    pic1= this.setIconImage(image2); 
    //}
      }

    

