import java.util.Scanner;

public class circular_l1 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


        Node head = null;
        Node tail=null;


        public void creation() {
            int data, n, m, p;
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Enter Data::");
                data = sc.nextInt();
                Node new_node = new Node(data);
                if (head == null) {

                    head = new_node;
                    tail=new_node;
                    new_node.next=head;

                } else {

                    new_node.next=head;
                    head=new_node;
                    tail.next=head;



                    }



                System.out.println("Do you want to add more data...If Yess then press 1::");
                n = sc.nextInt();
            } while (n == 1);
        }



        public void traverser(){
            Node temp=head;
            if(head==null){
                System.out.println("Linked list does not exist");
            }
            else{
                do{
                    System.out.println("The current data is::"+temp.data);
                    temp=temp.next;
                } while(temp!=head);
            }

        }

        public static void main(String[] args) {
            circular_l1 l2=new  circular_l1();
            l2.creation();
            l2.traverser();

        }

    }







