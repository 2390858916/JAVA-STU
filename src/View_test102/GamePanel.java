package View_test102;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class GamePanel extends JPanel {
    //Writer��Afang
    //Time:2020.3.27
    public void paint(Graphics g) {// g=����
        try {
            // ����ͼƬ
            BufferedImage bg = ImageIO.read(this.getClass().getResourceAsStream("img1.png"));
            // ����ͼƬ
            g.drawImage(bg, 0, 0, null);
        } catch (IOException e) {
            System.out.println("����ͼƬʧ��");
        }
    }
    public static void main(String[] args) {
        // �������
        JFrame jf = new JFrame();
        // �������
        GamePanel gp = new GamePanel();
        // ���������
        jf.add(gp);
        // ���ô�С
        jf.setSize(300, 300);
        // ���ÿɼ���
        jf.setVisible(true);
    }
}

