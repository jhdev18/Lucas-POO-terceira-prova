public class Doador extends MembroONG {

    private double valorDoadoMensal;

    public double getValorDoadoMensal() {
        return valorDoadoMensal;
    }

    public void setValorDoadoMensal(double valorDoadoMensal) {
        this.valorDoadoMensal = valorDoadoMensal;
    }

    @Override
    public void exibirResumo() {
        System.out.println("=== Doador ===");
        System.out.println("Nome: " + getNome() + " | Status: Doador Ativo | Valor Mensal: R$ " + String.format("%.2f", valorDoadoMensal));
    }
}
