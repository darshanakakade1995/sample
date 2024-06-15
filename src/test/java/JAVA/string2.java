package JAVA;

public class String2 {

    public static void main(String args[]) {
//##########################################################3
        // using length and chatat method
        String s = "welcome";
        String r = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println(s.charAt(i));
            r = r + s.charAt(i);
        }
        System.out.println("1st approch:" + r);

        // without using chart at method
        String rr = "";
        char a[] = s.toCharArray();
        for (int i = s.length() - 1; i >= 0; i--) {
            rr = rr + a[i];
        }
        System.out.println("2nd approch:" + rr);
    }
}
