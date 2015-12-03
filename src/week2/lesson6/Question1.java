package week2.lesson6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.CountDownLatch;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Question1 {
	private JFrame topFrame;
	private JButton countLetterButton;
	private JButton revLetterButton;
	private JButton remDupButton;
	private JLabel ipLabel;
	private JTextField ipTxtField;
	private JLabel opLabel;
	private JTextField opTxtField;

	private String ipText;

	public Question1() {

		topFrame = new JFrame();
		countLetterButton = new JButton("Count Letters");
		revLetterButton = new JButton("Reverse Letters");
		remDupButton = new JButton("Remove Duplicate");
		ipLabel = new JLabel("Input");
		ipTxtField = new JTextField(10);
		opLabel = new JLabel("Output");
		opTxtField = new JTextField();

		topFrame.setVisible(true);
		topFrame.setLayout(null);
		topFrame.setSize(400, 200);

		countLetterButton.setBounds(20, 20, 150, 20);
		topFrame.add(countLetterButton);

		revLetterButton.setBounds(20, 60, 150, 20);
		topFrame.add(revLetterButton);

		remDupButton.setBounds(20, 100, 150, 20);
		topFrame.add(remDupButton);

		ipLabel.setBounds(190, 40, 150, 20);
		topFrame.add(ipLabel);

		ipTxtField.setBounds(190, 60, 150, 20);
		topFrame.add(ipTxtField);

		opLabel.setBounds(190, 80, 150, 20);
		topFrame.add(opLabel);

		opTxtField.setBounds(190, 100, 150, 20);
		topFrame.add(opTxtField);

		countLetterEvent countE = new countLetterEvent();
		countLetterButton.addActionListener(countE);

		reverseLetterEvent revE = new reverseLetterEvent();
		revLetterButton.addActionListener(revE);

		removeDuplicatesEvent remDupE = new removeDuplicatesEvent();
		remDupButton.addActionListener(remDupE);

	}

	class countLetterEvent implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String ipTxt = ipTxtField.getText();
			opTxtField.setText(Integer.toString(ipTxt.length()));

		}

	}

	class reverseLetterEvent implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String ipTxt = ipTxtField.getText();
			opTxtField.setText(revString(ipTxt));

		}

		private String revString(String s) {
			String opStr = "";
			while (s.length() != 0) {
				opStr = opStr + s.substring(s.length() - 1);
				s = s.substring(0, s.length() - 1);
			}
			return opStr;
		}

	}

	class removeDuplicatesEvent implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String ipTxt = ipTxtField.getText();
			opTxtField.setText(remDuplicate(ipTxt));

		}

		private String remDuplicate(String input) {
			String output = new String();
			for (int index = 0; index < input.length(); index++) {
				if (input.charAt(index % input.length()) != input.charAt((index + 1) % input.length())) {
					output = output + input.charAt(index);

				}
			}
			return output;
		}
	}

	public static void main(String[] args) {
		Question1 q1 = new Question1();
	}
}
