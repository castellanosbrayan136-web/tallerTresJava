/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package talletresjava;
import javax.swing.JOptionPane;

/**
 *
 * @author UIS
 */
public class TalleTresJava {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        //Opciones que va a llevar el menu 
        String menuOptions = """
Main menu
1. Menú salida, despedida, salir
2. Calculo de áreas
3. 
4. 
0. Exit""";
        
        //condicion para el while
        int menuOption = 0;
        boolean salir = true;
        
        //Ciclo While para repetir el menu hasta que la opcion sea correcta o salir
        while (salir) {
            
            //usamos try para evitar errores y catch con el tipo de error a evitar y su variable que lo reciba (e)
            try {
                //menu de opciones
                String inputMenuOption = JOptionPane.showInputDialog(null, menuOptions ,"selection menu", JOptionPane.QUESTION_MESSAGE);
                
                //Si el usuario cierra o cancela el menu
                if (inputMenuOption == null) break;
                menuOption = Integer.parseInt(inputMenuOption);
                
                //Si elige la opcion 0. Salir
                if (menuOption == 0) {
                JOptionPane.showMessageDialog(
                        null,"Programa finalizado","Exit",JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
}
                
                //Evaluamos que la opción este dentro del rango correcto
                if (menuOption < 0 || menuOption > 5) {
                JOptionPane.showMessageDialog(
                        null,"Opción fuera de rango","Opción fuera de rango",JOptionPane.WARNING_MESSAGE);
            } else {
                    //Si todo es correcto saldremos del programa
                    salir = false;
                    
                    }
            } catch (NumberFormatException e) {
                
                JOptionPane.showMessageDialog(
                        null,"Debe escribir un número valido","Error",JOptionPane.WARNING_MESSAGE);
                
        }  
        }
        //Evaluamos la opcion con un switch
        switch (menuOption) {
            case 1 -> ejercicio1();
            case 2 -> ejercicio2();
            //case 3 -> ejercicio3();
            //case 4 -> ejercicio4();
            //case 5 -> ejercicio5();
        }
    }
        
    public static void ejercicio1() {
 
        boolean salida = true; //Condición ciclo
        int opcionMenu = 3;
        String dialogoMenu = """
1. Saludar
2. Despedirse
3. Salir""";
        
        while (salida) {
            try { //Evitar errores de tipo de variable
                String inputOpcionMenu = JOptionPane.showInputDialog(null,dialogoMenu,"Menú",JOptionPane.INFORMATION_MESSAGE);
                
                if (inputOpcionMenu == null) {
                    salida = false;
                } else {
                    opcionMenu = Integer.parseInt(inputOpcionMenu);
                }
                
                if (opcionMenu < 1 || opcionMenu > 3) { //Que este dentro del rango 
                JOptionPane.showMessageDialog(null,"Opción fuera de rango","Incorrect range",JOptionPane.WARNING_MESSAGE);
                } else {
                switch (opcionMenu) {
                    
                case 1 -> JOptionPane.showMessageDialog(null,"Hello!","Saludo",JOptionPane.PLAIN_MESSAGE);
                case 2 -> JOptionPane.showMessageDialog(null,"Bye!","Despedida",JOptionPane.PLAIN_MESSAGE);
                case 3 -> {JOptionPane.showMessageDialog(null,"Has salido del programa...","Extit",JOptionPane.INFORMATION_MESSAGE);
                salida = false;
                } default -> {
                    
                }
                }
        }
                } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Opción no valida","Invalid option",JOptionPane.WARNING_MESSAGE);
            }
        }

    }
    public static void ejercicio2() {
        boolean salida = true; //Condición ciclo
        int opcionMenu = 3;
        String dialogoMenu = """
1. Calcular área de un cuadrado
2. Calcular área de un círculo
3. Calcular área de un triángulo
4. Calcular área de un rectángulo
5. Salir""";
        
        while (salida) {
            
 
            try { //Evitar errores de tipo de variable
                String inputOpcionMenu = JOptionPane.showInputDialog(null,dialogoMenu,"Menú",JOptionPane.INFORMATION_MESSAGE);
                
                if (inputOpcionMenu == null) {
                    salida = false;
                } else {
                    opcionMenu = Integer.parseInt(inputOpcionMenu);
                }
                
                if (opcionMenu < 1 || opcionMenu > 5) { //Que este dentro del rango 
                JOptionPane.showMessageDialog(null,"Opción fuera de rango","Incorrect range",JOptionPane.WARNING_MESSAGE);
                } else {
                    switch (opcionMenu) {
                        case 1 ->                             {
                                double ladoCuadrado = Double.parseDouble(JOptionPane.showInputDialog( //Pedimos longitud de un lado
                                        null,
                                        "Medida de un lado:",
                                        "Medida",
                                        JOptionPane.INFORMATION_MESSAGE));
                                double area = Math.pow(ladoCuadrado,2); //Calculamos área
                                JOptionPane.showMessageDialog( //Mostramos el area
                                        null,
                                        "El area es de: " + area,
                                        "Area",
                                        JOptionPane.INFORMATION_MESSAGE);
                            }
                        case 2 ->                             {
                                double radioCirculo = Double.parseDouble(JOptionPane.showInputDialog( //Pedimos longitud de un lado
                                        null,
                                        "Medida del radio:",
                                        "Medida",
                                        JOptionPane.INFORMATION_MESSAGE));
                                double area = Math.PI * Math.pow(radioCirculo ,2);
                                JOptionPane.showMessageDialog( //Mostramos el area
                                        null,
                                        "El area es de: " + area,
                                        "Area",
                                        JOptionPane.INFORMATION_MESSAGE);
                            }
                        case 3 ->                             {
                                double base = Double.parseDouble(JOptionPane.showInputDialog( //Pedimos longitud de un lado
                                        null,
                                        "Medida de la base:",
                                        "Medida",
                                        JOptionPane.INFORMATION_MESSAGE));
                                double altura = Double.parseDouble(JOptionPane.showInputDialog( //Pedimos longitud de un lado
                                        null,
                                        "Medida de la altura:",
                                        "Medida",
                                        JOptionPane.INFORMATION_MESSAGE));
                                double area = (base * altura) / 2;
                                JOptionPane.showMessageDialog( //Mostramos el area
                                        null,
                                        "El area es de: " + area,
                                        "Area",
                                        JOptionPane.INFORMATION_MESSAGE);
                            }
                        case 4 ->                             {
                                double base = Double.parseDouble(JOptionPane.showInputDialog( //Pedimos longitud de un lado
                                        null,
                                        "Medida de la base:",
                                        "Medida",
                                        JOptionPane.INFORMATION_MESSAGE));
                                double altura = Double.parseDouble(JOptionPane.showInputDialog( //Pedimos longitud de un lado
                                        null,
                                        "Medida de la altura:",
                                        "Medida",
                                        JOptionPane.INFORMATION_MESSAGE));
                                double area = base * altura;
                                JOptionPane.showMessageDialog( //Mostramos el area
                                        null,
                                        "El area es de: " + area,
                                        "Area",
                                        JOptionPane.INFORMATION_MESSAGE);
                            }
                        case 5 -> salida = false;
                        default -> {
                        }
                    }
                }
                inputOpcionMenu = null;
        
                } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Opción no valida",
                        "Invalid option",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
        
        
    }
    
}
