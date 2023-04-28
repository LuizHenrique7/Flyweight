import java.util.ArrayList;
import java.util.List;

public class Loja {

    private List<Cliente> clientes = new ArrayList<>();

    public void registrar(String nomeCliente, String marca, String modelo, String processador, String memoriaRAM, String armazenamento) {
        Computador computador = ComputadorFactory.getComputador(marca, modelo, processador, memoriaRAM, armazenamento);
        Cliente cliente = new Cliente(nomeCliente, computador);
        clientes.add(cliente);
    }

    public List<String> obterClientes() {
        List<String> saida = new ArrayList<String>();
        for (Cliente cliente : this.clientes) {
            saida.add(cliente.obterCliente());
        }
        return saida;
    }


}
