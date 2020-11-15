package com.study.algorithm.linear;

import java.util.Iterator;

public class TowWayLinkList<T> implements Iterable<T>{
    private Node<T> headNode;
    private Node<T> lastNode;
    private int N;

    public T remove(int index) {
        Node<T> curr = headNode;
        for(int i=0; i<= index;i++){
            curr = curr.next;
        }
        Node<T> pre = curr.pre;
        Node<T> next = curr.next;
        if(pre != null){
            pre.next = next;
        }
        if(next !=null){
            next.pre = pre;
        }

        this.N--;
        return curr!=null ? curr.item:null;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class Node<T>{
        public Node<T> pre;
        public Node<T> next;
        public T item;
        public Node(T item,Node<T> pre,Node<T> next){
            this.item = item;
            this.pre = pre;
            this.next = next;
        }
    }

    public TowWayLinkList(){
        this.headNode= new Node<>(null,null,null);
        this.lastNode = null;
        this.N =0;
    }

    public int length(){
        return this.N;
    }

    public void clear(){
        this.headNode.next = null;
        this.lastNode=null;
        this.N =0;
    }

    public boolean isEmpty(){
        return this.N == 0;
    }

    public T getFirst(){
        return !this.isEmpty() ? this.headNode.next.item : null;
    }

    public T getLastNode(){
        return !this.isEmpty() ? this.lastNode.item: null;
    }
    public T get(int index){
        Node<T> curr = headNode;
       for(int i=0; i<= index;i++){
           curr = curr.next;
       }
       if(curr == null){
           return null;
       }
        return curr.item;

    }

    public void insert(T item){
      if(this.isEmpty()){
          this.lastNode = new Node<>(item,headNode,null);
          headNode.next = lastNode;
      }else{
          Node<T> newNode = new Node<>(item,lastNode,null);
          lastNode.next = newNode;

          this.lastNode = newNode;
      }
      this.N++;

    }

    public void insert(int index,T item){
        Node<T> curr = headNode;
        for(int i=0; i<= index;i++){
            curr = curr.next;
        }

        Node<T> newNode = new Node<>(item,curr.pre,curr);
        Node<T> pre = curr.pre;
        if(pre != null){
            pre.next = newNode;
        }
        if(curr != null){
            curr.pre = newNode;
        }

        this.N++;
    }

    private class MyIterator implements Iterator<T>{
        private Node<T> node;

        public MyIterator(){
            this.node = headNode;
        }

        @Override
        public boolean hasNext() {
            return this.node.next!=null;
        }

        @Override
        public T next() {
            node = node.next;
            return node.item;
        }
    }
}
