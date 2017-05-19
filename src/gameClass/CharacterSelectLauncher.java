package gameClass;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import textureClass.EHondaTexture;
import textureClass.MapTexture;
import textureClass.RyuTexture;
import textureClass.Texture;

@SuppressWarnings("serial")
public class CharacterSelectLauncher extends JPanel {
	private GameType g;
	private Character selectedCharacter = CharacterInfo.RYU.getCharacter(true,false);
	private Character selectedCharacter2 = CharacterInfo.RYU.getCharacter(false,false);
	private CharacterInfo[] characterList = {CharacterInfo.RYU,CharacterInfo.EHONDA,CharacterInfo.BLANKA,CharacterInfo.DEEJAY, CharacterInfo.DHALSIM};
	private JFrame frame;
	private CardLayout cardLayout = new CardLayout();
	private JPanel screen = new JPanel(cardLayout);
	boolean[] select = new boolean[characterList.length];
	boolean[] select2 = new boolean[characterList.length];

	protected CharacterSelectLauncher(GameType g){
		this.g = g;
		select[0] = true;
		select2[0] = true;

		
		
		if(g.equals(GameType.FIGHT)){
			getActionMap().put("LEFT", new AbstractAction(){

				@Override
				public void actionPerformed(ActionEvent e) {
					for(int subIndex = 1; subIndex < characterList.length; subIndex++){
						if(select2[subIndex]){
							select2[subIndex] = false;
							select2[subIndex-1] = true;
							selectedCharacter2 = characterList[subIndex-1].getCharacter(false,false);
							repaint();
							return;
						}
					}
				}

			});
			getActionMap().put("RIGHT", new AbstractAction(){

				@Override
				public void actionPerformed(ActionEvent e) {
					for(int subIndex = 0; subIndex < characterList.length-1; subIndex++){
						if(select2[subIndex]){
							select2[subIndex] = false;
							select2[subIndex+1] = true;
							selectedCharacter2 = characterList[subIndex+1].getCharacter(false,false);
							repaint();
							return;
						}

					}
				}

			});
		}
		
		
		
		
		panel();
		keys();
		repaint();
	}

	void keys(){
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("O"), "O");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("A"), "A");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("D"), "D");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("D"), "D");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke((char) KeyEvent.VK_LEFT, 0, false), "LEFT");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke((char) KeyEvent.VK_RIGHT, 0 , false), "RIGHT");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("ENTER"), "ENTER");
		
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke((char) KeyEvent.VK_BACK_SPACE), "BACK");
		getActionMap().put("BACK", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				new StreetFighterLauncher();
				frame.dispose();	
			}

		});
		getActionMap().put("ENTER", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(selectedCharacter == null || selectedCharacter2 == null){
					return;
				}				
				if(g.equals(GameType.TRAINING)){
					
					switch((int)(Math.random()*characterList.length)){
					case 0:
						selectedCharacter2 = CharacterInfo.RYU.getCharacter(false,true);
						break;
					case 1:
						selectedCharacter2 = CharacterInfo.EHONDA.getCharacter(false,true);
						break;
					case 2:
						selectedCharacter2 = CharacterInfo.BLANKA.getCharacter(false,true);
						break;
					case 3:
						selectedCharacter2 = CharacterInfo.DEEJAY.getCharacter(false,true);
						break;
					case 4:
						selectedCharacter2 = CharacterInfo.DHALSIM.getCharacter(false,true);
						break;
					}
				}
				new MapSelectLauncher(selectedCharacter,selectedCharacter2,g);
				frame.dispose();
			}

		});
		getActionMap().put("A", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				for(int subIndex = 1; subIndex < characterList.length; subIndex++){
					if(select[subIndex]){
						select[subIndex] = false;
						select[subIndex-1] = true;
						selectedCharacter = characterList[subIndex-1].getCharacter(true,false);
						repaint();
						return;
					}
				}
			}

		});
		getActionMap().put("D", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				for(int subIndex = 0; subIndex < characterList.length-1; subIndex++){
					if(select[subIndex]){
						select[subIndex] = false;
						select[subIndex+1] = true;
						selectedCharacter = characterList[subIndex+1].getCharacter(true,false);
						repaint();
						return;
					}

				}
			}

		});

		
		getActionMap().put("O", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.next(screen);
			}

		});
	}

	void panel(){
		frame = new JFrame();
		OptionLauncher.changePanel(screen, cardLayout);
		screen.add(this, null);
		screen.add(OptionLauncher.panel, null);
		frame.add(screen);
		this.setLayout(null);
		frame.setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));
		frame.pack();
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cardLayout.show(screen, null);
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(MapTexture.characterSelectBackground, 0, 0,Constants.SCREEN_WIDTH.getIntValue(),Constants.SCREEN_HEIGHT.getIntValue(), null);
		if(this.g.equals(GameType.TRAINING)){
			drawTrainingSelect(g);
		}else if(this.g.equals(GameType.FIGHT)){
			drawFightSelect(g);
		}	
		
	}
	
	void drawFightSelect(Graphics g){
		g.setFont(new Font("Arial",Font.BOLD,40));
		int xBuffer = (int)(Constants.SCREEN_WIDTH.getIntValue()*.05);
		int yBuffer = (int)(Constants.SCREEN_HEIGHT.getIntValue()*.05);
		for(int subIndex = 0; subIndex < characterList.length; subIndex++){
			Color c;
			if(select[subIndex]){
				c = Color.BLACK;
				g.setColor(Color.RED);
				g.setFont(new Font("Aerial",Font.BOLD,30));
				g.drawString("P1", xBuffer+50, yBuffer-10);
				
			}else{
				c = Color.GRAY;
				
			}
			g.setColor(c);
			BufferedImage display = MapTexture.characterSelectSprites[subIndex];
			
			g.drawImage(display, xBuffer, yBuffer, 100, 200,c, null);
			if(select[subIndex]){
				g.drawImage(MapTexture.player1Selector, xBuffer, yBuffer, 100, 200, null);
				switch(characterList[subIndex]){
				case EHONDA:
					display = MapTexture.characterSelectSprites[1];
					break;
				case DEEJAY:
					display = MapTexture.characterSelectSprites[3];
					break;
				case RYU:
					display = MapTexture.characterSelectSprites[0];
					break;
				case BLANKA:
					display = MapTexture.characterSelectSprites[2];
					break;
				case DHALSIM:
					display = MapTexture.characterSelectSprites[4];
					break;
				default:
					break;
				
				}
				g.drawImage(display, 0, (int)(Constants.SCREEN_HEIGHT.getIntValue()*.3), 500, 500, null);
			}
			xBuffer+=110; //5 pixel buffer


		}
		
		xBuffer = (int)(Constants.SCREEN_WIDTH.getIntValue()*.4);
		yBuffer = (int)(Constants.SCREEN_HEIGHT.getIntValue()*.7);
		
		for(int subIndex = 0; subIndex < characterList.length; subIndex++){
			Color c;
			if(select2[subIndex]){
				c = Color.BLACK;
				g.setColor(Color.BLUE);
				g.setFont(new Font("Aerial",Font.BOLD,30));
				g.drawString("P2", xBuffer+50, yBuffer-10);
				
			}else{
				c = Color.GRAY;
				
			}
			g.setColor(c);
			BufferedImage display = MapTexture.characterSelectSpritesFlipped[subIndex];
			
			
			
			g.drawImage(display, xBuffer, yBuffer, 100, 200,c, null);
			if(select2[subIndex]){
				g.drawImage(MapTexture.player2Selector, xBuffer, yBuffer, 100, 200, null);
				switch(characterList[subIndex]){
				case EHONDA:
					display = MapTexture.characterSelectSpritesFlipped[1];
					break;
				case DEEJAY:
					display = MapTexture.characterSelectSpritesFlipped[3];
					break;
				case RYU:
					display = MapTexture.characterSelectSpritesFlipped[0];
					break;
				case BLANKA:
					display = MapTexture.characterSelectSpritesFlipped[2];
					break;
				case DHALSIM:
					display = MapTexture.characterSelectSpritesFlipped[4];
					break;
				default:
					break;
				
				}
				g.drawImage(display, (int)(Constants.SCREEN_WIDTH.getIntValue()*.7), 0, 500, 500, null);
			}
			xBuffer+=110; //5 pixel buffer


		}
	}
	void drawTrainingSelect(Graphics g){
		g.setFont(new Font("Arial",Font.BOLD,40));
		//g.drawString("FIGHT CHARACTER SELECT", (int)(Constants.SCREEN_WIDTH.getIntValue()*.1),  (int)(Constants.SCREEN_HEIGHT.getIntValue()*.1));
		int xBuffer = (int)(Constants.SCREEN_WIDTH.getIntValue()*.05);
		int yBuffer = (int)(Constants.SCREEN_HEIGHT.getIntValue()*.05);
		for(int subIndex = 0; subIndex < characterList.length; subIndex++){
			Color c;
			if(select[subIndex]){
				c = Color.BLACK;
				g.setColor(Color.RED);
				g.setFont(new Font("Aerial",Font.BOLD,30));
				g.drawString("P1", xBuffer+50, yBuffer-10);
				
			}else{
				c = Color.GRAY;
				
			}
			g.setColor(c);
			BufferedImage display = MapTexture.characterSelectSprites[subIndex];
			
			g.drawImage(display, xBuffer, yBuffer, 100, 200,c, null);
			if(select[subIndex]){
				g.drawImage(MapTexture.player1Selector, xBuffer, yBuffer, 100, 200, null);
				switch(characterList[subIndex]){
				case EHONDA:
					display = MapTexture.characterSelectSprites[1];
					break;
				case DEEJAY:
					display = MapTexture.characterSelectSprites[3];
					break;
				case RYU:
					display = MapTexture.characterSelectSprites[0];
					break;
				case BLANKA:
					display = MapTexture.characterSelectSprites[2];
					break;
				case DHALSIM:
					display = MapTexture.characterSelectSprites[4];
					break;
				default:
					break;
				
				}
				g.drawImage(display, 0, (int)(Constants.SCREEN_HEIGHT.getIntValue()*.3), 500, 500, null);
			}
			//g.drawImage(MapTexture.characterSelectSprites[index][subIndex], xBuffer, yBuffer, 200,200,c,null);
			xBuffer+=110; //5 pixel buffer


				}
	}
}
