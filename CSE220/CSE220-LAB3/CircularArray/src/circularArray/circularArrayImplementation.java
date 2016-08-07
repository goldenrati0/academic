/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularArray;

/**
 *
 * @author tahmid
 */
public class circularArrayImplementation {

    private int start;
    private int size;
    private Object[] cir;

    /*
     * if Object [] lin = {10, 20, 30, 40, null}
     * then, CircularArray(lin, 2, 4) will generate
     * Object [] cir = {40, null, 10, 20, 30}
     */
    public circularArrayImplementation(Object[] lin, int st, int sz) {
        
        this.cir = new Object[lin.length];
        this.size = sz;
        this.start = st;
        
        int tempIndexManager = st;
        
        for(int i=0; i<sz; i++){
            
            this.cir[tempIndexManager%this.cir.length] = lin[i];
            tempIndexManager++;
        }
    }

    //Prints from index --> 0 to cir.length-1
    public void printFullLinear() {
        
        for(int i=0; i<this.cir.length; i++){
            
            System.out.print(this.cir[i] + ", ");
        }
        
        System.out.println();
    }

    // Starts Printing from index start. Prints a total of size elements
    public void printForward() {
        
        int tempIndexManager = this.start;
        
        for(int i=0; i<this.size; i++){
            
            System.out.print(this.cir[tempIndexManager%this.cir.length] + ", ");
            tempIndexManager++;
        }
        
        System.out.println();
    }

    public void printBackward() {
        
        int lastIndex = (this.start + this.size - 1)%this.cir.length;
        
        int tempIndexManager = lastIndex;
        
        for(int i=0; i<this.size; i++){
            
            if(tempIndexManager == -1){
                tempIndexManager = this.cir.length-1;
            }
            
            System.out.print(this.cir[tempIndexManager] + ", ");
            tempIndexManager--;
        }
        
        System.out.println();
    }

    // With no null cells
    public void linearize() {
        
        Object temp[] = new Object[this.size];
        
        int tempIndexManager = this.start;
        
        for(int i=0; i<this.size; i++){
            
            temp[i] = this.cir[tempIndexManager%this.cir.length];
            tempIndexManager++;
        }
        
        this.cir = temp;
    }

    // Do not change the Start index
    public void resizeStartUnchanged(int newcapacity) {
        
        Object[] temp = new Object[newcapacity];
        
        int tempIndexManager = this.start;
        
        for(int i=0; i<this.cir.length; i++){
            
            temp[tempIndexManager] = this.cir[tempIndexManager%this.cir.length];
            tempIndexManager++;
        }
        
        this.cir = temp;
    }

    // Start index becomes zero
    public void resizeByLinearize(int newcapacity) {
        
        Object[] temp = new Object[newcapacity];
        
        int tempIndexManager = this.start;
        
        for(int i=0; i<this.cir.length; i++){
            
            temp[i] = this.cir[tempIndexManager%this.cir.length];
            tempIndexManager++;
        }
        
        this.cir = temp;
    }

    /* pos --> position relative to start. Valid range of pos--> 0 to size.
     * Increase array length by 3 if size==cir.length
     * use resizeStartUnchanged() for resizing.
     */
    public void insertByRightShift(Object elem, int pos) {

        if (pos < 0 || pos >= this.size) {
            System.out.println("Invalid position to insert");
        } else {

            if (this.size == this.cir.length) {
                this.resizeStartUnchanged(size + 3);
            }
            
            int position = pos + this.start;
            int tempIndexManager = this.start + this.size - 1;
            
            for(int i=0; i<position; i++){
                
                this.cir[(tempIndexManager+1)%this.cir.length] = this.cir[(tempIndexManager)%this.cir.length];
                tempIndexManager--;
            }
            
            this.cir[position] = elem;
            this.size++;
        }
    }

    public void insertByLeftShift(Object elem, int pos) {
        
        if (pos < 0 || pos >= this.size) {
            System.out.println("Invalid position to insert");
        } else {

            if (this.size == this.cir.length) {
                this.resizeStartUnchanged(this.size + 3);
            }
            
            int position = pos + this.start;
            int tempIndexManager = this.start;
            
            for(int i=0; i<position; i++){
                
                this.cir[(tempIndexManager-1)%this.cir.length] = this.cir[tempIndexManager%this.cir.length];
                tempIndexManager++;
            }
            
            this.cir[position] = elem;
            this.size++;
            this.start--;
            
            if(this.start<0){
                this.start = this.cir.length-1;
            }
        }
    }

    /* parameter--> pos. pos --> position relative to start.
     * Valid range of pos--> 0 to size-1
     */
    public void removeByLeftShift(int pos) {
        
        if(pos<0 || pos>=this.size){
            System.out.println("Invalid index to remove");
        }else{
            
            int tempIndexManager = this.start + pos;
            
            for(int i=pos; i<this.cir.length; i++){
                
                this.cir[(tempIndexManager)%this.cir.length] = this.cir[(tempIndexManager+1)%this.cir.length];
                tempIndexManager++;
            }
            
            this.cir[(this.start-1)%this.cir.length] = null;
            this.size--;
            
        }
    }

    /* parameter--> pos. pos --> position relative to start.
     * Valid range of pos--> 0 to size-1
     */
    public void removeByRightShift(int pos) {
        //TO DO
    }
}