package gameClass;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

@SuppressWarnings("serial")
public class CharacterSelectLauncher extends JPanel {
	private GameType g;
	JFrame frame;
	CardLayout cardLayout = new CardLayout();
	JPanel screen = new JPanel(cardLayout);
	protected CharacterSelectLauncher(GameType g){
		this.g = g;
		panel();
		keys();
		repaint();
	}
	void keys(){
		getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("O"), "O");
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
	}
}
