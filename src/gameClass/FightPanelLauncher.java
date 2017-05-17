package gameClass;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import textureClass.MapTexture;


@SuppressWarnings("serial")
public class FightPanelLauncher extends JPanel implements Runnable{
	private Thread gameLoop;
	public static boolean isRunning;
	protected static Character c;
	private Map m;
	private GameType g;
	private JFrame frame;
	private CardLayout cardLayout = new CardLayout();
	private JPanel screen = new JPanel(cardLayout);
	protected static ArrayList<GameObject> sprites = new ArrayList<GameObject>();
	protected static Character c2;
	protected FightPanelLauncher(Character c, Character c2, Map m, GameType g){
		//Player 1
		FightPanelLauncher.c = c;
		FightPanelLauncher.c2 = c2;
		this.m = m;
		this.g = g;
		sprites.add(c);
		sprites.add(c2);
		panel();
		start();
	}


	void keys(){
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("O"), "O");
		getActionMap().put("O", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				stop();
				cardLayout.next(screen);
			}

		});
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("P"), "PAUSE");
		getActionMap().put("PAUSE", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(isRunning){
					stop();
				}else{
					start();
				}

			}

		});
		switch(g){
		case FIGHT:
			manyPlayerKeys();
			break;
		case TRAINING:
			singlePlayerKeys();
			break;
		default:
			break;

		}
	}

	protected boolean A = false;
	protected boolean D = false;
	protected boolean S = false;
	protected boolean W = false;

	protected boolean rA = false;
	protected boolean rD = false;
	protected boolean rS = false;

	protected boolean PUNCHR = false;
	protected boolean KICKR = false;
	protected boolean SPECIALR = false;


	protected boolean UP = false;
	protected boolean DOWN = false;
	protected boolean LEFT = false;
	protected boolean RIGHT = false;

	protected boolean rRIGHT = false;
	protected boolean rLEFT = false;
	protected boolean rDOWN = false;

	protected boolean PUNCHL = false;
	protected boolean KICKL = false;
	protected boolean SPECIALL = false;





	void singlePlayerKeys(){
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("A"), "A");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("D"), "D");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("W"), "W");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("S"), "S");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("released S"), "rS");

		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("released A"), "rA");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("released D"), "rD");


		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("J"), "PUNCH");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("K"), "KICK");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("L"), "SPECIAL");



		getActionMap().put("A", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(isRunning)
					A = true;
			}

		});
		getActionMap().put("D", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(isRunning)
					D = true;
			}

		});
		getActionMap().put("W", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(isRunning)
					W = true;

			}

		});
		getActionMap().put("S", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(isRunning)
					S = true;
			}

		});
		getActionMap().put("rS", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(isRunning)
					rS = true;
			}

		});
		getActionMap().put("rA", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(isRunning)
					rA = true;
			}

		});
		getActionMap().put("rD", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(isRunning)
					rD = true;
			}

		});
		getActionMap().put("PUNCH", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(isRunning)
					PUNCHR = true;
			}

		});
		getActionMap().put("KICK", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(isRunning)
					KICKR = true;
			}

		});
		getActionMap().put("SPECIAL", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(isRunning)
					SPECIALR = true;
			}

		});

	}
	void manyPlayerKeys(){

		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("A"), "A");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("D"), "D");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("W"), "W");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("S"), "S");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("released S"), "rS");

		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("released A"), "rA");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("released D"), "rD");


		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("F"), "PUNCHR");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("G"), "KICKR");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("H"), "SPECIALR");

		//PLAYER TWO

		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke((char) KeyEvent.VK_LEFT, 0, false), "LEFT");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke((char) KeyEvent.VK_RIGHT, 0 , false), "RIGHT");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke((char) KeyEvent.VK_UP, 0 ,false), "UP");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke((char) KeyEvent.VK_DOWN, 0 , false), "SNEAK");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke((char) KeyEvent.VK_DOWN, 0 , true), "rSNEAK");

		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke((char) KeyEvent.VK_LEFT, 0, true), "rLEFT");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke((char) KeyEvent.VK_RIGHT, 0 , true), "rRIGHT");


		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("B"), "PUNCHL");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("N"), "KICKL");
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("M"), "SPECIALL");





		getActionMap().put("A", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				//c.setXVelo(-c.getSpeed());
				if(isRunning)
					A = true;
			}

		});
		getActionMap().put("D", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				//c.setXVelo(c.getSpeed());
				if(isRunning)
					D = true;
			}

		});
		getActionMap().put("W", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				//c.jump();
				if(isRunning)
					W = true;
			}

		});
		getActionMap().put("S", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				//c.sneak();
				if(isRunning)
					S = true;
			}

		});
		getActionMap().put("rS", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				//c.stand();
				if(isRunning)
					rS = true;
			}

		});
		getActionMap().put("rA", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				//c.setXVelo(0);
				if(isRunning)
					rA = true;
			}

		});
		getActionMap().put("rD", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				//c.setXVelo(0);
				if(isRunning)
					rD = true;
			}

		});
		getActionMap().put("PUNCHR", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				//c.punch();
				if(isRunning)
					PUNCHR = true;
			}

		});
		getActionMap().put("KICKR", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				//	c.kick();
				if(isRunning)
					KICKR = true;
			}

		});
		getActionMap().put("SPECIALR", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				//c.special();
				if(isRunning)
					SPECIALR = true;
			}

		});



		getActionMap().put("LEFT", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				//c.setXVelo(-c.getSpeed());
				if(isRunning)
					LEFT = true;
			}

		});
		getActionMap().put("RIGHT", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				//c.setXVelo(c.getSpeed());
				if(isRunning)
					RIGHT = true;
			}

		});
		getActionMap().put("UP", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				//c.jump();
				if(isRunning)
					UP = true;
			}

		});
		getActionMap().put("SNEAK", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				//c.sneak();
				if(isRunning)
					DOWN = true;
			}

		});
		getActionMap().put("rSNEAK", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				//c.stand();
				if(isRunning)
					rDOWN = true;
			}

		});
		getActionMap().put("rLEFT", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				//c.setXVelo(0);
				if(isRunning)
					rLEFT = true;
			}

		});
		getActionMap().put("rRIGHT", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				//c.setXVelo(0);
				if(isRunning)
					rRIGHT = true;
			}

		});




		getActionMap().put("PUNCHL", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				//c.punch();
				if(isRunning)
					PUNCHL = true;
			}

		});
		getActionMap().put("KICKL", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				//	c.kick();
				if(isRunning)
					KICKL = true;
			}

		});
		getActionMap().put("SPECIALL", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				//c.special();
				if(isRunning)
					SPECIALL = true;
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
	synchronized void start(){
		gameLoop = new Thread(this);
		isRunning = true;
		gameLoop.start();
		c.characterLoops();
		c2.characterLoops();
		boundsCheck();
		readKeys();
		keys();
	}
	void readKeys(){
		Thread keyReading = new Thread(new Runnable(){
			public void run(){
				while(isRunning){
					if(!c.defeated){
					if(A){
						c.setXVelo(-c.getSpeed());
						A = false;
					}
					if(D){
						c.setXVelo(c.getSpeed());
						D = false;
					}
					if(W){
						c.jump();
						W = false;
					}
					if(S){
						c.sneak();
						S = false;
					}
					if(rS){
						c.stand();
						rS = false;
					}
					if(rA || rD){
						c.setXVelo(0);
						rA = false;
						rD = false;
					}
					if(PUNCHR){
						if(!c.inAir){
							if(c.isSneaking)
								c.sneakPunch();
							else
								c.punch();
						}else{
							c.aerialPunch();
						}
						PUNCHR = false;
					}
					if(KICKR){
						if(!c.inAir){
							if(c.isSneaking)
								c.sneakKick();
							else
								c.kick();
						}else{
							c.aerialKick();
						}
						KICKR = false;
					}
					if(SPECIALR){
						c.special();
						SPECIALR = false;
					}
					}
					if(!c2.defeated){
					//PLAYER 2
					if(UP){
						c2.jump();
						UP = false;
					}
					if(DOWN){
						c2.sneak();
						DOWN = false;
					}
					if(LEFT){
						c2.setXVelo(-c2.getSpeed());
						LEFT = false;
					}
					if(RIGHT){
						c2.setXVelo(c2.getSpeed());
						RIGHT = false;
					}
					if(rRIGHT){
						c2.setXVelo(0);
						rRIGHT = false;
					}
					if(rLEFT){
						c2.setXVelo(0);
						rLEFT = false;
					}
					if(rDOWN){
						c2.stand();
						rDOWN = false;
					}
					if(PUNCHL){
						if(!c2.inAir){
							if(c2.isSneaking)
								c2.sneakPunch();
							else
								c2.punch();
						}else{
							c2.aerialPunch();
						}
						PUNCHL = false;
					}
					if(KICKL){
						if(!c2.inAir){
							if(c2.isSneaking)
								c2.sneakKick();
							else
								c2.kick();
						}else{
							c2.aerialKick();
						}
						KICKL = false;
					}
					if(SPECIALL){
						c2.special();
						SPECIALL = false;
					}
					}
					try{
						Thread.sleep(1);
					}catch(Exception e) { }
				}
			}

		});
		keyReading.start();
	}
	void boundsCheck(){
		Thread boundCheck = new Thread(new Runnable(){
			public void run(){
				while(isRunning){
					//out of bounds check
					for(int index = 0; index < sprites.size(); index++){
						GameObject c = sprites.get(index);
						if(c==null){
							continue;
						}
						if(c.getType().equals(GameType.PROJECTILE)){
							//self removal
							if(c.getX()<0||c.getX()>Constants.SCREEN_WIDTH.getIntValue()){
								sprites.remove(c);
							}
						}
						if(c.gravity){
							if(c.getX()<0){
								c.setX(c.getSpeed());
							}
							else if(c.getX()+((Character)c).getInfo().getWidth()>Constants.SCREEN_WIDTH.getIntValue()){
								c.setX(-c.getSpeed());
							}
						}
						
						//if in air
						if(c.getType().equals(GameType.PLAYER)&&c.getY()+((Character)c).getInfo().getHeight()<(int)(Constants.SCREEN_HEIGHT.getIntValue()*.9)){
							c.inAir = true;
						}else{
							//stuck in floor
							c.inAir = false;
						}

					}
				}
			}
		});
		Thread moveHitBox = new Thread(new Runnable(){
			public void run(){
				while(isRunning){
					for(int index = 0; index < sprites.size(); index++){
						//Move Body HitBoxes
						GameObject c = sprites.get(index);
						if(c.getType().equals(GameType.PLAYER)){
							//movements
							//body, head

							Character c2 = ((Character ) c ); 

							c2.getBody().setX(c2.getX()+(int)(((Character)c).getInfo().getWidth()*.2)); //constant body x axis
							c2.getHead().setX(c2.getX()+(int)(((Character)c).getInfo().getWidth()*.2)); //constant body y axis
							c2.getLegs().setX(c2.getX()+(int)(((Character)c).getInfo().getWidth()*.2)); //constant body legs
							if(!((Character)c2).isSneaking){ //character is not sneaking
								c2.getBody().setY(c2.getY()+(int)(((Character)c).getInfo().getHeight()*.2)); //standard body placement
								if(!c2.inAir){ //character is on ground
									c2.getHead().setY(c2.getY()); //standard head placement
									c2.getLegs().setY(c2.getY()+(int)(((Character)c).getInfo().getHeight()*.6));
								}else{ //character is in air
									c2.getHead().setY(c2.getY()+(int)(((Character)c).getInfo().getHeight()*.3)); //tuck head for roll
									c2.getLegs().setY(c2.getY());
								}
							}else{ //character is sneaking 
								c2.getBody().setY(c2.getY()+(int)(((Character)c).getInfo().getHeight()*.5)); //head and body tucked for sneak
								c2.getHead().setY(c2.getY()+(int)(((Character)c).getInfo().getHeight()*.5));
								c2.getLegs().setY(c2.getY()+(int)(((Character)c).getInfo().getHeight()*.5));
							}


						}
						if(c.getType().equals(GameType.PROJECTILE)){
							c.getBody().setX(c.getX());
							c.getBody().setY(c.getY());
						}
					}
					//player increment check
					if(c2.getX()-(c.getX()+c.getWidth()*5)<=100 &&(!c.defeated&&!c.defeated)){ //60 pixel buffer
						c.setX(-c.getSpeed());
						c2.setX(c.getSpeed());
						//players never cross
					}
					try{
						Thread.sleep(1);
					}catch(Exception e) { }
				}


			}

		});
		Thread hitCheck = new Thread(new Runnable(){
			public void run(){
				while(isRunning){
					
					//player one/two hits
					
					int attackX = c.getBody().getCenterX();
					int attackY = 0;
					
					int attackX2 = c2.getBody().getCenterX();
					int attackY2 = 0;
					
					
					if(c.isPunching){
						attackX = c.getBody().getCenterX() + (int)(c.getBody().getWidth()*.7);
						attackY = c.getBody().getCenterY();

					}
					if(c2.isPunching){
						attackX2 = c2.getBody().getCenterX() - (int)(c2.getBody().getWidth()*.7);
						attackY2 = c2.getBody().getCenterY();
					}

					if(c.isKicking){
						attackX = c.getBody().getCenterX() + (int)(c.getBody().getWidth()*.7);
						attackY = c.getBody().getY()-c.getHead().getHeight()/2;

					}
					if(c2.isKicking){
						attackX2= c2.getBody().getCenterX() - (int)(c2.getBody().getWidth()*.7);
						attackY2 = c2.getBody().getY()-c2.getHead().getHeight()/2;
					}
					if(c.isLowPunching){
						attackX = c.getLegs().getCenterX() + (int)(c.getLegs().getWidth());
						attackY = c.getLegs().getCenterY()+c.getLegs().getHeight()/2;

					}
					if(c2.isLowPunching){
						attackX2 = c2.getLegs().getCenterX() - (int)(c2.getLegs().getWidth());
						attackY2 = c2.getLegs().getCenterY()+c2.getLegs().getHeight()/2;
					}
					if(c.isLowKicking){
							attackX = c.getLegs().getCenterX() + (int)(c.getLegs().getWidth());
							attackY = c.getLegs().getCenterY()+c.getLegs().getHeight()/2;
					}
					if(c2.isLowKicking){
							attackX2 = c2.getLegs().getCenterX() - (int)(c2.getLegs().getWidth());
							attackY2 = c2.getLegs().getCenterY()+c2.getLegs().getHeight()/2;
					}
					if(c.isAerialPunching){
						attackX = c.getLegs().getCenterX() + (int)(c.getLegs().getWidth()*1.5);
						attackY = c.getLegs().getCenterY()+(int)(c.getLegs().getHeight()*2.5);
					}
					if(c2.isAerialPunching){
						attackX2 = c2.getLegs().getCenterX() - (int)(c2.getLegs().getWidth()*1.5);
						attackY2 = c2.getLegs().getCenterY()+(int)(c2.getLegs().getHeight()*2.5);
					}
					if(c.isAerialKicking){
						attackX = c.getLegs().getCenterX() + (int)(c.getLegs().getWidth());
						attackY = c.getLegs().getCenterY()+c.getLegs().getHeight()/2;
					}
					if(c2.isAerialKicking){
						attackX2 = c2.getLegs().getCenterX() - c2.getLegs().getWidth() ;
						attackY2 = c2.getLegs().getCenterY()+c2.getLegs().getHeight()/2;
					}
					if(c.isAttacking&&!c2.defeated){

						if(c2.getBody().isTouching(attackX, attackY,true)&&!c2.justAttacked&&!c2.isGettingHitTorso){
							c2.getHitTorso();
							c2.isDead(10);
							c2.justAttacked = true;
						}
						if(c2.getLegs().isTouching(attackX, attackY,true)&&!c2.justAttacked&&!c2.isGettingKnockedDown){
							c2.getKnockedDown();
							c2.isDead(10);
							c2.justAttacked = true;

						}
						if(c2.getHead().isTouching(attackX, attackY,true)&&!c2.justAttacked&&!c2.isGettingHitHead){
							c2.getHitHead();
							c2.isDead(10);
							c2.justAttacked = true;
						}
					}
					if(c2.isAttacking&&!c.defeated){
						if(c.getBody().isTouching(attackX2, attackY2,false)&&!c.justAttacked&&!c.isGettingHitTorso){
							c.getHitTorso();
							c.isDead(10);
							c.justAttacked = true;
						}
						if(c.getLegs().isTouching(attackX2, attackY2,false)&&!c.justAttacked&&!c.isGettingKnockedDown){
							c.getKnockedDown();
							c.isDead(10);
							c.justAttacked = true;
						}
						if(c.getHead().isTouching(attackX2, attackY2,false)&&!c.justAttacked&&!c.isGettingHitHead){
							c.getHitHead();
							c.isDead(10);
							c.justAttacked = true;
						}
						
					}
					for(int index = 0; index < sprites.size(); index++ ){
						GameObject o = sprites.get(index);
						if(o.getType().equals(GameType.PROJECTILE)){
							if(c.getBody().isTouching(o.getBody().getCenterX(),o.getBody().getCenterY())){
								c.justAttacked = true;
								c.isDead(10);
								c.getHitTorso();
								sprites.remove(o);
							}
							if(c.getHead().isTouching(o.getBody().getCenterX(),o.getBody().getCenterY())){
								c.justAttacked = true;
								c.isDead(10);
								c.getHitHead();
								sprites.remove(o);
							}
							if(c.getLegs().isTouching(o.getBody().getCenterX(),o.getBody().getCenterY())){
								c.justAttacked = true;
								c.isDead(10);
								c.getKnockedDown();
								sprites.remove(o);
							}
							if(c2.getBody().isTouching(o.getBody().getCenterX(),o.getBody().getCenterY())){
								c2.justAttacked = true;
								c2.isDead(10);
								c2.getHitTorso();
								sprites.remove(o);
							}
							if(c2.getHead().isTouching(o.getBody().getCenterX(),o.getBody().getCenterY())){
								c2.justAttacked = true;
								c2.isDead(10);
								c2.getHitHead();
								sprites.remove(o);
							}
							if(c2.getLegs().isTouching(o.getBody().getCenterX(),o.getBody().getCenterY())){
								c2.justAttacked = true;
								c2.isDead(10);
								c2.getKnockedDown();
								sprites.remove(o);
							}
						}
					}
					try{
						Thread.sleep(1);
					}catch(Exception e) { }
				}
			}
		});
		hitCheck.start();
		boundCheck.start();
		moveHitBox.start();
	}
	synchronized void stop(){
		try{
			isRunning = false;
			repaint();
		}catch(Exception e) { }
	}
	@Override
	public void run() {
		while(isRunning){
			update();
			try{
				Thread.sleep(10);
			}catch(Exception e) { }
		}

	}
	void update(){
		repaint();
		physics();
		updateLocations();
	}
	void physics(){
		for(int index = 0; index < sprites.size(); index++){
			GameObject c = sprites.get(index);
			if(!c.gravity){
				continue;
			}
			if(c.getY()+((Character)c).getInfo().getHeight()<(int)(Constants.SCREEN_HEIGHT.getIntValue()*.9)){
				c.setYVelo(Constants.GRAVITY.getIntValue());
			}else{
				c.setYVelo(0);
			}

		}
	}
	void updateLocations(){
		for(int index = 0; index < sprites.size(); index++){
			GameObject c = sprites.get(index);
			if(c.getType().equals(GameType.PLAYER)&&!((Character)c).isGettingHitHead&&!((Character)c).isGettingHitTorso&&!((Character)c).isGettingKnockedDown&&!((Character)c).isAttacking){
			if(((Character)c).defeated){
				continue;
			}
			c.setX(c.getXVelo());
			}else if(c.getType().equals(GameType.PROJECTILE)){
				c.setX(c.getXVelo());
			}
			c.setY(c.getYVelo());
		}
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		drawMap(g);
		drawCharacters(g);
		//drawHitBoxes(g);
		drawCharacterHealth(g);
		if(!isRunning){
			g.setFont(new Font("Aerial",Font.BOLD,100));
			g.setColor(Color.WHITE);
			g.drawString("PRESS P TO UNPAUSE", (int)(Constants.SCREEN_WIDTH.getIntValue()*.05), (int)(Constants.SCREEN_HEIGHT.getIntValue()*.3));
		}
	}
	void drawCharacterHealth(Graphics g){
		//player one health
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, (int)(Constants.SCREEN_WIDTH.getIntValue()*.45), 90);
		g.fillRect( (int)(Constants.SCREEN_WIDTH.getIntValue()*.55), 0, (int)(Constants.SCREEN_WIDTH.getIntValue()*.45), 90);
		g.setColor(Color.RED);
		g.fillRect((int)(Constants.SCREEN_WIDTH.getIntValue()*.45) - (int) ((double)(((double)c.getHealth())/100)*(Constants.SCREEN_WIDTH.getIntValue()*.45)), 0, (int) ((double)(((double)c.getHealth())/100)*(Constants.SCREEN_WIDTH.getIntValue()*.45)), 90);
		g.fillRect((int)(Constants.SCREEN_WIDTH.getIntValue()*.55), 0, (int) ((double)(((double)c2.getHealth())/100)*(Constants.SCREEN_WIDTH.getIntValue()*.50)), 90);
		
		g.setColor(Color.DARK_GRAY);
		g.setFont(new Font("Aerial",Font.BOLD,40));
		g.drawString(c.toString(), (int)(Constants.SCREEN_WIDTH.getIntValue()*.30), (int)(Constants.SCREEN_HEIGHT.getIntValue()*.05));
		g.drawString(c2.toString(), (int)(Constants.SCREEN_WIDTH.getIntValue()*.60), (int)(Constants.SCREEN_HEIGHT.getIntValue()*.05));
		g.drawImage(MapTexture.koLogo, (int)(Constants.SCREEN_WIDTH.getIntValue()*.45),0,(int)(Constants.SCREEN_WIDTH.getIntValue()*.1),(int)(Constants.SCREEN_HEIGHT.getIntValue()*.1),null);
	}
	void drawCharacters(Graphics g){
		for(int index = 0; index < sprites.size(); index++){
			GameObject c = sprites.get(index);
			c.draw(g);
		}

	}
	void drawMap(Graphics g){
		m.drawMap(g);
	}
	void drawHitBoxes(Graphics g){
		for(int index = 0; index < sprites.size(); index++){
			GameObject o = sprites.get(index);
			o.getBody().draw(g,Color.GREEN);
			if(o.getType().equals(GameType.PLAYER)){
				//only players have heads and legs
				((Character) o).head.draw(g,Color.RED);
				((Character) o).legs.draw(g,Color.PINK);
			}
		}

	}
}
