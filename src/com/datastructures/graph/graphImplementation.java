package com.datastructures.graph;

import java.util.LinkedList;

public class graphImplementation {

   private static Graph graph;
   private static LinkedList<Integer> adjLinkedList[];



    public static void  addEdge(LinkedList<Integer> adjLinkedList[], int src, int dest) {
        adjLinkedList[src].add(dest);
        adjLinkedList[dest].add(src);
    }

    // print out each linkedlist vertex
    public static void printGraph(LinkedList<Integer> adjLinkedList[]) {

        for(int v = 0; v < 5; v++) {

            System.out.println("Adjacency list of vertex "+ v);
            System.out.print("head");
            for(Integer pCrawl: adjLinkedList[v]){
                System.out.print(" -> "+pCrawl);
            }
            System.out.println("\n");
        }
    }

    public static void main(String...args) {
        graph = new Graph(5);
        adjLinkedList = graph.getAdjListArray();

        addEdge(adjLinkedList, 0,1);
        addEdge(adjLinkedList, 0,4);
        addEdge(adjLinkedList, 1,2);
        addEdge(adjLinkedList, 1,3);
        addEdge(adjLinkedList, 1,4);
        addEdge(adjLinkedList, 2,3);
        addEdge(adjLinkedList, 3,4);

        printGraph(adjLinkedList);
    }





}
