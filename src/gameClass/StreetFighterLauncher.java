package gameClass;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import textureClass.MapTexture;
import textureClass.Texture;
@SuppressWarnings("serial")
public class StreetFighterLauncher extends JPanel {
	boolean[] select = new boolean[3];
	JFrame frame;
	CardLayout cardLayout = new CardLayout();
	JPanel screen = new JPanel(cardLayout);
	public static void main(String[] args){
		new StreetFighterLauncher();
	}
	protected StreetFighterLauncher(){
		Texture.loadMapTextures();
		panel();
		keys();
		repaint();
	}
	void keys(){
		select[1] = true; 
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("A"), "A");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("D"), "D");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("ENTER"), "CHOOSE");
		getActionMap().put("D", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				for(int index = 0; index < select.length-1; index++){
					if(select[index]){
						select[index] = false;
						select[index + 1] = true;
						repaint();
						return;
					}
				}
			}

		});
		getActionMap().put("A", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				for(int index = 1; index < select.length; index++){
					if(select[index]){
						select[index] = false;
						select[index - 1] = true;
						repaint();
						return;
					}
				}
			}

		});
		getActionMap().put("CHOOSE", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				for(int index = 0; index < select.length; index++){
					if(select[index]){
						switch(index){
						case 0:
							new CharacterSelectLauncher(GameType.TRAINING);
							frame.dispose();
							break;
						case 1:
							new CharacterSelectLauncher(GameType.FIGHT);
							frame.dispose();
							break;
						case 2:
							cardLayout.next(screen);
							break;
						}
					}
				}	
			}

		});
	}
	void panel(){
		frame = new JFrame();
		new OptionLauncher(screen,cardLayout);
		screen.add(this, null);
		screen.add(OptionLauncher.panel, null);
		frame.add(screen);
		frame.setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));
		frame.pack();
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cardLayout.show(screen, null);
	}
	public void paintComponent(Graphics g){
		drawBackDrops(g);
		drawGameModeSelect(g);
	}
	void drawGameModeSelect(Graphics g){
		int xBuffer = (int)(Constants.SCREEN_WIDTH.getIntValue()*.2);
		int yBuffer = (int)(Constants.SCREEN_HEIGHT.getIntValue()*.8);
		g.setFont(new Font("Arial",Font.BOLD,40));
		for(int index = 0; index < select.length; index++){
			if(select[index]){
				g.setColor(Color.GRAY);
			}else{
				g.setColor(Color.BLACK);
			}
			String s = "";
			switch(index){
			case 0:
				s = "SINGLEPLAYER";
				break;
			case 1:
				s = "GROUP BATTLE";
				break;
			case 2:
				s = "OPTIONS";
				break;
			}
			g.drawString(s, xBuffer, yBuffer);
			xBuffer += (s.length()*30) + 50;
		}
	}
	void drawBackDrops(Graphics g){
		g.setFont(new Font("Arial",Font.BOLD,40));
		g.drawImage(MapTexture.launcherSprites[0], 0, 0,Constants.SCREEN_WIDTH.getIntValue(),Constants.SCREEN_HEIGHT.getIntValue(), null);
		g.drawString("choose with A,D and press Enter to start", (int)(Constants.SCREEN_WIDTH.getIntValue()*.1), (int)(Constants.SCREEN_HEIGHT.getIntValue()*.9));
	}

}
