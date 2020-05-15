import java.util.LinkedList;

/**
 * @author Dima B
 * @version problema2
 * @apiNote 14.05.2020
 */


public class TraversalGraph {

    private final int V;
    private final LinkedList<Integer>[] adj;

    public TraversalGraph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int n : adj[v]) {
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    public void DFS(int v) {
        boolean[] visited = new boolean[V];
        DFSUtil(v, visited);
        System.out.println();
    }

    public void BFS(int s) {

        boolean[] visited = new boolean[V];

        LinkedList<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");

            for (int n : adj[s]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        System.out.println();
    }
}
