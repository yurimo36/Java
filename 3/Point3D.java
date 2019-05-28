public class Point3D{
  private int x,y,z; //座標

  void set(int newx, int newy, int newz){
    x = newx;
    y = newy;
    z = newz;
  }

  int getx(){return x;}
  int gety(){return y;}
  int getz(){return z;}

  void print(){ //座標を表示
    System.out.println(x + ", " + y + ", " + z);
  }


  public static void main(String args[]){

    Point3D pt1 = new Point3D();
    Point3D pt2 = new Point3D();

    pt1.set(10, 20, 30);//インスタンス変数を設定
    pt2.set(-pt1.getx(), -pt1.gety(), -pt1.getz());

    pt1.print();//インスタンスメソッド呼出
    pt2.print();
  }

}
