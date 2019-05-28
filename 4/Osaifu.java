public class Osaifu{
  private int okane;

  Osaifu(){
    okane = 0;
  }

  Osaifu(int x){
    okane = x;
  }

  void in(int kane){
    okane += kane;
  }

  int out(int kane){

    if(kane>okane){
      kane = okane;
      okane = 0;
    }

    else
      okane -= kane;

      return kane;
  }

  void print(){
    System.out.println("okane = " + okane + " yen");
  }

  public static void main(String argv[]) {
		Osaifu saifu1 = new Osaifu(1000);
		Osaifu saifu2 = new Osaifu(500);

		//saifu1.in(1000);
		//saifu2.in(500);

		saifu1.print();
		saifu2.print();

		saifu2.in(saifu1.out(200));

		saifu1.print();
		saifu2.print();
	}
}
