public class Queue<Integer> { 
private Stack<Integer> inbox = new Stack<Integer>(); 
private Stack<Integer> outbox = new Stack<Integer>();
public void queue(Integer item) { 
inbox.push(item);
 } 
public E dequeue() {
 if (outbox.isEmpty()) { 
while (!inbox.isEmpty()) {
 outbox.push(inbox.pop()); 
}
 } return outbox.pop(); 
} 
}