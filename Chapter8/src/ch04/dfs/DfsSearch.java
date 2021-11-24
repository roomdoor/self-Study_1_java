package ch04.dfs;

import ch04.graph.UnDirectedGraph;

import java.util.Stack;

public class DfsSearch {

    int count;
    boolean[] isVisited;
    Stack<Integer> stack;
    int[][] matrix;

    public DfsSearch(int count) {
        this.count = count;
        isVisited = new boolean[count];
        stack = new Stack<Integer>();

    }

    public void dfsTraversal() {
        stack.push(0);
        isVisited[0] = true;

        while (!stack.isEmpty()) {
            int node = stack.pop();

            System.out.print(node + " ");

            for (int i = 0; i < count; i++) {
                if(matrix[node][i] != 0 && !isVisited[i]){

                    stack.push(i);
                    isVisited[i] = true;
                }
            }
        }

    }

    public static void main(String[] args) {
        int count = 8;
        UnDirectedGraph graph = new UnDirectedGraph(count);
        graph.addEdges(0, 1, 1);
        graph.addEdges(0, 2, 1);
        graph.addEdges(1, 3, 1);
        graph.addEdges(1, 4, 1);
        graph.addEdges(3, 7, 1);
        graph.addEdges(2, 5, 1);
        graph.addEdges(2, 6, 1);
        graph.addEdges(4, 5, 1);

        DfsSearch dfs = new DfsSearch(count);
        dfs.matrix = graph.getVertexMatrix();

        dfs.dfsTraversal();
    }



}
