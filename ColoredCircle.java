class ColoredCircle extends Circle{

  public static void main (String args[]){
String color;
  ColoredCircle cc = new ColoredCircle(11,"あka");
  cc.display();
  }
  ColoredCircle(int a,String b){
  super ( a);
  color = b;
  }
  
  void display(){
    super.display();
    System.out.println("色は"+color+"です");
  }
}