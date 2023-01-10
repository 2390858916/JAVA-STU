package ViewDemo.veiw_border;
import java.awt.*;
public class demo {
    public static void main(String[] args) {
        Frame fra = new Frame("nwe window");
        BorderLayout layout = new BorderLayout(5,7); //水平间距 垂直间距
        fra.setBounds(50,100,400,400);
        fra.setLayout(layout);
        Button butn,buts,butw,butr,butc;
        butn = new Button("not buttom");
        buts = new Button("south buttom");
        butw = new Button("west buttom");
        butr = new Button("right buttom");
        butc = new Button("center buttom");
        fra.add(butn,BorderLayout.NORTH);
        fra.add(buts,BorderLayout.SOUTH);
        fra.add(butw,BorderLayout.WEST);
        fra.add(butr,BorderLayout.EAST);
        fra.add(butc,BorderLayout.CENTER);
        fra.setVisible(true);
    }
}
