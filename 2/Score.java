public class Score {
	public static void main (String argv[]) {
		int i,a;
    char grade;

		for(i=0;i<10;i++) {
			a=(int)(Math.random() * 100);

      if(a>=80){
        grade = 'A';
      }
      else if(a>=60 && a<80){
        grade = 'B';
      }
      else if(a>=40 && a<60){
        grade = 'C';
      }
      else{
        grade = 'D';
      }
			System.out.print(a + " ");
			System.out.println(grade);
		}
	}
}
