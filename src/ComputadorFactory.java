import java.util.HashMap;
import java.util.Map;


public class ComputadorFactory {
        private static Map<String, Computador> computadores = new HashMap<>();


        public static Computador getComputador(String marca, String modelo, String processador, String memoriaRAM, String armazenamento) {
            Computador computador = computadores.get(marca);
            if (computador == null) {
                computador = new Computador(marca, modelo, processador, memoriaRAM, armazenamento);
                computadores.put(marca, computador);
            }
            return computador;
        }
        public static int getTotalComputadores() {
        return computadores.size();
    }

    }

