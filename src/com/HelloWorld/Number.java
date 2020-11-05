package com.HelloWorld;
import java.util.Scanner;
import java.lang.Math;

public class Number {
    int num;
    public boolean isPrime(int num){
        if(num < 2){
            return false;
        }else{
            for(int i = 2; i <= Math.sqrt(num); i++){
                if(num % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    public void getInfo(){
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

    }
    public static void main(String[] args) {
	// write your code here
        Number n = new Number();
        n.getInfo();
        if(n.isPrime(n.num)){
            System.out.println(n.num + " la so nguyen to");
        }else{
            System.out.println(n.num + " khong la so nguyen to");
        }
    }
}
