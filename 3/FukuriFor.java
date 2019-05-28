class FukuriFor{
  public static void main(String argv[]){
    int year=1;
    double money=100000;

    for(year=1;money<=200000;year++){
      money *= 1.00001;
      System.out.println("year= " + year + " okane= " + money);
    }
  }
}
