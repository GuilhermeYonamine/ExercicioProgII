public class TestaExercicio {
    public static void main(String[] args) throws Exception {
        Funcionario g = new FuncionarioPadrao("Guilherme", 10000);
        System.out.println("\nNome do funcionário padrão: " + g.getNome());
        System.out.println("Salário do funcionário: " + g.getSalario());

        Funcionario f = new FuncionarioComissionado("Pedro", 5000, 1000, 0.05f);
        System.out.println("\nNome do funcionário comissionado: " + f.getNome());
        System.out.println("Salário do funcionário: " + f.getSalario());
        System.out.println("Proventos: " + f.calculaProventos);
    }
}
