/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.client.vistaPrincipal;

import app.services.ObjGraficosService;
import app.services.RecursosService;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author AndresFWilT
 */
public class VistaPrincipalTemplate extends JFrame {

    private static final long serialVersionUID = 8914150529633029064L;

    private RecursosService sRecursos;
    private ObjGraficosService sObjGraficos;
    private VistaPrincipalComponent vistaPrincipalComponent;

    private JPanel pNavegacion, pBarra, pPrincipal;
    
    public VistaPrincipalTemplate(VistaPrincipalComponent vistaPrincipalComponent) {
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

    
    
    public void crearJPanels(){
        pNavegacion = sObjGraficos.construirJPanel(0, 0, 250, 700,sRecursos.getColorNegro(), null);
        this.add(pNavegacion);

        pBarra = sObjGraficos.construirJPanel(250, 0, 850, 50,sRecursos.getColorNaranja(), null);
        this.add(pBarra);

        pPrincipal = sObjGraficos.construirJPanel(250, 50, 850, 600, Color.WHITE, null);
        this.add(pPrincipal);
    }

    public JPanel getPNavegacion() {
        return this.pNavegacion;
    }

    public JPanel getPPrincipal() {
        return this.pPrincipal;
    }

    public JPanel getPBarra() {
        return this.pBarra;
    }
    
    
    public void saludar() {
        String mensaje = "Hola mundo";
        System.out.println(mensaje);
    }

}
