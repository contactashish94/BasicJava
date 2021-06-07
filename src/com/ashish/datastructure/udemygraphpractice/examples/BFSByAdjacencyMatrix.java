package com.ashish.datastructure.udemygraphpractice.examples;

import com.ashish.datastructure.udemygraphpractice.node.GraphNode;

import java.util.ArrayList;
import java.util.LinkedList;

public class BFSByAdjacencyMatrix {

    public ArrayList<GraphNode> nodeList = new ArrayList<>();
    int[][] adJacencyMatirix;

    public BFSByAdjacencyMatrix(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
        this.adJacencyMatirix = new int[nodeList.size()][nodeList.size()];
    }

    void bfs() {
        for (GraphNode node : nodeList) {
            if (!node.isVisited()) {
                bfsVisit(node);
            }
        }
    }


    void bfsVisit(GraphNode node) {
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode presentNode = queue.remove(0);
            presentNode.setVisited(true);
            System.out.print(presentNode.getName() + " ");

            ArrayList<GraphNode> neighbors = getNeighbors(presentNode);

            for (GraphNode neighbor : neighbors) {
                if (!neighbor.isVisited()) {
                    queue.add(neighbor);
                    neighbor.setVisited(true);
                }
            }
        }
    }

    private ArrayList<GraphNode> getNeighbors(GraphNode presentNode) {
        ArrayList<GraphNode> neighbors = new ArrayList<>();

        int nodeIndex = presentNode.getIndex();
        for (int i = 0; i < adJacencyMatirix.length; i++) {
            if (adJacencyMatirix[nodeIndex][i] == 1) {
                neighbors.add(nodeList.get(i));
            }
        }
        return neighbors;
    }

    public void addUnDirected(int i, int j) {
        i--;
        j--;
        adJacencyMatirix[i][j] = 1;
        adJacencyMatirix[j][i] = 1;
    }
}
