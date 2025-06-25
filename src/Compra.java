public class Compra {
    private String descricao;
    private double valor;

    public Compra(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra(descricao: " + descricao +
                ", valor: " + valor + ')';
    }
}
