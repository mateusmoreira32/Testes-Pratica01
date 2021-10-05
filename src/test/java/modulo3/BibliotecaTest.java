package modulo3;

import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;

import java.util.List;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaTest {

    private static Biblioteca biblioteca;
    private final static Logger logger = Logger.getLogger("my-logger");

    @BeforeClass
    public static void setUp(){
        biblioteca = new Biblioteca();
        biblioteca.setLivros(List.of(new String[]{"Engenharia de software", "Sistemas Embarcados", "Scrum book"}));
        logger.info("Iniciando Testes: Biblioteca");
    }

    @AfterClass
    public static void end(){
        logger.info("Fim dos Testes: Biblioteca");
    }

    @Test
    public void testBibliotecaPossueLivro(){
        assertTrue(biblioteca.possueLivro("Engenharia de software"));
    }

    @Test
    public void testBibliotecaPossueLivros(){
        assertTrue(biblioteca.possuiLivros(List.of(new String[]{"Engenharia de software", "Sistemas Embarcados"})));
    }

    @Test
    public void testPrecoLivros(){
        assertEquals(2, biblioteca.precoDoParaEmprestimo(4));
    }
}
