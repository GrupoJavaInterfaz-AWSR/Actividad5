package login;

import java.awt.Color;
import static java.awt.Color.DARK_GRAY;
import java.awt.Cursor;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class LoginTemplate extends JFrame {
    //Declaracion objetos graficos
    private JPanel pDerecha, pIzquierda;
    private JLabel lTituloApp, lEslogan, lTituloLogin, lNotificaciones;
    private JTextField tNombreUsuario;
    private JPasswordField tClaveUsuario;
    private JComboBox cbTipoFondo;
    private JButton bEntrar, bCerrar, bRegistrarse, bOpcion1, bOpcion2, bOpcion3;
    private JCheckBox checkSi, checkNo;
    private ButtonGroup grupo;
    
    //Declaracion objetos Decoradores
    private Color colorNaranja, colorGrisOscuro;
    private Font fontTPrincipal, fontTitulo, fontSubtitulo;
    private Cursor cMano;
    private Border border;
    private ImageIcon iFondo, iLogo, iUsuario, iClave, iOnedrive,iDimAux;
    
    public LoginTemplate() {
        super("Login Usuario");
        this.setResizable(false);
        
        colorNaranja = new Color(255,128,0);
        colorGrisOscuro = new Color (80,80,80);
        fontTPrincipal = new Font("Rockwell Extra Bold", Font.PLAIN,20);
        fontTitulo = new Font ("Montserrat", Font.PLAIN, 18);
        fontSubtitulo = new Font("Forte", Font.PLAIN,13);
        cMano = new Cursor(Cursor.HAND_CURSOR);
        border = BorderFactory.createMatteBorder(0, 0, 2, 0, DARK_GRAY);
        iFondo = new ImageIcon("src/resources/Fondo.jpg");
        iLogo = new ImageIcon("src/resources/Logo.jpg");
        iUsuario = new ImageIcon("src/resources/usuario.jpg");
        iClave = new ImageIcon("src/resources/Clave.jpg");
        iOnedrive = new ImageIcon("src/resources/OneDrive.png");
        
        
        pIzquierda = new JPanel();
        pIzquierda.setSize(600, 500);
        pIzquierda.setLocation(0, 0);
        pIzquierda.setBackground(Color.ORANGE);
        pIzquierda.setLayout(null);
        this.add(pIzquierda);

        pDerecha = new JPanel();
        pDerecha.setSize(400, 500);
        pDerecha.setLocation(600, 0);
        pDerecha.setBackground(Color.WHITE);
        pDerecha.setLayout(null);
        this.add(pDerecha);
        
        iDimAux = new ImageIcon(iLogo.getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING));
        
        JLabel lLogo = new JLabel();
        lLogo.setBounds(50, 20, 40, 40);
        lLogo.setIcon(iDimAux);
        pIzquierda.add(lLogo);
        
        lTituloApp = new JLabel("Login de Usuario");
        lTituloApp.setBounds(100, 20, 200, 30);
        lTituloApp.setForeground(Color.black);
        pIzquierda.add(lTituloApp);

        
        
        lEslogan = new JLabel("Te ayudamos a crear las mejores presentaciones");
        lEslogan.setSize(300, 20);
        lEslogan.setLocation((pDerecha.getWidth() - lEslogan.getWidth()) / 2, 40);
        lEslogan.setHorizontalAlignment(SwingConstants.CENTER);
        lEslogan.setForeground(Color.BLACK);
        pDerecha.add(lEslogan);

        lTituloLogin = new JLabel("Ingresa tus datos");
        lTituloLogin.setSize(110, 30);
        lTituloLogin.setLocation((pDerecha.getWidth() - lTituloLogin.getWidth()) / 2, 60);
        lTituloLogin.setForeground(colorNaranja);
        lTituloLogin.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(lTituloLogin);

        lNotificaciones = new JLabel("¿Deseas recibir notificaciones?");
        lNotificaciones.setSize(250, 20);
        lNotificaciones.setLocation((pDerecha.getWidth() - lNotificaciones.getWidth()) / 2, 370);
        lNotificaciones.setForeground(Color.DARK_GRAY);
        lNotificaciones.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(lNotificaciones);

        iDimAux = new ImageIcon(iUsuario.getImage().getScaledInstance( 30, 30, Image.SCALE_AREA_AVERAGING));
                
        JLabel lUsuario = new JLabel();
        lUsuario.setBounds(40, 140, 30, 30);
        lUsuario.setIcon(iDimAux);
        pDerecha.add(lUsuario);
        
        iDimAux = new ImageIcon(iClave.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING));
        
        JLabel lClave = new JLabel();
        lClave.setBounds(40, 270, 30, 30);
        lClave.setIcon(iDimAux);
        pDerecha.add(lClave);
        
        tNombreUsuario = new JTextField("Nombre Usuario");
        tNombreUsuario.setSize(300, 40);
        tNombreUsuario.setLocation((pDerecha.getWidth() - tNombreUsuario.getWidth()) / 2, 120);
        tNombreUsuario.setForeground(Color.DARK_GRAY);
        tNombreUsuario.setBackground(Color.WHITE);
        tNombreUsuario.setCaretColor(Color.BLUE);
        tNombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(tNombreUsuario);

        tClaveUsuario = new JPasswordField("Clave Usuario");
        tClaveUsuario.setSize(300, 40);
        tClaveUsuario.setLocation((pDerecha.getWidth() - tClaveUsuario.getWidth()) / 2, 240);
        tClaveUsuario.setForeground(Color.DARK_GRAY);
        tClaveUsuario.setCaretColor(Color.BLUE);
        tClaveUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(tClaveUsuario);

        cbTipoFondo = new JComboBox();
        cbTipoFondo.addItem("Selecciona tema");
        cbTipoFondo.addItem("Negro");
        cbTipoFondo.addItem("Blanco");
        cbTipoFondo.addItem("Gris oscuro");
        cbTipoFondo.setSize(220, 30);
        cbTipoFondo.setLocation((pDerecha.getWidth() - cbTipoFondo.getWidth()) / 2, 185);
        cbTipoFondo.setForeground(Color.DARK_GRAY);
        cbTipoFondo.setBackground(Color.WHITE);
        ((JLabel) cbTipoFondo.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(cbTipoFondo);

        bEntrar = new JButton("Entrar");
        bEntrar.setSize(250, 45);
        bEntrar.setLocation((pDerecha.getWidth() - bEntrar.getWidth()) / 2, 300);
        bEntrar.setFocusable(false);
        bEntrar.setBackground(colorNaranja);
        bEntrar.setForeground(Color.black);
        pDerecha.add(bEntrar);

        bCerrar = new JButton("X");
        bCerrar.setBounds(330, 10, 45, 30);
        bCerrar.setFocusable(false);
        bCerrar.setBackground(colorNaranja);
        bCerrar.setForeground(Color.black);
        pDerecha.add(bCerrar);

        bRegistrarse = new JButton("Registrarse");
        bRegistrarse.setBounds(230, 420, 145, 35);
        bRegistrarse.setFocusable(false);
        bRegistrarse.setBackground(colorNaranja);
        bRegistrarse.setForeground(Color.black);
        pDerecha.add(bRegistrarse);

        bOpcion1 = new JButton("Privacidad de la cuenta");
        bOpcion1.setSize(250, 45);
        bOpcion1.setLocation((pIzquierda.getWidth() - bOpcion1.getWidth()) / 2, 300);
        bOpcion1.setFocusable(false);
        bOpcion1.setBackground(Color.white);
        bOpcion1.setForeground(Color.black);
        pIzquierda.add(bOpcion1);

        bOpcion2 = new JButton("Acerca de Power Point");
        bOpcion2.setSize(175, 20);
        bOpcion2.setLocation((pIzquierda.getWidth() - bOpcion2.getWidth()) / 2, 400);
        bOpcion2.setFocusable(false);
        bOpcion2.setBackground(Color.white);
        bOpcion2.setForeground(Color.black);
        pIzquierda.add(bOpcion1);
        pIzquierda.add(bOpcion2);
        
        iDimAux = new ImageIcon(iOnedrive.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING));

        JLabel lOneDrive = new JLabel();
        lOneDrive.setBounds(100, 400, 30, 30);
        lOneDrive.setIcon(iDimAux);
        pIzquierda.add(lOneDrive);
        
        iDimAux = new ImageIcon(iFondo.getImage().getScaledInstance(600, 600, Image.SCALE_AREA_AVERAGING));

        JLabel lFondo = new JLabel();
        lFondo.setBounds(0, 0, 600, 600);
        lFondo.setIcon(iDimAux);
        pIzquierda.add(lFondo);

        checkSi = new JCheckBox("Si");
        checkSi.setSize(45, 25);
        checkSi.setFocusable(false);
        checkSi.setBackground(Color.WHITE);
        checkSi.setLocation((pDerecha.getWidth() - checkSi.getWidth()) / 2 - 15, 345);
        pDerecha.add(checkSi);

        checkNo = new JCheckBox("No");
        checkNo.setSize(45, 25);
        checkNo.setFocusable(false);
        checkNo.setBackground(Color.WHITE);
        checkNo.setLocation((pDerecha.getWidth() + checkNo.getWidth()) / 2 - 15, 345);
        pDerecha.add(checkNo);

        grupo = new ButtonGroup();
        grupo.add(checkSi);
        grupo.add(checkNo);

        

        // taSugerencias = new JTextArea("Escribe algo...");
        // taSugerencias.setBounds(185, 180, 230, 140);
        // pIzquierda.add(taSugerencias);

        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 500);
        setLocationRelativeTo(this);
        setLayout(null);
        setVisible(true);
    }
}