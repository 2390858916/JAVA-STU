package com.chen.ch12.JTextFieldDemo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class JTextFieldDemo {

	public static void main(String[] args) {
		Font font= new Font(null, Font.PLAIN, 20);
		JFrame frame = new JFrame("տ���Ƽ�ѧԺѧ����Ϣ����ϵͳ");
		frame.setLayout(null);
		frame.setSize(600, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		JLabel labtext=new JLabel("ѧ��:");//������ǩ����labtext
		labtext.setFont(font);
		labtext.setBounds(200, 50, 100, 30);
		panel.add(labtext);//����ǩ����labtext��ӵ����
		JLabel labpwd=new JLabel("����:");//������ǩ����labpwd
		labpwd.setFont(font);
		labpwd.setBounds(200, 100, 160, 30);
		panel.add(labpwd);//����ǩ����labpwd��ӵ����
		// �����ı���ָ���ɼ�����Ϊ8��
		JTextField textField = new JTextField(8);//�����ı��ж���textField
		textField.setFont(font);
		textField.setBounds(250, 50, 160, 30);
		panel.add(textField);//����ǩ����textField��ӵ����
		// ���������ж���,ָ���ɼ�����Ϊ8��
		JPasswordField pwdField = new JPasswordField(8);//�����ı��ж���pwdField
		pwdField.setFont(font);
		pwdField.setBounds(250,100, 160, 30);
		pwdField.setEchoChar('*');//�����������ʾ����Ϊ"*"
		panel.add(pwdField);//����ǩ����pwdField��ӵ����
		// ����һ����ť��������ȡ�ı����е��ı�
		JButton btnlogin = new JButton("��¼");
		JButton btnExit = new JButton("�˳�ϵͳ");
		btnlogin.setFont(font);
		btnExit.setFont(font);
		btnlogin.setBounds(160,150, 120, 30);
		btnExit.setBounds(320, 150, 120, 30);
		panel.add(btnlogin);//����ǩ����btnlogin��ӵ����
		panel.add(btnExit);//����ǩ����btnExit��ӵ����
		btnlogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�ύ: " + textField.getText());
				JOptionPane.showMessageDialog(null, "��ӭ��ʹ��տ���Ƽ�ѧԺѧ����Ϣ����ϵͳ��");
			}
		});
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null, "��ȷ��Ҫ�˳�ϵͳ��");
				System.exit(0);
			}
		});
		//frame.setContentPane(panel);
		panel.setBounds(20, 20, 450, 300);//�������Ĵ�С��λ��
	    panel.setBackground(new Color(50, 100, 238));//�������ı�����ɫ
	    frame.getContentPane().add(panel);
		frame.setVisible(true);
	}
}

	