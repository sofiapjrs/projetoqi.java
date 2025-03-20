public class Gerente extends Usuario {

    public Gerente(int id, String nome, String cpf, String email, String senha, String cargo) {
        super(id, nome, cpf, email, senha, cargo);
    }
    
    public void criarProjeto(String nome, String descricao) {
        System.out.println("Projeto criado: " + nome);
    }

    public void editarProjeto(String nome, String descricao) {
        System.out.println("Projeto editado: " + nome);
    }

    public void excluirProjeto(String nome) {
        System.out.println("Projeto excluído: " + nome);
    }

    public String toString() {
        return "Gerente" +
        "Id: "+getId() + "\n" +
        "Nome: "+getNome() + "\n" +
        "Cpf: "+getCpf() + "\n" +
        "Email: "+getEmail() + "\n" +
        "Senha: "+getSenha();
    }
}
