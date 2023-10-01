package org.dsa.com.multithreading.problems;

class Numbers extends Thread{
    private int start;
    private int end;

    public Numbers(int start, int end){
        this.start = start;
        this.end = end;
    }

    public void run(){
        for(int i=0; i<=end; i++){
            System.out.println("Thread " + Thread.currentThread().getId() + "; " + i);
        }
        try{
            Thread.sleep((int) (Math.random() * 901) + 100);
        }catch(InterruptedException e){
            System.out.println("Thread Interrupted");
        }
    }
}

public class NumberPrinter {
    public static void main(String[] args) {
        Thread thread1 = new Numbers(1, 5);
        Thread thread2 = new Numbers(6, 10);
        Thread thread3 = new Numbers(11, 15);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
