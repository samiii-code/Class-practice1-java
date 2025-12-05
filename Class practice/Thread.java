package practice;
import java.util.*;
//Creating and Executing Threads

//By Extending Thread class
class MyThread extends Thread {
    public void run() {
         //Code that runs in the new thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread by class: " + i);
            try {
                Thread.sleep(500);  //pause for half a second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Thread {
    public static void main(string[] args){
    MyThread k = new MyThread();
    k.start();
    }
}

//Implementing the Runnable interface

Class MyThread implements Runnable{
    public void run(){
        system.out.println("Thread is running");
}
}
public class Main{
public static void main(String[] args){
    Thread t = new Thread(new myThread());
    t.start();
}
}