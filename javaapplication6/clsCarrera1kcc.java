package javaapplication6;

import java.util.Random;
import javax.swing.JOptionPane;

public class clsCarrera1kcc {

    private Pila<clsCompetidor1kcc> pila1kcc;
    private Pila<clsCompetidor1kcc> auxPila1kcc;
    private String cadena;
    private int cantCompetidores1k;

    public clsCarrera1kcc() {
        pila1kcc = new Pila();
        auxPila1kcc = new Pila();
        cadena = "";
        cantCompetidores1k = 0;
    }

    public String addCompetidor1kcc() {
        while (JOptionPane.showConfirmDialog(null,
                "¿Desea agregar un Competidor a la carrera?")
                == JOptionPane.YES_NO_OPTION) {
            String cedula = JOptionPane.showInputDialog("Introducir cédula");
            String cedulaR = ValidateID(cedula);
            String name = JOptionPane.showInputDialog("Introducir Nombre");
            String nameR = validatechar(name);
            String lastName = JOptionPane.showInputDialog("Introducir Apellido");
            String lastNameR = validatechar(lastName);
            String idMoto = JOptionPane.showInputDialog("Introducir matrícula de la moto");
            String idMotoR = validatechar(idMoto);
            String tipo = JOptionPane.showInputDialog("Introducir tipo");
            String tipoR = validatechar(tipo);
            int anio = anio();
            pila1kcc.apilar(new clsCompetidor1kcc(
                    cedulaR,
                    nameR,
                    lastNameR,
                    anio,
                    ChooseRH(),
                    idMotoR,
                    establishtime(),
                    tipoR
            ));
            cantCompetidores1k++;
        }
        cadena = "Se han agregado "
                + cantCompetidores1k
                + " competidores a la carrera de 1000cc.";
        return cadena;
    }

    public String showCompetidor1kcc() {
        cadena = "LISTA DE COMPETIDORES\n";

        while (!pila1kcc.estaVacia()) {
            clsCompetidor1kcc objCompetidor;
            objCompetidor = pila1kcc.getElemento();
            cadena += "Cédula: " + objCompetidor.getCedula()
                    + "\n Nombre: " + objCompetidor.getNombre()
                    + "\n Apellido: " + objCompetidor.getApellido()
                    + "\n Edad: " + objCompetidor.getAnionacimiento() + " años"
                    + "\n Tipo de sangre: " + objCompetidor.getRh()
                    + "\n Matrícula de moto: " + objCompetidor.getIdmoto()
                    + "\n Cilindraje: " + objCompetidor.getCilindraje() + " Centímetros Cúbicos"
                    + "\n Tipo de moto: " + objCompetidor.getTipo()
                    + "\n__________________\n";

            auxPila1kcc.apilar(pila1kcc.getElemento());
            pila1kcc.desapilar();
        }
        reapilar(auxPila1kcc);

        return cadena;
    }

    public String actualizarCompetidor1kcc(String cedula) {
        cadena = "";
        while (!pila1kcc.estaVacia()) {
            clsCompetidor1kcc objCompetidor;
            objCompetidor = pila1kcc.getElemento();
            if (objCompetidor.getCedula().equalsIgnoreCase(cedula)) {
                int opt2 = preguntarDatomod();
                switch (opt2) {
                    case 1 -> {
                        objCompetidor.setNombre(JOptionPane.showInputDialog(
                                "¿Cuál nombre del participante?"));
                        cadena = "Nombre del participante modificado con éxito";
                    }
                    case 2 -> {
                        objCompetidor.setApellido(JOptionPane.showInputDialog(
                                "¿Cuál es nuevo apellido del autor?"));
                        cadena = "Apellido del participante modificado con éxito";
                    }
                    case 3 -> {
                        objCompetidor.setAnionacimiento(anio());
                        cadena = "Año del participante modificado con éxito";
                    }

                    case 4 -> {
                        objCompetidor.setRh(ChooseRH());
                        cadena = "RH del participante modificado con éxito";
                    }

                    case 5 -> {
                        objCompetidor.setIdmoto(JOptionPane.showInputDialog(
                                "¿Cuál es nuevo registro de la moto?"));
                        cadena = "Registro de la moto modificado con éxito";
                    }

                    case 6 -> {
                        objCompetidor.setTipo(JOptionPane.showInputDialog(
                                "¿Cuál es nuevo tipo de moto del participante?"));
                        cadena = "Tipo de moto modificado con éxito";
                    }
                    default -> {
                    }
                }
                auxPila1kcc.apilar(pila1kcc.getElemento());
                pila1kcc.desapilar();
            } else {
                auxPila1kcc.apilar(pila1kcc.getElemento());
                pila1kcc.desapilar();
            }

        }
        if ("".equals(cadena)) {
            cadena = "Dato no encontrado";
        }
        reapilar(auxPila1kcc);
        return cadena;
    }

    public String borrarCompetidor1kcc(String cedula) {
        cadena = "";

        while (!pila1kcc.estaVacia()) {
            clsCompetidor1kcc objCompetidor;
            objCompetidor = pila1kcc.getElemento();
            if (objCompetidor.getCedula().equalsIgnoreCase(cedula)) {
                cantCompetidores1k--;
                pila1kcc.desapilar();
                cadena = "Competidor eliminado de la competencia";

            } else {
                auxPila1kcc.apilar(pila1kcc.getElemento());
                pila1kcc.desapilar();
            }
        }
        if ("".equals(cadena)) {
            cadena = "Dato no encontrado";
        }
        reapilar(auxPila1kcc);
        return cadena;
    }

    public String findandShow(String cedula) {
        cadena = "";
        while (!pila1kcc.estaVacia()) {
            clsCompetidor1kcc objCompetidor;
            objCompetidor = pila1kcc.getElemento();
            if (objCompetidor.getCedula().equalsIgnoreCase(cedula)) {
                cadena += "Información del concursante\n"
                        + "\nCédula: " + objCompetidor.getCedula()
                        + "\n Nombre: " + objCompetidor.getNombre()
                        + "\n Apellido: " + objCompetidor.getApellido()
                        + "\n Edad: " + objCompetidor.getAnionacimiento() + " años"
                        + "\n Tipo de sangre: " + objCompetidor.getRh()
                        + "\n Matrícula de moto: " + objCompetidor.getIdmoto()
                        + "\n Cilindraje: " + objCompetidor.getCilindraje() + " Centímetros Cúbicos"
                        + "\n Tipo de moto: " + objCompetidor.getTipo()
                        + "\n";
                auxPila1kcc.apilar(pila1kcc.getElemento());
                pila1kcc.desapilar();
            } else {
                auxPila1kcc.apilar(pila1kcc.getElemento());
                pila1kcc.desapilar();
            }
        }
        if ("".equals(cadena)) {
            cadena = "Dato no encontrado";
        }
        reapilar(auxPila1kcc);
        return cadena;
    }

    public String beginR100cc() {
        int menor = 0;
        cadena = "";
        while (!pila1kcc.estaVacia()) {
            clsCompetidor1kcc objCompetidor;
            objCompetidor = pila1kcc.getElemento();
            menor = objCompetidor.getTiempo();
            auxPila1kcc.apilar(pila1kcc.getElemento());
            pila1kcc.desapilar();
            int mayor = objCompetidor.getTiempo();
            if (mayor < menor) {
                menor = objCompetidor.getTiempo();
                cadena = "El mejor tiempo fue: "
                        + objCompetidor.getTiempo()
                        + "del concursante "
                        + objCompetidor.getNombre()
                        + " "
                        + objCompetidor.getApellido();
            }
        }
        reapilar(auxPila1kcc);
        return cadena;
    }

    private String ValidateID(String identificacion) {
        String charesp = "[0-9]+";
        while (!identificacion.matches(charesp)) {
            identificacion = JOptionPane.showInputDialog(null,
                    "Identificación con caracteres diferentes a números, intente nuevamente ");

        }
        return identificacion;
    }

    private String validatechar(String name) {
        String charesp = "[a-zA-Z]+";
        while (!name.matches(charesp)) {
            name = JOptionPane.showInputDialog(null,
                    "Caracteres especiales, intente nuevamente ");
        }
        return name;
    }

    private int anio() {
        int anionacimiento = Integer.parseInt(JOptionPane.showInputDialog("Introducir Año de nacimiento"));
        int edad = 2023 - anionacimiento;
        return edad;
    }

    private int establishtime() {
        int random_int = (int) Math.floor(Math.random() * (80 - 50 + 1) + 50);
        return random_int;
    }

    private void reapilar(Pila<clsCompetidor1kcc> auxPila1kcc) {

        while (!auxPila1kcc.estaVacia()) {
            pila1kcc.apilar(auxPila1kcc.getElemento());
            auxPila1kcc.desapilar();
        }

    }

    private int preguntarDatomod() {
        Object[] options = {"Nombre",
            "Apellido",
            "Año nacimiento",
            "Tipo desangre",
            "Matrícula de moto",
            "Tipo de moto"};
        int n = JOptionPane.showOptionDialog(null,
                "Escoja el dato a modificar",
                "ESCOGER CAMBIO",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                null);
        return n + 1;

    }

    private String ChooseRH() {
        String[] options = {"A+",
            "A-",
            "B+",
            "B-",
            "AB+",
            "AB-",
            "O+",
            "O-"};
        String rh = (String) JOptionPane.showInputDialog(null,
                "Seleccione tipo de sangre",
                "ELECCIÓN DE RH",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[7]);
        return String.valueOf(rh);
    }

    public String cant1000() {
        return "Hay " + String.valueOf(cantCompetidores1k) + " Concursantes en la categoría de 1000cc";
    }
}
