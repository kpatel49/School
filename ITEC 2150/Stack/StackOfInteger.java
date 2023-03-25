package Stack;

public class StackOfInteger {
    private int[] elements;

    private int size;
    public static final int DEFAULT_CAPAITY = 16;

    public StackOfInteger(){
       this(DEFAULT_CAPAITY);

    }

    public StackOfInteger(int length){
        elements = new int[length];
    }

    public void push(int value){
        if(size >= elements.length){
          int[] temp =   new int[elements.length * 2];
          System.arraycopy(elements, 0,temp,0,elements.length);
          elements = temp;
        }
        elements[size++] = value;
    }

    /**
     *
     * @return and remove the top element from the stack.
     */
    public int pop(){
        size = size - 1;
        return elements[size];
    }


    public int peek(){
        return elements[size - 1];
    }

    public boolean empty(){
        if(size == 0){
            return true;
        }
        else return false;
    }

    public int getSize(){
        return size;
    }
}
