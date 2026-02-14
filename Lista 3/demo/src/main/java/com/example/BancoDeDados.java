public class BancoDeDados implements Armazenavel {
    @Override
    public void salvar() {
        System.out.println("Salvando dados no banco de dados...");
    }

    @Override
    public void carregar() {
        System.out.println("Carregando dados do banco de dados...");
    }
}
