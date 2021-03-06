package implementation.MyHeap;

/**
 * A heap object implementation that lets any object work with my heap
 * @param <T>
 */
public final class HeapNodeAny<T> extends IHeapNode {
    private T item;
    public HeapNodeAny(T item) throws NullPointerException{
        if(item == null){
            throw new NullPointerException("Parent node expect non null values");
        }
        this.item = item;
    }

    public T getItem(){
        return item;
    }

    @Override
    protected void onUpdatePriority(double priority) { }

    @Override
    protected void onUpdateIndex(int index) { }
}
