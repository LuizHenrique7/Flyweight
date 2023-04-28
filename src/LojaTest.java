import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class LojaTest {

    @Test
    void deveRetornarClientes() {
        Loja loja = new Loja();
        loja.registrar("João Silva", "Dell", "Inspiron", "Core i5", "8GB", "256GB SSD");
        loja.registrar("Maria Santos", "HP", "Notebook", "Core i7", "16GB", "512GB SSD");
        loja.registrar("Pedro Almeida", "Asus", "VivoBook", "Ryzen 5", "12GB", "1TB HDD");
        List<String> clientes = loja.obterClientes();

        List<String> saida = Arrays.asList(
                "Cliente{nome='João Silva', marca='Dell', modelo='Inspiron', processador='Core i5', memoriaRAM='8GB', armazenamento='256GB SSD'}",
                "Cliente{nome='Maria Santos', marca='HP', modelo='Notebook', processador='Core i7', memoriaRAM='16GB', armazenamento='512GB SSD'}",
                "Cliente{nome='Pedro Almeida', marca='Asus', modelo='VivoBook', processador='Ryzen 5', memoriaRAM='12GB', armazenamento='1TB HDD'}");

        assertEquals(saida, loja.obterClientes());
    }

    @Test
    void deveRetornarTotalComputadores() {
        Loja loja = new Loja();
        loja.registrar("João Silva", "Dell", "Inspiron", "Core i5", "8GB", "256GB SSD");
        loja.registrar("Maria Santos", "HP", "Notebook", "Core i7", "16GB", "512GB SSD");
        loja.registrar("Pedro Almeida", "Asus", "VivoBook", "Ryzen 5", "12GB", "1TB HDD");


        assertEquals(3, ComputadorFactory.getTotalComputadores());
    }

}