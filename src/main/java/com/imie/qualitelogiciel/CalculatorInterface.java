package com.imie.qualitelogiciel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JTextField;

public class CalculatorInterface extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	public Double nb1 = 0.0;
	public Double nb2 = 0.0;
	private boolean first = true;


	/**
	 * Create the dialog.
	 */
	public CalculatorInterface() {
		setBounds(100, 100, 224, 341);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton button0 = new JButton("0");
			button0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					operate(0.0);
				}
			});
			button0.setBounds(10, 215, 90, 40);
			contentPanel.add(button0);
		}
		{
			JButton button1 = new JButton("1");
			button1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					operate(1.0);
				}
			});
			button1.setBounds(10, 164, 40, 40);
			contentPanel.add(button1);
		}
		{
			JButton button2 = new JButton("2");
			button2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					operate(2.0);
				}
			});
			button2.setBounds(60, 164, 40, 40);
			contentPanel.add(button2);
		}
		{
			JButton button3 = new JButton("3");
			button3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					operate(3.0);
				}
			});
			button3.setBounds(110, 164, 40, 40);
			contentPanel.add(button3);
		}
		{
			JButton button4 = new JButton("4");
			button4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					operate(4.0);
				}
			});
			button4.setBounds(10, 113, 40, 40);
			contentPanel.add(button4);
		}
		{
			JButton button5 = new JButton("5");
			button5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					operate(5.0);
				}
			});
			button5.setBounds(60, 113, 40, 40);
			contentPanel.add(button5);
		}
		{
			JButton button6 = new JButton("6");
			button6.setBounds(110, 113, 40, 40);
			button6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					operate(6.0);
				}
			});
			contentPanel.add(button6);
		}
		{
			JButton button7 = new JButton("7");
			button7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					operate(7.0);
				}
			});
			button7.setBounds(10, 62, 40, 40);
			contentPanel.add(button7);
		}
		{
			JButton button8 = new JButton("8");
			button8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					operate(8.0);
				}
			});
			button8.setBounds(60, 62, 40, 40);
			contentPanel.add(button8);
		}
		{
			JButton button9 = new JButton("9");
			button9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					operate(9.0);
				}
			});
			button9.setBounds(110, 62, 40, 40);
			contentPanel.add(button9);
		}
		
		textField = new JTextField();
		textField.setBounds(10, 11, 140, 40);
		contentPanel.add(textField);
		textField.setColumns(10);
		{
			JButton buttonplus = new JButton("+");
			buttonplus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			buttonplus.setBounds(160, 62, 40, 40);
			contentPanel.add(buttonplus);
		}
		{
			JButton buttonminus = new JButton("-");
			buttonminus.setBounds(160, 113, 40, 40);
			contentPanel.add(buttonminus);
		}
		{
			JButton buttonmult = new JButton("*");
			buttonmult.setBounds(160, 164, 40, 40);
			contentPanel.add(buttonmult);
		}
		{
			JButton buttondiv = new JButton("/");
			buttondiv.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			buttondiv.setBounds(160, 215, 40, 40);
			contentPanel.add(buttondiv);
		}
		{
			JButton buttontot = new JButton("=");
			buttontot.setBounds(160, 11, 40, 40);
			contentPanel.add(buttontot);
		}
		{
			JButton buttonvirgule = new JButton(".");
			buttonvirgule.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			buttonvirgule.setBounds(110, 215, 40, 40);
			contentPanel.add(buttonvirgule);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	public void operate(Double nb) {
		if (first) {
			nb1 = Addition.Additionner(Multiply.Multiplyer(nb1, 10.0), nb);
			textField.setText(nb1.toString());
		}else {
			nb2 = Addition.Additionner(Multiply.Multiplyer(nb2, 10.0), nb);
		}
	}
}
