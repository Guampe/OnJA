import java.util.Arrays;

public class Partida1 extends Repartir {
    
    int cj1Pr;
    int cj2Pr;
    int cj1Sr;
    int cj2Sr;
    int cj1Tr;
    int cj2Tr;
    int cj1Cr;
    int cj2Cr;
    int cj1Qr;
    int cj2Qr;
    int cj1Xr;
    int cj2Xr;

    public void rondaUno() {
        Repartir repartir = new Repartir();
        repartir.repartir();
        cj1Pr = repartir.cartaJugador1;
        cj2Pr = repartir.cartaJugador2;
        puntosJugador1[0] = cj1Pr;
        puntosJugador2[0] = cj2Pr;
        System.out.println(Arrays.toString(puntosJugador1));
        System.out.println(Arrays.toString(puntosJugador2));
    }

    public void rondaDos() {
        Repartir repartir = new Repartir();
        repartir.repartir();
        cj1Sr = repartir.cartaJugador1;    
        cj2Sr = repartir.cartaJugador2;   
    
        if (cj1Sr != cj1Pr && cj1Sr != cj2Pr && cj2Sr != cj1Pr && cj2Sr != cj2Pr){
            cj1Sr = repartir.cartaJugador1;
            cj2Sr = repartir.cartaJugador2;
            puntosJugador1[1] = cj1Sr;
            puntosJugador2[1] = cj2Sr;
            System.out.println(Arrays.toString(puntosJugador1));
            System.out.println(Arrays.toString(puntosJugador2));
        } else {
            rondaDos();
        }
    }

    public void rondaTres() {
        Repartir repartir = new Repartir();
        repartir.repartir();
        cj1Tr = repartir.cartaJugador1;    
        cj2Tr = repartir.cartaJugador2;   
    
        if (cj1Tr != cj1Pr && cj1Tr != cj2Pr && cj1Tr != cj1Sr && cj1Tr != cj2Sr && cj2Tr != cj1Pr && cj2Tr != cj2Pr && cj2Tr != cj1Sr && cj2Tr != cj2Sr){
                
            cj1Tr = repartir.cartaJugador1;
            cj2Tr = repartir.cartaJugador2;
            puntosJugador1[2] = cj1Tr;
            puntosJugador2[2] = cj2Tr;
            System.out.println(Arrays.toString(puntosJugador1));
            System.out.println(Arrays.toString(puntosJugador2));
        } else {
            rondaTres();
        }
    }


    public void rondaCuatro() {
        Repartir repartir = new Repartir();
        repartir.repartir();
        cj1Cr = repartir.cartaJugador1;    
        cj2Cr = repartir.cartaJugador2;   
    
        if (cj1Cr != cj1Pr && cj1Cr != cj2Pr && cj1Cr != cj1Sr && cj1Cr != cj2Sr && cj1Cr != cj1Tr && cj1Cr != cj2Tr && cj2Cr != cj1Pr && cj2Cr != cj2Pr && cj2Cr != cj1Sr && cj2Cr != cj2Sr && cj2Cr != cj1Tr && cj2Cr != cj2Tr && cj1Tr != cj1Pr && cj1Tr != cj2Pr && cj2Tr != cj1Pr && cj2Tr != cj2Pr && cj1Sr != cj1Pr && cj1Sr != cj2Pr && cj2Sr != cj1Pr && cj2Sr != cj2Pr){
            cj1Cr = repartir.cartaJugador1;
            cj2Cr = repartir.cartaJugador2;
            puntosJugador1[3] = cj1Cr;
            puntosJugador2[3] = cj2Cr;
            System.out.println(Arrays.toString(puntosJugador1));
            System.out.println(Arrays.toString(puntosJugador2));
        } else {
            rondaCuatro();
        }
    }

    public void rondaQuinta() {
        Repartir repartir = new Repartir();
        repartir.repartir();
        cj1Qr = repartir.cartaJugador1;    
        cj2Qr = repartir.cartaJugador2;   
    
        if (cj1Qr != cj1Pr && cj1Qr != cj2Pr && cj1Qr != cj1Sr && cj1Qr != cj2Sr && cj1Qr != cj1Tr && cj1Qr != cj2Tr && cj1Qr != cj1Cr && cj1Qr != cj2Cr && cj2Qr != cj1Pr && cj2Qr != cj2Pr && cj2Qr != cj1Sr && cj2Qr != cj2Sr && cj2Qr != cj1Tr && cj2Qr != cj2Tr && cj2Qr != cj1Cr && cj2Qr != cj2Cr && cj1Cr != cj1Pr && cj1Cr != cj2Pr && cj1Cr != cj1Sr && cj1Cr != cj2Sr && cj1Cr != cj1Tr && cj1Cr != cj2Tr && cj2Cr != cj1Pr && cj2Cr != cj2Pr && cj2Cr != cj1Sr && cj2Cr != cj2Sr && cj2Cr != cj1Tr && cj2Cr != cj2Tr && cj1Tr != cj1Pr && cj1Tr != cj2Pr && cj2Tr != cj1Pr && cj2Tr != cj2Pr && cj1Sr != cj1Pr && cj1Sr != cj2Pr && cj2Sr != cj1Pr && cj2Sr != cj2Pr){
            cj1Qr = repartir.cartaJugador1;
            cj2Qr = repartir.cartaJugador2;
            puntosJugador1[4] = cj1Qr;
            puntosJugador2[4] = cj2Qr;
            System.out.println(Arrays.toString(puntosJugador1));
            System.out.println(Arrays.toString(puntosJugador2));
        } else {
            rondaQuinta();
        }
    }

    public void rondaXesta() {
        Repartir repartir = new Repartir();
        repartir.repartir();
        cj1Xr = repartir.cartaJugador1;    
        cj2Xr = repartir.cartaJugador2;   
    
        if (cj1Xr != cj1Pr && cj1Xr != cj2Pr && cj1Xr != cj1Sr && cj1Xr != cj2Sr && cj1Xr != cj1Tr && cj1Xr != cj2Tr && cj1Xr != cj1Cr && cj1Xr != cj2Cr && cj1Xr != cj1Qr && cj1Xr != cj2Qr && cj2Xr != cj1Pr && cj2Xr != cj2Pr && cj2Xr != cj1Sr && cj2Xr != cj2Sr && cj2Xr != cj1Tr && cj2Xr != cj2Tr && cj2Xr != cj1Cr && cj2Xr != cj2Cr && cj2Xr != cj1Qr && cj2Xr != cj2Qr && cj1Qr != cj1Pr && cj1Qr != cj2Pr && cj1Qr != cj1Sr && cj1Qr != cj2Sr && cj1Qr != cj1Tr && cj1Qr != cj2Tr && cj1Qr != cj1Cr && cj1Qr != cj2Cr && cj2Qr != cj1Pr && cj2Qr != cj2Pr && cj2Qr != cj1Sr && cj2Qr != cj2Sr && cj2Qr != cj1Tr && cj2Qr != cj2Tr && cj2Qr != cj1Cr && cj2Qr != cj2Cr && cj1Cr != cj1Pr && cj1Cr != cj2Pr && cj1Cr != cj1Sr && cj1Cr != cj2Sr && cj1Cr != cj1Tr && cj1Cr != cj2Tr && cj2Cr != cj1Pr && cj2Cr != cj2Pr && cj2Cr != cj1Sr && cj2Cr != cj2Sr && cj2Cr != cj1Tr && cj2Cr != cj2Tr && cj1Tr != cj1Pr && cj1Tr != cj2Pr && cj2Tr != cj1Pr && cj2Tr != cj2Pr && cj1Sr != cj1Pr && cj1Sr != cj2Pr && cj2Sr != cj1Pr && cj2Sr != cj2Pr){
            cj1Xr = repartir.cartaJugador1;
            cj2Xr = repartir.cartaJugador2;
            puntosJugador1[5] = cj1Xr;
            puntosJugador2[5] = cj2Xr;
            System.out.println(Arrays.toString(puntosJugador1));
            System.out.println(Arrays.toString(puntosJugador2));
        } else {
            rondaXesta();
        }
    }
}


