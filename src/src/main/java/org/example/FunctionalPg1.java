package org.example;

import java.util.function.Function;

public class FunctionalPg1 {
    protected static class MyMath{
        public static Integer triple(Integer x){
            return x*3;
        }
    }

    public static void main(String[] args){

        //Function interface is Generic with 2 types , first type is the type of the argument function accepts,
        //second argument is the type of return value of the function

     Function<Integer, Integer> myTriple = MyMath::triple;
        Integer result = myTriple.apply(5);
        System.out.println(result);
    }
}
