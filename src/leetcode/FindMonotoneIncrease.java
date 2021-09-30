package leetcode;

public class FindMonotoneIncrease {
    public static void main(String[] args) {
        System.out.println(minFlipsMonoIncr("000101100011"));
    }

    static int minFlipsMonoIncr(String s){
        int countOne=0;
        int zto=0;
        int i = 0;
        while (i<s.length() && s.charAt(i)=='0'){
            i++;
        }
        for(;i<s.length();i++){
            char c =s.charAt(i);
            if(c=='0'){
                zto++;
            } else {
                countOne++;
            }
            if(zto>countOne){
                zto=countOne;
            }
        }
        return zto;
    }
}
