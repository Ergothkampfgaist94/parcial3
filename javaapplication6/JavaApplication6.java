package javaapplication6;

import javax.swing.JOptionPane;

public class JavaApplication6 {

    public static void main(String[] args) {
        clsCarrera1kcc CAR = new clsCarrera1kcc();
        int opt1 = 0;
        while (opt1 != 8) {
            String cad = "";
            opt1 = Integer.parseInt(JOptionPane.showInputDialog("opciones\n"
                    + "\n1 agregar"
                    + "\n2 mostrar"
                    + "\n3 actualizar"
                    + "\n4 borrar"
                    + "\n5 buscar 1"
                    + "\n6 mostrar cantidad"
                    + "\n7 mostrar ganador"
                    + "\n8 salir"));
            switch (opt1) {
                case 1:
                    cad = CAR.addCompetidor1kcc();
                    JOptionPane.showMessageDialog(null,
                            cad);
                    break;
                case 2:
                    cad = CAR.showCompetidor1kcc();
                    JOptionPane.showMessageDialog(null,
                            cad);
                    break;
                case 3:
                    String cedula = JOptionPane.showInputDialog("cédula");
                    cad = CAR.actualizarCompetidor1kcc(cedula);
                    JOptionPane.showMessageDialog(null,
                            cad);
                    break;
                case 4:
                    String cedulab = JOptionPane.showInputDialog("cédula");
                    cad = CAR.borrarCompetidor1kcc(cedulab);
                    JOptionPane.showMessageDialog(null,
                            cad);
                    break;
                case 5:
                    String cedulac = JOptionPane.showInputDialog("cédula");
                    JOptionPane.showMessageDialog(null,
                            CAR.findandShow(cedulac));
                    break;
                case 6:
                    String cant = CAR.cant1000();
                    JOptionPane.showMessageDialog(null,cant);
                    break;
                case 7:
                    String Rescar = CAR.beginR100cc();
                    JOptionPane.showMessageDialog(null, Rescar);
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null,
                            "saliendo");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "¡Opción incorrecta!\n\n"
                            + "Intentalo de nuevo");
            }
        }
    }
}
