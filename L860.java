public class L860 {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int i = 0; i < bills.length; i++){
            if (bills[i] == 5) five++;
            else if (bills[i] == 10) {
                ten++;
                five--;
            }
            else {
                if (ten == 0) five -= 3;
                else {five--;
                    ten--;}
            }
            if (ten < 0 || five < 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        L860 l860 = new L860();
        System.out.println(l860.lemonadeChange(new int []{5,5,10,20,5,5,5,5,5,5,5,5,5,10,5,5,20,5,20,5}));
    }
}
