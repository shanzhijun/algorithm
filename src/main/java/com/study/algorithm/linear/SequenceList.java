package com.study.algorithm.linear;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SequenceList<T> implements Iterable<T>{
    private T[] eles;
    private int N;

    public SequenceList(int capatity) {
        this.eles = (T[]) new Object[capatity];
        this.N = 0;
    }

    public void clear() {
        this.N = 0;
    }

    public boolean isEmpty() {

        return this.N == 0;
    }

    public int length() {
        return this.N;
    }

    public T get(int i) {
        return this.eles[i];
    }

    public void insert(int i, T t) {
        if(this.N == this.eles.length){
            this.expandCapatity(2 * this.N);
        }

        for (int j = this.N; j > i; j--) {
            this.eles[j] = this.eles[j - 1];
        }
        this.eles[i] = t;
        this.N++;
    }

    private void expandCapatity(int newSize) {
        T[] tempEles = this.eles;
        T[] newEles = (T[]) new Object[newSize];
        for(int i=0;i<this.N; i++){
            newEles[i] = tempEles[i];
        }
        this.eles = newEles;
    }

    public void insert(T t) {
        if(this.N == this.eles.length){
            this.expandCapatity(2 * this.N);
        }
        this.eles[N++] = t;
    }

    public T remove(int i) {
        T current = this.eles[i];
        for (int index = i + 1; index < this.N; index++) {
            this.eles[index - 1] = this.eles[index];
        }
        this.N--;
        if(this.N < this.eles.length/4){
            this.expandCapatity(this.eles.length/2);
        }
        return current;
    }

    public int indexOf(T t) {
        for (int i = 0; i < this.N; i++) {
            if (this.eles[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Iterator<T> iterator() {
        return new SIterateor();
    }

    private class SIterateor implements  Iterator{
        private int cusor;
        public SIterateor(){
            this.cusor = 0;
        }

        @Override
        public boolean hasNext() {
            return this.cusor < N;
        }

        @Override
        public Object next() {
            return eles[cusor++];
        }
    }
}
