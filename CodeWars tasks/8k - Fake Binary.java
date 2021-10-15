public class FakeBinary {
    public static String fakeBin(String numberString) {
      
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    
    }
}


//other solution
//
//public class FakeBinary {
//    public static String fakeBin(String numberString) {
//        String res = "";
//        for (int i = 0; i < numberString.length(); i++) {
//            if (numberString.charAt(i) < '5') {
//                res += '0';
//            } else {
//                res += '1';
//            }
//        }
//        return res;
//    }
//}
