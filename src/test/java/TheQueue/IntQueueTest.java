package TheQueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntQueueTest {

    @Test
    void isEmpty() {
        IntQueue myQueue = new IntQueue();

        //Test when size is 0
        assertTrue(myQueue.isEmpty());

        //Test if size is not 0
        myQueue.enqueue(5);
        assertFalse(myQueue.isEmpty());
    }

    @Test
    void enqueue() {
        IntQueue myQueue = new IntQueue();

        //Test if new element was added to the end of the queue
        myQueue.enqueue(5);
        myQueue.enqueue(4);
        myQueue.enqueue(3);
        assertEquals(3, myQueue.queueList.get(myQueue.size() - 1));
    }

    @Test
    void size() {
        IntQueue myQueue = new IntQueue();

        myQueue.enqueue(3);
        myQueue.enqueue(2);
        myQueue.enqueue(1);

        //Test size of Queue
        assertEquals(3, myQueue.size());
    }

    @Test
    void dequeue() {
        IntQueue myQueue = new IntQueue();

        myQueue.enqueue(3);
        myQueue.enqueue(2);
        myQueue.enqueue(1);

        myQueue.dequeue();
        assertEquals(2, myQueue.queueList.get(0));
    }

    @Test
    void testDequeue() {
        IntQueue myQueue = new IntQueue();

        myQueue.enqueue(5);
        myQueue.enqueue(4);
        myQueue.enqueue(3);
        myQueue.enqueue(2);
        myQueue.enqueue(1);

        myQueue.dequeue(3);
        assertEquals(2, myQueue.size());

        //Check if the queue was modified
        assertEquals(2, myQueue.queueList.get(0));
        assertEquals(1, myQueue.queueList.get(1));
    }
}