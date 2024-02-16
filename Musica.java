import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class Musica implements Runnable{
    
    @Override
    public void run() {
        AudioInputStream audioInputStream=null;
        try {
            String nombre="CuentaRegresiva.wav";
            File archivoDeSonido = new File(nombre);
            audioInputStream = AudioSystem.getAudioInputStream(archivoDeSonido);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Musica.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Musica.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Musica.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                audioInputStream.close();
            } catch (IOException ex) {
                ex.printStackTrace(System.out);
            }
        }
        
    }
    
  
}