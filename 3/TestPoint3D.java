public class TestPoint3D{
  public static void main(String args[]){

    Point3D pt1 = new Point3D();
    Point3D pt2 = new Point3D();

    pt1.x = 10;
    pt1.y = 20;
    pt1.z = 30;

    pt2.x = -pt1.x;
    pt2.y = -pt1.y;
    pt2.z = -pt1.z;

    pt1.print();
    pt2.print();

  }

}
