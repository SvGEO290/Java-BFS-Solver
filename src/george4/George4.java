
package george4;

import java.util.Map;

/**
 *
 * @author Samuel George
 */
public class George4 {

    public static void main(String[] args) {
        String fileName = "input1.txt";
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        

        Graph graph = Utility.readGraphFromFile(fileName);
        System.out.println(graph.adjacencyList);
        graph.BFS(Utility.getStartNodeInput(fileName)); 

        Map<Integer, Integer> minimumDistances = graph.getMinimumDistances();
        for (Map.Entry<Integer, Integer> entry : minimumDistances.entrySet()) {
            System.out.println("Node " + entry.getKey() + " is distance " + entry.getValue() + " from the source.");
        }
    }
}
