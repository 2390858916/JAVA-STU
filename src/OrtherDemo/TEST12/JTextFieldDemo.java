package com.chen.ch12.JTextFieldDemo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class JTextFieldDemo {

	public static void main(String[] args) {
		Font font= new Font(null, Font.PLAIN, 20);
		JFrame frame = new JFrame("湛江科技学院学生信息管理系统");
		frame.setLayout(null);
		frame.setSize(600, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		JLabel labtext=new JLabel("学号:");//创建标签对象labtext
		labtext.setFont(font);
		labtext.setBounds(200, 50, 100, 30);
		panel.add(labtext);//将标签对象labtext添加到面板
		JLabel labpwd=new JLabel("密码:");//创建标签对象labpwd
		labpwd.setFont(font);
		labpwd.setBounds(200, 100, 160, 30);
		panel.add(labpwd);//将标签对象labpwd添加到面板
		// 创建文本框，指定可见列数为8列
		JTextField textField = new JTextField(8);//创建文本行对象textField
		textField.setFont(font);
		textField.setBounds(250, 50, 160, 30);
		panel.add(textField);//将标签对象textField添加到面板
		// 创建密码行对象,指定可见列数为8列
		JPasswordField pwdField = new JPasswordField(8);//创建文本行对象pwdField
		pwdField.setFont(font);
		pwdField.setBounds(250,100, 160, 30);
		pwdField.setEchoChar('*');//设置密码框显示符号为"*"
		panel.add(pwdField);//将标签对象pwdField添加到面板
		// 创建一个按钮，点击后获取文本框中的文本
		JButton btnlogin = new JButton("登录");
		JButton btnExit = new JButton("退出系统");
		btnlogin.setFont(font);
		btnExit.setFont(font);
		btnlogin.setBounds(160,150, 120, 30);
		btnExit.setBounds(320, 150, 120, 30);
		panel.add(btnlogin);//将标签对象btnlogin添加到面板
		panel.add(btnExit);//将标签对象btnExit添加到面板
		btnlogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("提交: " + textField.getText());
				JOptionPane.showMessageDialog(null, "欢迎您使用湛江科技学院学生信息管理系统！");
			}
		});
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null, "你确认要退出系统吗？");
				System.exit(0);
			}
		});
		//frame.setContentPane(panel);
		panel.setBounds(20, 20, 450, 300);//设置面板的大小和位置
	    panel.setBackground(new Color(50, 100, 238));//设置面板的背景颜色
	    frame.getContentPane().add(panel);
		frame.setVisible(true);
	}
}

	