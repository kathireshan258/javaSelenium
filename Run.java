package com.handson.quiz;

//class Run extends Fun{
//    void time(){
//        System.out.println("Fun Run"); }
//    public static void main(String[] args) {
//        Fun f1=new Run();
//        f1.time(); }}

//class Trial{
//    public static void main(String[] args){
//        try{
//            System.out.println("Try Block");
//        }
//        finally{
//            System.out.println("Finally Block");
//        }
//    } }

//class Trial{
//    public static void main(String[] args){
//        try{
//            System.out.println("Java is portable");
//        } } }

//private class Run{
//    Run(){
//        int i = 100;
//        System.out.println(i);
//    }
//}

//class Animal {
//    void makeNoise() {System.out.println("generic noise"); }
//}
//class Dog extends Animal {
//    void makeNoise() {System.out.println("bark"); }
//    void playDead() { System.out.println("roll over"); }
//}
//class CastTest2 {
//    public static void main(String [] args) {
//        Animal a = new Dog();
//        a.makeNoise();
//    }
//}

class PropagateException{
    public static void main(String[] args){
        try{
            method();
            System.out.println("method() called");
        }
        catch(ArithmeticException ex){
            System.out.println("Arithmetic Exception");
        }
        catch(RuntimeException re){
            System.out.println("Runtime Exception");
        }}
    static void method(){
        int y = 2 / 0;
    }}