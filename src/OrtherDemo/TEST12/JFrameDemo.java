package com.chen.ch12.JFrameDemo;

import java.awt.Color;
import java.awt.Container;

import javax.swing.*;

public class JFrameDemo {
	JFrame frame;
	Container contentPanel;
	JPanel panel;
	public JFrameDemo() {//构造方法	
		frame=new JFrame("湛江科技学院学生信息管理系统");
		frame.setBounds(400, 300,500,400); //设置窗体的大小和位置
		//frame.getContentPane().setBackground(Color.blue);//通过控制面板改变背景颜色
//		contentPanel=frame.getContentPane();//获取内容窗格
//		contentPanel.setBackground(Color.pink);//1、直接通过内容窗格改变背景颜色
        panel=new JPanel();
		panel.setBackground(Color.yellow);
//		frame.add(panel);//2、将面板直接加载到窗体上，通过面板改变窗体背景颜色
		frame.getContentPane().add(panel);//3.通过内容窗格将面板加载到窗体上，通过面板改变窗体背景颜色
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //设置窗体可以关闭
		frame.setVisible(true);     
	}

	public static void main(String[] args) {
		new JFrameDemo();		
	}
}
	