public class Notificacoes {
    private int id;
    private String mensagem;
    private String dataEnvio;
    private String usuario;

    public Notificacoes(int id, String mensagem, String dataEnvio, String usuario) {
        this.id = id;
        this.mensagem = mensagem;
        this.dataEnvio = dataEnvio;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(String dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void enviarNotificacao(String mensagem) {
        System.out.println("Notificação enviada: " + mensagem);
    }

    public void visualizarNotificacoes() {
        System.out.println("Visualizando notificações...");
    }

    public void exibirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Mensagem: " + mensagem);
        System.out.println("Data de Envio: " + dataEnvio);
        System.out.println("Usuário: " + usuario);
    }
}




    

