package ArrayList;

import java.util.Stack;

public class BinarySearch {
    private static class Node{
        private int data;
        private Node left, right;

        public Node(int value){
            data = value;
            left = right = null;
        }
    }

    private Node root;

    public BinarySearch(){
        root = null;
    }

    public Node getRoot(){
        return root;
    }

    public boolean isEmpty(){ //check if binary tree is empty or not;
        return null == root;
    }

    public int size(){ // function to return number of nodes in this binary search tree;
        Node current  = root;
        int size = 0;
        Stack<Node> stack = new Stack<Node>();
        while(!stack.isEmpty() || current != null){
            if (current != null){
                stack.push(current);
                current = current.left;
            }else{
                size++;
                current = stack.pop();
                current = current.right;
            }
        }
        return size;
    }

    public void clear(){ //clear binary search tree;
        root = null;
    }


}