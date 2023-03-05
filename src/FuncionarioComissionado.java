public class FuncionarioComissionado extends Funcionario {
    private float vendas;
    private float percentual;

    public FuncionarioComissionado(String nome, float salario, float vendas, float percentual) {
        super(nome, salario);
        this.vendas = vendas;
        this.percentual = percentual;
    }

    public float calculaProventos() {
        return this.getSalario() + calculaComissao();
    }

    public float calculaComissao() {
        return vendas * percentual;
    }

    public double getVendas() {
        return vendas;
    }

    public double getPercentual() {
        return percentual;
    }
}
