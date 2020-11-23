package com.study.algorithm.tree;

import org.junit.Test;

public class BinaryTreeTest {

    @Test
    public void testBinaryTree(){
        BinaryTree<Integer,String> binaryTree = new BinaryTree();

        binaryTree.put(6,"six");
        binaryTree.put(1,"one");
        binaryTree.put(2,"two");
        binaryTree.put(4,"four");
        binaryTree.put(7,"seven");
        binaryTree.put(8,"eight");
        binaryTree.put(3,"three");

        System.out.println(binaryTree.get(7));
//        binaryTree.delete(3);

        binaryTree.prefind();

        binaryTree.middleFind();

        binaryTree.afterFind();

//        binaryTree.levelFind();

        System.out.println(binaryTree.maxDepth());
    }
}
