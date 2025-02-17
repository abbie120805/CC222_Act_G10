import java.util.ArrayList;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insert(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        LinkedList linkedList = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter a number: ");
            int num = scanner.nextInt();
            
            System.out.println("Operations:");
            System.out.println("[1] Insert into the Array");
            System.out.println("[2] Insert into the Linked List");
            System.out.print("User Input: ");
            int choice = scanner.nextInt();
            
            if (choice == 1) {
                array.add(num);
                System.out.println("Array after insertion: " + array);
            } else if (choice == 2) {
                linkedList.insert(num);
                System.out.print("Linked List after insertion: ");
                linkedList.display();
            }
            
            System.out.println("Options:");
            System.out.println("[1] Enter new number");
            System.out.println("[2] End");
            int option = scanner.nextInt();
            
            if (option == 2) {
                break;
            }
        }
        scanner.close();
    }
}





