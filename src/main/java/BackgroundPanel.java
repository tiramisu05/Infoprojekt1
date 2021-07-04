
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meike
 */
class BackgroundPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private Image img;

	public BackgroundPanel() {

            ImageIcon imageIcon = new ImageIcon(getClass().getResource("bild.jpg"));
            img = imageIcon.getImage();
            System.out.println("Picture loaded.");
	}
        @Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.drawImage(img, 0, 0, this);

	}

	public Image getBackgroundImage() {
		return img;
	}

}
