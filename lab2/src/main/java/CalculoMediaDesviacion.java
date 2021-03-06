import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CalculoMediaDesviacion {

    public static void main(String[] args) {
        List<Double> listaNumeros = new LinkedList<Double>();
        listaNumeros = LectorArchivo.leerListaArchivo(args[0],listaNumeros);
        Double media = Stats.calculoMedia(listaNumeros);
        Double desviacion = Stats.calculoDesviacion(listaNumeros);
        System.out.printf("Media: %.2f \n", media);
        System.out.printf("Desviacion: %.2f" , desviacion);
    }
}
