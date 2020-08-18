package org.jpinzon.binaryTree;

import java.util.Optional;

public class Node<T extends Comparable<T>> {

	private T value;

	private Node<T> left;
	private Node<T> right;

	public Node(T value) {
		this.value = value;
	}

	public boolean insert(T newValue) {
		if (newValue.compareTo(value) < 0) {
			if (left == null) {
				left = new Node<T>(newValue);
				return true;
			} else {
				return left.insert(newValue);
			}
		} else if (newValue.compareTo(value) > 0) {
			if (right == null) {
				right = new Node<T>(newValue);
				return true;
			} else {
				return right.insert(newValue);
			}
		} else {
			return false;
		}

	}

	public Optional<Node<T>> search(T searchedValue) {
		if (searchedValue.compareTo(value) == 0) {
			return Optional.of(this);
		} else if (searchedValue.compareTo(value) < 0 && left != null) {
			return left.search(searchedValue);
		} else if (searchedValue.compareTo(value) > 0 && right != null) {
			return right.search(searchedValue);
		}
		return Optional.empty();
	}

	public Node<T> delete(T deletedValue) {
		var response = this;
		int comp = deletedValue.compareTo(this.value);
		if (comp < 0) {
			this.left = left.delete(deletedValue);
		} else if (comp > 0) {
			this.right = right.delete(deletedValue);
		} else {
			if (!this.hasChildren()) {
				return null;
			} else if (left != null && right == null) {
				return left;
			} else if (left == null && right != null) {
				return right;
			} else {
			}
		}

		return response;
	}

	public boolean hasChildren() {
		return left != null || right != null;
	}

	public T getValue() {
		return value;
	}

	private Node<T> getPredecessor(Node<T> node) {
		Node<T> auxNode;
		do {
			auxNode = node.getRight();

		} while (auxNode.getRight() == null);
		return auxNode;
	}

	public Node<T> getLeft() {
		return left;
	}

	public void setLeft(Node<T> left) {
		this.left = left;
	}

	public Node<T> getRight() {
		return right;
	}

	public void setRight(Node<T> right) {
		this.right = right;
	}

	public void setValue(T value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value + " " + left + " " + right;
	}

}