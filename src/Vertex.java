
import java.util.ArrayList;
import java.util.List;

public class Vertex {
    	List<Edge> adj;

	public Vertex() {
		adj = new ArrayList<Edge>();
	}
	public Vertex(ArrayList<Edge> k) {
		adj = k;
	}
}
