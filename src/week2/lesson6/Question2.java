package week2.lesson6;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Question2 {
	private int width, height;
	private JFrame topFrame;
	private JPanel topPanel;
	private JButton redBtn, orangeBtn, yellowBtn, greenBtn, blueBtn, indigoBtn, violetBtn;

	public Question2() {

		width = 100;
		height = 100;

		redBtn = new JButton();
		orangeBtn = new JButton();
		yellowBtn = new JButton();
		greenBtn = new JButton();
		blueBtn = new JButton();
		indigoBtn = new JButton();
		violetBtn = new JButton();

		topFrame = new JFrame("Rainbow Color Frame");

		topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 2, 2));
		topFrame.setVisible(true);
		topFrame.add(topPanel);

		topFrame.setSize(1000, 200);
		topPanel.setSize(1000, 200);

		redBtn.setPreferredSize(new Dimension(width, height));
		orangeBtn.setPreferredSize(new Dimension(width, height));
		yellowBtn.setPreferredSize(new Dimension(width, height));
		greenBtn.setPreferredSize(new Dimension(width, height));
		blueBtn.setPreferredSize(new Dimension(width, height));
		indigoBtn.setPreferredSize(new Dimension(width, height));
		violetBtn.setPreferredSize(new Dimension(width, height));

		topPanel.add(redBtn);
		topPanel.add(orangeBtn);
		topPanel.add(yellowBtn);
		topPanel.add(greenBtn);
		topPanel.add(blueBtn);
		topPanel.add(indigoBtn);
		topPanel.add(violetBtn);

		redBtn.setBackground(Color.red);
		orangeBtn.setBackground(Color.orange);
		yellowBtn.setBackground(Color.yellow);
		greenBtn.setBackground(Color.green);
		blueBtn.setBackground(Color.blue);
		indigoBtn.setBackground(new Color(138, 43, 226));
		violetBtn.setBackground(new Color(75, 0, 130));
		
		
		redBtn.addActionListener(new RedBtnAction());
		orangeBtn.addActionListener(new OrangeBtnAction());
		yellowBtn.addActionListener(new YellowBtnAction());
		greenBtn.addActionListener(new GreenBtnAction());
		blueBtn.addActionListener(new BlueBtnAction());
		indigoBtn.addActionListener(new IndigoBtnAction());
		violetBtn.addActionListener(new VioletBtnAction());

	}

	private class RedBtnAction extends JOptionPane implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			showMessageDialog(null, " Red signifies passion, vitality, enthusiasm and security");

		}

	}

	private class OrangeBtnAction extends JOptionPane implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			showMessageDialog(null,
					"Orange represents creativity, practicality, playfulness as well as equilibrium or control.");

		}

	}

	private class YellowBtnAction extends JOptionPane implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			showMessageDialog(null,
					"Yellow represents  represents clarity of thought, wisdom, orderliness and energy.");

		}

	}
	
	private class GreenBtnAction extends JOptionPane implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			showMessageDialog(null,
					"Green denotes fertility, growth, balance, health and wealth.");

		}

	}
	
	private class BlueBtnAction extends JOptionPane implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			showMessageDialog(null,
					"Blue is associated with Spirituality and Divinity.");

		}

	}
	
	private class IndigoBtnAction extends JOptionPane implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			showMessageDialog(null,
					"Indigo is used for spiritual attainment, psychic abilities, self awareness and enhancement of Intuition");

		}

	}
	
	private class VioletBtnAction extends JOptionPane implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			showMessageDialog(null,
					"Violet can ignite one’s imagination and be an inspiration to artists.");

		}

	}
	
	

	public static void main(String[] args) {
		Question2 q2 = new Question2();
	}
}
