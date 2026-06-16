public class MembroONG {

    private String nome;
    private String cpf;
    private int diasAtuacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getDiasAtuacao() {
        return diasAtuacao;
    }

    public void setDiasAtuacao(int dias) {
        if (dias < 0) {
            System.out.println("Erro: dias de atuação não podem ser negativos.");
            return;
        }
        this.diasAtuacao = dias;
    }

    public void exibirResumo() {
        System.out.println("Nome: " + nome + " | Dias de Atuação: " + diasAtuacao);
    }
}
