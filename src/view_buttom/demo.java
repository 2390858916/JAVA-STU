package view_buttom;
import java.awt.*;
public class demo {
    public static void main(String[] args) {
        Frame fra = new Frame("buttom");
        fra.setSize(650,370);
        fra.setVisible(true);
        fra.setLayout(null);
        Button bt = new Button("click");
        bt.setSize(100,50);
        bt.setLocation(74,60);
        fra.add(bt);

    }
}
