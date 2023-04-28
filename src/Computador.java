public class Computador {
    private String marca;
    private String modelo;
    private String processador;
    private String memoriaRAM;
    private String armazenamento;

    public Computador(String marca, String modelo, String processador, String memoriaRAM, String armazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getProcessador() {
        return processador;
    }

    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public String getArmazenamento() {
        return armazenamento;
    }
}