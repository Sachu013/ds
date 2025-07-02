
import java.util.Scanner;
public class Insertbeg 
{
    class node {
        int data;
        node next;

        node(int data)
        {
            this.data = data;
            next = null;
        }

        node head;


        public void insertAtBeginning(int data)
        {

            node n = new node(data);
            n.next=head;
            head=n;
        }

        public void display()
        {
            node cur = head;
            while(cur!=null)
            {
                System.out.print(cur.data+" ");
                cur=cur.next;
            }
        }
    
}

public static void main(String[] args)
{
    Insertbeg l = new Insertbeg();
    Scanner sc = new Scanner(System.in);
    l.insertAtBeginning(sc.nextInt());
    l.insertAtBeginning(sc.nextInt());
    l.insertAtBeginning(sc.nextInt());
    l.display();
    sc.close();
}
