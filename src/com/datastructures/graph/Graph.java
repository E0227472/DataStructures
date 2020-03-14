package com.datastructures.graph;

import java.util.LinkedList;

/*
* A graph is basically nothing but an array of linkedlists / arrays. Each linked list consists of links between the verticies
* starting vertices are the index of the array
* */
public class Graph {

    private int vertices;
    private LinkedList<Integer> adjListArray[];

    public Graph (int v) {
        this.vertices = v;

        // array of linkedlist (each index of the array represents the starting vertice)
        adjListArray = new LinkedList[v];
        // each linkedlist represents the path of the vertex
        for(int i = 0; i < v; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }


    public LinkedList<Integer>[] getAdjListArray () {
        return adjListArray;
    }

}
