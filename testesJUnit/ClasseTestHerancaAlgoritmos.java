package testesJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import searchGraph.AlgBFS;
import graph.Graph;

class ClasseTestHerancaAlgoritmos extends Graph{

	public ClasseTestHerancaAlgoritmos(boolean directed) {
		super(directed);
	}

	@Test
	void test() {
		for (int i = 1; i<11; i++){
			this.addVertex(String.valueOf(i));
		}
		this.addEdge(this.getGraphVertex().get("1"), this.getGraphVertex().get("2"), 1D);
		this.addEdge(this.getGraphVertex().get("1"), this.getGraphVertex().get("2"), 4D);
		this.addEdge(this.getGraphVertex().get("1"), this.getGraphVertex().get("7"), 1D);
		this.addEdge(this.getGraphVertex().get("1"), this.getGraphVertex().get("2"), 6D);
		this.addEdge(this.getGraphVertex().get("1"), this.getGraphVertex().get("8"), 8D);
		this.addEdge(this.getGraphVertex().get("2"), this.getGraphVertex().get("8"), 11D);
		this.addEdge(this.getGraphVertex().get("2"), this.getGraphVertex().get("8"), 3D);
		this.addEdge(this.getGraphVertex().get("2"), this.getGraphVertex().get("3"), 8D);
		this.addEdge(this.getGraphVertex().get("3"), this.getGraphVertex().get("4"), 7D);
		this.addEdge(this.getGraphVertex().get("3"), this.getGraphVertex().get("4"), 1D);
		this.addEdge(this.getGraphVertex().get("3"), this.getGraphVertex().get("9"), 2D);
		this.addEdge(this.getGraphVertex().get("3"), this.getGraphVertex().get("6"), 4D);
		this.addEdge(this.getGraphVertex().get("4"), this.getGraphVertex().get("5"), 9D);
		this.addEdge(this.getGraphVertex().get("4"), this.getGraphVertex().get("6"), 14D);
		this.addEdge(this.getGraphVertex().get("6"), this.getGraphVertex().get("5"), 10D);
		this.addEdge(this.getGraphVertex().get("7"), this.getGraphVertex().get("6"), 2D);
		this.addEdge(this.getGraphVertex().get("8"), this.getGraphVertex().get("7"), 20D); 
		this.addEdge(this.getGraphVertex().get("8"), this.getGraphVertex().get("7"), 19D);
		this.addEdge(this.getGraphVertex().get("7"), this.getGraphVertex().get("9"), 6D);
		this.addEdge(this.getGraphVertex().get("7"), this.getGraphVertex().get("1"), 6D);
		this.addEdge(this.getGraphVertex().get("7"), this.getGraphVertex().get("9"), 5D);
		this.addEdge(this.getGraphVertex().get("8"), this.getGraphVertex().get("9"), 4D); //alterar pra 17 e 12...	
		this.addEdge(this.getGraphVertex().get("8"), this.getGraphVertex().get("9"), 20D);
		this.addEdge(this.getGraphVertex().get("5"), this.getGraphVertex().get("10"), 20D);
		//this.addEdge(this.getGraphVertex().get("12"), this.getGraphVertex().get("3"), 20D);
		//new AlgoritmoPrim(this, this.getGraphVertex().get("1"));
		new AlgBFS(this, "3", "10");
		assertEquals(true, true);
		imprimirGrafoCircle();
	}

}
