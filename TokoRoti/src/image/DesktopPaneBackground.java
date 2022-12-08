package image;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 * @author Agrayni Melinda Safitri
 * NIM 2109116050
 * Sistem Informasi B
 */
public class DesktopPaneBackground extends JDesktopPane {

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics = (Graphics2D) g.create();

        Image img = new ImageIcon(getClass().getResource("/image/MainMenu.png")).getImage();
        graphics.drawImage(img, 0, 0, getWidth(), getHeight(), null);
        graphics.dispose();
    }
}