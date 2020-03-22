class Circle{
  protected int radius =0;
  void display(){
  System.out.println("半径"+radius+"の円です");
  }
  Circle(){
  }
  Circle(int a){
    if(a<0)a=0;
    radius =a;
  }
}