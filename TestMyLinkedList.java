public class TestMyLinkedList {
    
    public static void main(String[] args) {
        MyLinkedList<String> linkedList = new MyLinkedList();
        linkedList.add(1, "Da Nang");
        linkedList.add(2, "Sai Gon");
        linkedList.add(3, "Ha Noi");

        linkedList.add(4, "Gia Lai");
        linkedList.add(5, "Thanh Hoa");
        linkedList.add(6, "Ha Tinh");
        System.out.println("Size: " + linkedList.size());

        System.out.println(linkedList.contains("Da Nang"));
        System.out.println(linkedList.indexOf("Da Nang"));
    }
    
}
