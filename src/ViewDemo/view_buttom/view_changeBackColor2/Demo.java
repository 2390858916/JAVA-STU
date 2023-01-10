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
//���ڲ��ܽ�������뵽JFrame�У�����ʹ��JPanel��һ����������࣬���ԷŰ�ť��ͼƬ����ǩ�ȣ���Ϊ�м�������
//Ȼ���ٽ�JPanel��ΪJFrame������
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
    //����ť�����ʱ����������ɫ����Ϊָ������ɫ�������ɫ�洢�ڼ���������
    private class ColorAction implements ActionListener{
        private Color backgroundColor;
        public ColorAction(Color c){
            backgroundColor = c;
        }
        public void actionPerformed(ActionEvent event){
            //ActionEvent��Ӧ��ť������˵�ѡ��ѡ���б�������ı�����ENTER
            buttonPanel.setBackground((backgroundColor));
        }
    }
}
