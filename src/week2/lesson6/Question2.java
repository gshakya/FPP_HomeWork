package week2.lesson6;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Question2 {
	private int width, height;
	private JFrame topFrame;
	private JPanel topPanel;
	private JButton redBtn, orangeBtn, yellowBtn, greenBtn, blueBtn, indigoBtn, violetBtn;

	public Question2() {

		width = 200;
		height = 200;

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

		topFrame.setSize(1400, 200);
		topPanel.setSize(1400, 200);

		redBtn.setSize(width, height);
		orangeBtn.setSize(width, height);
		yellowBtn.setSize(width, height);
		greenBtn.setSize(width, height);
		blueBtn.setSize(width, height);
		indigoBtn.setSize(width, height);
		violetBtn.setSize(width, height);

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

	}

	public static void main(String[] args) {
		Question2 q2 = new Question2();
	}
}
