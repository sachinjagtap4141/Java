package HundreadJavaProgram;

import java.awt.Frame;
import java.awt.TextArea;

public class TextArea76 {
	TextArea76(){
		Frame f= new Frame();
		TextArea area=new TextArea("Welcome to Technolamror");
		area.setBounds(10,30, 300,300);
		f.add(area);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		}
		public static void main(String args[])
		{
		new TextArea76();
		}
	
	
	
	
}
