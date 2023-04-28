public class Cliente {

    private String nome;
    private Computador computador;

    public Cliente(String nome, Computador computador) {
        this.nome = nome;
        this.computador = computador;
    }

    public String obterCliente() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", marca='" + computador.getMarca() + '\'' +
                ", modelo='" + computador.getModelo() + '\'' +
                ", processador='" + computador.getProcessador() + '\'' +
                ", memoriaRAM='" + computador.getMemoriaRAM() + '\'' +
                ", armazenamento='" + computador.getArmazenamento() + '\'' +
                '}';
    }

}
