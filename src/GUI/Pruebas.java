/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javax.swing.JFrame;

/**
 *
 * @author Ricardo Chaves
 */
public class Pruebas {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");

        PanelAlarma panel = new PanelAlarma();

        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // Pantalla completa
        frame.setVisible(true);
    }
}
