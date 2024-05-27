public class LinkedList {
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
            LinkNode current = head;
            for(int i= 0;i<n-1;i++){
                current=current.next; 
            }
            temp.next=current.next;
            current.next=temp;
        }
        public static void main(String[] args) {
            LinkedList sl = new LinkedList();
            sl.head = new LinkNode(10);
            LinkNode second = new LinkNode(1);
            LinkNode third = new LinkNode(8);
            LinkNode forth = new LinkNode(4);
            
            
            sl.head.next=second;
            second.next = third;
            third.next = forth;
    
            sl.display();
            //sl.insertFirst(20);
            System.out.println();
            sl.insertEnd(20);
            sl.display();
            
    
        }
    }
    

