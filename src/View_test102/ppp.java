package View_test102;

import TEST12.JCheckBoxDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ppp {
    static JLabel label;// 标签
    static JFrame frame;
    private JButton button1;

    public ppp() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        frame = new JFrame("复选按钮演示窗口");
        frame.setBounds(200, 300, 500, 400); // 设置窗体大小和位置
        frame.setLayout(null);
        frame.setVisible(true);
    }


}
