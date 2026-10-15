package Re_java;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class LL{

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void printLL(Node head){
        Node currNode = head;
        while (currNode!=null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static Node reverseLL(Node head){

        Node prev = null;
        Node curr = head;
        Node nextNode;

        while(curr!=null){
            nextNode = curr.next;
            curr.next = prev;

            prev = curr;
            curr = nextNode;
        }

        head = prev;

        return head;
    }

    public static void main(String[] args) {
        //Creating nodes
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node four = new Node(40);
        Node five = new Node(50);
        Node six = new Node(60);

        //Assingning next node
        first.next = second;
        second.next = third;
        third.next = four;
        four.next = five;
        five.next = six;

        //Assinging head node
        Node head = first;

        /* 
        //Inserting a new node at begining
        Node node = new Node(5);
        node.next = head;
        head = node;

        //Inserting a new node at end
        Node endNode = new Node(40);
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = endNode;
        endNode.next = null;

        //Insert at an index
        int idx = 1;
        int count = 0;
        Node node2 = new Node(15);
        currNode = head;
        while(count!=idx){
            currNode = currNode.next;
            count++;
        }
        node2.next = currNode.next;
        currNode.next = node2;

        //Delete from the end
        currNode = head;
        while(currNode.next.next!=null){
            currNode = currNode.next;
        }
        currNode.next = null;

        //Delete node by a value
        int target = 20;
        currNode = head;
        while (currNode.next.data != target) {
            currNode = currNode.next;
        }
        currNode.next = currNode.next.next;
        */

        Node fast = head, slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            System.out.print(fast.data + ", ");
        }

        head = reverseLL(head);

        //Print nodes
              
    }

    
}