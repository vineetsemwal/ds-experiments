package datastructure.customcollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiMap {

    public static void main(String[] args) {
        MultiMap adjacencyList = new MultiMap();
        adjacencyList.addEdge("A", new Edge("B", 10));
        adjacencyList.addEdge("A", new Edge("D", 5));
    }

    Map<String, List<Edge>> map = new HashMap<>();

    public void addEdge(String vertex, Edge edge) {
        List<Edge> list = map.get(vertex);
        if (list == null) {
            list = new ArrayList<>();
            map.put(vertex, list);
        }
        list.add(edge);
    }

    public List<Edge> getEdges(String vertex) {
        return map.get(vertex);
    }


    static class Edge {
        String vertex;
        double cost;

        public Edge(String vertex, double cost) {
            this.vertex = vertex;
            this.cost = cost;
        }
    }

}
