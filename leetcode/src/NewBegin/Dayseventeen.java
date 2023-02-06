package NewBegin;

import java.util.ArrayList;
import java.util.List;

public class Dayseventeen {
    public static void main (String[] args) {
        Solution17 s = new Solution17();
        List<String> list = s.letterCombinations("29");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}


class Solution17 {
    public List<String> letterCombinations(String digits) {
        List<String> list= new ArrayList<String>();
        if (digits.equals("")) {
            return list;
        }
        char[] arr = digits.toCharArray();
        switch (arr[0]){
            case '2' :
                list.add("a");
                list.add("b");
                list.add("c");
                break;
            case '3' :
                list.add("d");
                list.add("e");
                list.add("f");
                break;
            case '4' :
                list.add("g");
                list.add("h");
                list.add("i");
                break;
            case '5' :
                list.add("j");
                list.add("k");
                list.add("l");
                break;
            case '6' :
                list.add("m");
                list.add("n");
                list.add("o");
                break;
            case '7' :
                list.add("p");
                list.add("q");
                list.add("r");
                list.add("s");
                break;
            case '8' :
                list.add("t");
                list.add("u");
                list.add("v");
                break;
            case '9' :
                list.add("w");
                list.add("x");
                list.add("y");
                list.add("z");
                break;
        }
        if (arr.length == 1) {
            return list;
        }
        for (int i = 1; i < arr.length; i++) {
            int a = list.size();
            int m = 0;
            int n = 0;
            switch (arr[i]){
                case '2' :
                    char[] arr2 = {'a','b','c'};
                    while (n < a){
                        for (int j = 0; j < arr2.length; j++) {
                            list.add(m,list.get(m)+arr2[j]);
                            m++;
                        }
                        list.remove(m);
                        n++;
                    }
                    break;
                case '3' :
                    char[] arr3 = {'d','e','f'};
                    while (n < a){
                        for (int j = 0; j < arr3.length; j++) {
                            list.add(m,list.get(m)+arr3[j]);
                            m++;
                        }
                        list.remove(m);
                        n++;
                    }
                    break;
                case '4' :
                    char[] arr4 = {'g','h','i'};
                    while (n < a){
                        for (int j = 0; j < arr4.length; j++) {
                            list.add(m,list.get(m)+arr4[j]);
                            m++;
                        }
                        list.remove(m);
                        n++;
                    }
                    break;
                case '5' :
                    char[] arr5 = {'j','k','l'};
                    while (n < a){
                        for (int j = 0; j < arr5.length; j++) {
                            list.add(m,list.get(m)+arr5[j]);
                            m++;
                        }
                        list.remove(m);
                        n++;
                    }
                    break;
                case '6' :
                    char[] arr6 = {'m','n','o'};
                    while (n < a){
                        for (int j = 0; j < arr6.length; j++) {
                            list.add(m,list.get(m)+arr6[j]);
                            m++;
                        }
                        list.remove(m);
                        n++;
                    }
                    break;
                case '7' :
                    char[] arr7 = {'p','q','r','s'};
                    while (n < a){
                        for (int j = 0; j < arr7.length; j++) {
                            list.add(m,list.get(m)+arr7[j]);
                            m++;
                        }
                        list.remove(m);
                        n++;
                    }
                    break;
                case '8' :
                    char[] arr8 = {'t','u','v'};
                    while (n < a){
                        for (int j = 0; j < arr8.length; j++) {
                            list.add(m,list.get(m)+arr8[j]);
                            m++;
                        }
                        list.remove(m);
                        n++;
                    }
                    break;
                case '9' :
                    char[] arr9 = {'w','x','y','z'};
                    while (n < a){
                        for (int j = 0; j < arr9.length; j++) {
                            list.add(m,list.get(m)+arr9[j]);
                            m++;
                        }
                        list.remove(m);
                        n++;
                    }
                    break;
            }
        }
        return list;
    }
}
