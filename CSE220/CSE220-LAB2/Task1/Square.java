public class Square{
    
    private double height, width;
    private double area;
    
    void setHeight(double height){
        
        this.height = height;
    }
    
    void setWidth(double height){
        
        this.width = height;
    }
    
    double getHeight(){
        
        return this.height;
    }
    
    double getWidth(){
        
        return this.width;
    }
    
    double getArea(){
        
        this.area = this.height*this.width;
        return area;
    }
}