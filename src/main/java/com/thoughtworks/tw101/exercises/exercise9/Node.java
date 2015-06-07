package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private String name;
    private Node leftNode;
    private Node rightNode;

    public Node(String name) {
        this.name = name;
        leftNode = null;
        rightNode = null;
    }

    public void add(String nameOfNewNode) {

        int compare = nameOfNewNode.compareTo(name);

        if(compare < 0) {
           //left
            if(leftNode != null) {
                // if there is a left, left.add()
                leftNode.add(nameOfNewNode);
            } else {
                //if there is no left, make it the left one
                Node newNode = new Node(nameOfNewNode);
                leftNode = newNode;
            }
        } else{
           //right
            if(rightNode != null) {
                // if there is no right, make it the right one
                rightNode.add(nameOfNewNode);
            } else {
                // if there is a right, right.add()
                Node newNode = new Node(nameOfNewNode);
                rightNode = newNode;
            }
        }
    }



    public List<String> names(List<String> allNames) {

        if(leftNode != null) {
            leftNode.names(allNames);
        }

        allNames.add(this.name);

        if(rightNode != null) {
            rightNode.names(allNames);
        }
        return allNames;
    }
}