/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego.cartas;

/**
 *
 * @author user
 */
public class Carta {
    
    
    protected int ataque;
    protected int defensa;
    protected int vidaJugador;
    protected String elemento;

    public Carta(int ataque, int defensa, int vidaJugador, String elemento) {
        this.ataque = ataque;
        this.defensa = defensa;
        this.vidaJugador = vidaJugador;
        this.elemento = elemento;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVidaJugador() {
        return vidaJugador;
    }

    public void setVidaJugador(int vidaJugador) {
        this.vidaJugador = vidaJugador;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }
}


