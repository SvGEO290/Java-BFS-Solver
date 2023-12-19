# Java BFS Solver
 
Objectives:
Java Skill Enhancement: Further enhance knowledge and skill in Java.
BFS Algorithm Understanding: Gain an understanding of the BFS algorithm.
Javadoc Documentation: Gain further experience in using Javadoc documentation.
Programming Techniques: Continue to practice good programming techniques.
Implementation Details:
Graph Representation:

Implemented Graph.java, a representation of a graph G = (V, E) using an adjacency list.
Included methods:
addVertex(v): Add a vertex v.
addEdge(u, v): Add a directed edge from vertex u to vertex v.
getNeighbors(v): Get a list of vertices adjacent to vertex v.
BFS Traversal:

Added a method Graph.BFS(s) that performs a Breadth First Search traversal from a source vertex s.
Prints the order of traversal on a single line.
Minimum Distance Calculation:

Modified the code to track the minimum distance from a source to each destination vertex.
Used an additional data structure for this purpose.
Real-world Datasets:

Implemented a method to read datasets from files and build a graph using the adjacency information.
Provided three datasets of different sizes as adjacency lists.
User can choose which dataset to run a test with.
Output:

For each dataset, the program prints the minimum distance from the source to each vertex.
Output format:
"Node i is distance d from source," or "-1 if node i cannot be reached from the starting node."
Instructions for Use:
Choose Dataset:

The user can specify the dataset to run a test with.
Run the Program:

Execute the program, and it will output the minimum distance information for the chosen dataset.
Graph File Format:

The datasets are provided as adjacency lists in a file, where the first line is the source vertex, and the following V lines represent the adjacency for each vertex.
Note:

The process of reading the file does not belong in the Graph.java class; it should be handled in the driver or utility location.
Feel free to explore the code and documentation. Feedback and suggestions are welcome!
