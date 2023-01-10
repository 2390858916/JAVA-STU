package ViewDemo.view_buttom.view_changeBackColor2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Demo {
    public static void main(String[] args)
    {
        EventQueue.invokeLater(()->{
                    JFrame frame=new ButtonFrame();
                    frame.setTitle("ListenerTest");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                }
        );
    }
}
class ButtonFrame extends JFrame {
    private JPanel buttonPanel;

    public ButtonFrame(){
        setSize(300,200);
        //create buttons
        JButton yellowButton = new JButton("Yellow");
//由于不能将组件加入到JFrame中，我们使用JPanel（一个面板容器类，可以放按钮、图片、标签等）作为中间容器，
//然后再将JPanel置为JFrame的内容
        buttonPanel=new JPanel();
        //add buttons to panel
        buttonPanel.add(yellowButton);
        //add panel to frame
        add(buttonPanel);
        //create button actions
        ColorAction yellowAction = new ColorAction(Color.YELLOW);
        //associate actions with buttons
        yellowButton.addActionListener(yellowAction);
    }
    //当按钮被点击时，将面板的颜色设置为指定的颜色，这个颜色存储在监听器类中
    private class ColorAction implements ActionListener{
        private Color backgroundColor;
        public ColorAction(Color c){
            backgroundColor = c;
        }
        public void actionPerformed(ActionEvent event){
            //ActionEvent对应按钮点击、菜单选择、选择列表项或在文本框中ENTER
            buttonPanel.setBackground((backgroundColor));
        }
    }
}
