package metodusok;


public class Metodusok {
    
    public static void main(String[] args) {
        nehanySzamOsszegenekGyoke();
        
    }

    private static void nehanySzamOsszegenekGyoke() {
        int osszegzes = osszeg(2, osszeg(3,4));
        double gyoke = gyok(osszegzes);
        String kimenet = "%d gyöke: %.4f\n".formatted(ossszegzes, gyoke);
        System.out.println(kimenet);
        
        osszegzes = osszeg(new int[] {3,5,12,2,3});
        gyoke = gyok(osszegzes);
        kimenet = "%d gyöke: %.4f\n".formatted(ossszegzes, gyoke);
        System.out.println(kimenet);
    }
    
    private static int osszeg(int[] tomb){
        int ossz = 0;
        for (int i = 0; i < tomb.length; i++) {
            ossz += tomb[i]; 
        }
        return ossz;
    }
    
    private static int osszeg(int a, int b){
        //return a + b;
        
        //int[] tomb = {a, b};
        //return osszeg(tomb);    
        
        return osszeg(new int[] {a, b});
    }
    
    private static double gyok(int osszege){
        double gyokvonas = Math.sqrt(osszege);
        return gyokvonas;
    }
    
    private static double kiir(String uzenet){
        return System.out.println(uzenet);
    }
    
}
