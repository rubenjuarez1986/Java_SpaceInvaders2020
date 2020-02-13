package codigo;

import java.awt.Image;
import javax.imageio.ImageIO;

/**
 *
 * @author Ruben
 */
public class Disparo {

    Image imagen = null;
    public int posX = 0;
    public int posY = 0;

    public Disparo() {
        try {//siempre que hace la lectura con algo que hay en el disco,se ejecuta un try
            //catch,esto hace que proteja lo que se encuentra en el disco
            imagen = ImageIO.read(getClass().getResource("/imagenes/disparo.png"));

        } catch (Exception e) {

        }
    }

    public void mueve() {
        posY -= 5;

    }

    public void posicionaDisparo(Nave _nave) {
        //aqui le decimos que el disparo salga desde la mitad de la nave
        posX = _nave.posX + _nave.imagen.getWidth(null) / 2 - imagen.getWidth(null) / 2;
        // le restamos tambien la mitad del disparo para que salga desde el centro
        posY = _nave.posY - _nave.imagen.getHeight(null) / 2;

    }
}
