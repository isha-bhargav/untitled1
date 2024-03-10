import java.util.*;

public class Main {

    public static void main(String[] args) {
         m=1e9+7;
        Graph graph=new Graph(4);
        graph.getEdges().add(new Edge(0,1,10));
        graph.getEdges().add(new Edge(0,2,6));
        graph.getEdges().add(new Edge(0,3,5));
        graph.getEdges().add(new Edge(1,3,15));
        graph.getEdges().add(new Edge(2,3,4));
        graph.kruskal();
    }



}
