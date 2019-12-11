package Queues;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        ArrayDeque<String> children=new ArrayDeque<>();
        String[] line=scanner.nextLine().split(" ");
        int number=Integer.parseInt(scanner.nextLine());
        Collections.addAll(children, line);
        while (children.size()>1){
            for (int i=1;i<number;i++){
                String child=children.remove();
                children.offer(child);
            }
            String name=children.remove();
            System.out.println("Removed "+name);
        }
        String name=children.remove();
        System.out.println("Last is "+name);
    }
}
