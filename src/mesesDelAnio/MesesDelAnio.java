package mesesDelAnio;
import javax.swing.JOptionPane;

public class MesesDelAnio {

	public static void main(String[] args) {
		
		int numYear = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año"));
		int numMonth = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes"));

		if(numMonth == 11 || numMonth == 4 || numMonth == 6 || numMonth == 9 ) {
			JOptionPane.showMessageDialog(null, "El mes tiene 30 dìas!");
		} else if(numMonth == 1 || numMonth == 3 || numMonth == 5 || numMonth == 8 || numMonth == 10 || numMonth == 12 || numMonth == 7) {
			JOptionPane.showMessageDialog(null, "El mes tiene 31 dìas!");
		} else if(numYear % 400 == 0 || (numYear % 4 == 0 && !(numYear % 100 == 0))) {
			JOptionPane.showMessageDialog(null, "El mes tiene 29 dìas!");
		} else {
			JOptionPane.showMessageDialog(null, "El mes tiene 28 dìas!");
		}
	}
}