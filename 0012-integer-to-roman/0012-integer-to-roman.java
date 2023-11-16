class Solution {
    public String intToRoman(int num) {
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        tm.put(1,"I");
        tm.put(5,"V");
        tm.put(10,"X");
        tm.put(50,"L");
        tm.put(100,"C");
        tm.put(500,"D");
        tm.put(1000,"M");
        tm.put(4,"IV");
        tm.put(9,"IX");
        tm.put(40,"XL");
        tm.put(90,"XC");
        tm.put(400,"CD");
        tm.put(900,"CM");
        
        StringBuilder romanNumeral = new StringBuilder("");
        while(num > 0){
            int nearestNum = tm.floorKey(num);
            romanNumeral.append(tm.get(nearestNum));
            num = num - nearestNum;
        }
        
        return romanNumeral.toString();
        
    }

        
    }