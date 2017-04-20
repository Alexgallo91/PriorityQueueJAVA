package pruebapriorityqueue;

import java.util.PriorityQueue;

public class PruebaPriorityQueue {

    public static void main(String[] args) {
        
        PriorityQueue<Double> cola = new PriorityQueue<Double>();
        
        cola.offer(3.4);
        cola.offer(9.8);
        cola.offer(5.4);
        
        System.out.print("Sondeando de cola: ");
        
        while(cola.size() > 0)
        {
            System.out.printf("%.1f ", cola.peek());
            cola.poll();//elimna el elemento superior
        }
    }
}
