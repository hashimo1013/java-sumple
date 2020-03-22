class Ex{
  public static void main (String args[]){
    Circle[] c = new Circle[10];
    c[0]=new Circle(1);
    c[1]=new Circle(2);
    c[2]=new Circle(3);
    c[3]=new Circle(4);
    c[4]=new Circle(5);
    c[5]=new Circle(6);
    c[6]=new Circle(7);
    c[7]=new Circle(8);
    c[8]=new Circle(9);
    c[9]=new Circle(10);

    for(int i=0;i<c.length;i++){
      c[i].display();
    }
    Ex xx=new Ex();
    xx.open();
  }
    void open (){
    System.out.println("open");
  }
}