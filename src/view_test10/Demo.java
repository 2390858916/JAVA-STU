package view_test10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Demo {
    public static void main(String[] args) {
        Frame fra = new Frame("湛江科技学院学生信息管理系统");
        FlowLayout flow = new FlowLayout();
        Button bt1 = new Button("登陆系统");
        Button bt2 = new Button("退出系统");
        bt1.setBounds(85,300,70,40);
        bt2.setBounds(350,300,70,40);
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        TextField text1 = new TextField("湛江科技学院欢迎您!");
        Font f2 = new Font("font",10,26);
        text1.setFont(f2);
        text1.setBackground(Color.GREEN);
        text1.setBounds(130,130,250,50);


//        String names[] = {"but1","but2"};
//        for (int i = 0;i<names.length;i++) fra.add(new Button(names[i]));
        fra.add(bt1);
        fra.add(bt2);
        fra.setLayout(null);
        fra.add(text1);
        fra.setBounds(100,100,500,400);
        fra.setBackground(Color.blue);
        fra.setVisible(true);
    }
}
