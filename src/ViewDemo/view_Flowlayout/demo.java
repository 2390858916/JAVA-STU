package ViewDemo.view_Flowlayout;
import java.awt.*;
public class demo {
    public static void main(String[] args) {
        Frame fra = new Frame("flowlayout");
        FlowLayout layout = new FlowLayout();
        fra.setBounds(100,100,200,200);
        fra.setLayout(layout);
        Button but1,but2;
        TextField text1,text2;
        but1 = new Button("button1");
        but2 = new Button("button2");
        text1 = new TextField("text1");
        text2 = new TextField("text3");
        fra.add(but1);
        fra.add(but2);
        fra.add(text1);
        fra.add(text2);

        fra.setVisible(true);
    }
}
