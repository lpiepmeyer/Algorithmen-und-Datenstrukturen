package de.hfu.ad.chapter06;


public class Main {
    public static void main(String[] args) {
        System.out.println("starting...");

        NumberContainer container=new NumberContainer(3);
         for(int i=0; i<3; i++){
            container.add(i);
        }
        System.out.println(container.add(23));
        System.out.println(container.remove(1));
        System.out.println(container.contains(2));
        System.out.println(container.contains(23));
        System.out.println(container.size());

        System.out.println("terminating...");
    }
}
