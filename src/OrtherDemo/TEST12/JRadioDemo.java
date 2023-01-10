package com.chen.ch12.JRadioButtonDemo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JRadioDemo {
	static JLabel label;// ��ǩ
	static JRadioButton plain;// ��ѡ��ť
	static JRadioButton bold;
	static JRadioButton italic;
	static ButtonGroup buttonG;// ��ť��
	static Font fontP, fontB, fontI;
	static JFrame frame;

	public static void main(String[] args) {
		frame = new JFrame("��ѡ��ť��ʾ����");
		frame.setBounds(200, 300, 500, 400); // ���ô����С��λ��
		frame.setLayout(null);
		fontP = new Font("", Font.PLAIN, 24);// �������������������
		fontB = new Font("", Font.BOLD, 24);// �������Ӵ֡��������
		fontI = new Font("", Font.ITALIC, 24);// ������б�塱�������
		label = new JLabel("����ѡ���������壡");// ������ǩ����
		plain = new JRadioButton("����", true);// ����������ѡ��ť����
		bold = new JRadioButton("�Ӵ�", false);// �����Ӵֵ�ѡ��ť����
		italic = new JRadioButton("б��", false);// ��б�嵥ѡ��ť����
		label.setFont(fontP);// ���ñ�ǩ����Ϊ������������
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
		buttonG = new ButtonGroup();//������ť�����
		buttonG.add(plain);//����ѡ��ťplain������ӵ���ť�����buttonG
		buttonG.add(bold);//����ѡ��ťbold������ӵ���ť�����buttonG
		buttonG.add(italic);//����ѡ��ťitalic������ӵ���ť�����buttonG
		frame.setVisible(true);
	}
	//�ڲ���ʵ��Ŀ���¼��ӿڼ�����
	static class Handler1 implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getSource() == plain) {
				label.setText("����ѡ���������壡");
				label.setFont(fontP);// ���ñ�ǩ����Ϊ������������
			} else if (e.getSource() == bold) {
				label.setText("����ѡ��Ӵ����壡");
				label.setFont(fontB);// ���ñ�ǩ����Ϊ���Ӵ֡�����
			} else {
				label.setText("����ѡ��б�����壡");
				label.setFont(fontI);//// ���ñ�ǩ����Ϊ��б�塱����
			}
		}
	}
	//�ڲ���ʵ�ִ����¼�������
	static class Handler2 extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
}
	