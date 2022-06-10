import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class LectorArchivo {

    public static List<Double> leerListaArchivo(String archivo, List<Double> ln) {
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
