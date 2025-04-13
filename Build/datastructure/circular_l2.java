import java.util.Scanner;

public class circular_l2 {

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
                tail = new_node;
                new_node.next = head;

            } else {

                System.out.println("Enter 1 to insert the item at begining ,2 to insert the item at the  end,3 to insert the item at specific position");
                m = sc.nextInt();
                switch (m) {
                    case 1:
                        new_node.next = head;
                        head = new_node;
                        tail.next = head;
                        break;
                    case 2:
                        tail.next = new_node;
                        tail = new_node;
                        new_node.next = head;
                        break;

                    case 3:
                        System.out.println("Enter position of node to be inserted");
                        p = sc.nextInt();
                        Node temp1 = head;
                        for (int i = 0; i < (p - 1); i++) {
                            temp1 = temp1.next;
                        }
                        new_node.next = temp1.next;
                        temp1.next = new_node;
                        break;


                }
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
        circular_l2 l2=new  circular_l2();
        l2.creation();
        l2.traverser();

    }

}








