/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brazzo;
import com.sun.java.swing.plaf.windows.resources.windows;
import java.awt.Window;
/**
 *
 * @author WALMART
 */

/*BRAZO ROBOTICO
 * MATERIA SISTEMAS PROGRAMABLES 
 * PROF.INGENIERO LEVY
 * 
 * INTEGRANTES 
 * ANGUIANO NUÑEZ CARLOS EBRIQUE DE JESUS 
 * BAIRON AREVALO ANTONIO
 * 
 * EL DESARROLLO DE ESTE PROYECTO CONSISTE EN LA ELABORACION DE UN BRAZO ROBOTICO 
 * CONTROLADO CON SERVOMOTORES PARA EFECTUAR UN MOVIMIETO CONTINUO
 * 
 * EN ESTE CASO USAMOS 5 SERVOMOTORES QUE SON CONTROLADOS DESDE UNA INTERFAZ DE JAVA 
 * DONDE UTILIZAMOS UNA LIBRERIA EXTRAIDA DESDE LA PAGINA 
 * http://panamahitek.com/tag/libreria-arduino-para-java/
 * LA CUAL NOS AYUDO A HACER POSIBLE ESTA CONEXION ENTRE ESTAS DOS TECNOLOGIAS
 * 
 * MATERIAL USADO
 * 
 * 5 MICRO SERVO 9600
 * TORNILLOS
 * CABLE MACHO-MACHO
 * CABLE MACHO-HEMBRA
 * LED
 * RESISTOR 10K
 * PROTOBOARD
 * CABLE SERIAL USB
 * ARDUINO UNO
 * ESTRUCTURA DE BRAZO ROBOTICO IMPRESO 3D
 */



public class Brazzo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        interfaz ventana = new interfaz();
        ventana.setVisible(true);
    }
    
}
