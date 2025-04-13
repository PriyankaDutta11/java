import java.util.Scanner;

public class doublydeletion {


        static class Node {
            int data;
            Node next;
            Node prev;

            Node(int data) {
                this.data = data;
                this.next = null;
                Node prev=null;
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

                } else {
                    System.out.println("Enter 1 to insert the item at beginning ,2 to insert the item at the  end,3 to insert the item at specific position");
                    m = sc.nextInt();
                    switch (m) {
                        case 1:
                            new_node.next = head;
                            head = new_node;
                            break;
                        case 2:
                            Node temp = head;
                            while (temp.next != null) {
                                temp = temp.next;
                            }
                            temp.next = new_node;
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

        public void delete() {
            int data, n, m, p;
            Scanner sc = new Scanner(System.in);
            do {
                if (head == null) {
                    System.out.println("LL is empty");
                } else {
                    System.out.println("Enter 1 to delete the item from beginning,2 to delete the item from end,3 to delete  the item from specific position");
                    m = sc.nextInt();
                    switch (m) {
                        case 1:
                            Node temp=head;
                            temp=temp.next;
                            head=temp;
                            head.prev=tail;
                            break;
                        case 2:
                            Node temp1=tail;
                            temp1=temp1.prev;
                            temp1.next=null;
                            break;
                        case 3:
                            System.out.println("Enter position to be deleted");
                            p=sc.nextInt();
                            Node temp2=head;
                            Node ptr2=temp2.next;
                            for(int i=0;i<(p-2);i++){
                                temp2=ptr2;
                                ptr2=ptr2.next;

                            }
                            temp2.next=ptr2.next;
                            ptr2.next.prev=temp2;
                            break;

                    }
                }


                System.out.println("Do you want to delete more data...If yess,press 1");
                n = sc.nextInt();
            }
            while (n == 1);
        }


        public void traverser(){
            Node temp=head;
            if(head==null){
                System.out.println("Linked list does not exist");
            }
            else{
                while(temp!=null){
                    System.out.println("The current data is::"+temp.data);
                    temp=temp.next;
                }
            }

        }

        public static void main(String[] args) {
            doublydeletion l2=new doublydeletion();
            l2.creation();
            l2.delete();
            l2.traverser();

        }

    }







