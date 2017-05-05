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

import textureClass.MapTexture;
import textureClass.Texture;
@SuppressWarnings("serial")
public class MapSelectLauncher extends JPanel{
	private Character c;
	private GameType g;
	private JFrame frame;
	private CardLayout cardLayout = new CardLayout();
	private JPanel screen = new JPanel(cardLayout);
	private Map selectedMap = MapInfo.ONE.getMap();
	private MapInfo[] mapList = {MapInfo.ONE,MapInfo.TWO,MapInfo.THREE,MapInfo.FOUR,MapInfo.FIVE,MapInfo.SIX, MapInfo.SEVEN, MapInfo.EIGHT, MapInfo.NINE};
	private boolean[][] select = new boolean[MapTexture.mapSelectSprites.length][MapTexture.mapSelectSprites[0].length];

	protected MapSelectLauncher(Character c, GameType g){
		select[0][0] = true;
		this.c = c;
		this.g = g;
		keys();
		panel();
		repaint();
	}
	void keys(){
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke((char) KeyEvent.VK_BACK_SPACE), "BACK");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("ENTER"), "ENTER");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("O"), "O");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("A"), "A");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("D"), "D");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("W"), "W");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("S"), "S");
		getActionMap().put("ENTER", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				new FightPanelLauncher(c,selectedMap,g);
				frame.dispose();
			}

		});	
		getActionMap().put("A", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				for(int index = 0; index < MapTexture.mapSelectSprites.length; index++){
					for(int subIndex = 1; subIndex < MapTexture.mapSelectSprites[0].length; subIndex++){
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
				for(int index = 0; index < MapTexture.mapSelectSprites.length; index++){
					for(int subIndex = 0; subIndex < MapTexture.mapSelectSprites[0].length-1; subIndex++){
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
				for(int index = 1; index < MapTexture.mapSelectSprites.length; index++){
					for(int subIndex = 0; subIndex < MapTexture.mapSelectSprites[0].length; subIndex++){
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
				for(int index = 0; index < MapTexture.mapSelectSprites.length-1; index++){
					for(int subIndex = 0; subIndex < MapTexture.mapSelectSprites[0].length; subIndex++){
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


		getActionMap().put("BACK", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				new CharacterSelectLauncher(g);
				frame.dispose();	
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
	void updateSelectedCharacter(int r, int c){
		int location = (r*MapTexture.mapSelectSprites[0].length) + c + 1;
		for(int index = 0; index < mapList.length; index++){
			if(location == mapList[index].locationInMapSelect()){
				selectedMap = mapList[index].getMap();
			}
		}
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		drawMapSelect(g);
		drawSelection(g);
	}
	void drawSelection(Graphics g){
		g.setColor(Color.GRAY);
		g.fillRect((int)(Constants.SCREEN_WIDTH.getIntValue()*.6),(int)(Constants.SCREEN_HEIGHT.getIntValue()*.6), 500, 50);
		g.setFont(new Font("Arial",Font.BOLD,40));
		g.drawString("Selected Map " + selectedMap.toString(), (int)(Constants.SCREEN_WIDTH.getIntValue()*.6), (int)(Constants.SCREEN_HEIGHT.getIntValue()*.8));
	}
	void drawMapSelect(Graphics g){
		g.setFont(new Font("Arial",Font.BOLD,40));
		g.drawString("MAP SELECT", (int)(Constants.SCREEN_WIDTH.getIntValue()*.1),  (int)(Constants.SCREEN_HEIGHT.getIntValue()*.1));
		int xBuffer = (int)(Constants.SCREEN_WIDTH.getIntValue()*.1);
		int yBuffer = (int)(Constants.SCREEN_HEIGHT.getIntValue()*.15);
		for(int index = 0; index < MapTexture.mapSelectSprites.length; index++){
			for(int subIndex = 0; subIndex < MapTexture.mapSelectSprites[0].length; subIndex++){
				if(MapTexture.mapSelectSprites[index][subIndex] != null){

					g.drawImage(MapTexture.mapSelectSprites[index][subIndex], xBuffer, yBuffer, 200,200,null);
					if(select[index][subIndex]){
						g.drawImage(MapTexture.selector, xBuffer, yBuffer, 200, 200,null);
					}
				}
				xBuffer+=205; //5 pixel buffer
			}
			xBuffer = (int)(Constants.SCREEN_WIDTH.getIntValue()*.1);
			yBuffer += 205;
		}
	}
}
