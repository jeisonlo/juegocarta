/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juego.cartas;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class JuegoCartas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Jugador j1=new Jugador(100, "Mago");
          Jugador j2=new Jugador(100, "Caballero");
          
        Carta carta1 = new Carta(500, 500, 100, "Fuego");
        Carta carta2 = new Carta(600, 500, 100, "Fuego");
        Carta carta3 = new Carta(700, 500, 100, "Agua");
        Carta carta4 = new Carta(800, 500, 100, "Agua");
        Carta carta5 = new Carta(300, 500, 100, "Aire");
        Carta carta6 = new Carta(400, 500, 100, "Aire");
        Carta carta7 = new Carta(250, 500, 100, "Tierra");
        Carta carta8 = new Carta(190, 500, 100, "Tierra");
        Carta carta9 = new Carta(150, 500, 100, "Rayo");
        Carta carta10 = new Carta(120, 500, 100, "Rayo");
        
          
         Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego de cartas!");
        System.out.println("Escoge un jugador:");
        System.out.println("1. Mago");
        System.out.println("2. Caballero");

        int opcion = scanner.nextInt();
        scanner.nextLine();

        Jugador jugador;

        switch (opcion) {
            case 1:
                
                System.out.println("Has escogido al Mago.");
                break;
            case 2:
                
                System.out.println("Has escogido al Caballero.");
                break;
            default:
                jugador = new Jugador(100, "Jugador");
                System.out.println("Opción inválida. Has escogido al Jugador por defecto.");
                System.out.println("caballero");
                
                break;
        }

       
        
         List<Carta> cartas = new ArrayList<>();
        cartas.add(new Carta(500, 500, 100, "Fuego"));
        cartas.add(new Carta(600, 500, 100, "Fuego"));
        cartas.add(new Carta(900, 500, 100, "Agua"));
        cartas.add(new Carta(800, 500, 100, "Agua"));
        cartas.add(new Carta(900, 500, 100, "Aire"));
        cartas.add(new Carta(400, 500, 100, "Aire"));
        cartas.add(new Carta(650, 500, 100, "Tierra"));
        cartas.add(new Carta(190, 500, 100, "Tierra"));
        cartas.add(new Carta(150, 500, 100, "Rayo"));
        cartas.add(new Carta(120, 500, 100, "Rayo"));

        Collections.shuffle(cartas);
       
        List<Carta> cartasMago = new ArrayList<>(cartas.subList(0, 5));
        List<Carta> cartasCaballero = new ArrayList<>(cartas.subList(5, 10));

        System.out.println("Cartas del Mago: ");
        for (Carta carta : cartasMago) {
            System.out.println("Ataque: " + carta.getAtaque() + ", Defensa: " + carta.getDefensa() + ", Elemento: " + carta.getElemento());
        }

        System.out.println("Cartas del Caballero: ");
        for (Carta carta : cartasCaballero) {
            System.out.println("Ataque: " + carta.getAtaque() + ", Defensa: " + carta.getDefensa() + ", Elemento: " + carta.getElemento());
        }
          int enfrentamientosMagoGanados = 0;      
          int enfrentamientosCaballeroGanados = 0;   
          
        int victoriasMago = 0;
        int victoriasCaballero = 0;

        
       
        for (int i = 0; i < cartasMago.size(); i++) {
            
            
            if (cartasMago.get(i).ataque > cartasCaballero.get(i).defensa) {
                int resul = carta1.vidaJugador-20;
                System.out.println(" vida despues de la batalla:"+resul);
                victoriasMago++;
            } else if (cartasMago.get(i).ataque < cartasCaballero.get(i).defensa) {
                int resul = carta2.vidaJugador-20;
                System.out.println(" vida despues de la batalla:"+resul);
                victoriasCaballero++;
                
            }
        }

        System.out.println("Resultados:");
        System.out.println("Victorias del Mago: " + victoriasMago);
        System.out.println("Victorias del Caballero: " + victoriasCaballero);
        
        
        
        if(victoriasMago>victoriasCaballero){
            
            System.out.println("el ganador es mago..");
        } else if (victoriasMago<victoriasCaballero) {   
            
            System.out.println("el ganador es caballero...");
            
        }


    }}
     
    
    
  

