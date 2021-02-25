package com.alexlove;

public class LinkedList {
    Node head;
    public LinkedList() {
        this.head = null;
    }
    int get(int index) {
        return 1;
    }
    void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = null;
        //if empty just set to head
        if (this.head != null) {
            newNode.next = this.head;
        }
        this.head = newNode;

    }
    void addAtTail(int val) {
        Node newNode = new Node(val);
        Node tmp = this.head;
        if(this.head == null) {
            this.head = newNode;
        } else {
            while(tmp != null) {
                tmp = this.tmp.next;
            }
            tmp.next = newNode;
        }
    }
    void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
        } else {
            Node newNode = new Node(val);
            Node curNode = this.head;
            for (int i = 0; i < index; i++) {
                curNode = curNode.next;

            }
        }
    }
    void deleteByIndex(int index) {

    }
}

 class Node {
    private Node next;
    private int data;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    public int getData() {
        return this.data;
    }
}
