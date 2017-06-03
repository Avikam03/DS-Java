package DataSructures1;

public class LinkedList {
    public Node header;
    public Node lastNode;
    public int size;
    
    public LinkedList(){
        header = new Node(null);
        lastNode = header;
    }
    
    public void prepend(int data){
        Node n = new Node(data);
        if(size == 0){
            header.next = n;
            lastNode = n;
            size++;
        }
        else{
            Node temp = header.next;
            header.next = n;
            n.next = temp;
            size++;
        }
    }
    
    public void append(int data){
        Node n = new Node(data);
        if(size == 0){
            header.next = n;
            lastNode = n;
            size++;
        }
        else{
            lastNode.next = n;
            lastNode = n;
            size++;
        }
    }
    
    public void removeFirst(){
        if(size != 0){
            header.next = header.next.next;
            size--;
        }
    }
    
    public void removeLast(){
        if(size != 0){
            Node n = header.next;
            while(n.next != lastNode){
                n = n.next;
            }
            n.next = null;
            size--;
        }
    }
    
    public void insertAt(int data, int index){
        if(index == 1){
            prepend(data);
        }
        else if(index == size){
            append(data);
        }
        else if(index > size || index <= 0){
            return;        
        }
        else{
            int i = 1;
            Node n = new Node(data);
            Node x = header.next;
            while(i != index-1){
                x = x.next;
                i++;
            }
            Node temp = x.next;
            x.next = n;
            n.next = temp;
            size++;
        }
    }
    
    public void deleteAt(int index){
        int i = 1;
        Node x = header.next;
        while(i != index-1){
            x = x.next;
            i++;
        }
        x.next = x.next.next;
        size--;
    }
    
    public int getSize(){
        return size;
    }
    
    public String toString(){
        Node n = header.next;
        String temp = "";
        while(n!=null){
            temp = temp + n.data + " ";
            n = n.next;
        }
        return temp;
    }
}
