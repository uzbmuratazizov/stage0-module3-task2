package lang.print.gaps.task2;

public class advancedNamingConvention {
    private static final int adult_age = 18;
    private int AGE=adult_age;
    private int phoneNumber=151565889;

    static void CallToFriend() {
        System.out.println("Calling Friend!");
    }

    static void callByNumber(int Number) {
        System.out.println("Calling to " + Number);
    }

    public static void main (String[] args) {
        CallToFriend();
        callByNumber(2345678);
    }
}
