import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.*;

public class RegistrationFormDesign extends JFrame  implements ActionListener{

JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,s1,s2,s3;
static String user;
JPanel panel;
JFrame jf;
JButton register;
JTextField textfield1,textfield2,textfield3,textfield4a,textfield4b,textfield4c,textfield5,textfield6,textfield7,textfield8,textfield9;
JPasswordField passwordfield1;
JRadioButton radiobutton2,radiobutton3;
String name,gender,dob1,dob2,dob,dobb,password,mobileNumber,email,area,state,nationality,selectedState;
JComboBox combobox1;
Connection con1;
Statement st1;
int index,count;
String states[] = new String[50];


public RegistrationFormDesign() throws FontFormatException, IOException 
{
	String filename="C:\\Users\\MUCB\\Downloads\\wcp.ttf";
	Font font = Font.createFont(Font.TRUETYPE_FONT, new File(filename));
	font = font.deriveFont(Font.PLAIN,30);
setContentPane(new JLabel(new ImageIcon("C:\\Users\\MUCB\\Desktop\\images\\y.png")));

Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
setBounds(0,0,screenSize.width, screenSize.height);
setVisible(true);

label1=new javax.swing.JLabel("Registration Form");
label1.setFont(font);
label1.setBounds(500,20,400,40);
add(label1);
label1.setForeground(new Color(0, 255,0));

label2=new javax.swing.JLabel("Name");
label2.setFont(font);
label2.setForeground(new Color(0, 255,0));
label2.setBounds(400,80,150,40);
add(label2);

label3=new javax.swing.JLabel("Gender");
label3.setFont(font);
label3.setForeground(new Color(0, 255,0));
label3.setBounds(400,140,150,40);
add(label3);

label4=new javax.swing.JLabel("Password");
label4.setFont(font);
label4.setForeground(new Color(0, 255,0));
label4.setBounds(400,200,150,40);
add(label4);

label5=new javax.swing.JLabel("DOB");
label5.setFont(font);
label5.setBounds(400,240,150,80);
label5.setForeground(new Color(0, 255,0));
add(label5);

label7=new javax.swing.JLabel("E-mail");
label7.setFont(font);
label7.setBounds(400,320,150,40);
label7.setForeground(new Color(0, 255,0));
add(label7);

label9=new javax.swing.JLabel("State");
label9.setFont(font);
label9.setBounds(400,380,150,40);
label9.setForeground(new Color(0,255,0));
label9.setOpaque(false);
add(label9);

textfield1=new javax.swing.JTextField();
textfield1.setFont(font);
textfield1.setBackground(new Color(37,178,170));
textfield1.setForeground(new Color(0, 255,0));
textfield1.setOpaque(false);
textfield1.setBounds(650,80,180,30);
textfield1.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.LIGHT_GRAY));


add(textfield1);

label10=new javax.swing.JLabel("Male");
label10.setFont(font);
label10.setBounds(680,140,100,40);
label10.setForeground(new Color(0,255,0));
add(label10);

label11=new javax.swing.JLabel("Female");
label11.setFont(font);
label11.setBounds(770,140,100,40);
label11.setForeground(new Color(0,255,0));
add(label11);

label12=new javax.swing.JLabel("Nationality");
label12.setFont(font);
label12.setBounds(400,440,150,40);
label12.setForeground(new Color(0,255,0));
add(label12);

radiobutton2=new JRadioButton();
radiobutton2.setFont(font);
radiobutton2.setBounds(650,140,20,30);
radiobutton2.setForeground(new Color(0,255,0));
radiobutton2.setOpaque(false);
add(radiobutton2);

radiobutton3=new JRadioButton();
radiobutton3.setFont(font);
radiobutton3.setBounds(740,140,20,30);
radiobutton3.setForeground(new Color(0,255,0));
radiobutton3.setOpaque(false);
add(radiobutton3);

ButtonGroup jb = new ButtonGroup();
jb.add(radiobutton2);
jb.add(radiobutton3);

textfield3=new JPasswordField();
textfield3.setFont(font);
textfield3.setBounds(650,200,180,30);
textfield3.setBackground(new Color(37,178,170));
textfield3.setOpaque(false);
textfield3.setForeground(new Color(0, 255,0));
textfield3.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.LIGHT_GRAY));
add(textfield3);

textfield4a=new JTextField();
textfield4a.setFont(font);
textfield4a.setBounds(650,260,40,30);
textfield4a.setBackground(new Color(37,178,170));
textfield4a.setOpaque(false);
textfield4a.setForeground(new Color(0, 255,0));
textfield4a.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.LIGHT_GRAY));
add(textfield4a);

s1=new javax.swing.JLabel("/");
s1.setFont(font);
s1.setBounds(695,260,20,30);
s1.setForeground(new Color(0,255,0));
add(s1);

textfield4b=new javax.swing.JTextField();
textfield4b.setFont(font);
textfield4b.setBounds(710,260,40,30);
textfield4b.setForeground(new Color(0,255,0));
textfield4b.setBackground(new Color(37,178,170));
textfield4b.setOpaque(false);
textfield4b.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.LIGHT_GRAY));
add(textfield4b);

s2=new javax.swing.JLabel("/");
s2.setFont(font);
s2.setForeground(new Color(0,255,0));
s2.setBounds(755,260,20,30);
add(s2);

textfield4c=new javax.swing.JTextField();
textfield4c.setFont(font);
textfield4c.setBounds(770,260,100,30);
textfield4c.setBackground(new Color(37,178,170));
textfield4c.setForeground(new Color(0, 255,0));
textfield4c.setOpaque(false);
textfield4c.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.LIGHT_GRAY));
add(textfield4c);



textfield6=new JTextField();
textfield6.setFont(font);
textfield6.setForeground(new Color(0, 255,0));
textfield6.setBounds(650,320,180,30);
textfield6.setBackground(new Color(37,178,170));
textfield6.setOpaque(false);
textfield6.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.LIGHT_GRAY));
add(textfield6);

textfield8=new javax.swing.JTextField();
textfield8.setFont(font);
textfield8.setForeground(new Color(0, 255,0));
textfield8.setBounds(650,440,180,30);
textfield8.setBackground(new Color(37,178,170));
textfield8.setOpaque(false);
textfield8.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.LIGHT_GRAY));
add(textfield8);



register = new JButton("<html><u>Register</u></html>");
register.setFont(font);
register.setBounds(550,550,150,50);
register.setForeground(new Color(0, 255,0));
add(register);
register.setBackground(new Color(37,178,170)); 
register.setOpaque(false);

combobox1 = new JComboBox();
combobox1.setBounds(650,380,180,30);
combobox1.setFont(font);
combobox1.setForeground(new Color(0, 255,0));
combobox1.setBackground(new Color(8,146,208));
combobox1.setOpaque(false);
combobox1.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.LIGHT_GRAY));
add(combobox1);

states[0] = "Andra Pradesh";
states[1] = "Arunachal Pradesh";
states[2] = "Assam";
states[3] = "Bihar";
states[4] = "Chhattisgarh";
states[5] = "Goa";
states[6] = "Gujarat";
states[7] = "Haryana";
states[8] = "Himachal Pradesh";
states[9] = "Jammu and Kashmir";
states[10] = "Jharkhand";
states[11] = "Karnataka";
states[12] = "Kerala";
states[13] = "Madya Pradesh";
states[14] = "Maharashtra";
states[15] = "Manipur";
states[16] = "Meghalaya";
states[17] = "Mizoram";
states[18] = "Nagaland";
states[19] = "Orissa";
states[20] = "Punjab";
states[21] = "Rajasthan";
states[22] = "Sikkim";
states[23] = "Tamil Nadu";
states[24] = "Tripura";
states[25] = "Uttaranchal";
states[26] = "Uttar Pradesh";
states[27] = "West Bengal";
states[28] = "Andaman and Nicobar Islands";
states[29] = "Chandigarh";
states[30] = "Dadar and Nagar Haveli";
states[31] = "Daman and Diu";
states[32] = "Delhi";
states[33] = "Lakshadeep";
states[34] = "Pondicherry";

for (int j= 0 ; j< 35; j++) { combobox1.addItem(states[j]);
combobox1.setOpaque(false);} gender = ""; 

register.addActionListener(this);
combobox1.addActionListener(this);

setLayout(null);
setVisible(true);
setResizable(false);
combobox1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent event)
{
Object selectedStateobj = combobox1.getSelectedItem();
selectedState = String.valueOf(selectedStateobj);
index = combobox1.getSelectedIndex();

}
});

radiobutton2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
gender = "Male";
}
});
radiobutton3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
gender = "Female";
}
});






}




public void actionPerformed(ActionEvent e) 
{

   if (e.getSource() == register)
    {

       int x = 0;
       name = textfield1.getText();
       password = textfield3.getText();
       dob = textfield4a.getText();
       dob1 = textfield4b.getText();
       dob2 = textfield4c.getText();
       dobb = dob + "/" + dob1 + "/" + dob2;
       email = textfield6.getText();
       state = selectedState;
       nationality = textfield8.getText();
       
       if(email!=null) {
           try
          {
user=email;
               Class.forName("oracle.jdbc.driver.OracleDriver");

               Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mucb");

               PreparedStatement ps = con.prepareStatement("insert into reg values(?,?,?,?,?,?)");

               ps.setString(1, name);

               ps.setString(2, password);

               ps.setString(3, dobb);

               ps.setString(4, email);

               ps.setString(5, state);

               ps.setString(6, nationality);

               ResultSet rs = ps.executeQuery();

               x++;

               if (x > 0) 
               {

                   JOptionPane.showMessageDialog(register, "Data Saved Successfully");
                   new SessionWhileRegistration();

               }
               else
               {
            	   JOptionPane.showMessageDialog(register, "Please enter valid information");
               }

           }
     catch (Exception ex) 
           {

               System.out.println(ex);

           }

       }
     else
      {

           JOptionPane.showMessageDialog(register, "Enter valid information");

       } 

   } 

else
  {

       textfield1.setText("");

       textfield3.setText("");

       textfield4a.setText("");
 
       textfield4b.setText("");

       textfield4c.setText("");

       textfield6.setText("");

       textfield8.setText("");}}

 
      

 /*      

public static void main(String args[]) throws FontFormatException, IOException {
	 new RegistrationFormDesign();
	}*/

}