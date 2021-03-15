package fernando.oliveira;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Titulo {
    private double valor;
    private double jurosPorDia;
    private String nome;
    private LocalDate dataParaPagamente;

    public Titulo(double valor, double jurosPorDia, String nome, String dataParaPagamente) {
        this.valor = valor;
        this.jurosPorDia = jurosPorDia;
        this.nome = nome;
        this.dataParaPagamente = LocalDate.parse(dataParaPagamente);
    }
    public double getTotalPagamento(){
        if(!estaVencida()){
            return this.valor;

        } else {
            return calcularPagamentoComJuros();
        }
    }

    private double calcularPagamentoComJuros() {
        return this.valor + this.valor * this.jurosPorDia * dataParaPagamente.until(LocalDate.now(), DAYS);
    }

    private boolean estaVencida() {
        return LocalDate.now().isAfter(dataParaPagamente) ;

    }
}
