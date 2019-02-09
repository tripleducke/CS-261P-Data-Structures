package hashtables;

public class HashNode {
    public int key;
    public int value;

    public HashNode(int key, int value){
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean equals(Object o){
        return ((HashNode) o).key == this.key;
    }

}
