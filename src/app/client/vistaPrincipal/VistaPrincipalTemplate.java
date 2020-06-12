/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.vistaPrincipal;

import app.services.RecursosService;
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

    private static final long serialVersionUID = 8914150529633029064L;

    private RecursosService sRecursos;
    
    public VistaPrincipalTemplate() {
        super("Vista Principal");
        this.setResizable(false);
        sRecursos = RecursosService.getService();

        getContentPane().setBackground(sRecursos.getColorNaranja());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 700);
        setLocationRelativeTo(this);
        setLayout(null);
        setVisible(true);
    }

    public void saludar() {
        String mensaje = "Hola mundo";
        System.out.println(mensaje);
    }

}
