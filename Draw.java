import javax.swing.JComponent;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.Random;

public class Draw extends JComponent{

	private BufferedImage image;
	private BufferedImage backgroundImage;
	public URL resource = getClass().getResource("run0.png");

	// circle's position
	//public int x = 30;
	//public int y = 30;

	// animation states
	//public int state = 0;

	Monster monster1;
	Monster monster2;
	Monster monster3;
	Monster monster4;
	Monster monster5;
	Monster monster6;
	Monster monster7;
	Monster monster8;
	Monster monster9;
	Monster monster10;
	Player player;

	public Draw(){
		player = new Player(0, 0);
		monster1 = new Monster(200, 200);
		monster2 = new Monster(300, 200);
		monster3 = new Monster(200, 300);
		monster4 = new Monster(400, 300);
		monster5 = new Monster(100, 100);
		monster6 = new Monster(400, 400);
		monster7 = new Monster(350, 150);
		monster8 = new Monster(500, 250);
		monster9 = new Monster(450, 300);
		monster10 = new Monster(300, 500);

		try{
			image = ImageIO.read(resource);
			backgroundImage = ImageIO.read(getClass().getResource("background.jpg"));
		}
		catch(IOException e){
			e.printStackTrace();
		}
		repaint();
	}

	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.drawImage(backgroundImage, 0, 0, this);
		g.drawImage(player.image, player.x, player.y, this);

		g.drawImage(monster1.image, monster1.xPos, monster1.yPos, this);
		g.drawImage(monster2.image, monster2.xPos, monster2.yPos, this);
		g.drawImage(monster3.image, monster3.xPos, monster3.yPos, this);
		g.drawImage(monster4.image, monster4.xPos, monster4.yPos, this);
		g.drawImage(monster5.image, monster5.xPos, monster5.yPos, this);
		g.drawImage(monster6.image, monster6.xPos, monster6.yPos, this);
		g.drawImage(monster7.image, monster7.xPos, monster7.yPos, this);
		g.drawImage(monster8.image, monster8.xPos, monster8.yPos, this);
		g.drawImage(monster9.image, monster9.xPos, monster9.yPos, this);
		g.drawImage(monster10.image, monster10.xPos, monster10.yPos, this);

	}
}