package LabExam;

import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations obj = new Operations();
	}

}


class Operations extends JFrame implements ActionListener
{
	JTextField t1,t2;
	JButton add,sub,mult,div,clear;
	JLabel l;
	
	public Operations()
	{
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		add = new JButton("Add");
		sub = new JButton("Subtract");
		mult = new JButton("Multiply");
		div = new JButton("Divide");
		l = new JLabel("Result");
	
		add(t1);
		add(t2);
		add(add);
		add(sub);
		add(mult);
		add(div);
		add(l);
		
		add.addActionListener(this);
		sub.addActionListener(this);
		mult.addActionListener(this);
		div.addActionListener(this);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		double a=Double.parseDouble(t1.getText());
		l.setText("a is: "+a);
		double b=Double.parseDouble(t1.getText());
		l.setText("b is: "+b);
		double rslt=0;
		
		if (e.getSource()==add)
		{
			rslt=a+b;
		}
		else if (e.getSource()==sub)
		{
			rslt=a-b;
		}
		else if (e.getSource()==mult)
		{
			rslt=a*b;
		}
		else 
		{
			if (b != 0)
			{
				rslt=a/b;
			}
		}
		if (b!=0)
		{
			l.setText("Result is: "+rslt);
		}
		else
		{
			l.setText("Division by Zero not possible");
		}
	}
}
































