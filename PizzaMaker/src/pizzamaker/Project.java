package pizzamaker;
import javax.swing.*;
import java.awt.*;
import static java.awt.BorderLayout.SOUTH;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener {
  
    String[] comboBoxValues ={"Large","Medium","Small"};
    //String[] comboBoxValues = {"Priyanka's Pepperoni Pizza","Multigrain Pizza ","Meat Pizza Recipe",
      //  "Margherita Pizza","Vegetarian Pizza","Neapolitan pizza","Other"};
    JCheckBox item = new JCheckBox("potato");
     JCheckBox item2 = new JCheckBox("chicken");
      JCheckBox item3 = new JCheckBox("olive");
       JCheckBox item4 = new JCheckBox("beef");
       JCheckBox item5 = new JCheckBox("tomatoes");
     JCheckBox item6 = new JCheckBox("bruccoli");
      JCheckBox item7 = new JCheckBox("onion");
       JCheckBox item8 = new JCheckBox("cornMeal");
       JCheckBox item9 = new JCheckBox("mushroom");
     JCheckBox itemA = new JCheckBox("macrooni");
      JCheckBox itemB = new JCheckBox("pepper");
       JCheckBox itemC = new JCheckBox("salt");
       
     private JComboBox size2 = new JComboBox(comboBoxValues);
    JPanel pl = new JPanel();JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();JPanel p4 = new JPanel(); 
         Panel p = new Panel(); Panel p5 = new Panel();
         Panel p6 = new Panel(); Panel p7 = new Panel();
    
    
JButton submit =new JButton ("Continue");
JButton clear =new JButton ("Clear");
ButtonGroup the = new ButtonGroup();


JRadioButton water = new JRadioButton ("water", false);
JRadioButton sugar = new JRadioButton ("sugar", false);
JRadioButton flour = new JRadioButton ("flour", false);
ButtonGroup sexGroup = new ButtonGroup();
JTextArea area= new JTextArea(5,25);
JTextArea area2= new JTextArea(5,25);

ImageIcon imageLocation = new ImageIcon("C:\\Users\\King James\\Desktop\\PizzaMaker\\pizza.png");
JLabel pictureLabel = new JLabel();

JLabel size = new JLabel("Please select prefered Pizza size : ");
    
    Project(){
        setLayout(new FlowLayout());
        setTitle("My form");
        setSize(590,550);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//panel.setLayout(new BorderLayout ());
 p.setLayout(new BorderLayout(0,0));
p2.setLayout(new GridLayout (0,1));
    p3.setLayout(new GridLayout (1,3));
   p4.setLayout(new GridLayout (1,2));
    p5.setLayout(new GridLayout (0,2));
  p6.setLayout(new GridLayout (2,2));
  p7.setLayout(new GridLayout (1,0));
  add(p); add(p2); add(p3);add(p4);add(p5);add(p6);add(p7);
               
    p.add(new JLabel("DOMINO'S PIZZA MAKER               "));
pictureLabel.setIcon(imageLocation);
pictureLabel.setPreferredSize(new Dimension(500,250));
p2.add(pictureLabel);
//p.add((area2), SOUTH);
p3.add(size);
size2.setSelectedIndex(-1);
p3.add(size2);
p4.add(new JLabel("Major ingredient  :"));

p4.add(sugar);
p4.add(water);
p4.add(flour);



p5.add(new JLabel("    Please select other prefered ingredients:    "));
p6.add(item); p6.add(item2);p6.add(item3); p6.add(item4); p6.add(item5);p6.add(item6);p6.add(item7);
p6.add(item8); p6.add(item9);p6.add(itemA);p6.add(itemB);p6.add(itemC);


p7.add(new JLabel("Click Continue to proccess:  "),SOUTH);
p7.add((submit),SOUTH);
p7.add((clear),SOUTH);

submit.addActionListener(this);
clear.addActionListener(this);


setVisible(true);
    }

    
     
    public void actionPerformed (ActionEvent action){
        
       String pizzaa = " " ;
       String items= "";
        String ing= "" ;
        if(action.getSource()== submit){
            
if ( size2.getSelectedIndex()== -1){
   if (!(this.sugar.isSelected() && 
                this.flour.isSelected() &&  
                this.water.isSelected())){ 
                     
JOptionPane.showMessageDialog(null,
        "Make a complete selection + all major ingredient"); return; } 
   JOptionPane.showMessageDialog(null,
        "Please select size");return;}
             // if (country.getSelectedIndex()== 0)
       // {String pizaa = "No selection";    }
       
              if (size2.getSelectedIndex()== 1)
        { pizzaa += comboBoxValues[1];    }
        else if (size2.getSelectedIndex()== 2)
        { pizzaa += comboBoxValues[2];    }
        else if (size2.getSelectedIndex()== 3)
        { pizzaa += comboBoxValues[3];    }
        
        
              if (item.isSelected())  items += "Cheese,  \n"; 
               if (item2.isSelected()) items += "Chicken,  \n";
                if (item3.isSelected()) items += "olive,  \n";
               if (item4.isSelected()) items += "beef,  \n";
                if (item5.isSelected()) items += "tomatoes,  \n";
               if (item6.isSelected()) items += "bruccoli,  \n";
                if (item7.isSelected()) items += "onion,  \n";
               if (item8.isSelected()) items += "cornMeal,  \n";
                if (item9.isSelected()) items += "mushroom,  \n";
               if (itemA.isSelected()) items += "macrooni,  \n";
                if (itemB.isSelected()) items += "pepper,  \n";
                 if (itemC.isSelected()) items += "salt,  \n";
     
                 if (item.isSelected())  ing = "Cheese,  \n"; 
               if (item2.isSelected()) ing = "Chicken,  \n";
                if (item3.isSelected()) ing = "olive,  \n";
               if (item4.isSelected()) ing = "beef,  \n";
                if (item5.isSelected()) ing = "tomatoes,  \n";
               if (item6.isSelected()) ing = "bruccoli,  \n";
                if (item7.isSelected()) ing = "onion,  \n";
               if (item8.isSelected()) ing = "cornMeal,  \n";
                if (item9.isSelected()) ing = "mushroom,  \n";
               if (itemA.isSelected()) ing = "macrooni,  \n";
                if (itemB.isSelected()) ing = "pepper,  \n";
                
       //JOptionPane.showMessageDialog(null, pizzaa);
              type f2 = new type();
             f2.setItem(items);
              f2.setNme(ing);
            
             dispose();}
     
         
     if (action.getSource()== clear){
        size2.setSelectedIndex(-1);
          water.setSelected(false);
           sugar.setSelected(false);
            flour.setSelected(false);
            //sexGroup.clearSelection();
            //item2.doClick();
 item2.setSelected(false); item.setSelected(false); item3.setSelected(false);
  item4.setSelected(false); item5.setSelected(false); item6.setSelected(false);
   item7.setSelected(false); item8.setSelected(false); item9.setSelected(false);
   itemA.setSelected(false); itemB.setSelected(false); itemC.setSelected(false);     
        
        }
    }

     
     public static void main(String[] args) {
Project form =new Project();

    }
    

}
