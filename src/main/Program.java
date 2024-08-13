
package main;

import vonal.Vonal;

public class Program {
    public static void main(String[] args) {
        try {
            Vonal v1 = new Vonal(3, 0, Vonal.Szinek.PIROS, Vonal.Stilusok.DUPLA);
            bemutato(v1);
            
            Vonal v2 = new Vonal(3, 2, Vonal.Szinek.PIROS, Vonal.Stilusok.DUPLA);
            bemutato(v2);
            
            Vonal v3 = new Vonal(2, 3, Vonal.Szinek.KEK, Vonal.Stilusok.SZIMPLA);
            bemutato(v3);
            
            Vonal v4 = new Vonal(5, 0, Vonal.Szinek.ZOLD, Vonal.Stilusok.PONT);
            bemutato(v4);
            
//            Vonal v5 = new Vonal(5, -1, Vonal.Szinek.ZOLD, Vonal.Stilusok.PONT);
//            bemutato(v5); 
//            0-NÁL KISEBB ELTOLÁST ÁTÁLLÍTJA 0-RA
            
            Vonal v6 = new Vonal(0, 0, Vonal.Szinek.ZOLD, Vonal.Stilusok.PONT);
            bemutato(v6);
            
        } catch (Exception ex) {
            System.out.print("Egy vonal nem jött létre,");
            System.out.println(ex.getMessage());
        }
    }
    
    private static void bemutato(Vonal v) {
        System.out.println(v);
        System.out.println(v.vonalAbra());
    }
}
