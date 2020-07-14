package classes;

public class ConversorDeMoedas {
    private final int porcentagemEmIOF = 6;
    private double cotacaoDoDolar;
    private double quantidadeDeDolaresASeremComprados;

    public ConversorDeMoedas(double cotacaoDoDolar, double quantidadeDeDolaresASeremComprados) {
        this.cotacaoDoDolar = cotacaoDoDolar;
        this.quantidadeDeDolaresASeremComprados = quantidadeDeDolaresASeremComprados;
    }

    public double converter() {
        double valorAPagar = ((quantidadeDeDolaresASeremComprados * cotacaoDoDolar) + (quantidadeDeDolaresASeremComprados * cotacaoDoDolar * porcentagemEmIOF/100));
        return valorAPagar;
    }
}
