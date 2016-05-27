public class ComplexNumber extends RealNumber {


  private double realPart;
  private double imgnPart;

	/**
	* Default empty ComplexNumber constructor
	*/
	public ComplexNumber() {

    realPart = 1.0;
    imgnPart = 1.0;
	}

  public ComplexNumber(double realPart, double imgnPart){
    this.realPart = realPart;
    this.imgnPart = imgnPart;
  }

  public void check(){

    System.out.println("I'm in ComplexNumber class");
    super.ping();
    System.out.println("Checking ended");
  }

  @Override
  public String toString(){

    String x = "RealPart: " + realPart + "\nImaginaryPart: " + imgnPart;

    return x;
  }

}
