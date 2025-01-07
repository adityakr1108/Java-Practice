import java.util.*;

public class palindromeLinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("C");
        ll.add("B");
        ll.add("A");
        Stack<String> st = new Stack<>();
        
        // Use two pointers to find the middle of the linked list
        Iterator<String> slowIterator = ll.iterator();
        Iterator<String> fastIterator = ll.iterator();
        
        while (fastIterator.hasNext()) {
            st.push(slowIterator.next());
            fastIterator.next();
            if (fastIterator.hasNext()) {
                fastIterator.next();
            } else {
                break;
            }
        }
        
        // If the list size is odd, skip the middle element
        if (ll.size() % 2 != 0 && slowIterator.hasNext()) {
            slowIterator.next(); // Skip the middle element
        }
        
        // Compare the second half of the list with the stack
        while (slowIterator.hasNext()) {
            if (!st.pop().equals(slowIterator.next())) {
                System.out.println("Not a palindrome");
                return;
            }
        }
        
        System.out.println("Is a palindrome");
    }
}