import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class DirectedGraphTest {

    private DirectedGraph graph;

    @Before
    public void setUp() {
        graph = new DirectedGraph();
        graph.buildGraphFromFile("C:\\Users\\osheenconstable\\directed-graph\\directed-graph\\text1.txt");
    }

    @Test
    public void testQueryBridgeWordsValid() {
        assertEquals("The bridge words from build to castles are: grand", graph.queryBridgeWords("build", "castles"));
    }

    @Test
    public void testQueryBridgeWordsInvalid() {
        assertEquals("No to or nonexistent in the graph!", graph.queryBridgeWords("to", "nonexistent"));
    }

    @Test
    public void testQueryBridgeWordsNoBridge() {
        assertEquals("No bridge words from walls to and!", graph.queryBridgeWords("walls", "and"));
    }
}
