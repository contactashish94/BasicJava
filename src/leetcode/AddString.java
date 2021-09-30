package leetcode;

import java.util.Stack;

public class AddString {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String num1 = "11";
        String num2 = "123";

        Character[] ch1 = new Character[num1.length()];
        Character[] ch2 = new Character[num2.length()];

        for(int i = 0 ; i < num1.length();i++){
            ch1[i] = num1.charAt(i);
        }
        for(int i = 0 ; i < num2.length();i++){
            ch2[i] = num2.charAt(i);
        }

        int n1 = num1.length()-1;
        int n2 = num2.length()-1;
        int carry = 0;
        Stack<Integer> st = new Stack();
        while(n1 >= 0 || n2 >= 0){
            if(n1 < 0){
                st.push((((ch2[n2]-48) + carry)%10)+48);
                carry = ((ch2[n2]-48) + carry)/10;
                n2--;
            } else if(n2 < 0){
                st.push((((ch1[n1]-48) + carry)%10)+48);
                carry = ((ch1[n1]-48) + carry)/10;
                n1--;
            } else {
                st.push((((ch1[n1]-48) + (ch2[n2]-48)+carry)%10)+48);
                carry = ((ch1[n1]-48) + (ch2[n2]-48)+carry)/10;

                n1--;
                n2--;
            }
        }
        if(carry>0){
            st.push(carry+48);
        }
        int stackSize = st.size();
        String str = "";
        for (int i = 0 ; i < stackSize; i++) {
            str=str+(st.pop()-48);
        }
        System.out.println(str);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        //return str;
    }
}
