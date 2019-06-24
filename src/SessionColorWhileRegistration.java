import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;

public class SessionColorWhileRegistration extends JFrame implements ActionListener {
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	JPasswordField pass;
	JCheckBox cb;
	JLabel l;
	String b="";
	int count=1;
	String temp="";
	public SessionColorWhileRegistration() throws FontFormatException, IOException
	{
		String filename="C:\\Users\\MUCB\\Downloads\\wcp.ttf";
	       Font font = Font.createFont(Font.TRUETYPE_FONT, new File(filename));
	       font = font.deriveFont(Font.PLAIN,40);
	       String file="C:\\Users\\MUCB\\Downloads\\sf.ttf";
	       Font f=Font.createFont(Font.TRUETYPE_FONT,new File(file));
	       f=f.deriveFont(Font.PLAIN,40);
		 setContentPane(new JLabel(new ImageIcon("C:\\Users\\MUCB\\Desktop\\images\\t.jpg")));
		l=new JLabel("PASSWORD : ");
		b1=new JButton();
		b2=new JButton();
		b3=new JButton();
		b4=new JButton();
		b5=new JButton();
		b6=new JButton();
		b7=new JButton();
		b8=new JButton();
		b9=new JButton("SUBMIT");
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t4=new JTextField();
		t5=new JTextField();
		t6=new JTextField();
		t7=new JTextField();
		t8=new JTextField();
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
		t5.setFont(font);
		t6.setFont(font);
		t7.setFont(font);
		t8.setFont(font);
		b9.setFont(font);
		pass=new JPasswordField();
		pass.setBounds(550,500,300,50);
		t1.setBounds(300,200,100,30);
		t2.setBounds(450,200,100,30);
		t3.setBounds(600,200,100,30);
		t4.setBounds(750,200,100,30);
		t5.setBounds(300,350,100,30);
		t6.setBounds(450,350,100,30);
		t7.setBounds(600,350,100,30);
		t8.setBounds(750,350,100,30);
		b9.setBounds(450,600,200,50);
		b9.setFont(font);
		b9.setForeground(new Color(0,255,0));
		b9.setOpaque(false);
		t1.setForeground(new Color(0,255,0));
		t2.setForeground(new Color(0,255,0));
		t3.setForeground(new Color(0,255,0));
		t4.setForeground(new Color(0,255,0));
		
		t5.setForeground(new Color(0,255,0));
		t6.setForeground(new Color(0,255,0));
		t7.setForeground(new Color(0,255,0));
		t8.setForeground(new Color(0,255,0));
	
		l.setBounds(350,500,300,50);
		cb=new JCheckBox("Show Password");
		cb.setBounds(400,450,400,30);
		cb.setFont(font);
		l.setFont(font);
		pass.setFont(f);
		cb.setForeground(new Color(0,255,0));
		  pass.setForeground(new Color(169, 169,169));
		l.setForeground(new Color(0,255,0));
		cb.setFont(font);
		cb.setOpaque(false);
		cb.addActionListener(this);
		b2.setBackground(Color.RED);
		b2.setBounds(450, 100,100, 100);
		b3.setBackground(Color.YELLOW);
		b3.setBounds(600, 100,100, 100);
		b4.setBackground(Color.PINK);
		b4.setBounds(750, 100,100, 100);
		b5.setBackground(Color.GREEN);
		b5.setBounds(300, 250,100, 100);
		b6.setBackground(Color.ORANGE);
		b6.setBounds(450, 250,100, 100);
		b7.setBackground(Color.BLACK);
		b7.setBounds(600, 250,100, 100);
		b8.setBackground(Color.MAGENTA);
		b8.setBounds(750, 250,100, 100);
		b1.setBackground(Color.GRAY);
		b1.setBounds(300, 100,100, 100);
		pass.setOpaque(false);
		 pass.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.LIGHT_GRAY));
       add(l);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(cb);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(t6);
		add(t7);
		add(t8);
		add(pass);
		add(b9);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		 b9.setBackground(new Color(37,178,170));
		 t1.setBackground(new Color(37,178,170));
		 t2.setBackground(new Color(37,178,170));
		 t3.setBackground(new Color(37,178,170));
		 t4.setBackground(new Color(37,178,170));
		 t5.setBackground(new Color(37,178,170));
		 t6.setBackground(new Color(37,178,170));
		 t7.setBackground(new Color(37,178,170));
		 t8.setBackground(new Color(37,178,170));
		
		
        setLayout(null);
		setVisible(true);
		
		 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	      setBounds(0,0,screenSize.width, screenSize.height);
		
		
		
		
	}
	public static void main(String args[]) throws FontFormatException, IOException
	{
		new SessionColorWhileRegistration();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1)
		{
			t1.setText(""+count);
		count++;
		pass.setText(""+temp+count);
		temp=pass.getText();
	
		}
		if(e.getSource()==b2)
		{
			t2.setText(""+count);
		count++;
		pass.setText(""+temp+count);
		temp=pass.getText();
		
		}
		if(e.getSource()==b3)
		{
			t3.setText(""+count);
		count++;
		pass.setText(""+temp+count);
		temp=pass.getText();
		}
		if(e.getSource()==b4)
		{
			t4.setText(""+count);
		count++;
		pass.setText(""+temp+count);
		temp=pass.getText();
		}
		if(e.getSource()==b5)
		{
			t5.setText(""+count);
		count++;
		pass.setText(""+temp+count);
		temp=pass.getText();
		}
		if(e.getSource()==b6)
		{
			t6.setText(""+count);
		count++;
		pass.setText(""+temp+count);
		temp=pass.getText();
	}
		if(e.getSource()==b7)
		{
			t7.setText(""+count);
		count++;
		pass.setText(""+temp+count);
		temp=pass.getText();
		}
		if(e.getSource()==b8)
		{
			t8.setText(""+count);
		count++;
		pass.setText(""+temp+count);
		temp=pass.getText();
				b=b+temp;
		
		}
if (e.getSource() == cb) {
    if (cb.isSelected()) {
        pass.setEchoChar((char) 0);
    } else {
        pass.setEchoChar('*');
        // b=temp;
     
    }
}
    if(e.getSource()==b9)
    {
    	//System.out.println("GAURI");
    	int x=0;
    //	System.out.println("succes");
    	  try
          {
    		  String email=RegistrationFormDesign.user;
    		  
    	    	//char s[]=temp;
    	    	String ss=temp;
System.out.println(b);
               Class.forName("oracle.jdbc.driver.OracleDriver");

               Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mucb");

               PreparedStatement ps = con.prepareStatement("insert into reg2 values(?,?)");

              ps.setString(1,email);

               ps.setString(2,temp);
               ResultSet rs = ps.executeQuery();

               x++;

               if (x > 0) 
               {

                   JOptionPane.showMessageDialog(b9, "Data Saved Successfully");
                   new Login();

               }

           }
     catch (Exception ex) 
           {

               System.out.println(ex);

           }

       
  

 } 

	
	
	}
}
