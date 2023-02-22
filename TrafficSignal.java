package LabExam;

import java.util.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

import test.Traffic_Signal;

public class TrafficSignal extends JFrame implements ItemListener
{
	JRadioButton red;
	JRadioButton yellow;
	JRadioButton green;
	
	JTextField t;
	String msg="";
	
	int x = 0, y = 0, z = 0;
	
	public TrafficSignal(String msg)
	{
		red = new JRadioButton("Red");
		yellow = new JRadioButton("Yellow");
		green = new JRadioButton("Green");
		t = new JTextField(10);
		
		red.addItemListener(this);
		yellow.addItemListener(this);
		green.addItemListener(this);

		add(red);
		add(yellow);
		add(green);
		add(t);
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		if (e.getSource() == red) 
		{
			if (e.getStateChange() == 1) 
			{
				msg = "Stop!";
				x = 1;
				repaint();
			}
			else 
			{
				msg = "";
			}
		}
		if (e.getSource() == yellow) 
		{
			if (e.getStateChange() == 1) 
			{
				msg = "Get Ready to go!";
				y = 1;
				repaint();
			}
			else 
			{
				msg = "";
			}
		}
		if (e.getSource() == green) 
		{
			if (e.getStateChange() == 1) 
			{
				msg = "Go!!";
				z = 1;
				repaint();
			}
			else 
			{
				msg = "";
			}
		}
		t.setText(msg);
	}
	
	public void paint(Graphics g)
	{
		g.drawRect(100, 105, 110, 270);
		g.drawOval(120, 150, 60, 60);
		g.drawOval(120, 230, 60, 60);
		g.drawOval(120, 300, 60, 60);

		// Case: Red
		if (x == 1) {
			g.setColor(Color.RED);
			g.fillOval(120, 150, 60, 60);
			g.setColor(Color.WHITE);
			g.fillOval(120, 230, 60, 60);
			g.setColor(Color.WHITE);
			g.fillOval(120, 300, 60, 60);
			x = 0;
		}

		// Case: Orange
		if (y == 1) {
			g.setColor(Color.WHITE);
			g.fillOval(120, 150, 60, 60);
			g.setColor(Color.YELLOW);
			g.fillOval(120, 230, 60, 60);
			g.setColor(Color.WHITE);
			g.fillOval(120, 300, 60, 60);
			y = 0;
		}

		// Case: Green
		if (z == 1) {
			g.setColor(Color.WHITE);
			g.fillOval(120, 150, 60, 60);
			g.setColor(Color.WHITE);
			g.fillOval(120, 230, 60, 60);
			g.setColor(Color.GREEN);
			g.fillOval(120, 300, 60, 60);
			z = 0;
		}
	}
	
	public static void main(String args[])
	{
		JFrame jf = new Traffic_Signal("Traffic Light");

		jf.setSize(500, 500);
		jf.setVisible(true);
	}
}
