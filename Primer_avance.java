/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author kenda
 */
public class ProyectoBarberia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        do {
            menu();
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Selecciona una opción del menú:"));

            switch (opcion) {
                case 1:
                    calendario();
                    break;
                case 2:
                    barberos();
                    break;
                case 3:
                    precios();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Gracias por usar la aplicación de la barbería. ¡Hasta luego!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, selecciona una opción válida del menú.");
                    break;
            }
        } while (opcion != 4); 

    }
public static void menu() {
        JOptionPane.showMessageDialog(null, "Bienvenido al sistema de The Brother's BarberShop\n"
        + "Opccion 1: Calendario\n"
        + "Opccion 2: Barberos\n"
        + "Opccion 3: Precios\n"
        + "Opccion 4: Cerrar sistema\n");
    }        
public static void calendario() {
        JOptionPane.showMessageDialog(null, "Calendario de The Brother's BarberShop");
        //falta toda la el calendario con el guardado de citas y dias disponibles
    }  
public static void barberos() {
    //cuando este hecha la clase de los barberos aqui estaran y se agragaran los mismos
        JOptionPane.showMessageDialog(null, "Estos son nuestros barberos\n" +
          "Opcion 1\n"
        + "Opccion2\n"
        + "Opccion3\n");
    }  
public static void precios() {
    //todo esto ira de la mano con las clases de los barberos para que consulten sus precio 
    int opcionBarbero;
        JOptionPane.showMessageDialog(null, "Los precios dependen de los barberos, seleccione el barbero de su preferencia");
        opcionBarbero = Integer.parseInt(JOptionPane.showInputDialog(null, 
              "Opcion 1\n"
            + "opccion2\n"
            + "opccion3\n"));
        if (opcionBarbero == 1){
          JOptionPane.showMessageDialog(null, "El precio de una hora es de: 1000 colones\n"
          + "El precio de dos horas es de: 2000 colones ");
        }
        if (opcionBarbero == 2){
          JOptionPane.showMessageDialog(null, "El precio de una hora es de: 1000 colones\n"
          + "El precio de dos horas es de: 2000 colones ");
        }
        if (opcionBarbero == 3){
          JOptionPane.showMessageDialog(null, "El precio de una hora es de: 1000 colones\n"
          + "El precio de dos horas es de: 2000 colones ");
        }        
    }
}  

    

