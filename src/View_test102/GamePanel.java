package View_test102;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class GamePanel extends JPanel {
    //Writer：Afang
    //Time:2020.3.27
    public void paint(Graphics g) {// g=画笔
        try {
            // 加载图片
            BufferedImage bg = ImageIO.read(this.getClass().getResourceAsStream("img1.png"));
            // 绘制图片
            g.drawImage(bg, 0, 0, null);
        } catch (IOException e) {
            System.out.println("加载图片失败");
        }
    }
    public static void main(String[] args) {
        // 创建框架
        JFrame jf = new JFrame();
        // 创建面板
        GamePanel gp = new GamePanel();
        // 框架添加面板
        jf.add(gp);
        // 设置大小
        jf.setSize(300, 300);
        // 设置可见性
        jf.setVisible(true);
    }
}

