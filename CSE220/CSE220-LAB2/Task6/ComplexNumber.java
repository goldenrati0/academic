public class ComplexNumber{
    
    private String complexNumber;
    private int realPart;
    private int imgnPart;
    
    ComplexNumber(){
    }
    
    ComplexNumber( String complexNumber ){
        
        parseAll(complexNumber);
        setComplexNumber(complexNumber);
    }
    
    private void parseAll(String complexNumber){
        
        String realPartString = "";
        String imgnPartString = "";
        
        for(int i=0; i<complexNumber.length(); i++){
            
            if(complexNumber.charAt(i) != '+'){
                
                realPartString += complexNumber.charAt(i);
            }else{
                
                break;
            }
        }
        
        realPart = Integer.parseInt(realPartString);
        
        for(int i=0; i<complexNumber.length(); i++){
            
            if(complexNumber.charAt(i) == 'i'){
                
                for(int j=i+1; j<complexNumber.length(); j++){
                    
                    imgnPartString += complexNumber.charAt(j);
                }
                break;
            }
        }
        
        imgnPart = Integer.parseInt(imgnPartString);
    }
    
    /**
     * Returns value of complexNumber
     * @return
     */
    public String getComplexNumber() {
        return complexNumber;
    }
    
    /**
     * Sets new value of complexNumber
     * @param
     */
    public void setComplexNumber(String complexNumber) {
        this.complexNumber = complexNumber;
    }
    
    /**
     * Returns value of realPart
     * @return
     */
    public int getRealPart() {
        return realPart;
    }
    
    /**
     * Sets new value of realPart
     * @param
     */
    public void setRealPart(int realPart) {
        this.realPart = realPart;
    }
    
    /**
     * Returns value of imgnPart
     * @return
     */
    public int getImgnPart() {
        return imgnPart;
    }
    
    /**
     * Sets new value of imgnPart
     * @param
     */
    public void setImgnPart(int imgnPart) {
        this.imgnPart = imgnPart;
    }
    
    public void increaseValue(){
        
        realPart += 2;
        imgnPart += 2;
    }
    
    public void polarRadius(){
    
        System.out.println(Math.sqrt( Math.pow(realPart, 2) + Math.pow(imgnPart,2) ));
    }
    
    public String toString(){
        
        String x = realPart + " + i" + imgnPart;
        return x;
    }
}
