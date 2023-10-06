public class CalculoCilindrico {

    private double pi = 3.14159;
    private double raio;
    private double altura;


    public CalculoCilindrico( Double raio, Double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public Double getRaio() {
        return raio;
    }

    public Double getAltura() {
        return altura;
    }

    public String calcula_circunferencia( double raio, double altura){

        Double v = pi * (raio * raio) * altura;

        return String.valueOf(v);
    }

    public boolean validaRaioAltura(Double raio, Double Altura){

        if(raio <= 0.0 || altura <= 0.0 ){
            return false;
        }

        return true;
    }
}
