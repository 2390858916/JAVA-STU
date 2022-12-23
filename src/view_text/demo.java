package view_text;
import java.awt.*;
public class demo {
    public static void main(String[] args) {
        Frame fra = new Frame("text1content");
        TextField text1 = new TextField("text1");
        fra.setLayout(null);
        text1.setBounds(100,50,100,50);
        fra.setBounds(100,100,300,200);
        fra.setVisible(true);
        fra.add(text1);
    }
}
