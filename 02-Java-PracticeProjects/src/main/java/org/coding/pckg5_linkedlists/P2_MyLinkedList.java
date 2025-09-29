package org.coding.pckg5_linkedlists;

public class P2_MyLinkedList {

    Node head;
    int size;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public P2_MyLinkedList() {
        this.size = 0;
        this.head = null;
    }

    public int get(int index) {
        return 0;
    }

    public void addAtHead(int val) {
        Node node;
        if (this.size == 0) {
            node = new Node(val);
            this.head = node;
        } else {
            node = new Node(val);
            node.next = head;
            this.head = node;
        }

        this.size++;
    }

    public void addAtTail(int val) {
        Node node;
        if (this.size == 0) {
            node = new Node(val);
            this.head = node;
        } else {

            // create a temp var to traverse to last node of LL
            // U can reach last node by using condition : temp.next != null
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            // now temp is pointing to last node of LL
            // create new node and point this temp last node next to it

            node = new Node(val);
            temp.next = node;
        }

        this.size++;
    }

    public void addAtIndex(int index, int val) {
        Node node;
        if (this.size == 0 || this.head == null || index == 0) {
            node = new Node(val);
            this.head = node;
        } else {
            if (index == this.size) { // copy code of adding node at tail
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                node = new Node(val);
                temp.next = node;
            } else if (index > size) {
                System.out.println("Node will not be inserted");
                return;
            } else {
                // now I need to reach one node previous of index
                int count = 0;
                Node current = head;

                while (count < index-1) {
                    current = current.next;
                    count++;
                }

                // now your current is pointing to one node previous of index
                node = new Node(val);
                node.next = current.next;
                current.next = node;
            }
        }
        this.size++;
    }

    public void deleteAtIndex(int index) {

        if(index > size || size == 0){
            return;
        }

        Node temp = head;
        int count = 0;
        while(count != index){
            temp = temp.next;
            count++;
        }

        
    }

    public void printLL() {
        if (this.head == null || this.size == 0) {
            System.out.println("LL is empty. Pls add elements to it.");
            return;
        }

        // here we are printing each node data so we will use condition: temp != null
        // below condition will print each node data and then move to next node
        // if we use temp.next != null then last node data will not be printed
        // so if u want to move to last node use condition : temp.next != null and
        // if u want to print each node data then use condition : temp != null
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        P2_MyLinkedList myLL1 = new P2_MyLinkedList();

        // trying to print empty LL
        myLL1.printLL();
        System.out.println();

        // adding nodes at beginning of LL
        myLL1.addAtHead(40);
        myLL1.addAtHead(30);
        myLL1.addAtHead(20);
        myLL1.addAtHead(10);

        myLL1.printLL();
        System.out.println();

        // adding nodes at last of LL
        myLL1.addAtTail(50);
        myLL1.addAtTail(60);
        myLL1.addAtTail(70);
        myLL1.addAtTail(80);

        myLL1.printLL();
        System.out.println();

        // 10 -> 20 -> 30 -> 40 -> 50 -> 60 -> 70 -> 80 -> null
        // 0      1    2      3    4      5    6      7
        myLL1.addAtIndex(2,25);
        myLL1.printLL();
        System.out.println();

        myLL1.addAtIndex(9,150);
        myLL1.printLL();
        System.out.println();


    }
}
