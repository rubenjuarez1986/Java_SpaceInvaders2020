
package codigo;

import java.awt.Image;
import javax.imageio.ImageIO;

/**
 *
 * @author Ruben
 */
public class Nave {
  Image imagen = null;
  public int posX = 0;
  public int posY = 0;
  
  private boolean pulsadoIzquierda = false;
  private boolean pulsadoDerecha = false;
    
    public Nave(){
       try {//siempre que hace la lectura con algo que hay en el disco,se ejecuta un try
            //catch,esto hace que proteja lo que se encuentra en el disco
            imagen = ImageIO.read(getClass().getResource("/imagenes/nave.png"));
            
        }catch (Exception e){
            
    }
       }
   public void mueve(){
       if (pulsadoIzquierda && posX > 0){
       posX-=3;
       }
       if (pulsadoDerecha && posX < VentanaJuego.ANCHOPANTALLA - imagen.getWidth(null)-15){
       posX+=3;
       }
   } 

    public boolean isPulsadoIzquierda() {
        return pulsadoIzquierda;
    }

    public void setPulsadoIzquierda(boolean pulsadoIzquierda) {
        this.pulsadoIzquierda = pulsadoIzquierda;
        this.pulsadoDerecha = false;
    }

    public boolean isPulsadoDerecha() {
        return pulsadoDerecha;
    }

    public void setPulsadoDerecha(boolean pulsadoDerecha) {
        this.pulsadoDerecha = pulsadoDerecha;
        this.pulsadoIzquierda = false;
    }
}
