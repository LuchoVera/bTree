package org.example;

public class Main {
    public static void main(String[] args) {
        BPlusTree bpt = new BPlusTree(3);
        bpt.insert(5, 33);
        bpt.insert(15, 21);
        bpt.insert(25, 31);
        bpt.insert(35, 41);
        bpt.insert(45, 10);

        bpt.printTree();
    }

}