import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.swing.*;

public class end extends JFrame {
	end() throws FontFormatException, IOException
	{
		String filename="C:\\Users\\MUCB\\Downloads\\wcp.ttf";
	    Font font = Font.createFont(Font.TRUETYPE_FONT, new File(filename));
	    font = font.deriveFont(Font.PLAIN,70);
		setContentPane(new JLabel(new ImageIcon("C:\\Users\\MUCB\\Desktop\\images\\iron.jpg")));
		JLabel j=new JLabel("Logged in successfully");
		j.setBounds(400,200,900,100);
		j.setFont(font);
		j.setForeground(new Color(0,255,0));
		j.setBackground(new Color(37,178,170));
	//	j.setOpaque(false);
		add(j);
		pack();
		 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	      setBounds(0,0,screenSize.width, screenSize.height);
		setVisible(true);
		
	}/*
	public static void main(String args[]) throws FontFormatException, IOException
	{
		new end();
	}*/

}
