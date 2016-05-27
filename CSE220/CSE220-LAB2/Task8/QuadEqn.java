public class QuadEqn{
    
    private int a;
    private int b;
    private int c;
    
    QuadEqn(int a, int b, int c){
        
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    /**
     * Returns value of a
     * @return
     */
    public int getA() {
        return a;
    }
    
    /**
     * Sets new value of a
     * @param
     */
    public void setA(int a) {
        this.a = a;
    }
    
    /**
     * Returns value of b
     * @return
     */
    public int getB() {
        return b;
    }
    
    /**
     * Sets new value of b
     * @param
     */
    public void setB(int b) {
        this.b = b;
    }
    
    /**
     * Returns value of c
     * @return
     */
    public int getC() {
        return c;
    }
    
    /**
     * Sets new value of c
     * @param
     */
    public void setC(int c) {
        this.c = c;
    }
    
    public void firstRoot(){
        
        double firstRoot = ( ( -b + Math.sqrt( Math.pow(b, 2) - 4*a*c)) / 2*a );
        
        System.out.println("First Root: " + firstRoot);
    }
    
    public String equation(){
        
        if(a==1){
            
            return "" + "x^2 " + b + "x " + c;
        }else{
            
            return a + "x^2 " + b + "x " + c;
        }
    }
}