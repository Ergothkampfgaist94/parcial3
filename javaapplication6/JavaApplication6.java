package javaapplication6;

import javax.swing.JOptionPane;

public class JavaApplication6 {

    public static void main(String[] args) {
        clsCarrera1kcc CAR = new clsCarrera1kcc();
        int opt1 = 0;
        while (opt1 != 5) {
            String cad = "";
            opt1 = Integer.parseInt(JOptionPane.showInputDialog("opcion"));
            switch (opt1) {
                case 1:
                    JOptionPane.showMessageDialog(null, "agregar");
                    cad = CAR.addCompetidor1kcc();
                    JOptionPane.showMessageDialog(null, cad);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Mostrar");
                    cad = CAR.showCompetidor1kcc();
                    JOptionPane.showMessageDialog(null, cad);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Actualizar");
                    String cedula = JOptionPane.showInputDialog("cédula");
                    cad = CAR.actualizarCompetidor1kcc(cedula);
                    JOptionPane.showMessageDialog(null, cad);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Borrar");
                    String cedulab = JOptionPane.showInputDialog("cédula");
                    cad = CAR.borrarCompetidor1kcc(cedulab);
                    JOptionPane.showMessageDialog(null, cad);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "saliendo");
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
