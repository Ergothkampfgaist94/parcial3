package javaapplication6;

import javax.swing.JOptionPane;

public class JavaApplication6 {

    public static void main(String[] args) {
        clsCarrera1kcc CAR = new clsCarrera1kcc();
        int opt1 = 0;
        while (opt1 != 6) {
            String cad = "";
            opt1 = Integer.parseInt(JOptionPane.showInputDialog("opcion"));
            switch (opt1) {
                case 1:
                    cad = CAR.addCompetidor1kcc();
                    JOptionPane.showMessageDialog(null, cad);
                    break;
                case 2:
                    cad = CAR.showCompetidor1kcc();
                    JOptionPane.showMessageDialog(null, cad);
                    break;
                case 3:
                    String cedula = JOptionPane.showInputDialog("cédula");
                    cad = CAR.actualizarCompetidor1kcc(cedula);
                    JOptionPane.showMessageDialog(null, cad);
                    break;
                case 4:
                    String cedulab = JOptionPane.showInputDialog("cédula");
                    cad = CAR.borrarCompetidor1kcc(cedulab);
                    JOptionPane.showMessageDialog(null, cad);
                    break;
                case 5:
                    String cedulac = JOptionPane.showInputDialog("cédula");
                    JOptionPane.showMessageDialog(null, CAR.findandShow(cedulac));
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "saliendo");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "¡Opción incorrecta!\n\n"
                            + "Intentalo de nuevo");
            }
        }
    }
}
