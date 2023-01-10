package OrtherDemo.TEST12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCheckBoxDemo {
	static JLabel label;// ��ǩ
	static JCheckBox bold, italic;
	static Font fontP, fontB, fontI,fontBI;
	static JFrame frame;

	public static void main(String[] args) {
		frame = new JFrame("��ѡ��ť��ʾ����");
		frame.setBounds(200, 300, 500, 400); // ���ô����С��λ��
		frame.setLayout(null);
		fontP = new Font("", Font.PLAIN, 24);// �������������������
		fontB = new Font("", Font.BOLD, 24);// �������Ӵ֡��������
		fontI = new Font("", Font.ITALIC, 24);// ������б�塱�������
		fontBI =new Font("", Font.BOLD+Font.ITALIC, 24);// �������Ӵֺ�б�塱�������
		label = new JLabel("��ʲô���嶼û��ѡ�У�");// ������ǩ����
		bold = new JCheckBox("�Ӵ�", false);// �����Ӵָ�ѡ��ť����
		italic = new JCheckBox("б��", false);// ��б�帴ѡ��ť����
		label.setFont(fontP);// ���ñ�ǩ����Ϊ������������
		label.setBounds(120, 100, 300, 60);
		bold.setBounds(160, 10, 80, 60);
		italic.setBounds(280, 10, 80, 60);
		frame.add(bold);
		frame.add(italic);
		frame.add(label);
		bold.addItemListener(new Handler1());
		italic.addItemListener(new Handler1());
		frame.setVisible(true);
	}
	//�ڲ���ʵ��Ŀ���¼��ӿڼ�����
	static class Handler1 implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(bold.isSelected() && italic.isSelected()){
		              label.setText("����ѡ��Ӵֺ�б�����壡");
					  label.setFont(fontBI);
		          }else if(bold.isSelected() && !italic.isSelected() ) {
		              label.setText("����ѡ��Ӵ����壡");
		              label.setFont(fontB);
		          }else if(!bold.isSelected() && italic.isSelected()) {
		        	   label.setText("����ѡ��б�����壡");
					   label.setFont(fontI);
		               }else {      
		                  label.setText("��ʲô���嶼û��ѡ��!"); 
		                   label.setFont(fontP);
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
