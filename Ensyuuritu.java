class Ensyuuritu{
  public static void main(String[] args){
    
    double x,y,en;
    int result[] = {0,0};

    for (int i=0;i<1000000;i++){
      x = (Math.random()*50);
      y = (Math.random()*50);
      if (x*x+y*y <= 50*50){
        result[0] += 1;  //中
      } else {
        result[1] += 1; //外
      }
    }
    en = 4.0*result[0]/(result[0]+result[1]);
    System.out.println(result[0]);
    System.out.println(result[1]);
    System.out.println("円周率は"+en+"！ジャジャーン!!");
  }
}