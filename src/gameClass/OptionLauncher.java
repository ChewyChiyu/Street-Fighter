package gameClass;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
@SuppressWarnings("serial")
class OptionPanel extends JPanel{
	public OptionPanel(){
		super();
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		drawStrings(g);
	}
	void drawStrings(Graphics g){
		g.setFont(new Font("Arial", Font.BOLD, 40));
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Constants.SCREEN_WIDTH.getIntValue(), Constants.SCREEN_HEIGHT.getIntValue());
		g.setColor(Color.WHITE);
		g.drawString("OPTIONS / CONTROLS", (int)(Constants.SCREEN_WIDTH.getIntValue()*.3), (int)(Constants.SCREEN_HEIGHT.getIntValue()*.2));
		g.drawString("PAUSE : P", (int)(Constants.SCREEN_WIDTH.getIntValue()*.1), (int)(Constants.SCREEN_HEIGHT.getIntValue()*.3));
		g.drawString("OPTIONS : O", (int)(Constants.SCREEN_WIDTH.getIntValue()*.1), (int)(Constants.SCREEN_HEIGHT.getIntValue()*.4));
		g.drawString("EXIT OPTIONS : A", (int)(Constants.SCREEN_WIDTH.getIntValue()*.1), (int)(Constants.SCREEN_HEIGHT.getIntValue()*.5));

	}
	
}
@SuppressWarnings("serial")
public class OptionLauncher{
	 static OptionPanel panel = new OptionPanel();
	 static JPanel panelMain;
	 static CardLayout cardLayout;
	protected OptionLauncher(JPanel panel, CardLayout cardLayout){
		OptionLauncher.cardLayout = cardLayout;
		panelMain = panel;
		keys();
	}
	void keys(){
		panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("A"), "A");
		panel.getActionMap().put("A", new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.next(panelMain);
			}
			
		});
	}
	static void changePanel(JPanel p, CardLayout c){
		panelMain = p;
		cardLayout = c;
	}
}
