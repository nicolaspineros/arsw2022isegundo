import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CalculoMediaDesviacion {

    public static void main(String[] args) {
        List<Integer> listaNumeros = new LinkedList<Integer>();
        listaNumeros = leerListaArchivo(args[0],listaNumeros);
        System.out.println("Total de numeros: " + listaNumeros.size());
        //System.out.println("Media: " + calcularMedia(listaNumeros));
    }


    private static List<Integer> leerListaArchivo(String archivo, List<Integer> ln) {
        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivo));
            String linea = lector.readLine();
            while (linea != null){
                System.out.println(linea);
                ln.add(Integer.parseInt(linea));
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
