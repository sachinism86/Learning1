package code.practice.treeDiameter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TreeDiameterTest {
	
	private static Node<Integer> test1() {
        Node<Integer> root = new Node<Integer>(1);
        Node<Integer> n11 = new Node<Integer>(2);
        Node<Integer> n12 = new Node<Integer>(3);
        Node<Integer> n21 = new Node<Integer>(4);
        Node<Integer> n22 = new Node<Integer>(5);
        Node<Integer> n23 = new Node<Integer>(6);
        Node<Integer> n24 = new Node<Integer>(7);
        Node<Integer> n31 = new Node<Integer>(8);
        Node<Integer> n32 = new Node<Integer>(9);
        Node<Integer> n33 = new Node<Integer>(10);
        Node<Integer> n34 = new Node<Integer>(11);
        Node<Integer> n35 = new Node<Integer>(12);
        Node<Integer> n36 = new Node<Integer>(13);
        Node<Integer> n37 = new Node<Integer>(14);
        Node<Integer> n38 = new Node<Integer>(15);

        root.left = n11;
        root.right = n12;

        n11.left = n21;
        n11.right = n22;
        n12.left = n23;
        n12.right = n24;

        n21.left = n31;
        n21.right = n32;
        n22.left = n33;
        n22.right = n34;
        n23.left = n35;
        n23.right = n36;
        n24.left = n37;
        n24.right = n38;

        return root;
    }

    private static Node<Integer> test2() {
        Node<Integer> root = new Node<Integer>(2);
        Node<Integer> n11 = new Node<Integer>(7);
        Node<Integer> n12 = new Node<Integer>(5);
        Node<Integer> n21 = new Node<Integer>(2);
        Node<Integer> n22 = new Node<Integer>(6);
        Node<Integer> n23 = new Node<Integer>(9);
        Node<Integer> n31 = new Node<Integer>(5);
        Node<Integer> n32 = new Node<Integer>(8);
        Node<Integer> n33 = new Node<Integer>(4);

        root.left = n11;
        root.right = n12;

        n11.left = n21;
        n11.right = n22;

        n12.right = n23;
        n22.left = n31;
        n22.right = n32;

        n23.left = n33;

        return root;
    }

    public static void main(String[] args) {

        BTreePrinter.printNode(test1());
        int height = TreeDiameter.height(test1());
        System.out.println("HEIGHT OF TREE is ::"+height);
        int diameter = TreeDiameter.diameter(test1());
        System.out.println("DIAMETER OF TREE is ::"+diameter);

    }
}

class Node<T extends Comparable<?>> {
    Node<T> left, right;
    T data;

    public Node(T data) {
        this.data = data;
    }
}

