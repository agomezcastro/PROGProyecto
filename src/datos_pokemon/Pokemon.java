package datos_pokemon;

/**
 *
 * @author mgonzalezlorenzo & agomezcastro
 */
public class Pokemon {
    private String nombre;
    private int vida;
    private Movimientos mov;

    public Pokemon() {
    }

    public Pokemon(String nombre, int vida, Movimientos mov) {
        this.nombre = nombre;
        this.vida = vida;
        this.mov = mov;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Movimientos getMov() {
        return mov;
    }

    public void setMov(Movimientos mov) {
        this.mov = mov;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "nombre=" + nombre + ", vida=" + vida + ", mov=" + mov + '}';
    }

    
    
    
    
    
    
}