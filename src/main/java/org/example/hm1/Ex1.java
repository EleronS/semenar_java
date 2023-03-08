package org.example.hm1;

public class Ex1 {
    public static void main(String[] args) {
        //Учитывая входную строку s, измените порядок слов на противоположный .
        //Вам нужно сократить несколько пробелов между двумя словами до одного пробела в
        // перевернутой строке.Ваша перевернутая строка не должна содержать начальных или
        // конечных пробелов.
        String str = " aaa www   eee ddd  ".trim();
        System.out.println(str);

        String res = "".trim();
        if(str.length() % 2 != 0) {
            res = str.substring(str.length() / 2+1) + str.substring( str.length() / 2,str.length() / 2+1) + str.substring(0, str.length() / 2);

        }
        else{
            res= str.substring(0, str.length() / 2) + str.substring(0, str.length() / 2);

        }System.out.println(res.trim());
    }
}
