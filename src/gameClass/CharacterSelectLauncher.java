package gameClass;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import textureClass.Texture;

@SuppressWarnings("serial")
public class CharacterSelectLauncher extends JPanel {
	private GameType g;
	Character selectedCharacter = CharacterInfo.ONE.getCharacter();
	CharacterInfo[] characterList = {CharacterInfo.ONE,CharacterInfo.TWO,CharacterInfo.THREE,CharacterInfo.FOUR,CharacterInfo.FIVE,CharacterInfo.SIX, CharacterInfo.SEVEN, CharacterInfo.EIGHT, CharacterInfo.NINE};
	JFrame frame;
	CardLayout cardLayout = new CardLayout();
	JPanel screen = new JPanel(cardLayout);
	boolean[][] select = new boolean[Texture.characterSelectSprites.length][Texture.characterSelectSprites[0].length];
	protected CharacterSelectLauncher(GameType g){
		this.g = g;
		select[0][0] = true;
		panel();
		keys();
		repaint();
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
				for(int index = 0; index < Texture.characterSelectSprites.length; index++){
					for(int subIndex = 1; subIndex < Texture.characterSelectSprites[0].length; subIndex++){
						if(select[index][subIndex]){
							updateSelectedCharacter(index,subIndex);
							repaint();
							return;
						}
					}
				}
			}

		});
		getActionMap().put("A", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				for(int index = 0; index < Texture.characterSelectSprites.length; index++){
					for(int subIndex = 1; subIndex < Texture.characterSelectSprites[0].length; subIndex++){
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
				for(int index = 0; index < Texture.characterSelectSprites.length; index++){
					for(int subIndex = 0; subIndex < Texture.characterSelectSprites[0].length-1; subIndex++){
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
				for(int index = 1; index < Texture.characterSelectSprites.length; index++){
					for(int subIndex = 0; subIndex < Texture.characterSelectSprites[0].length; subIndex++){
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
				for(int index = 0; index < Texture.characterSelectSprites.length-1; index++){
					for(int subIndex = 0; subIndex < Texture.characterSelectSprites[0].length; subIndex++){
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
		int location = (r*Texture.characterSelectSprites[0].length) + c + 1;
		for(int index = 0; index < characterList.length; index++){
			if(location == characterList[index].locationInCharSelect()){
				selectedCharacter = characterList[index].getCharacter();
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
		g.fillRect((int)(Constants.SCREEN_WIDTH.getIntValue()*.6),(int)(Constants.SCREEN_HEIGHT.getIntValue()*.6), 500, 50);
		g.setFont(new Font("Arial",Font.BOLD,40));
		g.drawString("Selected Character " + selectedCharacter.toString(), (int)(Constants.SCREEN_WIDTH.getIntValue()*.6), (int)(Constants.SCREEN_HEIGHT.getIntValue()*.8));
	}
	void drawFightSelect(Graphics g){
		g.setFont(new Font("Arial",Font.BOLD,40));
		g.drawString("FIGHT CHARACTER SELECT", (int)(Constants.SCREEN_WIDTH.getIntValue()*.1),  (int)(Constants.SCREEN_HEIGHT.getIntValue()*.1));
		int xBuffer = (int)(Constants.SCREEN_WIDTH.getIntValue()*.1);
		int yBuffer = (int)(Constants.SCREEN_HEIGHT.getIntValue()*.15);
		for(int index = 0; index < Texture.characterSelectSprites.length; index++){
			for(int subIndex = 0; subIndex < Texture.characterSelectSprites[0].length; subIndex++){
				if(Texture.characterSelectSprites[index][subIndex] != null){
					g.drawImage(Texture.characterSelectSprites[index][subIndex], xBuffer, yBuffer, 200,200,null);
				}
				if(select[index][subIndex]){
					g.setColor(Color.BLACK);
				}else{
					g.setColor(Color.GRAY);
				}
				g.fillRect(xBuffer, yBuffer, 200, 200);
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
		for(int index = 0; index < Texture.characterSelectSprites.length; index++){
			for(int subIndex = 0; subIndex < Texture.characterSelectSprites[0].length; subIndex++){
				if(Texture.characterSelectSprites[index][subIndex] != null){
					g.drawImage(Texture.characterSelectSprites[index][subIndex], xBuffer, yBuffer, 200,200,null);
				}
				if(select[index][subIndex]){
					g.setColor(Color.BLACK);
				}else{
					g.setColor(Color.GRAY);
				}
				g.fillRect(xBuffer, yBuffer, 200, 200);
				xBuffer+=205; //5 pixel buffer
			}
			xBuffer = (int)(Constants.SCREEN_WIDTH.getIntValue()*.1);
			yBuffer += 205;
		}

	}
}
