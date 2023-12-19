package george4;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Utility {
    
    public static int getStartNodeInput(String fileName){
        try(Scanner scanner = new Scanner(new File(fileName))){
            return scanner.nextInt(); //this will read the first value from the file, making it the start node
        } catch (FileNotFoundException e){
            e.printStackTrace(); //incase of an error
            return -1;
        }
        
    
    
    }

    public static Graph readGraphFromFile(String fileName) {
        Graph graph = new Graph();
        
        try(Scanner scanner = new Scanner(new File(fileName))){
            scanner.nextLine();
            
            int vertex = 0;
            
            while (scanner.hasNextLine()){
                
                graph.addVertex(vertex);
                
                String line = scanner.nextLine();
                
                Scanner lineScanner = new Scanner(line);
                
                while (lineScanner.hasNextInt()){
                    int neighbor = lineScanner.nextInt();
                    graph.addEdge(vertex, neighbor);
                } 
                vertex++;
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        return graph;
    }

    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the filename for the dataset: ");
        return scanner.nextLine();
    }
}
