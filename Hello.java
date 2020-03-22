class Hello{
  public static void main(String args[]){
  int result[]= {0,0,0,0,0,0};
  double a;
  for(int i=0;i<10000;i++){
    a=(int)(Math.random()*6+1);
    if(a< 2){
        result[0]+= 1;
    }else if (2<= a && a < 3){
        result[1]+= 1;
    }else if  (3<= a && a < 4){
        result[2]+= 1;
    }else if (4<= a && a < 5){
        result[3]+= 1;
    }else if (5<= a && a < 6){
        result[4]+= 1;
    } else if (6<= a && a < 7){
        result[5]+= 1;
    };
    }

  for(int i=0;i<result.length;i++){
    System.out.println((i+1)+"のでた回数は"+result[i]+"回、確率は"+result[i]*100/10000+"%");
  }
  System.out.println("試行回数は"+(result[0]+result[1]+result[2]+result[3]+result[4]+result[5]));
}
}