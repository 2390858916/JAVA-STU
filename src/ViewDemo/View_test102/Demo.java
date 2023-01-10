package ViewDemo.View_test102;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Demo {
    public static void main(String[] args) {
        ImageIcon imageIcon = new ImageIcon("img1.png");
        JLabel jlabel=new JLabel(imageIcon);
        Frame frame = new Frame("??????????????????");
        Label label1 = new Label("???:");
        Label label2 = new Label("????:");
        TextField textField1 = new TextField(20);
        TextField textField2 = new TextField(20);
        Button button1 = new Button("???");
        Button button2 = new Button("???");
        Font font = new Font("Serief",Font.BOLD ,18);
        frame.setBounds(0, 0, 700,500);
        frame.setBackground(Color.WHITE);
        frame.setLayout(null);
        jlabel.setBounds(100,50,500,300);
        label1.setBounds(130, 370, 50, 30);
        label2.setBounds(350, 370, 50, 30);
        label1.setFont(font);
        label2.setFont(font);
        textField1.setBounds(180, 370, 130, 30);
        textField2.setBounds(400, 370, 130, 30);
        textField1.setBackground(Color.cyan);
        textField2.setBackground(Color.cyan);
        textField1.setFont(font);
        textField2.setFont(font);
        button1.setBounds(180, 420, 80, 40);
        button2.setBounds(400, 420, 80, 40);
        button1.setFont(font);
        button2.setFont(font);
        button1.setBackground(Color.cyan);
        button2.setBackground(Color.cyan);
        frame.add(jlabel);
        frame.add(textField1);
        frame.add(textField2);
        frame.add(label1);
        frame.add(label2);
        frame.add(button1);
        frame.add(button2);
        frame.setVisible(true);
        button2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });
        frame.addWindowFocusListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
