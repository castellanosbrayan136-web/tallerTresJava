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
        String menuOptions;
        menuOptions = """
                      Menu Ejercicios en clase
                      1. Menú de salida, despedida y salir
                      2. Calculo de áreas
                      3. Sistema de estudiantes
                      4.
                      0. Exit""";
        
        //Ciclo While para repetir el menu hasta que la opcion sea correcta o salir
        while (true) {
            try {
                String inputMenuOption = JOptionPane.showInputDialog(
                        null, menuOptions, "selection menu",
                        JOptionPane.QUESTION_MESSAGE);

                if (inputMenuOption == null) break;

                int menuOption = Integer.parseInt(inputMenuOption);

                if (menuOption < 0 || menuOption > 4) {
                    JOptionPane.showMessageDialog(null, "Opción fuera de rango");
                    continue;
                }

                switch (menuOption) {
                    case 1 -> ejercicio1();
                    case 2 -> ejercicio2();
                    case 3 -> ejercicio3();
                    case 0 -> {
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                        return;
                    }
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número válido");
            }
        }
    }
        
    public static void ejercicio1() {
        String dialogoMenu;
        dialogoMenu = """
                      1. Saludar
                      2. Despedirse
                      3. Salir""";
        
        while (true) {
            try {
                String inputOpcionMenu = JOptionPane.showInputDialog(null,dialogoMenu,"Menú",JOptionPane.INFORMATION_MESSAGE);
                
                if (inputOpcionMenu == null) {
                    break;
                }
                
                int opcionMenu = Integer.parseInt(inputOpcionMenu);

                if (opcionMenu < 1 || opcionMenu > 3) { //Si esta fuera del rango 
                JOptionPane.showMessageDialog(
                        null,
                        "Opción fuera de rango",
                        "Incorrect range",
                        JOptionPane.WARNING_MESSAGE);
                } else {
                    switch (opcionMenu) {
                        case 1 -> JOptionPane.showMessageDialog(
                                null,
                                "Hello!",
                                "Greeting",
                                JOptionPane.PLAIN_MESSAGE);
                        case 2 -> JOptionPane.showMessageDialog(null,
                                "Bye!",
                                "Farewell",
                                JOptionPane.PLAIN_MESSAGE);
                        case 3 -> {
                            return;
                        }
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Opción no valida","Invalid option",JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    public static void ejercicio2() {
        String dialogoMenu;
        dialogoMenu = """
                      1. Calcular área de un cuadrado
                      2. Calcular área de un círculo
                      3. Calcular área de un triángulo
                      4. Calcular área de un rectángulo
                      5. Salir""";
        
        while (true) {
            
 
            try { //Evitar errores de tipo de variable
                String inputOpcionMenu = JOptionPane.showInputDialog(
                        null,
                        dialogoMenu,
                        "Menú",
                        JOptionPane.INFORMATION_MESSAGE);
                
                if (inputOpcionMenu == null) {
                    break;
                }
                
                int opcionMenu = Integer.parseInt(inputOpcionMenu);
                
                
                if (opcionMenu < 1 || opcionMenu > 5) { //Que este dentro del rango de opciones
                JOptionPane.showMessageDialog(
                        null,
                        "Opción fuera de rango",
                        "Incorrect range",
                        JOptionPane.WARNING_MESSAGE);
                } else {
                    switch (opcionMenu) {
                        case 1 -> {
                            String inputLado = JOptionPane.showInputDialog( //Pedimos longitud de un lado
                                    null,
                                    "Medida de un lado:",
                                    "Extent",
                                    JOptionPane.INFORMATION_MESSAGE);
                            
                            float ladoCuadrado = Float.parseFloat(inputLado);
                            
                            double area = Math.pow(ladoCuadrado,2); //Calculamos área
                            
                            JOptionPane.showMessageDialog( //Mostramos el area resultante
                                    null,
                                    "El area es de: " + area,
                                    "Area",
                                    JOptionPane.INFORMATION_MESSAGE);
                            }
                        case 2 -> {
                            String inputRadio = JOptionPane.showInputDialog(
                                    null,
                                    "Medida del radio:",
                                    "Extent",
                                    JOptionPane.INFORMATION_MESSAGE);
                            
                            float radio = Float.parseFloat(inputRadio);
                            
                            double area = Math.PI * Math.pow(radio ,2);
                            
                            JOptionPane.showMessageDialog(
                                    null,
                                    "El area es de: " + area,
                                    "Area",
                                    JOptionPane.INFORMATION_MESSAGE);
                            }
                        case 3 -> {
                            String inputBase = JOptionPane.showInputDialog(
                                    null,
                                    "Medida de la base:",
                                    "Medida",
                                    JOptionPane.INFORMATION_MESSAGE);
                            
                            float base = Float.parseFloat(inputBase);
                            
                            String inputAltura = JOptionPane.showInputDialog(
                                    null,
                                    "Medida de la altura:",
                                    "Medida",
                                    JOptionPane.INFORMATION_MESSAGE);
                            
                            float altura = Float.parseFloat(inputAltura);
                            
                            double area = (base * altura) / 2;
                            
                            JOptionPane.showMessageDialog(
                                    null,
                                    "El area es de: " + area,
                                    "Area",
                                    JOptionPane.INFORMATION_MESSAGE);
                            }
                        case 4 -> {
                            String inputBase = JOptionPane.showInputDialog(
                                    null,
                                    "Medida de la base:",
                                    "Medida",
                                    JOptionPane.INFORMATION_MESSAGE);
                            
                            float base = Float.parseFloat(inputBase);
                            
                            String inputAltura = JOptionPane.showInputDialog(
                                    null,
                                    "Medida de la altura:",
                                    "Medida",
                                    JOptionPane.INFORMATION_MESSAGE);
                            
                            float altura = Float.parseFloat(inputAltura);
                            
                            double area = base * altura;
                            
                            JOptionPane.showMessageDialog( //Mostramos el area
                                    null,
                                    "El area es de: " + area,
                                    "Area",
                                    JOptionPane.INFORMATION_MESSAGE);
                            }
                        case 5 -> {
                            return;
                        }
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Opción no valida",
                        "Invalid option",
                        JOptionPane.WARNING_MESSAGE);
            }    
        }
    }
    public static void ejercicio3() {
        String[] estudiantes = new String[10];
        
        double[] matematicas = new double[10];
        
        double[] ingles = new double[10];
        
        double[] español = new double[10];
        
        int contador = -1;
        
        String menuOptions;
        menuOptions = """
                      1. Registrar notas
                      2. Calcular promedio por materia
                      3. Calcular promedio total del curso
                      4. Mostrar aprobados y reprobados
                      5. Exit""";
        
        while (true) {
            try {
                String inputMenuOption = JOptionPane.showInputDialog(
                        null,
                        menuOptions);
                
                if (inputMenuOption == null) {
                    break;
                }
                
                int menuOption = Integer.parseInt(inputMenuOption);
                
                if (menuOption < 1 || menuOption > 5) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Opción fuera de rango");
                } else {
                    switch (menuOption) {
                        case 1 -> {
                            String name = JOptionPane.showInputDialog(null,"Nombre del estudiante: ");
                            estudiantes[contador] = name;
                            
                            String inputNotaMate = JOptionPane.showInputDialog(null,"Nota Matematicas: ");
                            double notaMate = Double.parseDouble(inputNotaMate);
                            matematicas[contador] = notaMate;
                            
                            String inputNotaIngles = JOptionPane.showInputDialog(null,"Nota Ingles ");
                            double notaIngles = Double.parseDouble(inputNotaIngles);
                            ingles[contador] = notaIngles;
                            
                            String inputNotaEspañol = JOptionPane.showInputDialog(null,"Nota Español: ");
                            double notaEspañol = Double.parseDouble(inputNotaEspañol);
                            español[contador] = notaEspañol;
                            
                            contador += 1;
                        }
                        case 2 -> {
                            System.out.println(matematicas[1]);
                            System.out.println(ingles);
                            System.out.println(español);
                            System.out.println(estudiantes);
                        }
                    }
                }
                
            } catch (NumberFormatException e) {
                
            }
        }
        
        
        
        
        
    }
}
