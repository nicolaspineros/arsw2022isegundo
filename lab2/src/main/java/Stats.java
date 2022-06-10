import java.util.List;
import java.util.stream.*;

public class Stats {

    public static Double calculoMedia(List<Double> ln){
        System.out.println(ln.size());
        return ln.stream().reduce(0.0,(a,b) -> a + b)/ln.size();
    }

    public static Double calculoDesviacion(List<Double> ln){
        Double media = calculoMedia(ln);
        Double longitud = Double.valueOf(ln.size());
        Double resultado = 0.0;
        resultado = Math.sqrt((ln.stream().mapToDouble(numero -> Math.pow((numero-media),2)).reduce(resultado,(a, b) -> a+b))/(longitud - 1));
        return resultado;
    }
}
