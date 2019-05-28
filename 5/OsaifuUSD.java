public class OsaifuUSD extends Osaifu{

  public void inUSD(int dollar){
    super.in(dollar * 114);
  }

  public int outUSD(int dollar){
    return super.out(dollar);
  }

  void print(){
    super.print();
    System.out.println("( " + okane/114 + " usd )");
  }



public static void main(String argv[]) {
  	OsaifuUSD saifu1= new OsaifuUSD();
  	OsaifuUSD saifu2=new OsaifuUSD();

  	saifu1.in(1000);
  	saifu2.inUSD(5);

  	saifu1.print();
  	saifu2.print();

  	saifu2.inUSD(saifu1.outUSD(2));

  	saifu1.print();
  	saifu2.print();
  }

}
