package usuarios;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import java.io.*;

/**
 * Write a description of class textfield_pasajero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class textfield_listar_destino extends JPanel
{
    // instance variables - replace the example below with your own
    private JTextField textedit_listar;

    /**
     * Constructor for objects of class textfield_pasajero
     */
    public textfield_listar_destino()
    {
        // initialise instance variables
        this.setLayout(new GridLayout(1,1));
        this.setBounds(new Rectangle(100,20));        
        this.setLocation(230,260);
        this.setBackground(Color.white);
        this.textedit_listar = new JTextField("Destino");
        add(textedit_listar);
    }    
}