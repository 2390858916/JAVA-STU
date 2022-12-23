package view_Girdlayout;
import java.awt.*;

public class demo {
    public static void main(String[] args) {
        Frame fra = new Frame("gridLayout");
        GridLayout layout = new GridLayout(3,3);
        fra.setLayout(layout);
        fra.setBounds(100,100,200,200);
        String names[] = {"but1","but2","but3","but4","but5"};
        for (int i = 0;i<names.length;i++) fra.add(new Button(names[i]));
        fra.setVisible(true);
    }
}
