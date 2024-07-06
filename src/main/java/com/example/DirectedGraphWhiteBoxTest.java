package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DirectedGraphWhiteBoxTest {

    private DirectedGraph graph;

    @BeforeEach
    public void setUp() {
        graph = new DirectedGraph();
        graph.buildGraphFromFile("/Volumes/[C] Windows 11/Users/osheenconstable/directed-graph/directed-graph/text1.txt");
    }

    @Test
    public void testCalcShortestPathValid() {
        assertEquals("Shortest path from build to castles is: build->grand->castles. Path weight: 2.0", 
                      graph.calcShortestPath("build", "castles"));
    }

    @Test
    public void testCalcShortestPathInvalidWord() {
        assertEquals("One or both of the words are not in the graph!", 
                      graph.calcShortestPath("to", "nonexistent"));
    }

    @Test
    public void testCalcShortestPathNoPath() {
        assertEquals("Shortest path from walls to and is: walls->and. Path weight: 1.0", 
                      graph.calcShortestPath("walls", "and"));
    }
}
