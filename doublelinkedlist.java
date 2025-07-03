public class doublelinkedlist 
{
    class node
    {
        int data;
        node next;
        node prev;

        node(int data)
        {
            this.data =  data;
            next = null;
            prev = null;
        }
    }

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

    public void display()
    {
        node cur = head;
        while(cur!=null)
        {
            System.out.print(cur.data + " ");
            cur=cur.next;
        }
    }


    public static void main(String[] args) 
    {
        doublelinkedlist dll = new doublelinkedlist();
        dll.insertbeg(10);
        dll.insertbeg(20);
        dll.insertend(30);
        dll.insertend(40);
        dll.display(); // Output: 20 10 30 40
    }

}  

