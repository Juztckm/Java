package com.virtusa.exceptionhandling;


public class ExceptionHandlingMain {

    /**
     * @param args
     */
    public static void main(String[] args){
        // TODO Auto-generated method stub
        
        System.out.println("asdsadsa");
        System.out.printf(args[1] , args[0]);


        int i;
        try{
            i = 10/0;
        }catch(Exception e){
            System.err.println("asdfasd");
        }
        
        System.out.println("asdf'asdfas'fd");
    }

}