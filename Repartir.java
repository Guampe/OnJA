public class Repartir {
    
    int cartaJugador1;
    int cartaJugador2;
    static int puntosJugador1[] = new int [6];
    static int puntosJugador2[] = new int [6];

    public void repartir() {

        cartaJugador1 = (int) (Math.round(Math.random() * 11));
        cartaJugador2 = (int) (Math.round(Math.random() * 11));
        if (cartaJugador2 != cartaJugador1) {
        } else {
            repartir();
        }
    }
}