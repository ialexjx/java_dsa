package org.dsa.com.multithreading.problems;

class MultithreadingDemo extends Thread{
    public void run(){
        //Displaying the thread that is running
        System.out.println("Thread " + Thread.currentThread().getName() + " is running" + " with the thread id :- " + Thread.currentThread().getId());
    }
}
public class Multithread {
    public static void main(String[] args) {
        int j = 5;
        for(int i=1; i<j; i++){
            MultithreadingDemo demoThread = new MultithreadingDemo();
            demoThread.start();
        }
    }
}
