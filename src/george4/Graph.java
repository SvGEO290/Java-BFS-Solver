package george4;

import java.util.*;

public class Graph {
    Map<Integer, List<Integer>> adjacencyList;
    private Map<Integer, Integer> minimumDistances;
    
    

    public Graph() {
        adjacencyList = new HashMap<>();
        minimumDistances = new HashMap<>();
    }

    public void addVertex(int v) {
        adjacencyList.put(v, new ArrayList<>());
    }

    public void addEdge(int u, int v) {
        adjacencyList.get(u).add(v);
    }

    public List<Integer> getNeighbors(int v) {
        return adjacencyList.get(v);
    }

    public void BFS(int s) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(s);
        queue.add(s);
        minimumDistances.put(s, 0);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            
            
                
            for (int neighbor : adjacencyList.get(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                    minimumDistances.put(neighbor, minimumDistances.get(current) + 1);
                }
            }
        }
        
        
    }

    public Set<Integer> getVertices() {
        return adjacencyList.keySet();
    }

    public Map<Integer, Integer> getMinimumDistances() {
        return minimumDistances;
    }
}
