public class SinglyLinkedList {
    private LinkNode head;

    private static class LinkNode {
        private int data;
        private LinkNode next;

        public LinkNode(int data){
            this.data = data;
            this.next = null;
        }

    } 
    public void display(){
        LinkNode current = head;
        while (current!=null) {
            System.out.print(current.data+"--> ");
            current=current.next;
        }
        System.out.print("null");
    }
    public void Length_list() {
        int count=0;
        LinkNode current = head;
        while (current!=null) {
            count++;
            current=current.next;
        }
        System.out.println("Length of LinkedList"+count);
    }
    public void insertFirst(int n){
        LinkNode temp = new LinkNode(n);
        temp.next=head;
        head=temp;
    }
    public void insertEnd(int n){
        LinkNode temp = new LinkNode(n);
        if(head==null){
            head=temp;
            return;
        }
        else{
        LinkNode current = head;
        while (current.next!=null) {
            current=current.next;
        }
        current.next=temp;
        }
    }
    public void insertAt(int n,int val){
        LinkNode temp = new LinkNode(val);
        if(val==1){
            temp.next=head;
            head=temp;
        }
        else{
            LinkNode current = head;
            for(int i= 1;i<n-1;i++){
                current=current.next; 
            }
            temp.next=current.next;
            current.next=temp;
        }
    }
    public LinkNode deleteFirst(){
        if(head==null){
            return null;
        }
        LinkNode temp = head;
        head = head.next;
        temp.next=null;
        return temp;
    }
    public LinkNode deleteLast(){
        if(head==null || head.next ==null){
            return null;
        }
        LinkNode current = head;
        LinkNode prev = null;
        while (current.next!=null) {
            prev = current;
            current=current.next;
        }
        prev.next = null;
        return current; 
    }
    public void deleteAt(int n){
        if(n==1){
            head=head.next;
        }else{
        int count=1;
        LinkNode prev = head;
        while(count<n-1){
            prev=prev.next; 
            count++;
        }
    
        LinkNode current= prev.next;
        prev.next=current.next; 
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.head = new LinkNode(10);
        LinkNode second = new LinkNode(1);
        LinkNode third = new LinkNode(8);
        LinkNode forth = new LinkNode(4);
        
        
        sl.head.next=second;
        second.next = third;
        third.next = forth;

        sl.display();
        //sl.Length_list();
        //sl.insertFirst(20);
        //System.out.println();
        //sl.insertAt(2,20);
        //sl.deleteLast();
        sl.deleteAt(2);
        sl.display();

    }
}
