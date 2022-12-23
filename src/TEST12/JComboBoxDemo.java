package TEST12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//2、用数组创建选项内容
public class JComboBoxDemo extends JFrame {
	private JComboBox comboBoxList;
	private JLabel label,label1;
	private Object cities[] = { "北京市", "上海市", "天津市", "重庆市", "郑州市", "太原市", "石家庄市" };
	private Font font;
	public JComboBoxDemo() {
		super("组合框演示窗口");
		font=new Font("黑体",Font.BOLD,24);
		Container c = getContentPane();//获取内容窗格
		c.setLayout(null);
		comboBoxList = new JComboBox(cities);//利用数组cities创建组合框comboBoxList
		comboBoxList.addItem("广州市");//向组合框添加项
		comboBoxList.addItem("深圳市");//向组合框添加项
		comboBoxList.setMaximumRowCount(4);//设置最大显示行数
		comboBoxList.setBounds(240, 50, 80, 30);
		label = new JLabel("请从组合框中选择 ");
		label1=new JLabel();
		label.setBounds(120, 50, 120, 30);
		label1.setBounds(120, 250, 200, 30);
		label1.setFont(font);
		c.add(comboBoxList);//将组合框comboBoxList添加到内容窗格
		c.add(label);//将标签label添加到内容窗格
		c.add(label1);//将标签label1添加到内容窗格
		comboBoxList.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				label1.setText("您选中了：" +  comboBoxList.getSelectedItem());
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
	