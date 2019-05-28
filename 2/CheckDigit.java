class CheckDigit{
  public static void main(String args[]){
  int cd = 4*9 + 9*8 + 3*7 + 0*6 + 1*5 + 2*4 + 3*3;

  cd = cd % 11;
  cd = cd % 10;

  System.out.println("check digit is: " + cd);
  }
}
