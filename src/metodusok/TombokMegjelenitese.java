/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodusok;


public class TombokMegjelenitese {
    public static void main(String[] args) {
        sorbanKiiras();
        tobbSorbanKiiras();
        
        
    }

    private static void sorbanKiiras() {
        String[] betuk = {"a", "b", "c", "d", "e", "f", "g"};
        System.out.println("Tömb elemei 1 sorban: ");
        for (int i = 0; i < betuk.length; i++) {
            System.out.print(betuk[i] + " ");
        }
        System.out.println("");
    }
    
    private static void tobbSorbanKiiras() {
        String[] betuk = {"a", "b", "c", "d", "e", "f", "g"};
        System.out.println("Tömb elemei több sorban: ");
        for (int i = 0; i < betuk.length; i++) { 
            if(i != 0 && i % 3 == 0){
                System.out.println("");
            }
            System.out.print(betuk[i] + " ");
        }
        System.out.println("");
    }
}
