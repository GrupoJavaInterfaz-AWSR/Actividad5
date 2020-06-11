/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author AndresFWilT
 */
public class VistaPrincipalTemplate extends JFrame {
    
    private JButton bEnviar;
    private JTextField tNombre;
    private JLabel lNombre;
    
    public VistaPrincipalTemplate(){
        super("Vista Principal");
        this.setSize(1200,700);
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setUndecorated(true);
        this.setLayout(null);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.BLUE);
    }
    
    public void saludar(){
       String mensaje ="Hola mundo"; 
       System.out.println(mensaje);
    }
    
}
