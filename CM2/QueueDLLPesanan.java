public class QueueDLLPesanan {
    NodeDLLPesanan head, tail;
    int size;

    public QueueDLLPesanan() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(Pesanan input) {
        NodeDLLPesanan newNode = new NodeDLLPesanan(input);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void sortDLLASC() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
        } else {
            NodeDLLPesanan current = head;
            while (current != null) {
                NodeDLLPesanan index = current.next;
                while (index != null) {
                    if (current.node.namaPesanan.compareToIgnoreCase(index.node.namaPesanan) > 0) {
                        Pesanan temp = current.node;
                        current.node = index.node;
                        index.node = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
        } else {
            sortDLLASC();
            NodeDLLPesanan current = head;
            System.out.println("=================================");
            System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
            System.out.println("=================================");
            System.out.println("Kode Pesanan\tNama Pesanan\tHarga");
            while (current != null) {
                System.out.println(current.node.kodePesanan+ "\t\t" + current.node.namaPesanan + "\t\t" + current.node.harga);
                current = current.next;
            }
            System.out.println();
        }
    }
}
