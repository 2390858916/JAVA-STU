package TEST12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//2�������鴴��ѡ������
public class JComboBoxDemo extends JFrame {
	private JComboBox comboBoxList;
	private JLabel label,label1;
	private Object cities[] = { "������", "�Ϻ���", "�����", "������", "֣����", "̫ԭ��", "ʯ��ׯ��" };
	private Font font;
	public JComboBoxDemo() {
		super("��Ͽ���ʾ����");
		font=new Font("����",Font.BOLD,24);
		Container c = getContentPane();//��ȡ���ݴ���
		c.setLayout(null);
		comboBoxList = new JComboBox(cities);//��������cities������Ͽ�comboBoxList
		comboBoxList.addItem("������");//����Ͽ������
		comboBoxList.addItem("������");//����Ͽ������
		comboBoxList.setMaximumRowCount(4);//���������ʾ����
		comboBoxList.setBounds(240, 50, 80, 30);
		label = new JLabel("�����Ͽ���ѡ�� ");
		label1=new JLabel();
		label.setBounds(120, 50, 120, 30);
		label1.setBounds(120, 250, 200, 30);
		label1.setFont(font);
		c.add(comboBoxList);//����Ͽ�comboBoxList��ӵ����ݴ���
		c.add(label);//����ǩlabel��ӵ����ݴ���
		c.add(label1);//����ǩlabel1��ӵ����ݴ���
		comboBoxList.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				label1.setText("��ѡ���ˣ�" +  comboBoxList.getSelectedItem());
				label1.setForeground(Color.red);
			}
		});
		setBounds(300, 200, 600, 500);
		setVisible(true);
	}
	public static void main(String[] args) {
		JComboBoxDemo app = new JComboBoxDemo();
		app.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				   System.exit(0);
			}
	    });
    }
}
	