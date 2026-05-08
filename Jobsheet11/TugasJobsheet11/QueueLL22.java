package Jobsheet11.TugasJobsheet11;

public class QueueLL22 {
    Node22 head;
    Node22 tail;

    boolean isEmpty() {
        return head == null;
    }

    boolean isFull() {
        return false;
    }

    void clear() {
        head = tail = null;
    }

    void enqueue(Mahasiswa22 input) {
        Node22 ndInput = new Node22(input, null);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    Mahasiswa22 dequeue() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
            return null;
        } else {
            Mahasiswa22 dataOut = head.data;
            head = head.next;
            return dataOut;
        }
    }

    void showHeadTail() {
        if (!isEmpty()) {
            System.out.println("Head: " + head.data.nama);
            System.out.println("Tail: " + tail.data.nama);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    int sizeLL() {
        int count = 0;
        Node22 temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
