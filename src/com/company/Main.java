package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "10#11#12";
        Character[] a = new Character[27];
        for (int i = 1; i <27 ; i++) {
            a[i] = (char)((int)'a'+i-1);
        }
        char[] schar=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i = s.length()-1; i >=0 ; i--) {
            if (schar[i] == '#') {
                char x = a[(int) ((schar[i - 2]-48)*10 + schar[i - 1]-48)];
                sb.append(x);
                i=i-2;
            } else {
                System.out.println(i+":"+schar[i]+a[schar[i]-48]);
                sb.append(a[schar[i]-48]);
            }
        }
        String aa=sb.toString();
        char[] sschar= aa.toCharArray();

        StringBuilder sb2=new StringBuilder();
        for (int i = sschar.length-1 ;i>=0; i--) {
            sb2.append(sschar[i]);
        }

        String r=sb2.toString();


        System.out.println(sb.toString());
        System.out.println(sb2.toString());

//        for (int i = 0; i <27 ; i++) {
//            System.out.println(i+":"+a[i]);
//        }
//        System.out.printf("a"+(char)98);
    }
}
