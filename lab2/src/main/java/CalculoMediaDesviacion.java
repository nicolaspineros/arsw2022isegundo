import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CalculoMediaDesviacion {

    public static void main(String[] args) {
        List<Double> listaNumeros = new LinkedList<Double>();
        listaNumeros = leerListaArchivo(args[0],listaNumeros);
        Stats calculos = new Stats();
        Double media = calculos.calculoMedia(listaNumeros);
        Double desviacion = calculos.calculoDesviacion(listaNumeros);
        System.out.printf("Media: %.2f \n", media);
        System.out.printf("Desviacion: %.2f" , desviacion);
    }


    private static List<Double> leerListaArchivo(String archivo, List<Double> ln) {
        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivo));
            String linea = lector.readLine();
            while (linea != null){
                System.out.println(linea);
                ln.add(Double.parseDouble(linea));
                linea = lector.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return ln;
    }

}
