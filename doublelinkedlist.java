public class doublelinkedlist 
{

    node head;

    public void insertbeg(int data)
    {
        node n = new node(data);
        if(head == null)
        {
            head = n;
        }
        else{
            head.prev = n;
            n.next= head;
            head = n;
        }
    }

    public void insertend(int data)
    {
        node n = new node(data);
        if(head ==null)
        {
            head =n;
        }
        else{
            node cur=head;
            while(cur.next!= null)
            {
                cur=cur.next;
            } 
            cur.next = n;
            n.prev = cur;
        }

    }


    public void insertatpos(int data, int pos)
    {
        node n = new node(data);
        if(pos == 1)
        {
            insertbeg(data);
        }
        else
        {
            node cur=head;
            for(int i=1; i<pos-1 && cur!=null; i++)
            {
                cur = cur.next;
            }
            if(cur == null)
            {
                System.out.println("Position out of bounds");
            }
            else
            {
                n.next=cur.next;
                n.prev=cur;
                cur.next = n;
                n.next.prev=n;
            }

        }

    }

    public void displayforward()
    {
        node cur = head;
        while(cur!=null)
        {
            System.out.print(cur.data + " ");
            cur=cur.next;
        }
    }

    public void displaybackward()
    {
        node cur = head;
        node a = null;
        while(cur!=null)
        {
            a=cur;
            cur=cur.next;
        }
        while(a!=head)
        {
            System.out.print(a.data + " ");
            a=a.prev;
        }
    }

}  

