import uz.pdp.online.queue.User;

import java.util.*;

public class Main {
    public static void main() {
        /*
        1-vazifa
        10 ta natural sondan iborat queue yarating -> done
        elementlarni ekranga chop eting -> done
        birinchi sonni ochirib oxirga 100 snoni qoshing -> done
        elementlarni ekranga chop eting -> done
        */
        var nums = new ArrayDeque<Integer>();
        for (int i = 1; i <= 10; i++) nums.add(i);
        // nums.forEach(System.out::println);
        System.out.println("nums = " + nums);
        System.out.println("nums.poll() = " + nums.poll());
        System.out.println("nums.offer(100) = " + nums.offer(100));
        System.out.println("nums = " + nums);

        /*
        2-vazifa
        Name,Phone fieldlaridan iborat User larni saqlovchi PriorityQueue yaraqting
        elementlarini ekranga chiqaring -> done
        peek() methodingi natijaini
        poll() methodini natijasini chiqaring
        elementlarini ekranga chiqaring
        */
        var user = new PriorityQueue<User>();
        user.add(new User("Abdukarim", "9351232331"));
        user.add(new User("Aly", "9812331131"));
        user.add(new User("Atamjon", "8712331213"));

        user.forEach(System.out::println);

        System.out.println("\nuser.peek() = " + user.peek());
        System.out.println("\nuser.poll() = " + user.poll() + "\n");


        user.forEach(System.out::println);
    }
}

