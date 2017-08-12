Class: MapGraph

Modifications made to MapGraph (what and why):

- added variables to hold all the vertices and edges
- method for returning the number of vertices, edges and vertices
- method for adding a vertex and an edge
- bfs search method (split into a few methods for redability)
- method for creating a path between nodes based on a search map


Class name: MapNode

Purpose and description of class:

- holds nodes from a map with all the relevant info. for that node/vertix


Class name: MapEdge

- edge info. ie. road from one node to another
- also holds the road type, name and distance

Overall Design Justification (4-6 sentences):

The assignment was to implement map graph loading with BFS search algorithm.
When creating the representation of the map I have added separate classes 
for map nodes and edges, so they can be easily extended or reused in the future. 
The vertices/nodes are stored in a hashmap so acces time is fast and checking if 
a node exists or not is also fast. There is a separate HashSet for edges for 
facilitating access to the objects inside MapGraph. 
The BFS method creates a fifo queue for checking all the relevant nodes and the
first/starting node is added to it. After that we check the current first element 
of the queue and if the goal is not found we add all the node's connections to 
the queue. There is a separate list of visited nodes so we can avoid visiting the
same nodes multiple times. During the search a list of parent nodes is created
so the path from start to finish can be recreated (that is done using a separate
method - createPath). 