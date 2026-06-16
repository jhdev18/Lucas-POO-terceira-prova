public class SistemaMain {

    public static void main(String[] args) {

        Voluntario voluntario = new Voluntario();
        voluntario.setNome("Rafael Mendonça");
        voluntario.setCpf("123.456.789-00");
        voluntario.setDiasAtuacao(120);
        voluntario.setSetor("Aulas de Reforço");

        Doador doador = new Doador();
        doador.setNome("Carla Figueiredo");
        doador.setCpf("987.654.321-00");
        doador.setDiasAtuacao(365);
        doador.setValorDoadoMensal(250.00);

        ProjetoSocial projeto = new ProjetoSocial();
        projeto.setNomeDoProjeto("Conhecimento Sem Fronteiras");
        projeto.setMetaImpacto(500);

        projeto.setLider(voluntario);

        System.out.println("========================================");
        System.out.println("   SISTEMA DE GESTÃO - ONG PARCEIRA    ");
        System.out.println("========================================");
        System.out.println();

        voluntario.exibirResumo();
        System.out.println();

        doador.exibirResumo();
        System.out.println();

        projeto.iniciarProjeto();
        System.out.println();

    }
}
