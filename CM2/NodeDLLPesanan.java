public class NodeDLLPesanan {
    Pesanan node;
    NodeDLLPesanan next, prev;

    public NodeDLLPesanan() {
    }

    public NodeDLLPesanan(Pesanan node) {
        this.node = node;
        this.next = null;
        this.prev = null;
    }
}