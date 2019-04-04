package com.imie.qualitelogiciel;

import javax.swing.JDialog;

public class QualitelogicielApplication {

	public static void main(String[] args) {
		try {
			CalculatorInterface dialog = new CalculatorInterface();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
