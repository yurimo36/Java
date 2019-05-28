class FukuriWhile{
  public static void main(String argv[]){
    int year=1;
    double money=100000;

    while(money <= 200000){
      money *= 1.00001;
      System.out.println("year= " + year + " okane= " + money);
      year += 1;
    }
  }
}
