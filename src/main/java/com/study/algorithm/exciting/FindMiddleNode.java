package com.study.algorithm.exciting;

public class FindMiddleNode<T> {

    public static void main(String[] args){
        Node<String> head = new Node<>(null,null);
        Node<String> firstNode = new Node<>("first",null);
        Node<String> secondNode = new Node<>("second",null);
        Node<String> thirdNode = new Node<>("third",null);
        Node<String> fourthNode = new Node<>("fourth",null);
        Node<String> fifthNode = new Node<>("fifth",null);
        Node<String> sixthNode = new Node<>("sixth",null);

        head.next = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;
        fifthNode.next = sixthNode;

        FindMiddleNode<String> findMiddleNode = new FindMiddleNode<>();
        Node<String> midNode = findMiddleNode.findMidNode(head);
        System.out.println(midNode.item);

        sixthNode.next = secondNode;
        boolean haveCircle = findMiddleNode.isHaveCircle(head);
        System.out.println(haveCircle);

        String circleNodeItem = findMiddleNode.getCircleNodeItem(head);
        System.out.println(circleNodeItem);
    }

    /**
     * 寻找中间节点
     * @param nodes
     * @return
     */
    public  Node<T> findMidNode(Node<T> nodes){
        Node<T> low = nodes;
        Node<T> fast =nodes;
        while(fast.next!=null){
            fast = fast.next.next;
            low = low.next;
        }
        return low;
    }

    /**
     * 是否存在环状
     * @param nodes
     * @return
     */
    public boolean isHaveCircle(Node<T> nodes){
        Node<T> low = nodes;
        Node<T> fast =nodes;
        while(fast.next!=null){
            fast = fast.next.next;
            low = low.next;
            if(fast.equals(low)){
                return true;
            }
        }
        return false;
    }

    /**
     * 获取环状出现的入口点
     * @param nodes
     * @return
     */
    public T getCircleNodeItem(Node<T> nodes){
        Node<T> low = nodes;
        Node<T> fast =nodes;
        Node<T> tmp =null;
        while(fast.next!=null){
            fast = fast.next.next;
            low = low.next;
            if(fast.equals(low)){
                tmp = nodes;
                break;
            }
        }
        while(tmp != low){
            tmp = tmp.next;
            low = low.next;
            if(tmp.equals(low)){
                return low.item;
            }
        }
        return null;
    }
}

