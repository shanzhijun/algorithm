package com.study.algorithm.linear;

import java.util.Iterator;

public class LinkList<T> implements Iterable<T>{
    private Node<T> head;
    private int N;

    public LinkList(){
        this.head = new Node<>(null,null);
        this.N = 0;
    }

    public void clear(){
        head.next=null;
        this.N=0;
    }

    public boolean isEmpty(){
        return this.N==0;
    }

    public int length(){
        return this.N;
    }

    public T get(int i){
        Node<T> currentNode=head;
        int num = 0;
        while(num <= i){
            currentNode = currentNode.next;
            num++;
        }
        return currentNode.item;
    }

    public Node<T> getNode(int i){
        Node<T> currentNode=head;
        int num = 0;
        while(num <= i){
            currentNode = currentNode.next;
            num++;
        }
        return currentNode;
    }

    public void insert(T t){
        Node<T> currentNode = this.getNode(this.N-1);
        currentNode.next = new Node(t,null);
        this.N++;
    }

    public void insert(int i,T t){
        if(i >= this.N){
            return;
        }
        Node<T> currentNode = this.getNode(i-1);
        Node insertNode= new Node(t,currentNode.next);
        currentNode.next = insertNode;

        this.N++;
    }

    public T remove(int i){
        Node<T> currentNode = this.getNode(i-1);
        Node<T> tmpNode = this.getNode(i);
        currentNode.next =tmpNode.next;
        this.N--;
        return tmpNode.item;
    }

    public int indexOf(T t){
        return -1;
    }

    public void reverse(){
        if(isEmpty()){
            return ;
        }

        reverse(head.next);
    }

    public Node<T> reverse(Node<T> node){
        if(node.next==null){
            head.next = node;
            return node;
        }

        Node<T> reverse = reverse(node.next);
        reverse.next = node;
        node.next = null;
        reverse.next = node;
        return node;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator{
        private Node n;
        public MyIterator(){
            this.n = head;
        }

        @Override
        public boolean hasNext() {
            return n.next!=null;
        }

        @Override
        public Object next() {
            n = n.next;
            return n.item;
        }
    }
    private class Node<T>{
        public T item;
        public Node next;
        public Node(T item,Node next){
            this.item = item;
            this.next = next;
        }
    }
}
