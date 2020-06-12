package app.services;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class RecursosService {

    private Color colorNaranja, colorGrisOscuro;
    private Font fontTPrincipal, fontTitulo, fontSubtitulo;
    private Cursor cMano;
    private Border borderInferiorNaranja;

    static private RecursosService servicio;

    private RecursosService(){
        colorNaranja = new Color(255,128,0);
        colorGrisOscuro = new Color(80, 80, 80);
        fontTPrincipal = new Font("Rockwell Extra Bold", Font.PLAIN, 20);
        fontTitulo = new Font("Montserrat", Font.PLAIN, 18);
        fontSubtitulo = new Font("Forte", Font.PLAIN, 13);
        cMano = new Cursor(Cursor.HAND_CURSOR);
        borderInferiorNaranja = BorderFactory.createMatteBorder(0, 0, 2, 0, colorNaranja);
   
    }
    
    public Color getColorNaranja(){
        return colorNaranja;
    }

    public Color getColorGrisOscuro(){
        return colorGrisOscuro;
    }

    public Font getFontTPrincipal(){
        return fontTPrincipal;
    }

    public Font getFontTitulo(){
        return fontTitulo;
    }
    
    public Font getFontSubtitulo(){
        return fontSubtitulo;
    }

    public Cursor getCMano(){
        return cMano;
    }

    public Border getBorderInferiorNaranja(){
        return borderInferiorNaranja;
    }

    

    public static RecursosService getService(){
        if(servicio == null)
            servicio = new RecursosService();
        return servicio;
    }
}
