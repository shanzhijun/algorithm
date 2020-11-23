package com.study.algorithm.tree;

import com.sun.corba.se.impl.io.ValueUtility;

import java.util.PriorityQueue;
import java.util.Queue;

public class BinaryTree<Key extends  Comparable<Key>,Value> {
    private Node<Key,Value> root;// 记录根节点
    private int N;
    public BinaryTree(){
        this.N = 0;
    }

    // 向树种插入一个键值对
    public void put(Key key,Value value){
        root = this.put(root,key,value);
    }

    //给指定的树上插入一个键值对，并返回新树
    private Node<Key,Value> put(Node<Key,Value> node,Key key,Value value){
        if(node == null){
            node = new Node<Key,Value>(key,value,null,null);
            this.N++;
        }else{
            if(node.key.compareTo(key)>0){
                node.leftNode = this.put(node.leftNode,key,value);
            }else if(node.key.compareTo(key)<0){
                node.rightNode = this.put(node.rightNode,key,value);
            }else{
                node.value = value;
            }
        }
        return node;
    }

    // 根据key，从树中找出对应的值
    public Value get(Key key){

        return this.get(root,key);
    }

    public Value get(Node<Key,Value> node,Key key){
        if(node == null){
            return null;
        }
        if(node.key.compareTo(key)==0){
            return node.value;
        }else if(node.key.compareTo(key) > 0){
            // 查询左子树
            return get(node.leftNode,key);
        }else{
            // 查询右子树
            return get(node.rightNode,key);
        }
    }

    //根据key，删除书中对应的键值对

    public void delete(Key key){
        this.delete(root,key);

    }

    // 删除指定树上的键为key的键值对，并返回删除后的新树
    public Node<Key,Value> delete(Node<Key,Value> node,Key key){
        if(node == null){
            return null;
        }
        if(node.key.compareTo(key)==0){
           // 删除节点
            N--;

            if(node.rightNode == null){
                return node.leftNode;
            }
            if(node.leftNode == null){
                return node.rightNode;
            }

            // 查找右子树中最小的节点
            Node minNode = node.rightNode;
            while(minNode.leftNode!=null){
                minNode = minNode.leftNode;
            }

            // 删除右子树中的最小节点
            Node n = node.rightNode;
            while(n.leftNode != null){
                if(node.leftNode.leftNode == null){
                    n.leftNode = null;
                }else{
                    n = n.leftNode;
                }
            }

            // 最小节点的
            minNode.leftNode = node.leftNode;
            minNode.rightNode = node.rightNode;

            node = minNode;

        }else if(node.key.compareTo(key) > 0){
            // 查询左子树
           node.leftNode = delete(node.leftNode,key);
        }else{
            // 查询右子树
           node.rightNode = delete(node.rightNode,key);
        }
        return node;
    }

    public int size(){
        return N;
    }

    public void prefind(){
        preFind(root);
    }
    public void preFind(Node<Key, Value> node){
        if(node != null){
            System.out.println(node.key);
            preFind(node.leftNode);
            preFind(node.rightNode);
        }
    }

    public void middleFind(){
        middleFind(root);
    }

    public void middleFind(Node<Key, Value> node){
        if(node != null){
            middleFind(node.leftNode);
            System.out.println(node.key);
            middleFind(node.rightNode);
        }
    }

    public void afterFind(){
        afterFind(root);
    }

    public void afterFind(Node<Key, Value> node){
        if(node != null){
            afterFind(node.leftNode);
            afterFind(node.rightNode);
            System.out.println(node.key);
        }
    }


//    public void levelFind(){
    // 队列使用错误
//        PriorityQueue<Node<Key,Value>> nodes = new PriorityQueue();
//        nodes.add(root);
//        while(!nodes.isEmpty()){
//            Node<Key,Value> n = nodes.poll();
//            System.out.println(n.key);
//            if(n.leftNode !=null){
//                nodes.add(n.leftNode);
//            }
//            if(n.rightNode !=null){
//                nodes.add(n.rightNode);
//            }
//        }
//    }

    // 获取整棵树的最大深度
    public int maxDepth(){
        return this.maxDepth(root);
    }

    public int maxDepth(Node<Key,Value> node){
        if(node == null){
            return 0;
        }
        int leftNum = 0;
        int rightNum =0;
        if(node.leftNode != null){
            leftNum = maxDepth(node.leftNode);
        }

        if(node.rightNode != null){
            rightNum = maxDepth(node.rightNode);
        }

        if(leftNum > rightNum){
            return leftNum + 1;
        }else{
            return rightNum + 1;
        }
    }
    class Node<Key,Value>{
        public Key key;
        public Value value;
        public Node<Key,Value> leftNode;
        public Node<Key,Value> rightNode;
        public Node(Key key,Value value, Node<Key,Value> leftNode,Node<Key,Value> rightNode){
            this.key = key;
            this.value = value;
            this.leftNode = leftNode;
            this.rightNode = rightNode;
        }
    }
}
