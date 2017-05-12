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
	private Character selectedCharacter = CharacterInfo.RYU.getCharacter(true);
	private CharacterInfo[] characterList = {CharacterInfo.RYU,CharacterInfo.EHONDA,CharacterInfo.THREE,CharacterInfo.FOUR,CharacterInfo.FIVE,CharacterInfo.SIX, CharacterInfo.SEVEN, CharacterInfo.EIGHT, CharacterInfo.NINE};
	private JFrame frame;
	private CardLayout cardLayout = new CardLayout();
	private JPanel screen = new JPanel(cardLayout);
	boolean[][] select = new boolean[MapTexture.characterSelectSprites.length][MapTexture.characterSelectSprites[0].length];
	protected CharacterSelectLauncher(GameType g){
		loadCharacterImages();
		this.g = g;
		select[0][0] = true;
		panel();
		keys();
		repaint();
	}
	void loadCharacterImages(){
		Texture.loadRyuTextures();
		Texture.loadEHondaTextures();
	}
	void keys(){
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("O"), "O");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("A"), "A");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("D"), "D");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("W"), "W");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("S"), "S");
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
				if(selectedCharacter == null){
					return;
				}
				new MapSelectLauncher(selectedCharacter ,g);
				frame.dispose();
			}

		});
		getActionMap().put("A", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				for(int index = 0; index < MapTexture.characterSelectSprites.length; index++){
					for(int subIndex = 1; subIndex < MapTexture.characterSelectSprites[0].length; subIndex++){
						if(select[index][subIndex]){
							select[index][subIndex] = false;
							select[index][subIndex-1] = true;
							updateSelectedCharacter(index,subIndex-1);
							repaint();
							return;
						}
					}
				}
			}

		});
		getActionMap().put("D", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				for(int index = 0; index < MapTexture.characterSelectSprites.length; index++){
					for(int subIndex = 0; subIndex < MapTexture.characterSelectSprites[0].length-1; subIndex++){
						if(select[index][subIndex]){
							select[index][subIndex] = false;
							select[index][subIndex+1] = true;
							updateSelectedCharacter(index,subIndex+1);
							repaint();
							return;
						}
					}
				}
			}

		});
		getActionMap().put("W", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				for(int index = 1; index < MapTexture.characterSelectSprites.length; index++){
					for(int subIndex = 0; subIndex < MapTexture.characterSelectSprites[0].length; subIndex++){
						if(select[index][subIndex]){
							select[index][subIndex] = false;
							select[index-1][subIndex] = true;
							updateSelectedCharacter(index-1,subIndex);
							repaint();
							return;
						}
					}
				}
			}

		});
		getActionMap().put("S", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				for(int index = 0; index < MapTexture.characterSelectSprites.length-1; index++){
					for(int subIndex = 0; subIndex < MapTexture.characterSelectSprites[0].length; subIndex++){
						if(select[index][subIndex]){
							select[index][subIndex] = false;
							select[index+1][subIndex] = true;
							updateSelectedCharacter(index+1,subIndex);
							repaint();
							return;
						}
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
	void updateSelectedCharacter(int r, int c){
		int location = (r*MapTexture.characterSelectSprites[0].length) + c + 1;
		for(int index = 0; index < characterList.length; index++){
			if(location == characterList[index].locationInCharSelect()){
				selectedCharacter = characterList[index].getCharacter(true);
			}
		}
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
		if(this.g.equals(GameType.TRAINING)){
			drawTrainingSelect(g);
		}else if(this.g.equals(GameType.FIGHT)){
			drawFightSelect(g);
		}	
		drawSelect(g);
	}
	void drawSelect(Graphics g){
		g.setColor(Color.GRAY);
		BufferedImage display = RyuTexture.idleRyuRight[0];
		if(selectedCharacter!=null){
		switch(selectedCharacter.getInfo()){
		case RYU:
			display = RyuTexture.idleRyuRight[0];
			break;
		case EHONDA:
			display = EHondaTexture.idleEHondaRight[0];
			break;
		default:
			g.drawString("Not Avaiable", (int)(Constants.SCREEN_WIDTH.getIntValue()*.7),(int)(Constants.SCREEN_HEIGHT.getIntValue()*.5));
			break;
		}
		}
		g.drawImage(display,(int)(Constants.SCREEN_WIDTH.getIntValue()*.7),0,selectedCharacter.getInfo().getWidth(),selectedCharacter.getInfo().getHeight(),null);
		g.fillRect((int)(Constants.SCREEN_WIDTH.getIntValue()*.6),(int)(Constants.SCREEN_HEIGHT.getIntValue()*.6), 500, 50);
		g.setFont(new Font("Arial",Font.BOLD,40));
		g.drawString("Selected Character ", (int)(Constants.SCREEN_WIDTH.getIntValue()*.55), (int)(Constants.SCREEN_HEIGHT.getIntValue()*.85));
		g.drawString(selectedCharacter.toString(), (int)(Constants.SCREEN_WIDTH.getIntValue()*.55), (int)(Constants.SCREEN_HEIGHT.getIntValue()*.9));

	}
	void drawFightSelect(Graphics g){
		g.setFont(new Font("Arial",Font.BOLD,40));
		g.drawString("FIGHT CHARACTER SELECT", (int)(Constants.SCREEN_WIDTH.getIntValue()*.1),  (int)(Constants.SCREEN_HEIGHT.getIntValue()*.1));
		int xBuffer = (int)(Constants.SCREEN_WIDTH.getIntValue()*.1);
		int yBuffer = (int)(Constants.SCREEN_HEIGHT.getIntValue()*.15);
		for(int index = 0; index < MapTexture.characterSelectSprites.length; index++){
			for(int subIndex = 0; subIndex < MapTexture.characterSelectSprites[0].length; subIndex++){
					Color c;
					if(select[index][subIndex]){
						c = Color.BLACK;
					}else{
						c = Color.GRAY;
					}
					g.drawImage(MapTexture.characterSelectSprites[index][subIndex], xBuffer, yBuffer, 200,200,c,null);
				xBuffer+=205; //5 pixel buffer
			}
			xBuffer = (int)(Constants.SCREEN_WIDTH.getIntValue()*.1);
			yBuffer += 205;
		}

	}
	void drawTrainingSelect(Graphics g){
		g.setFont(new Font("Arial",Font.BOLD,40));
		g.drawString("TRAINING CHARACTER SELECT", (int)(Constants.SCREEN_WIDTH.getIntValue()*.1),  (int)(Constants.SCREEN_HEIGHT.getIntValue()*.1));
		int xBuffer = (int)(Constants.SCREEN_WIDTH.getIntValue()*.1);
		int yBuffer = (int)(Constants.SCREEN_HEIGHT.getIntValue()*.15);
		for(int index = 0; index < MapTexture.characterSelectSprites.length; index++){
			for(int subIndex = 0; subIndex < MapTexture.characterSelectSprites[0].length; subIndex++){
					Color c;
					if(select[index][subIndex]){
						c = Color.BLACK;
					}else{
						c = Color.GRAY;
					}
					g.drawImage(MapTexture.characterSelectSprites[index][subIndex], xBuffer, yBuffer, 200,200,c,null);
				
				xBuffer+=205; //5 pixel buffer
			}
			xBuffer = (int)(Constants.SCREEN_WIDTH.getIntValue()*.1);
			yBuffer += 205;
		}

	}
}
