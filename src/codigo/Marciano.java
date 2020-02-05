/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Ruben
 */
public class Marciano {

    public Image imagen1 = null;
    public Image imagen2 = null;
//para cuando el marciano se mueva por la pantalla sepa eñ tamaño
    private int anchoPantalla;
    public int vida = 50;

    public Marciano(int _anchoPantalla) {
        anchoPantalla = _anchoPantalla;
        try {//siempre que hace la lectura con algo que hay en el disco,se ejecuta un try
            //catch,esto hace que proteja lo que se encuentra en el disco
            imagen1 = ImageIO.read(getClass().getResource("/imagenes/marcianito1.png"));
            imagen2 = ImageIO.read(getClass().getResource("/imagenes/marcianito2.png"));
        }catch (Exception e){
            
    }
    }
}
