public class NodeDLLPembeli {
    Pembeli node;
    NodeDLLPembeli next, prev;
    int antrian = 0;

    public NodeDLLPembeli() {
    }

    public NodeDLLPembeli(Pembeli node) {
        this.node = node;
        this.next = null;
        this.prev = null;
    }

    public boolean isEmpty() {
        return node == null;
    }
}
