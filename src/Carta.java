public class Carta {
    String nombre;
    byte nivel;
    short ataque;
    short vida;

    public Carta(String nombre, byte nivel, short ataque, short vida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.ataque = ataque;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getNivel() {
        return nivel;
    }

    public void setNivel(byte nivel) {
        this.nivel = nivel;
    }

    public short getAtaque() {
        return ataque;
    }

    public void setAtaque(short ataque) {
        this.ataque = ataque;
    }

    public short getVida() {
        return vida;
    }

    public void setVida(short vida) {
        this.vida = vida;
    }

}
