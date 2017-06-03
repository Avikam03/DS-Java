package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doubly = new DoublyLinkedList();
        doubly.prepend(1);
        doubly.prepend(2);
        doubly.prepend(3);
        doubly.append(4);
        doubly.append(5);
        doubly.append(6);
        doubly.deleteFirst();
        doubly.deleteLast();
        doubly.insertAt(30, 3);
        doubly.deleteAt(3);
        System.out.println(doubly.toString() + "[Size-" + doubly.getSize() + "]");
    }
}
