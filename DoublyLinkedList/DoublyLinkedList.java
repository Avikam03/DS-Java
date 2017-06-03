package DoublyLinkedList;

class DoublyLinkedList {
    public Node header;
    public Node lastNode;
    public int size;

    public DoublyLinkedList() {
        header = new Node(null);
        lastNode = header;
    }
    
    // Add node in the begining of the list.
    public void prepend(int data){
        Node n = new Node(data);
        if(size == 0){
            header.next = n;
            lastNode = n;
            n.prev = header;
            size++;
        }
        else{
            Node temp = header.next;
            header.next = n;
            n.next = temp;
            n.prev = header;
            size++;
        }
    }
    
    // Add node in the end of the list.
    public void append(int data){
        Node n = new Node(data);
        if(size == 0){
            header.next = n;
            lastNode = n;
            n.prev = header;
            size++;
        }
        else{
            lastNode.next = n;
            n.prev = lastNode;
            lastNode = n;
            size++;
        }
    }
    
    // Delete the first node in the list.
    public void deleteFirst(){
        if(size == 1){
            return;
        }
        else{
            header.next = header.next.next;
        }
    }

    // Delete the last node in the list.
    public void deleteLast(){
        if(size == 0){
            header.next = header.next.next;
            size--;
        }
        else{
            lastNode = lastNode.prev;
            lastNode.next = null;
            size--;
        }
    }
    
    // Insert the node at position=index in the list.
    public void insertAt(int data, int index){
        Node n = new Node(data);
        if(size == 0){
            prepend(data);
        }
        if(index == getSize()){
            append(data);
        }
        else{
            int i=1;
            Node temp = header.next;
            while(i != index-1){
                temp = temp.next;
                i++;
            }
            Node x = temp.next;
            temp.next = n;
            n.next = x;
            n.prev = temp;
            size++;
        }
    }
    
    // Delete the node at position=index in the list.
    public void deleteAt(int index){
        if(size == 0){
            deleteFirst();
        }
        else if(index == getSize()){
            deleteLast();
        }
        else{
            int i=1;
            Node temp = header.next;
            while(i != index-1){
                temp = temp.next;
                i++;
            }
            temp.next = temp.next.next;
            size--;
        }
    }
    
    // Returns the size of the list.
    public int getSize(){
        return size;
    }
    
    // Returns the list.
    public String toString(){
        String string = "";
        Node temp = header.next;
        while(temp != null){
            string = string + temp.data + " ";
            temp = temp.next;
        }
        return string;
    }
        
}
