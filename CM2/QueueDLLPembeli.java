public class QueueDLLPembeli {
    NodeDLLPembeli head, tail;
    int size;

    public QueueDLLPembeli() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(Pembeli input) {
        NodeDLLPembeli newNode = new NodeDLLPembeli(input);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public NodeDLLPembeli removeFirst() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
            return null;
        } else {
            NodeDLLPembeli removeNode = head;
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            return removeNode;
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
        } else {
            NodeDLLPembeli current = head;
            int noAntrian = 1;
            System.out.println("=================================");
            System.out.println("Daftar Antrian Pembeli");
            System.out.println("=================================");
            System.out.println("No Antrian\tNama\t\tNo HP");
            while (current != null) {
                System.out.println(noAntrian + "\t\t" + current.node.namaPembeli + "\t\t" + current.node.NoHp);
                noAntrian++;
                current = current.next;
            }
            System.out.println();
        }
    }
}
