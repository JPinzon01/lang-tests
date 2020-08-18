package org.jpinzon.tree;

import org.jpinzon.binaryTree.Node;

public class BinaryTree<T extends Comparable<T>> {

    Node<T> root;

    public void insert(T value){
        if (root == null){
            root = new Node<T>(value);
        } else{
            root.insert(value);
        }
    }

    public void delete(T value){
        if (root != null){
            root.delete(value);
        }
    }
    
	@Override
	public String toString() {
		return root.toString();
	}

    
}