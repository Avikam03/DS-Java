package DataSructures1;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.insertAt(100, 3);
        System.out.println(list.toString());
        list.deleteAt(3);
        System.out.println(list.toString());
    }
}
