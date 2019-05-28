public class TestString{
  public static void main(String argv[]){
    try{
      System.out.println(argv[0]);

      int i,x = argv[0].length();
      for(i=1;i<=x;i++){
        System.out.print(argv[0].charAt(x-i));
      }
      System.out.println();
    }

    catch(Exception e){
      System.out.println("Please input a word.");
    }
  }
}
