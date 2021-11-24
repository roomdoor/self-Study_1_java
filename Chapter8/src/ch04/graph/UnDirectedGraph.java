package ch04.graph;

public class UnDirectedGraph { // 그래프 만드는 방법
    private int count;                  //노드가 몇개인지 카운트
    private int[][] vertexMatrix;       //

    public UnDirectedGraph(int count){  // 몇개짜리 그래프인지 모르니까 생성자로 받음
        this.count = count;
        vertexMatrix = new int[count][count];
    }

    public void addEdges(int from, int to, int weight){ // 간선의 유무, 정보를 넣기위한것
        vertexMatrix[from][to] = weight;
        vertexMatrix[to][from] = weight;
    }

    public int[][] getVertexMatrix(){
        return vertexMatrix;
    }

}
