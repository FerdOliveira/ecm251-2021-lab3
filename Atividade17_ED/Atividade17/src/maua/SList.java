package maua;

import models.Node;

public class SList {
    private Node head;

    public SList(){
        this.head = null;
    }

    public void InsereInicio(Integer data){
        Node newNode = new Node(data);

        if(this.head == null)
            this.head = newNode;
        else{
            Node last = this.head;
            while(last.next!=null){
                last = last.next;
            }
            last.next = newNode;
        }
    }
    public void printList(){
        Node cNode = this.head;
        System.out.printf("[\t");
        while (cNode != null){
            System.out.printf("%d\t",cNode.data);
            cNode = cNode.next;
        }
        System.out.printf("]");
    }
}
