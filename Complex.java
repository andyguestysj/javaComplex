public class Complex {

  public double real;
  public double imag;

  public Complex()
  {
    real = 0;
    imag = 0;
  }


  public Complex(double r, double i)
  {
    real = r;
    imag = i;
  }

  public double imag()
  {
    return imag;
  }

  public double real()
  { 
    return real;
  }
}