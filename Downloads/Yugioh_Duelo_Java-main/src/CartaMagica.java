public class CartaMagica extends Carta {
    private String efecto;

    public CartaMagica(String nombre, String efecto) {
        super(nombre);
        this.efecto = efecto;
    }

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }

   public void activar(Jugador jugadorActivo, Jugador jugadorRival) {
    if (getNombre().equals("Pot of Greed")) {
        System.out.println("Pot of Greed activado! " + jugadorActivo.getNombre() + " roba 2 cartas.");
        for (int i = 0; i < 2; i++) {
            Carta carta = jugadorActivo.getMazo().robarCarta();
            if (carta != null) {
                jugadorActivo.getMano().add(carta);
            }
        }
    } else if (getNombre().equals("Dian Keto")) {
        jugadorActivo.setPuntosVida(jugadorActivo.getPuntosVida() + 1000);
        System.out.println("Dian Keto activado! " + jugadorActivo.getNombre() + " recupera 1000 LP.");
    } else {
        System.out.println(getNombre() + " activada. Efecto: " + efecto);
    }
}
}