package org.example;

public class RegisterPage {

    public static void main(String[] args){

        String s1 = "automation testing automation java testing";
        //word frequency count
        String[] s2 = s1.split(" ");

        for (int i = 0; i < s2.length; i++) {

            if (s2[i].equals("")) {
                continue;
            }

            //int count = 1;
            for (int j = i+1; j < s2.length; j++) {

                if (s2[i].equals(s2[j])) {
                    //count++;
                    s2[j] = "";
                }
            }

            System.out.println(s2[i]);
        }



    }
}
