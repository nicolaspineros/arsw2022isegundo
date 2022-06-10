import java.util.List;

public class Stats {

    public Double calculoMedia(List<Double> ln){
        return ln.stream().reduce(0.0,(a,b) -> a + b)/ln.size();
    }

    public Double calculoDesviacion(List<Double> ln){
        Double media = calculoMedia(ln);
        Double longitud = Double.valueOf(ln.size());
        Double resultado = 0.0;
        resultado = Math.sqrt((ln.stream().mapToDouble(numero -> Math.pow((numero-media),2)).reduce(resultado,(a, b) -> a+b))/(longitud - 1));
        return resultado;
    }
}
