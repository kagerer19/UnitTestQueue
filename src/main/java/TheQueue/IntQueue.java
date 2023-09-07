package TheQueue;

import DoublyLinkedList.DoubleLinkedList;

public class IntQueue {
    public DoubleLinkedList<Integer> queueList;

    public IntQueue() {
        this.queueList = new DoubleLinkedList<>();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void enqueue(int newElement) {
        queueList.add(newElement);
    }

    public int size() {
        return queueList.size();
    }

    public int dequeue() {
        if (!isEmpty()) {
            int poppedElement = queueList.get(0);
            queueList.remove(0);
            return poppedElement;
        } else {
            System.out.println("Error: queue is empty");
            return -1; // Return a default value in case of an empty queue
        }
    }

    public int[] dequeue(int n) {
        int[] poppedElements = new int[n];

        for (int i = 0; i < n; i++) {
            poppedElements[i] = dequeue();
        }
        return poppedElements;
    }

    @Override
    public String toString() {
        return queueList.toString();
    }
}
