public class Point2D{
  private int x,y; //座標

  void set(int newx, int newy){
    x = newx;
    y = newy;
  }

  int getx(){return x;}
  int gety(){return y;}

  void print(){ //座標を表示
    System.out.println(x + ", " + y);
  }

  double distance(int px, int py){
    int dx = px - this.x;
    int dy = py - this.y;
    return Math.sqrt(dx*dx + dy*dy);
    }

  double distance(Point2D pt){
    return this.distance(pt.getx(),pt.gety());
  }

  public static void main(String args[]){

    Point2D pt1 = new Point2D();
    Point2D pt2 = new Point2D();

    pt1.set(10, 20);//インスタンス変数を設定
    pt2.set(-pt1.getx(), -pt1.gety());

    pt1.print();//インスタンスメソッド呼出
    pt2.print();

    System.out.println(pt1.distance(pt2));
  }

}
