public class main 
{
    public static void main(String[] args)
    {
        doublelinkedlist dll = new doublelinkedlist();
        dll.insertbeg(10);
        dll.insertend(20);
        dll.insertatpos(15, 2);
        dll.displayforward();
        dll.displaybackward();
    }
    
}
