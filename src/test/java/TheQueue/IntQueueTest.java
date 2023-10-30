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
    void size() {
        IntQueue myQueue = new IntQueue();

        myQueue.enqueue(3);
        myQueue.enqueue(2);
        myQueue.enqueue(1);

        //Test size of Queue
        assertEquals(3, myQueue.size());
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

    @Test
    void testEnqueue() {
        IntQueue myQueue = new IntQueue();

        myQueue.enqueue(3);
        myQueue.enqueue(5);
        myQueue.enqueue(4);
        myQueue.enqueue(2);
        myQueue.enqueue(1);

        assertEquals(5, myQueue.size());

        myQueue.dequeue();
        assertEquals(4, myQueue.size());
    }

    @Test
    void testDequeueFromEmptyQueue() {
        IntQueue myQueue = new IntQueue();

        //Expected output should be a message in the console stating that the queue is empty
        int result = myQueue.dequeue();
        assertEquals(-1, result);
    }

    @Test
    void testSizeWithNegativeValues() {
        IntQueue myIntQueue = new IntQueue();

        myIntQueue.enqueue(-3);
        myIntQueue.enqueue(-1);
        myIntQueue.enqueue(-2);

        myIntQueue.dequeue();

        assertEquals(2, myIntQueue.size());
    }

}