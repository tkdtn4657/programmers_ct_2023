package com.ll.level0.p120829;

public class Main {
    public static void main(String[] args){

    }
}

class Solution {
    public int solution(int angle) {
        if( angle == 90) return 2;
        else if( angle == 180) return 4;
        else if( angle > 90) return 3;

        return 1;

        //        if(0 < angle && angle < 90){
//            return 1;
//        }
//        else if(angle == 90){
//            return 2;
//        }
//        else if(90 < angle && angle < 180){
//            return 3;
//        }
//        else if(angle == 180){
//            return 4;
//        }
//        return -1;
    }
}