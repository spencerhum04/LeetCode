class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int length = s.length();
        int count = 0;
        for(int i = 0; i < length-1; i++) {
            System.out.println(sum);
            if(s.substring(i,i+1).equals("I")) {
                if(s.substring(i+1,i+2).equals("V")) {
                    sum = sum + 4;
                    i = i + 1;
                    count = count + 1;
                }   else if(s.substring(i+1,i+2).equals("X")) {
                    sum = sum + 9;
                    i = i + 1;
                    count = count + 1;
                }   else {
                    sum = sum + 1;
                }
            }
            else if(s.substring(i,i+1).equals("V")) {
                sum = sum + 5;
            }
            else if(s.substring(i,i+1).equals("X")) {
                if(s.substring(i+1,i+2).equals("L")) {
                    sum = sum + 40;
                    i = i + 1;
                    count = count + 1;
                }   else if(s.substring(i+1,i+2).equals("C")) {
                    sum = sum + 90;
                    i = i + 1;
                    count = count + 1;
                }   else {
                    sum = sum + 10;
                }
            }
            else if(s.substring(i,i+1).equals("L")) {
                sum = sum + 50;
            }
            else if(s.substring(i,i+1).equals("C")) {
                if(s.substring(i+1,i+2).equals("D")) {
                    sum = sum + 400;
                    i = i + 1;
                    count = count + 1;
                }   else if(s.substring(i+1,i+2).equals("M")) {
                    sum = sum + 900;
                    i = i + 1;
                    count = count + 1;
                }   else {
                    sum = sum + 100;
                }
            }
            else if(s.substring(i,i+1).equals("D")) {
                sum = sum + 500;
            }
            else if(s.substring(i,i+1).equals("M")) {
                sum = sum + 1000;
            }
            count = count + 1;
        }
        if(count < length) {
            if(s.substring(length-1,length).equals("I")) {
                sum = sum + 1;
            }   else if(s.substring(length-1,length).equals("V")) {
                sum = sum + 5;
            }   else if(s.substring(length-1,length).equals("X")) {
                sum = sum + 10;
            }   else if(s.substring(length-1,length).equals("L")) {
                sum = sum + 50;
            }   else if(s.substring(length-1,length).equals("C")) {
                sum = sum + 100;
            }   else if(s.substring(length-1,length).equals("D")) {
                sum = sum + 500;
            }   else if(s.substring(length-1,length).equals("M")) {
                sum = sum + 1000;
            }
        }
        return sum;
    }
}
