package datos_pokemon;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author agomezcastro
 */
public class Sonido {
    
    public void music(){
        try {
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/Sonidos/Trainer.wav").getAbsoluteFile());
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
    } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
        System.out.println("Error with playing sound.");
    }
    }
    
    public void victoryMusic(){
        try {
             AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/Sonidos/VictoryTrainer.wav").getAbsoluteFile());
             Clip clip = AudioSystem.getClip();
             clip.open(audioInputStream);
             clip.start();
       }catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
             System.out.println("Error with playing sound.");
       }
    }
}
