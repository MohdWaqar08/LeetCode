package Re_java;

public class stAck {
    //Linked List Implementation
    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    

    static class Stack {
        static Node head;

        public static boolean isEmpty(Node head){
            if(head == null){
                return true;
            }

            return false;
        }

        public static void push(int val){
            Node newNode = new Node(val);

            newNode.next = head;
            head = newNode;
        }

        public static int pop(){
            if(isEmpty(head)){
                System.out.println("UNDERFLOW!!");
                return -1;
            } 

            Node curr = head;
            head = head.next;

            return curr.data;
        }

        public static int peek(){
            if(isEmpty(head)){
                System.out.println("UNDERFLOW!!");
                return -1;
            } 

            return head.data;
        }
        

    }

    

    public static void main(String[] args) {
        Stack.push(35);
        Stack.push(40);
        Stack.push(45);
        Stack.push(50);

        System.out.println(Stack.pop());
        System.out.println(Stack.pop());
        Stack.push(60);
        System.out.println(Stack.peek());
    }
}
