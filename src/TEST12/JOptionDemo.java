package com.chen.ch12.JOptionPaneDemo;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class JOptionDemo {

	public static void main(String[] args) {
		// 1.确认对话框
		// ①第3个参数选0为显示“YES和NO”钮
		//System.out.println(JOptionPane.showConfirmDialog(null, "确定要删除吗？", "删除提示", 0));
		// ②第4个参数选1为显示“YES、NO和CANCEL”钮,第5个参数选2为"WARNING_MESSAGE"图标
		//JOptionPane.showConfirmDialog(null, "确定要删除吗？", "删除提示", 1, 2);
		// ImageIcon icon=new ImageIcon("E:\\java\\2.png");
		// ③第4个参数选2为显示“YES和CANCEL”钮,第5个参数选1为"INFORMATION_MESSAGE"图标
		// 第6个参数选icon变量为图标为指定的图片！
		// JOptionPane.showConfirmDialog(null,"确定要删除吗？","删除提示",2,1,icon);

		// 2.消息对话框
//		JOptionPane.showMessageDialog(null,"用户名或密码错误！","错误 ",0);
//		JOptionPane.showMessageDialog(null,"请注册或登录...","提示",1);
//		JOptionPane.showMessageDialog(null,"普通会员无权执行删除操作！","警告",2);
//		JOptionPane.showMessageDialog(null,"你是哪一位？请输入用户名","问题",3);
		// 第5个参数为自定义图标
		// JOptionPane.showMessageDialog(null,"扫描完毕，没有发现病毒！","提示",JOptionPane.PLAIN_MESSAGE,icon);
		// 3.输入对话框
//		 JOptionPane.showInputDialog(null,"请输入城市名称：","广州市"); String[]
//		 str={"广州市","深圳市","东莞市","中山市"}; Object city =
//		 JOptionPane.showInputDialog(null,"请选择城市名称","城市名称",1,null,str,str[0]);
//		 JOptionPane.showMessageDialog(null, "你选择的城市："+city.toString(), "选择结果显示", 1);
		 //4.选项对话框
		 Object[] fruits = {"苹果","梨子","香蕉","西瓜","荔枝"}; int xz =
		 JOptionPane.showOptionDialog(null, "你喜欢什么水果",
		 "选择",JOptionPane.YES_NO_CANCEL_OPTION ,JOptionPane.QUESTION_MESSAGE,null,
		  fruits, fruits[0]); JOptionPane.showMessageDialog(null,
		  "你选择的结果是："+fruits[xz], "选择结果显示", 1);
		 
	}

}
