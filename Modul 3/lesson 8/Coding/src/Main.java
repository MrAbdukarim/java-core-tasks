import uz.pdp.online.task.two.Role;
import uz.pdp.online.task.two.User;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Main {
    public static void main(String[] args) {
        User originalUser1 = new User("Jakhongir", "+9998883383", Role.FATHER);
        User originalUser2 = new User("Malika", "+9997772299", Role.MOTHER);
        User originalUser3 = new User("Alisher", "+9995556677", Role.CHILD);

        List<User> shallowCopies = new ArrayList<>();
        List<User> deepCopies = new ArrayList<>();

        shallowCopies.add(originalUser1.shallowCopy());
        shallowCopies.add(originalUser2.shallowCopy());
        shallowCopies.add(originalUser3.shallowCopy());

        deepCopies.add(originalUser1.deepCopy());
        deepCopies.add(originalUser2.deepCopy());
        deepCopies.add(originalUser3.deepCopy());

        System.out.println("--- Shallow Copies ---");
        ListIterator<User> shallowIterator = shallowCopies.listIterator();

        System.out.println("Forward iteration:");
        while (shallowIterator.hasNext()) {
            User user = shallowIterator.next();
            System.out.println(user);

            if (user.getRole() == Role.FATHER) {
                user.setName("Jakhongir (Shallow)");
            }
        }

        System.out.println("\nBackward iteration:");
        while (shallowIterator.hasPrevious()) {
            User user = shallowIterator.previous();
            System.out.println(user);
        }

        System.out.println("\n--- Deep Copies ---");
        ListIterator<User> deepIterator = deepCopies.listIterator();

        System.out.println("Forward iteration:");
        while (deepIterator.hasNext()) {
            User user = deepIterator.next();
            System.out.println(user);

            if (user.getRole() == Role.FATHER) {
                user.setName("Jakhongir (Deep)");
            }
        }

        System.out.println("\nBackward iteration:");
        while (deepIterator.hasPrevious()) {
            User user = deepIterator.previous();
            System.out.println(user);
        }
    }
}