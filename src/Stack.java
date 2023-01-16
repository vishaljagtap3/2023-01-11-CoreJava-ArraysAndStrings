public class Stack {
    private int [] arr;
    private int top;
    private int size;

    public Stack() {
        size = 5;
        top = -1;
        arr = new int[size];
    }

    public Stack(int size) {
        this.size = size;
        top = -1;
        arr = new int[size];
    }

    public boolean isFull() {
        /*if(top == (size -1)) {
            return true;
        }
        else {
            return false;
        }*/

        /*if(top == (size - 1) ) {
            return true;
        }
        return false;*/

        return top == (size -1);
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean push(int data) {
        if( isFull() ) {
            return false;
        }

        /*top++;
        arr[top] = data;*/
        arr[++top] = data;

        return true;
    }


}
