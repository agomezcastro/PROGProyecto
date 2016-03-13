package datos_pokemon;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

/**
 *
 * @author mgonzalezlorenzo & agomezcastro
 */
public class Pokedex {
    ArrayList <Pokemon> lista = new ArrayList();
    public Pokemon pokemon1,pokemon2;
    
    
    public void iniciar(){
        Pokemon charmander = new Pokemon("Charmander",100, new Movimientos("Arañazo",30), new Movimientos("Ascuas",20));
        Pokemon squirtle = new Pokemon("Squirtle",120,new Movimientos("Placaje",18), new Movimientos("Pistola Agua", 36));
        Pokemon bulbasaur = new Pokemon("Bulbausaur",110,new Movimientos("Placaje",20), new Movimientos("Latigo Cepa", 25));
        Pokemon pidgey = new Pokemon("Pidgey",80,new Movimientos("Ataque Ala",40), new Movimientos("Tornado", 25));
        Pokemon rattata = new Pokemon("Rattata",75,new Movimientos("Placaje",30), new Movimientos("Hiper Colmillo", 60));
        
        
        lista.add(charmander);
        lista.add(squirtle);
        lista.add(bulbasaur);
        lista.add(pidgey);
        lista.add(rattata);
    }
    
    public void elegir(){
        int opcion;
        int opcion2;
        
            
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Jugador 1 elige: \n 1. Charmander. \n 2. Squirtle. \n 3. Bulbasaur. \n 4. Pidgey. \n 5. Rattata."));
            
            switch(opcion){
                case 1 : pokemon1=lista.get(0); JOptionPane.showMessageDialog(null, "Adelante Charmander !!!!!!!!");
                try {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/Sonidos/Charmander.wav").getAbsoluteFile());
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
            } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
                System.out.println("Error with playing sound.");
    }
                    break;
                case 2 : pokemon1=lista.get(1); JOptionPane.showMessageDialog(null, "Adelante Squirtle !!!!!!!!");
                try {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/Sonidos/Squirtle.wav").getAbsoluteFile());
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
            } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
                System.out.println("Error with playing sound.");
    }
                    break;
                case 3 : pokemon1=lista.get(2); JOptionPane.showMessageDialog(null, "Adelante Bulbasaur !!!!!!!!");
                try {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/Sonidos/Bulbasaur.wav").getAbsoluteFile());
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
            } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
                System.out.println("Error with playing sound.");
    }
                    break;
                case 4 : pokemon1=lista.get(3); JOptionPane.showMessageDialog(null, "Adelante Pidgey !!!!!!!!");
                try {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/Sonidos/Pidgey.wav").getAbsoluteFile());
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
            } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
                System.out.println("Error with playing sound.");
    }
                    break;
                case 5 : pokemon1=lista.get(4); JOptionPane.showMessageDialog(null, "Adelante Rattata !!!!!!!!");
                try {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/Sonidos/Rattata.wav").getAbsoluteFile());
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
            } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
                System.out.println("Error with playing sound.");
    }
                    break;
            }
            
            
            opcion2=Integer.parseInt(JOptionPane.showInputDialog("Jugador 2 elige: \n 1. Charmander. \n 2. Squirtle. \n 3. Bulbasaur. \n 4. Pidgey. \n 5. Rattata."));
            
            switch(opcion2){
                case 1 : pokemon2=lista.get(0); JOptionPane.showMessageDialog(null, "Adelante Charmander !!!!!!!!");
                try {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/Sonidos/Charmander.wav").getAbsoluteFile());
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
            } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
                System.out.println("Error with playing sound.");
    }
                    break;
                case 2 : pokemon2=lista.get(1); JOptionPane.showMessageDialog(null, "Adelante Squirtle !!!!!!!!");
                try {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/Sonidos/Squirtle.wav").getAbsoluteFile());
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
            } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
                System.out.println("Error with playing sound.");
    }
                    break;
                case 3 : pokemon2=lista.get(2); JOptionPane.showMessageDialog(null, "Adelante Bulbasaur !!!!!!!!");
                try {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/Sonidos/Bulbasaur.wav").getAbsoluteFile());
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
            } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
                System.out.println("Error with playing sound.");
    }
                    break;
                case 4 : pokemon2=lista.get(3); JOptionPane.showMessageDialog(null, "Adelante Pidgey !!!!!!!!");
                try {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/Sonidos/Pidgey.wav").getAbsoluteFile());
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
            } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
                System.out.println("Error with playing sound.");
    }
                    break;
                case 5 : pokemon2=lista.get(4); JOptionPane.showMessageDialog(null, "Adelante Rattata !!!!!!!!");
                try {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/Sonidos/Rattata.wav").getAbsoluteFile());
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
            } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
                System.out.println("Error with playing sound.");
    }
                    break;
                
            }
        
    }
        
    
    
    }
