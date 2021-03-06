package codigo;

import java.awt.Image;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Ruben
 */
public class Disparo {

    Image imagen = null;
    public int posX = 0;
    public int posY = 0;
    Clip sonidoDisparo;

    public Disparo() {
       try{
                imagen=ImageIO.read(getClass().getResource("/imagenes/disparo.png"));
                sonidoDisparo = AudioSystem.getClip();
                sonidoDisparo.open(
                    AudioSystem.getAudioInputStream(
                            getClass().getResource("/sonidos/disparosXBOX.wav"))
            );
            }
            catch(Exception e){
            }
    }
      public void mueve(){
         posY -= 5;
            
    }

    public void posicionaDisparo(Nave _nave) {
        //aqui le decimos que el disparo salga desde la mitad de la nave
        posX = _nave.posX + _nave.imagen.getWidth(null) / 2 - imagen.getWidth(null) / 2;
        // le restamos tambien la mitad del disparo para que salga desde el centro
        posY = _nave.posY - _nave.imagen.getHeight(null) / 2;

    }
}
