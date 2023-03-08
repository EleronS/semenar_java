package org.example.hm1;

public class Ex1b {
    public static void main(String[] args) {
        //Second realization Ex1
        String s = " aaa www eeee ddd ";
        String res = "";
        int start = -1, end = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ' && end == -1) {
                end = i;

        } else if(s.charAt(i) == ' ' && end != -1){
            start = i + 1;
            res = res + s.substring(start, end+1) + " ";
            start = -1;
            end =-1; }if(i == 0 && end != -1)
            {
                res = res + s.substring(i, end+1);
            }
        } System.out.print( res.trim());
    }
}
