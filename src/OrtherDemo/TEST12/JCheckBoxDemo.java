package OrtherDemo.TEST12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCheckBoxDemo {
	static JLabel label;// 标签
	static JCheckBox bold, italic;
	static Font fontP, fontB, fontI,fontBI;
	static JFrame frame;

	public static void main(String[] args) {
		frame = new JFrame("复选按钮演示窗口");
		frame.setBounds(200, 300, 500, 400); // 设置窗体大小和位置
		frame.setLayout(null);
		fontP = new Font("", Font.PLAIN, 24);// 创建“正常”字体对象
		fontB = new Font("", Font.BOLD, 24);// 创建“加粗”字体对象
		fontI = new Font("", Font.ITALIC, 24);// 创建“斜体”字体对象
		fontBI =new Font("", Font.BOLD+Font.ITALIC, 24);// 创建“加粗和斜体”字体对象
		label = new JLabel("你什么字体都没有选中！");// 创建标签对象
		bold = new JCheckBox("加粗", false);// 创建加粗复选按钮对象
		italic = new JCheckBox("斜体", false);// 创斜体复选按钮对象
		label.setFont(fontP);// 设置标签文字为“正常”字体
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
	//内部类实项目类事件接口监听器
	static class Handler1 implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(bold.isSelected() && italic.isSelected()){
		              label.setText("你已选择加粗和斜体字体！");
					  label.setFont(fontBI);
		          }else if(bold.isSelected() && !italic.isSelected() ) {
		              label.setText("你已选择加粗字体！");
		              label.setFont(fontB);
		          }else if(!bold.isSelected() && italic.isSelected()) {
		        	   label.setText("你已选择斜体字体！");
					   label.setFont(fontI);
		               }else {      
		                  label.setText("你什么字体都没有选中!"); 
		                   label.setFont(fontP);
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
