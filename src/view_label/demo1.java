package view_label;
import java.awt.*;
public class demo1 {
    public static void main(String[] args) {
        Frame fra = new Frame("标题");
        Label lab = new Label("这是一个标签");
        lab.setAlignment(Label.CENTER);//标签布局
        lab.setBackground(Color.CYAN);
        lab.setForeground(Color.ORANGE);
        fra.setBounds(100,200,250,150);
        fra.add(lab);
        fra.setVisible(true);
    }

}
