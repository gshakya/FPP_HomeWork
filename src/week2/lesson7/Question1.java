package week2.lesson7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.GridBagConstraints;
import java.awt.Label;
import java.awt.Insets;
import java.awt.Button;

public class Question1 extends JFrame {

	private JPanel contentPane;
	private JTextField mileTxtField;
	private JLabel pndLbl;
	private JTextField pndTxtField;
	private JLabel galLabel;
	private JTextField galTxtField;
	private JLabel fhtLabel;
	private JTextField fhtTxtField;
	private JLabel kmLabel;
	private JLabel kgLabel;
	private JLabel ltrLabel;
	private JLabel centLabel;
	private JLabel mileLabel;
	private JTextField kmTxtField;
	private JTextField kgTxtField;
	private JTextField ltrTxtField;
	private JTextField centTxtField;
	private Button calculateBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		Question1 frame = new Question1();

	}

	/**
	 * Create the frame.
	 */
	public Question1() {
		int startX = 20;
		int startY = 20;
		int width = 70;
		int height = 20;
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 250);
		contentPane = new JPanel();
		add(contentPane);

		contentPane.setLayout(null);

		mileLabel = new JLabel("Mile: ");
		mileLabel.setBounds(startX, startY, width, height);
		contentPane.add(mileLabel);

		startX = startX + (width);
		mileTxtField = new JTextField(10);
		mileTxtField.setBounds(startX, startY, width, height);
		contentPane.add(mileTxtField);

		startX = startX + (width);
		kmLabel = new JLabel("Kilometer: ");
		kmLabel.setBounds(startX, startY, width, height);
		contentPane.add(kmLabel);

		startX = startX + (width);
		kmTxtField = new JTextField(10);
		kmTxtField.setBounds(startX, startY, width, height);
		contentPane.add(kmTxtField);

		startX = 20;
		startY = startY + 20;
		pndLbl = new JLabel("Pound: ");
		pndLbl.setBounds(startX, startY, width, height);
		contentPane.add(pndLbl);

		startX = startX + (width);
		pndTxtField = new JTextField(10);
		pndTxtField.setBounds(startX, startY, width, height);
		contentPane.add(pndTxtField);

		startX = startX + (width);
		kgLabel = new JLabel("Kilogram: ");
		kgLabel.setBounds(startX, startY, width, height);
		contentPane.add(kgLabel);

		startX = startX + (width);
		kgTxtField = new JTextField(10);
		kgTxtField.setBounds(startX, startY, width, height);
		contentPane.add(kgTxtField);

		startX = 20;
		startY = startY + 20;
		galLabel = new JLabel("Gallon: ");
		galLabel.setBounds(startX, startY, width, height);
		contentPane.add(galLabel);

		startX = startX + (width);
		galTxtField = new JTextField(10);
		galTxtField.setBounds(startX, startY, width, height);
		contentPane.add(galTxtField);

		startX = startX + (width);
		ltrLabel = new JLabel("Liter: ");
		ltrLabel.setBounds(startX, startY, width, height);
		contentPane.add(ltrLabel);

		startX = startX + (width);
		ltrTxtField = new JTextField(10);
		ltrTxtField.setBounds(startX, startY, width, height);
		contentPane.add(ltrTxtField);

		startX = 20;
		startY = startY + 20;
		fhtLabel = new JLabel("Fahrenheit: ");
		fhtLabel.setBounds(startX, startY, width, height);
		contentPane.add(fhtLabel);

		startX = startX + (width);
		fhtTxtField = new JTextField(10);
		fhtTxtField.setBounds(startX, startY, width, height);
		contentPane.add(fhtTxtField);

		startX = startX + (width);
		centLabel = new JLabel("Centigrade: ");
		centLabel.setBounds(startX, startY, width, height);
		contentPane.add(centLabel);

		startX = startX + (width);
		centTxtField = new JTextField(10);
		centTxtField.setBounds(startX, startY, width, height);
		contentPane.add(centTxtField);

		mileLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		kmLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		kgLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		ltrLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		centLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		pndLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		galLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		fhtLabel.setHorizontalAlignment(SwingConstants.RIGHT);

		startX = (int) (20 + (width * 1.5));
		startY = startY + 20;
		calculateBtn = new Button("Calculate");
		calculateBtn.setBounds(startX, startY, width, height);
		calculateBtn.addActionListener(evt -> {
			populateOpTxtField();
		});
		contentPane.add(calculateBtn);
	}

	private void populateOpTxtField() {
		kmTxtField.setText("");
		kgTxtField.setText("");
		ltrTxtField.setText("");
		centTxtField.setText("");
		
		
		if (!(mileTxtField.getText().trim().equals(""))) {
			double mileVal = Double.parseDouble(mileTxtField.getText().trim()) * 1.60934;
			kmTxtField.setText(String.format("%.3f", mileVal));
		}

		if (!(pndTxtField.getText().trim().equals(""))) {
			double kgVal = Double.parseDouble(pndTxtField.getText().trim()) * 0.453592;
			kgTxtField.setText(String.format("%.3f", kgVal));
		}

		if (!(galTxtField.getText().trim().equals(""))) {
			double ltrVal = Double.parseDouble(galTxtField.getText().trim()) * 3.78541;
			ltrTxtField.setText(String.format("%.3f", ltrVal));
		}

		if (!(fhtTxtField.getText().trim().equals(""))) {
			double centVal = (Double.parseDouble(fhtTxtField.getText().trim()) - 32) / 1.8;
			centTxtField.setText(String.format("%.3f", centVal));
		}
	}

}
