/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego.cartas;

/**
 *
 * @author user
 */
public class Jugador {
    
   
    private int vida;
    private String nombreJugador;

    public Jugador(int vida, String nombreJugador) {
        this.vida = vida;
        this.nombreJugador = nombreJugador;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }
}




