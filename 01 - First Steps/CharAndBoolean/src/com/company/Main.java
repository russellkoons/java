package com.company;

public class Main {

    public static void main(String[] args) {
	    // char can only be one character
        char myChar = 'D';
        char myUnicode = '\u0044'; // This is D in unicode, backslash + u tells Java it is unicode
        System.out.println(myChar);
        System.out.println(myUnicode);
        char myCopyright = '\u00A9';
        System.out.println(myCopyright);

        boolean myTrueBoolean = true;
        boolean myFalseBoolean = false;

        boolean isCustomerOverTwentyOne = true;
    }
}
