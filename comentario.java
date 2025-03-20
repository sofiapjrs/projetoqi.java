public class Comentario {
    private int id;
    private String texto;
    private String autor;
    private String dataCriacao;
    private String tarefa;

    public Comentario(int id, String texto, String autor, String dataCriacao, String tarefa) {
        this.id = id;
        this.texto = texto;
        this.autor = autor;
        this.dataCriacao = dataCriacao;
        this.tarefa = tarefa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public void adicionarComentario(String comentario) {
        System.out.println("Comentário adicionado: " + comentario);
    }

    public void editarComentario(String novoComentario) {
        System.out.println("Comentário editado: " + novoComentario);
    }

    public void excluirComentario() {
        System.out.println("Comentário excluído.");
    }

    public void visualizarComentarios() {
        System.out.println("Visualizando comentários...");
    }

    public void exibirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Texto: " + texto);
        System.out.println("Autor: " + autor);
        System.out.println("Data de Criação: " + dataCriacao);
        System.out.println("Tarefa: " + tarefa);
    }
}
