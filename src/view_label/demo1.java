package view_label;
import java.awt.*;
public class demo1 {
    public static void main(String[] args) {
        Frame fra = new Frame("����");
        Label lab = new Label("����һ����ǩ");
        lab.setAlignment(Label.CENTER);//��ǩ����
        lab.setBackground(Color.CYAN);
        lab.setForeground(Color.ORANGE);
        fra.setBounds(100,200,250,150);
        fra.add(lab);
        fra.setVisible(true);
    }

}
