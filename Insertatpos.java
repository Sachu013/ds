import java.util.*;

class Insertatpos
{
    class node
    {
        int data;
        node next;

        node(int data)
        {
            this.data=data;;
            next=null;
        }
    }
    node head;

    public void insertatpos(int data, int pos)
    {
        node n = new node(data);
        if (pos == 1) 
        {
            n.next=head;
            head=n;
        }
        else
        {
            node cur= head;
            for(int i=1;i<pos-1 && cur!=null;i++)
            {
                cur=cur.next;
            }
            n.next=cur.next;
            cur.next=n;

        }
    }

    public void display()
    {
        node cur = head;
        while (cur != null) 
        {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }

    public static void main(String[] args)
    {
        Insertatpos list = new Insertatpos();
        Scanner sc = new Scanner(System.in);
        list.insertatpos(10, 1);
        list.insertatpos(20, 1);
        list.insertatpos(30, 2);
        list.display();
        sc.close();
    }
}