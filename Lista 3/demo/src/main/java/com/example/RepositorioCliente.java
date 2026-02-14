public class RepositorioCliente implements Repositorio<Usuario> {

    @Override
    public void salvar(Usuario objeto) {
        System.out.println("Salvando usuário: " + objeto);
    }

    @Override
    public void buscar(int id) {
        System.out.println("Buscando usuário com ID: " + id);        
    }

}
