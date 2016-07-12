/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraystack;

/**
 *
 * @author BUCC MSP
 */
public class ArrayStack implements Stack {

    int size;
    int top;
    Object[] data;

    public ArrayStack() {
        size = 0;
        top = -1;
        data = new Object[10];
    }


    @Override
    public int size() {
        return size;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @param e
     * @throws StackOverflowException
     */
    @Override
    public void push(Object e) throws StackOverflowException {
        if (size == data.length) {
            throw new StackOverflowException("overflow");
        } else {
            top++;
            data[top] = e;
            size++;
        }
    }

    @Override
    public Object pop() throws StackUnderflowException {
        if (size == 0) {
            throw new StackUnderflowException("underflow");
        } else {
            Object val = data[top];
            data[top] = null;
            top--;
            size--;
            return val;
        }
    }

    /**
     *
     * @return
     * @throws StackUnderflowException
     */
    @Override
    public Object peek() throws StackUnderflowException {
        if (top >= 0) {
            Object val = data[top];
            return val;
        } else {
            throw new StackUnderflowException("underflow");
        }
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String s = "";
        for (int i = size - 1; i >= 0; i--) {
            s = s + data[i] + " ";
        }
        return "[ " + s + " ]";
    }

    /**
     *
     * @return
     */
    @Override
    public Object[] toArray() {
        Object[] a = new Object[size];
        int c = 0;
        for (int i = size - 1; i >= 0; i--) {
            a[c] = data[i];
            c++;
        }
        return a;
    }

    /**
     *
     * @param e
     * @return
     */
    @Override
    public int search(Object e) {
        for(int i=top; i>=0; i--){
            
            if(data[i].equals(e)){
                return top-i;
            }
        }
        
        return -1;
    }

}
