///**
// * Forward declaration of guess API.
// * @param  num   your guess
// * @return 	     -1 if num is higher than the picked number
// *			      1 if num is lower than the picked number
// *               otherwise return 0
// * int guess(int num);
// */
//
//public class L374  {
//    public int guessNumber(int n) {
//        int l = 0;
//        int r = n;
//        int ans = 0;
//
//        while (true){
//            int m = (l + r) / 2;
//            if (guess(m) == -1) {
//                r = m + 1;
//            }
//            else if (guess(m) == 1) {
//                l = m - 1;
//            }
//            else {
//               ans = m;
//               break;
//            }
//        }
//        return ans;
//    }
//}