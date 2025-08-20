public class DoublyLinkedList {
    public static void main(String[] var0) {
      System.out.println("Doubly Linked List Implementation");
      Node list = new Node();
      list.addNode(10);
      list.addNode(20);
      list.addNode(30);
      list.display();
   }
    // Source code is decompiled from a .class file using FernFlower decompiler.
static class Node {
   int data;
   Node head;
   Node next;
   Node prev;

   Node() {
      this.data = 0;
      this.head = null;
      this.next = null;
      this.prev = null;
   }

   Node(int data) {
      this.data = data;
      this.head = null;
      this.next = null;
      this.prev = null;
   }

   public void addNode(int data) {
      Node newNode = new Node(data);
      if (this.head == null) {
         this.head = newNode;
         this.head.prev = null;
         this.head.next = null;
      } else {
         Node current= head;
         while(current.next != null) {
            current = current.next;
         }

         current.next = newNode;
         newNode.prev = current;
      }
   }

   public void display() {
      Node current = this.head;
      if (current == null) {
         System.out.println("List is empty");
         return;
      }

      System.out.print("Doubly Linked List: ");
      while (current != null) {
         System.out.print(current.data + " ");
         current = current.next;
      }
      System.out.println();

   }
}

}
