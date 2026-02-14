public class ArquivoTexto implements Armazenavel {
    @Override
    public void salvar() {
        System.out.println("Salvando dados no arquivo de texto...");
    }

    @Override
    public void carregar() {
        System.out.println("Carregando dados do arquivo de texto...");
    }
}
