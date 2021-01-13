package com.TTS;
import java.util.Arrays;
import static java.lang.Double.valueOf;
import java.util.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        double result = toPower(4, 2);
        System.out.println(result);
    }
        public static double toPower (int size, int power){
           return Math.pow(size, power);
        }
    }
