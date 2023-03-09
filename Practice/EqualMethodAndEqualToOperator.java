package Practice;

class EqualMethodAndEqualToOperator {
    public static void main(String[] args) {
        Object o = new Object();

        String s = "Mohit";
        String s1 = "Mohit";
        String s2 = new String("Mohit");
        String s3 = new String("Mohit");
        System.out.println(s == s1);
        System.out.println(s == s2);
        System.out.println(s2 == s3);
        System.out.println(s.equals(s3));// this .equals method is overidden from string class so this compares the
                                         // value or content of the variable or object so this return true
        System.out.println(s.equals(s1));
        System.out.println(o.equals(s2.equals(s))); // this is .equals method from class Object which compare the
                                                    // refrence/address so output is false.
    }
}