public class Kata {

  public static int makeNegative(final int x) {
    
    return (x <= 0) ? x : ~x + 1;
    
  }
  
}

//other solution
//
//public class Kata {
//
//  public static int makeNegative(final int x) {
//   
//    if (x <= 0){
//      return x;
//    } else {
//      return -1 * x;
//    }
//  
//  }
//  
//}
