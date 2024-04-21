/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flyweight.example;
import f1.Equipo;
import f1.EquipoRedBull;
import f1.Ferrari;
import f1.Honda;
import f1.IMotor;
import flyweight.forest.Forest;
import java.awt.*;
/**
 *
 * @author chima
 */
public class Client {
    static int CANVAS_SIZE = 500;
    static int TREES_TO_DRAW = 1000000;
    static int TREE_TYPES = 2;

    public static void main(String[] args) {
        
        System.out.println ("Ejemplo bridge");
        IMotor motorHonda = new Honda();
        Equipo equipoRB = new EquipoRedBull(motorHonda);
        equipoRB.obtenerVelocidad(397);
        equipoRB.caracteristicasDeEquipo();
        
        IMotor motorFerrari = new Ferrari();
        Equipo equipoRBPrueba2 = new EquipoRedBull(motorFerrari);
        equipoRBPrueba2.obtenerVelocidad(355);
        equipoRBPrueba2.caracteristicasDeEquipo();
        System.out.println ("Ejemplo flyweight");
        Forest forest = new Forest();
        for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Summer Oak", Color.GREEN, "Oak texture stub");
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");
        }
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

        System.out.println(TREES_TO_DRAW + " trees drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Tree size (8 bytes) * " + TREES_TO_DRAW);
        System.out.println("+ TreeTypes size (~30 bytes) * " + TREE_TYPES + "");
        System.out.println("---------------------");
        System.out.println("Total: " + ((TREES_TO_DRAW * 8 + TREE_TYPES * 30) / 1024 / 1024) +
                "MB (instead of " + ((TREES_TO_DRAW * 38) / 1024 / 1024) + "MB)");
        
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
   
}
