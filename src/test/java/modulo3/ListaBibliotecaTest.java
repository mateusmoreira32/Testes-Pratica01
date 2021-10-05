package modulo3;

import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;

import java.util.List;
import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.*;

public class ListaBibliotecaTest {

    private static ListaBiblioteca lista;
    private final static Logger logger = Logger.getLogger("my-logger");

    @BeforeClass
    public static void setUp(){
        Biblioteca b = new Biblioteca();
        b.setGerente("Lucas");
        b.setNome("b");
        b.setLivros(List.of(new String[]{"Engenharia de software", "Sistemas Embarcados", "Scrum book"}));

        Biblioteca b1 = new Biblioteca();
        b1.setLivros(List.of(new String[]{"Engenharia de software", "Sistemas Embarcados"}));
        b1.setGerente("Zézinho");
        b1.setNome("b1");

        lista = new ListaBiblioteca();
        lista.setBibliotecas(List.of(new Biblioteca[]{b, b1}));
        logger.info("Iniciando Testes: Lista biblioteca");
    }

    @AfterClass
    public static void end(){
        logger.info("Fim dos Testes: Lista biblioteca");
    }

    @Test
    public void testProcurarPorQuantLivros(){
        assertEquals(1, lista.findPorQuantLivros(3).size());
    }

    @Test
    public void testProcurarPorGerente(){
        assertNotNull(lista.findPorGerente("Lucas"));
    }

    @Test
    public void testProcurarPor(){
        assertEquals("Lucas", lista.findPorNome("b").getGerente());
    }
}
