package week2.lesson6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ExtraCredit {

	private JFrame topFrame;

	private JPanel contextPane;

	private JLabel fNameLbl, lNameLbl, streetLbl, cityLbl, stateLbl, countryLbl, genderLbl, courseLbl, sessionLbl,
			msgLbl;

	private JTextField fNameTxtField, lNameTxtField, streetTxtField, cityTxtField, stateTxtField, countryTxtField;

	private ButtonGroup genderGroup;
	private JRadioButton maleRadioButton;
	private JRadioButton femaleRadioButton;

	// private ButtonGroup sessionGroup;
	private JCheckBox morningSessionCheckBox, afternoonSessionCheckBox, eveningSessionCheckBox;
	private JComboBox<String> courseCombo;
	private JTextArea msgTxtArea;

	private JButton submitBtn;

	private String[] courses = { "Java", "C#", "Python", "Lisp", "Oracle", "Php" };

	ExtraCredit() {
		fNameLbl = new JLabel("First Name: ");
		lNameLbl = new JLabel("Last Name: ");
		streetLbl = new JLabel("Street: ");
		cityLbl = new JLabel("City: ");
		stateLbl = new JLabel("State:");
		countryLbl = new JLabel("Country: ");
		genderLbl = new JLabel("Gender: ");
		courseLbl = new JLabel("Select Course: ");
		sessionLbl = new JLabel("Suitable Session: ");
		msgLbl = new JLabel("Message: ");

		fNameTxtField = new JTextField(20);
		lNameTxtField = new JTextField(20);
		streetTxtField = new JTextField(20);
		cityTxtField = new JTextField(20);
		stateTxtField = new JTextField(20);
		countryTxtField = new JTextField(20);

		genderGroup = new ButtonGroup();
		maleRadioButton = new JRadioButton("Male");
		femaleRadioButton = new JRadioButton("Female");
		genderGroup.add(maleRadioButton);
		genderGroup.add(femaleRadioButton);

		courseCombo = new JComboBox<String>(courses);

		// sessionGroup = new ButtonGroup();
		morningSessionCheckBox = new JCheckBox("Morning");
		// sessionGroup.add(morningSessionCheckBox);
		afternoonSessionCheckBox = new JCheckBox("Afternoon");
		// sessionGroup.add(afternoonSessionCheckBox);
		eveningSessionCheckBox = new JCheckBox("Evening");
		// sessionGroup.add(eveningSessionCheckBox);

		msgTxtArea = new JTextArea(80, 30);

		submitBtn = new JButton("Submit");

		topFrame = new JFrame();
		topFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		topFrame.setVisible(true);

		topFrame.setBounds(100, 100, 800, 800);

		contextPane = new JPanel();
		contextPane.setLayout(null);
		topFrame.add(contextPane);

		int width = 140;
		int height = 20;

		int startX = 40;
		int startY = 40;

		fNameLbl.setBounds(startX, startY, width, height);
		contextPane.add(fNameLbl);

		startX += width;
		fNameTxtField.setBounds(startX, startY, width, height);
		contextPane.add(fNameTxtField);

		startX = 40;
		startY += height;
		lNameLbl.setBounds(startX, startY, width, height);
		contextPane.add(lNameLbl);

		startX += width;
		lNameTxtField.setBounds(startX, startY, width, height);
		contextPane.add(lNameTxtField);

		startX = 40;
		startY += height;
		streetLbl.setBounds(startX, startY, width, height);
		contextPane.add(streetLbl);

		startX += width;
		streetTxtField.setBounds(startX, startY, width, height);
		contextPane.add(streetTxtField);

		startX = 40;
		startY += height;
		cityLbl.setBounds(startX, startY, width, height);
		contextPane.add(cityLbl);

		startX += width;
		cityTxtField.setBounds(startX, startY, width, height);
		contextPane.add(cityTxtField);

		startX = 40;
		startY += height;
		stateLbl.setBounds(startX, startY, width, height);
		contextPane.add(stateLbl);

		startX += width;
		stateTxtField.setBounds(startX, startY, width, height);
		contextPane.add(stateTxtField);

		startX = 40;
		startY += height;
		countryLbl.setBounds(startX, startY, width, height);
		contextPane.add(countryLbl);

		startX += width;
		countryTxtField.setBounds(startX, startY, width, height);
		contextPane.add(countryTxtField);

		startX = 40;
		startY += height;
		genderLbl.setBounds(startX, startY, width, height);
		contextPane.add(genderLbl);

		startX += width;
		maleRadioButton.setBounds(startX, startY, width / 2, height);
		femaleRadioButton.setBounds(startX + width / 2, startY, width / 2, height);
		contextPane.add(maleRadioButton);
		contextPane.add(femaleRadioButton);

		startX = 40;
		startY += height;
		courseLbl.setBounds(startX, startY, width + 100, height);
		contextPane.add(courseLbl);

		startX += width;
		courseCombo.setBounds(startX, startY, width, height);
		contextPane.add(courseCombo);

		startX = 40;
		startY += height;
		sessionLbl.setBounds(startX, startY, width + 100, height);
		contextPane.add(sessionLbl);

		startX += width;
		morningSessionCheckBox.setBounds(startX, startY, width, height);
		contextPane.add(morningSessionCheckBox);
		afternoonSessionCheckBox.setBounds(startX + width, startY, width, height);
		contextPane.add(afternoonSessionCheckBox);
		eveningSessionCheckBox.setBounds(startX + width + width, startY, width, height);
		contextPane.add(eveningSessionCheckBox);

		startX = 40;
		startY += height;
		msgLbl.setBounds(startX, startY, width, height);
		contextPane.add(msgLbl);

		startX += width;
		msgTxtArea.setBounds(startX, startY, width + 100, height + 30);
		contextPane.add(msgTxtArea);

		startX = 40 + width / 2;
		startY += height + 40;
		submitBtn.setBounds(startX, startY, width, height);
		contextPane.add(submitBtn);

		SubmitAction sa = new SubmitAction();
		submitBtn.addActionListener(sa);

	}

	class SubmitAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, validate());
		}

		private String validate() {
			String altertMsg = "";
			Boolean validation = true;

			if (fNameTxtField.getText().trim().equals("")) {
				validation = false;
				altertMsg = altertMsg + "First Name can't be Empty";
			}
			if (lNameTxtField.getText().trim().equals("")) {
				validation = false;
				altertMsg = altertMsg + "\nLast Name can't be Empty";
			}
			if (streetTxtField.getText().trim().equals("")) {
				validation = false;
				altertMsg = altertMsg + "\nStreet can't be Empty";
			}
			if (cityTxtField.getText().trim().equals("")) {
				validation = false;
				altertMsg = altertMsg + "\nCity can't be Empty";
			}
			if (stateTxtField.getText().trim().equals("")) {
				validation = false;
				altertMsg = altertMsg + "\nState can't be Empty";
			}
			if (countryTxtField.getText().trim().equals("")) {
				validation = false;
				altertMsg = altertMsg + "\nCountry can't be Empty";
			}
			if (genderGroup.getSelection() == null) {
				validation = false;
				altertMsg = altertMsg + "\nChoose a gender";
			}
			if (courseCombo.getSelectedItem() == null) {
				validation = false;
				altertMsg = altertMsg + "\nChoose a Course";
			}
			System.out.println(morningSessionCheckBox.isSelected());
			System.out.println(afternoonSessionCheckBox.isSelected());
			System.out.println(eveningSessionCheckBox.isSelected());
			if (!morningSessionCheckBox.isSelected()&& !afternoonSessionCheckBox.isSelected()
					&& !eveningSessionCheckBox.isSelected()) {
				validation = false;
				altertMsg = altertMsg + "\nChoose a Session";
			}

			if (msgTxtArea.getText().trim().equals("")) {
				validation = false;
				altertMsg = altertMsg + "\nMessage Text can't be Empty";
			}

			if (!validation)
				return altertMsg.trim();

			return "Successfully Registered";

		}

	}

	public static void main(String[] args) {
		ExtraCredit ec = new ExtraCredit();
	}
}
