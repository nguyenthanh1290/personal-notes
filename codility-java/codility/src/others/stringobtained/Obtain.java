package others.stringobtained;

import java.util.*;

public class Obtain {

    public static void main(String[] args) {
    	Obtain ob = new Obtain();
        System.out.println(ob.solution("abcd", "bacd"));
        System.out.println(ob.solution("", ""));
        System.out.println(ob.solution("a", "a"));
        System.out.println(ob.solution("abcd", "AbCD"));
        System.out.println(ob.solution("0", "odd"));
        System.out.println(ob.solution("nice", "nicer"));
        System.out.println(ob.solution("xx", "xXx"));
        System.out.println(ob.solution("test", "tent"));
        System.out.println(ob.solution("text", "tent"));
        System.out.println(ob.solution("text", "texx"));
        System.out.println(ob.solution("test", "tenk"));
        System.out.println(ob.solution("beans", "banes"));
        System.out.println(ob.solution("beanse", "banese"));
    }
    
    public String solution(String S, String T) {
        Optional<String> identical = identical(S, T);
        if(identical.isPresent()) {
            return identical.get();
        }

        Optional<String> changeable = changeable(S, T);
        if(changeable.isPresent()) {
            return changeable.get();
        }

        Optional<String> movable = movable(S, T);
        if(movable.isPresent()) {
            return movable.get();
        }

        Optional<String> addable = addable(S, T);
        if(addable.isPresent()) {
            return addable.get();
        }

        return "IMPOSSIBLE";
    }

    private Optional<String> addable(String S, String T) {
        int sLength = S.length();
        int tLength = T.length();
        if (sLength + 1 == tLength) {
            if (S.equals(T.substring(0, tLength - 1))) {
                return Optional.of("ADD " + T.charAt(tLength - 1));
            }
        }
        return Optional.empty();
    }

    private Optional<String> changeable(String S, String T) {
        if (S.length() == T.length() && S.length() > 1) {
            int length = S.length();
            for(int i = 0; i < length; i++) {
                String s = S.substring(0, i) + S.substring(i + 1);
                String t = T.substring(0, i) + T.substring(i + 1);
                if (s.equals(t)) {
                    return Optional.of("CHANGE " + S.charAt(i) + " " + T.charAt(i));
                }
            }
        }
        return Optional.empty();
    }

    private Optional<String> identical(String S, String T) {
        return S.equals(T) ? Optional.of("NOTHING") : Optional.empty();
    }

    private Optional<String> movable(String S, String T) {
        if (S.length() == T.length()) {
            int length = S.length();
            for(int i = 0; i < length; i++) {
                char c = S.charAt(i);
                String s = S.substring(0, i) + S.substring(i + 1);
                int tIndex = T.indexOf(c, i + 1);
                while (tIndex >= 0) {
                    String t = T.substring(0, tIndex) + T.substring(tIndex + 1);
                    if (s.equals(t)) {
                        return Optional.of("MOVE " + c);
                    }
                    tIndex = T.indexOf(c, tIndex + 1);
                }
            }
        }
        return Optional.empty();
    }

}
