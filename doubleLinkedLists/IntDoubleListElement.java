package doubleLinkedLists;

public class IntDoubleListElement {

    private int info;

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public IntDoubleListElement next;

    public IntDoubleListElement prev;

    public IntDoubleListElement(int startInfo) {
        this.info = startInfo;
        next = null;
        prev = null;
    }
    public boolean isEqual(IntDoubleListElement other){
        return other != null && info == other.info;
    }
}
