public class Tarefas {
    private int id;
    private String  titulo;
    private String descricao;
    private String dataCriacao;
    private String dataVencimento;
    private String status;
    private String responsavel;
    
    public Tarefas(int id, String titulo, String descricao, String dataCriacao, String dataVencimento, String status, String responsavel) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.dataVencimento = dataVencimento;
        this.status = status;
        this.responsavel = responsavel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public void atualizarStatus(String novoStatus) {
        System.out.println("O status foi atualizado para: " + novoStatus);
    }

    public void adicionarComentario(String comentario) {
        System.out.println("Comentário adicionado: " + comentario);
    }

    public void vincularProjetoo(String projeto) {
        System.out.println("Tarefa vinculada ao projeto: " + projeto);
    }

    public void exibirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Data de Criação: " + dataCriacao);
        System.out.println("Data de Vencimento: " + dataVencimento);
        System.out.println("Status: " + status);
        System.out.println("Responsável: " + responsavel);
    }
}



