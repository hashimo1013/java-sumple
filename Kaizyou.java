class Kaizyou{
  public static void main(String[] args){
    int n,sum;
    n = 7 ;
    sum = 1;
    System.out.println(saiki(n));
  }
  private static int saiki(int num){
    if(num!=1){
      return num* saiki(num-1);
  } else{
    return 1;
  }
  }
}