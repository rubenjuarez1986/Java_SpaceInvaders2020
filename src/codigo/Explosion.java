/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Ruben
 */
public class Explosion {

    Image imagen1 = null;
    Image imagen2 = null;

    public int posX = 0;
    public int posY = 0;

    public int tiempoDeVida = 50;

    Clip sonidoExplosion;

    public Explosion() {
        try {
            sonidoExplosion = AudioSystem.getClip();
            sonidoExplosion.open(AudioSystem.getAudioInputStream(getClass().getResource("/sonidos/explosion.wav")));

        } catch (LineUnavailableException ex) {//no se a podido cargar la linea de audio
        } catch (UnsupportedAudioFileException ex) {// no a cargado la imagen
        } catch (IOException ex) {// no a cargado el 

        }
    }

}
