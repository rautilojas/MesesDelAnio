package mesesDelAnio;
import javax.swing.JOptionPane;

public class MesesDelAnioSwitch {
	
	public static void main (String[] args) {
		String month = (JOptionPane.showInputDialog("Ingrese el mes")).toLowerCase();
		switch (month) {
			case "enero": 
				JOptionPane.showMessageDialog(null, "El mes es enero y le corresponde el 1");
			break;
			case "febrero":
				JOptionPane.showMessageDialog(null, "El mes es febrero y le corresponde el 2");
			break;
			case "marzo": 
				JOptionPane.showMessageDialog(null, "El mes es marzo y le corresponde el 3");
			break;
			case "abril":
				JOptionPane.showMessageDialog(null, "El mes es abril y le corresponde el 4");
			break;
			case "mayo": 
				JOptionPane.showMessageDialog(null, "El mes es mayo y le corresponde el 5");
			break;
			case "junio":
				JOptionPane.showMessageDialog(null, "El mes es junio y le corresponde el 6");
			break;
			case "julio": 
				JOptionPane.showMessageDialog(null, "El mes es julio y le corresponde el 7");
			break;
			case "agosto":
				JOptionPane.showMessageDialog(null, "El mes es agosto y le corresponde el 8");
			break;
			case "septiembre": 
				JOptionPane.showMessageDialog(null, "El mes es septiembre y le corresponde el 9");
			break;
			case "octubre":
				JOptionPane.showMessageDialog(null, "El mes es octubre y le corresponde el 10");
			break;
			case "noviembre": 
				JOptionPane.showMessageDialog(null, "El mes es noviembre y le corresponde el 11");
			break;
			case "diciembre":
				JOptionPane.showMessageDialog(null, "El mes es diciembre y le corresponde el 12");
			break;
			default:
				JOptionPane.showMessageDialog(null, "Ingrese un mes valido");
		}
	}
}
