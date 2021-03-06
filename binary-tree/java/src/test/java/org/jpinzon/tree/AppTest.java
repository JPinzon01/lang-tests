/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.jpinzon.tree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

class AppTest {

	@Test
	void testInsert() {
		BinaryTree<Integer> tree = new BinaryTree<>();
		tree.insert(10);
		tree.insert(15);
		tree.insert(4);
		tree.insert(1);
		tree.insert(3);
		;
		tree.insert(6);
		assertEquals("10 4 1 null 3 null null 6 null null 15 null null", tree.toString());
	}

	@Test
	void testDeleteOneChild() {
		var tree = createTree();
		tree.delete(3);
		assertEquals("10 4 1 null null 6 null null 15 null null", tree.toString());
	}
	
	@Test
	void testDeleteNoChildren() {
		var tree = createTree();
		tree.delete(1);
		assertEquals("10 4 3 null null 6 null null 15 null null", tree.toString());
	}

	@Test
	void testDeleteTwoChildren() {
		var tree = createTree();
		tree.delete(4);
		assertEquals("10 3 1 null null 6 null null 15 null null", tree.toString());
	}
	private BinaryTree<Integer> createTree() {
		BinaryTree<Integer> tree = new BinaryTree<>();
		tree.insert(10);
		tree.insert(15);
		tree.insert(4);
		tree.insert(1);
		tree.insert(3);
		tree.insert(6);
		return tree;
	}

}
