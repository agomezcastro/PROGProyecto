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
 * @author agomezcastro & mgonzalezlorenzo
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
    
    public void sonidoCharmander(){
        try {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/Sonidos/Charmander.wav").getAbsoluteFile());
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
            } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
                System.out.println("Error with playing sound.");
    }
    }
    
    public void sonidoSquirtle(){
        try {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/Sonidos/Squirtle.wav").getAbsoluteFile());
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
            } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
                System.out.println("Error with playing sound.");
    }
    }
    
    public void sonidoBulbasaur(){
        try {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/Sonidos/Bulbasaur.wav").getAbsoluteFile());
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
            } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
                System.out.println("Error with playing sound.");
    }
    }
    
    public void sonidoPidgey(){
        try {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/Sonidos/Pidgey.wav").getAbsoluteFile());
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
            } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
                System.out.println("Error with playing sound.");
    }
    }
    
    public void sonidoRattata(){
        try {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/Sonidos/Rattata.wav").getAbsoluteFile());
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
            } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
                System.out.println("Error with playing sound.");
    }
    }
    /*public void victoryMusic(){
        try {
             AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/Sonidos/VictoryTrainer.wav").getAbsoluteFile());
             Clip clip = AudioSystem.getClip();
             clip.open(audioInputStream);
             clip.start();
       }catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
             System.out.println("Error with playing sound.");
       }
    }*/
}
