import java.util.Scanner;

class Insertend 
{
    class node
    {
        int data;
        node next;

        node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    node head;

    public void insertatend(int data)
    {
        node n = new node(data);
        if(head == null)
        {
            head = n;
            return;
        }
        else
        {
            node cur = head;
            while(cur.next != null)
            {
                cur=cur.next;
            }
            cur.next=n;
        }   
    }

    public void display()
    {
        node cur = head;
        while (cur !=null)
        {
            System.out.print(cur.data + " ");
            cur=cur.next;
        }
    }

    public static void main(String[] args) 
    {
        Insertend l = new Insertend();
        Scanner sc = new Scanner(System.in);

        l.insertatend(sc.nextInt());
        l.insertatend(sc.nextInt());
        l.insertatend(sc.nextInt());
        l.display();
        sc.close();
        
    }
}
