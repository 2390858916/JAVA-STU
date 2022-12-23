package com.chen.ch12.JRadioButtonDemo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JRadioDemo {
	static JLabel label;// 标签
	static JRadioButton plain;// 单选按钮
	static JRadioButton bold;
	static JRadioButton italic;
	static ButtonGroup buttonG;// 按钮组
	static Font fontP, fontB, fontI;
	static JFrame frame;

	public static void main(String[] args) {
		frame = new JFrame("单选按钮演示窗口");
		frame.setBounds(200, 300, 500, 400); // 设置窗体大小和位置
		frame.setLayout(null);
		fontP = new Font("", Font.PLAIN, 24);// 创建“正常”字体对象
		fontB = new Font("", Font.BOLD, 24);// 创建“加粗”字体对象
		fontI = new Font("", Font.ITALIC, 24);// 创建“斜体”字体对象
		label = new JLabel("你已选择正常字体！");// 创建标签对象
		plain = new JRadioButton("正常", true);// 创建正常单选按钮对象
		bold = new JRadioButton("加粗", false);// 创建加粗单选按钮对象
		italic = new JRadioButton("斜体", false);// 创斜体单选按钮对象
		label.setFont(fontP);// 设置标签文字为“正常”字体
		label.setBounds(120, 100, 240, 60);
		plain.setBounds(100, 10, 80, 60);
		bold.setBounds(200, 10, 80, 60);
		italic.setBounds(300, 10, 80, 60);
		frame.getContentPane().add(plain);
		frame.add(bold);
		frame.add(italic);
		frame.add(label);
		plain.addItemListener(new Handler1());
		bold.addItemListener(new Handler1());
		italic.addItemListener(new Handler1());
		buttonG = new ButtonGroup();//创建按钮组对象
		buttonG.add(plain);//将单选按钮plain对象添加到按钮组对象buttonG
		buttonG.add(bold);//将单选按钮bold对象添加到按钮组对象buttonG
		buttonG.add(italic);//将单选按钮italic对象添加到按钮组对象buttonG
		frame.setVisible(true);
	}
	//内部类实项目类事件接口监听器
	static class Handler1 implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getSource() == plain) {
				label.setText("你已选择正常字体！");
				label.setFont(fontP);// 设置标签文字为“正常”字体
			} else if (e.getSource() == bold) {
				label.setText("你已选择加粗字体！");
				label.setFont(fontB);// 设置标签文字为“加粗”字体
			} else {
				label.setText("你已选择斜体字体！");
				label.setFont(fontI);//// 设置标签文字为“斜体”字体
			}
		}
	}
	//内部类实现窗口事件适配器
	static class Handler2 extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
}
	