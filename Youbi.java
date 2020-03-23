class Youbi{
  public static void main(String[] args){
    String youbi[];
    int n = 6;
    System.out.println(keisan(n));
  }
  private static int keisan(int num){
    if(num==6||num==7){
      return keisan(num+1);
    }else{
      return num;
    }
  }
}