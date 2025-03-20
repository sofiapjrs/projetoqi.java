public class Projeto {
    private int id;
    private String nome;
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private String status;

    public Projeto(int id, String nome, String descricao, String dataInicio, String dataFim, String status) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void adicionarTarefa() {
        System.out.println("Tarefa adicionada: " + this.nome);
        // Aqui você poderia adicionar lógica para salvar a tarefa em um banco de dados ou lista
    }
    
    public void definirPrazo(String dataFim) {
        this.dataFim = dataFim;
        System.out.println("Prazo definido para: " + dataFim);
    }

    public void exibirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Data de Início: " + dataInicio);
        System.out.println("Data de Término: " + dataFim);
        System.out.println("Status: " + status);
    }

     // Método main para teste
     //public static void main(String[] args) {
        // Criando uma nova tarefa
        //Projeto projeto = new projeto(1, "Implementar sistema", "Desenvolver o sistema de gerenciamento de tarefas");
        
        // Adicionando a tarefa
        //projeto.adicionarProjeto();
        
        // Definindo um prazo
        //Date prazo = new Date(); // Aqui você poderia definir uma data específica
        //tarefa.definirPrazo(prazo);
        
        // Alterando o status
        //arefa.setStatus("Em andamento");
        
        // Gerando relatório
        //tarefa.gerarRelatorio();
        //}
}






