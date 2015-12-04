package week2.lesson6;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.xml.ws.FaultAction;

public class ExtraCredit {

	private JFrame topFrame;

	private JPanel contextPane;

	private JLabel fNameLbl, lNameLbl, streetLbl, cityLbl, stateLbl, countryLbl, genderLbl, courseLbl, sessionLbl,
			msgLbl;

	private JTextField fNameTxtField, lNameTxtField, streetTxtField, cityTxtField, stateTxtField, countryTxtField;

	private ButtonGroup genderGroup;
	private JRadioButton maleRadioButton;
	private JRadioButton femaleRadioButton;

	private ButtonGroup sessionGroup;
	private JCheckBox morningSessionCheckBox, afternoonSessionCheckBox, eveningSessionCheckBox;
	private JComboBox courseCombo;
	private JTextArea msgTxtArea;

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

		courseCombo = new JComboBox(courses);

		sessionGroup = new ButtonGroup();
		morningSessionCheckBox = new JCheckBox("Morning");
		sessionGroup.add(morningSessionCheckBox);
		afternoonSessionCheckBox = new JCheckBox("Afternoon");
		sessionGroup.add(afternoonSessionCheckBox);
		eveningSessionCheckBox = new JCheckBox("Evening");
		sessionGroup.add(eveningSessionCheckBox);

		msgTxtArea = new JTextArea(80, 30);

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
		sessionCheckMenu.setBounds(startX, startY, width, height);
		contextPane.add(sessionCheckMenu);

		startX = 40;
		startY += height;
		msgLbl.setBounds(startX, startY, width, height);
		contextPane.add(msgLbl);

		startX += width;
		msgTxtArea.setBounds(startX, startY, width + 100, height + 30);
		contextPane.add(msgTxtArea);

	}

	public static void main(String[] args) {
		ExtraCredit ec = new ExtraCredit();
	}
}
