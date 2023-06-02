package DSA;

public class Mystack {
    private boolean isEmpty = true;
    public Mystack(int SizeOfStack) {

    }

    public boolean isEmpty() {
        return isEmpty;
    }
    public void push(){
        isEmpty = false;
    }
}


