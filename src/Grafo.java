
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Grafo {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int nod = Integer.parseInt(sc.nextLine());
        int conec = Integer.parseInt(sc.nextLine());
        Edge[] E = new Edge[conec];
        Vertex[] G = new Vertex[nod];

        for (int i = 0; i < conec; i++) {
            String cad = sc.nextLine();
            int dir[] = new int[cad.split(" ").length];
            for (int j = 0; j < 3; j++) {
                dir[j] = Integer.parseInt(cad.split(" ", 3)[j]);
            }
            E[i] = new Edge(dir[1], dir[2]);
            E[i].setFrom(dir[0]);
        }

        ArrayList<ArrayList<Edge>> Nodos = new ArrayList<>();
        for (int k = 0; k < nod; k++) {
        ArrayList<Edge> c = new ArrayList<>();
            for (int l = 0; l < E.length; l++) {
                if (E[l].getFrom() == k) {
                    c.add(E[l]);
                }
            }
            Nodos.add(c);
        }
        for (int m = 0; m < nod; m++) {
            G[m] = new Vertex(Nodos.get(m));
        }

        Dijkstra Ej1 = new Dijkstra(G, G.length);
        System.out.println(Arrays.toString(Ej1.dijkstra(1)));
    }
}
