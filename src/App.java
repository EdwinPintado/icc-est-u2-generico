import models.Caja;
import models.Par;
public class App {
    public static void main(String[] args) throws Exception {
        Caja<String> stringCaja = new Caja<>();
        Caja<Integer> integerCaja = new Caja<>();
        Caja<Double> doubleCaja = new Caja<>();
        Caja<Boolean> booleanCaja = new Caja<>();

        stringCaja.setT("Hola mundo");
        integerCaja.setT(100);
        doubleCaja.setT(9.75);
        booleanCaja.setT(false);

        Par<Integer, String> iSPar = new Par<>();
        Par<String, Integer> sIPar = new Par<>();
        Par<String, Double> sDPar = new Par<>();

        iSPar.setK(1);
        sIPar.setK("Edad :");
        sDPar.setK("Promedio");
        iSPar.setV("Juan Perez");
        sIPar.setV(20);
        sDPar.setV(8.75);


        System.out.println("\n--- Uso de Caja<T> ---\n");
        System.out.println("Caja de texto: " + stringCaja.getT() );
        System.out.println("Caja de entero: " + integerCaja.getT() );
        System.out.println("Caja de decimal: " + doubleCaja.getT() );
        System.out.println("¿La caja de texto está vacía?: " + booleanCaja.getT() );

        System.out.println("\n--- Uso de Par<K, V> ---\n");
        System.out.println("Clave: " + iSPar.getK() +" | "+ "Valor: " + iSPar.getV());
        System.out.println("Clave: " + sIPar.getK() +" | "+ "Valor: " + sIPar.getV());
        System.out.println("Clave: " + sDPar.getK() +" | "+ "Valor: " + sDPar.getV());
       
    }
}
 