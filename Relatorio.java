public class Relatorio {
    private int id;
    private String projeto;
    private String dataGeracao;
    private String dados;

    public Relatorio(int id, String projeto, String dataGeracao, String dados) {
        this.id = id;
        this.projeto = projeto;
        this.dataGeracao = dataGeracao;
        this.dados = dados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public String getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(String dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public String getDados() {
        return dados;
    }

    public void setDados(String dados) {
        this.dados = dados;
    }

    public void gerarRelatorio(String dados) {
        System.out.println("Relatório gerado com sucesso!");
    }

    public void exportarRelatorio(String formato) {
        System.out.println("Relatório exportado no formato " + formato);
    }

    public void exibirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Projeto: " + projeto);
        System.out.println("Data de Geração: " + dataGeracao);
        System.out.println("Dados: " + dados);
    }
}
