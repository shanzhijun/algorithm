package com.study.algorithm.exciting;

public class Node<T>  {
    public T item;
    public Node<T> next;
    public Node(T item,Node<T> next){
        this.item = item;
        this.next = next;
    }


}
