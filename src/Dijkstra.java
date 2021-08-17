
import java.util.Arrays;
import java.util.PriorityQueue;


public class Dijkstra {

    int N;
    static int INF = 5000;
    Vertex[] G;

    public Dijkstra() {
        N = 0;
        G = null;

    }

    public Dijkstra(Vertex[] G1, int N1) {
        this.G = G1;
        this.N = N1;
    }

    int[] dijkstra(int s) {
        int[] dist = new int[N];
        int[] p = new int[N];
        PriorityQueue<QueueItem> Q = new PriorityQueue<QueueItem>();
        Arrays.fill(dist, INF);
        Arrays.fill(p, -1);
        dist[s] = 0;
        Q.offer(new QueueItem(s, 0));
        while (!Q.isEmpty()) {
            QueueItem q = Q.poll();
            int u = q.u, d = q.dist;
            if (d == dist[u]) {
                for (Edge e : G[u].adj) {
                    int v = e.to, w = e.w;
                    if (dist[u] + w < dist[v]) {
                        dist[v] = dist[u] + w;
                        p[v] = u;
                        Q.offer(new QueueItem(v, dist[v]));
                    }
                }
            }
        }
        return dist;
    }
}
