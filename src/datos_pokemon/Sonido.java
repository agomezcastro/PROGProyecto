package datos_pokemon;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author agomezcastro
 */
public class Sonido {
    
    public void music(){
        try {
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("Vs. Trainer.wav").getAbsoluteFile());
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
    } catch(Exception ex) {
        System.out.println("Error with playing sound.");
        ex.printStackTrace();
    }
    }
}
