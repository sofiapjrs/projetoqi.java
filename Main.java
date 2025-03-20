public class Main {
    public static void main(String[] args) {
        // Criando um usuário
        Usuario usuario = new Usuario(1, "Carlos Silva", "123.456.789-00", "carlos@email.com", "senha123", "Gerente");

        // Exibir informações do usuário
        usuario.exibirInformacoes();

        // Atualizar status
        usuario.atualizarStatus("Ativo");
    }
}

