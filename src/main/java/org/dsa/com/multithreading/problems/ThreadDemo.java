package org.dsa.com.multithreading.problems;

class ThreadExample extends Thread{
    public void run(){
        for(int i=1; i<6; i++){
            System.out.println("Thread " + i);
            //Sleep for 1 second to simulate some work
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        ThreadExample thread = new ThreadExample();
        // Start the thread
        thread.start();
        for(int i=1; i<=3; i++){
            System.out.println("Main: " + i);
            try{
                //Sleep for 1 second to simulate some work
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Main thread interrupted !!");
            }
        }
    }
}
