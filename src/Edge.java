
public class Edge {

    int to, w, from;

    public Edge( int to, int w) {
        this.to = to;
        this.w = w;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }
}

class QueueItem implements
        Comparable< QueueItem> {

    int u, dist;

    public QueueItem(int u, int dist) {
        this.u = u;
        this.dist = dist;
    }

    public int compareTo(QueueItem q) {
        return this.dist - q.dist;
    }

}
