import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Jugador j1 = new Jugador("Jugador 1", 8000, new ArrayList<>(), null, new Campo());
        Jugador j2 = new Jugador("Jugador 2", 8000, new ArrayList<>(), null, new Campo());

        InicializadorMazo.repartirCartas(j1, j2);

        Juego juego = new Juego(j1, j2);
        juego.iniciar();
    }
}


