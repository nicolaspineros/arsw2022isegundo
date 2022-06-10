import java.util.LinkedList;
import java.util.List;

public class CalculoLinkedListPropia {

    public static void main(String[] args) {
        List<Double> listaNumeros = new LinkedListPropia<>();
        listaNumeros = LectorArchivo.leerListaArchivo(args[0],listaNumeros);
        System.out.println(listaNumeros.getClass());
        Double media = Stats.calculoMedia(listaNumeros);
        Double desviacion = Stats.calculoDesviacion(listaNumeros);
        System.out.printf("Media: %.2f \n", media);
        System.out.printf("Desviacion: %.2f" , desviacion);
    }
}
