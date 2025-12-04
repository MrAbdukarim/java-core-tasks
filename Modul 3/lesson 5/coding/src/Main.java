import com.pdp.online.tasks.MockData;
import com.pdp.online.tasks.User;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main() {
        // a dan z gacha bo'lgan harflarni saqlovchi set yarating forEach orqali ekranga chop eting
        Set<String> alphabet = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(String.valueOf(c));
        }

        // alphabet.forEach(System.out::println);
        System.out.println("alphabet = " + alphabet);
        // 1 dan 10 gacha sonlarni TreeSetga saqlang va ekranga chiqaring
        Set<Integer> nums = new TreeSet<>();
        for (int i = 1; i <= 10; i++) nums.add(i);

        System.out.println("nums = " + nums);
        /*
        Name, Phone fieldlaridan iborat User classini yarating.
        Comparator orqali name ba phone boyicha sortlagan holda TreeSetda saqlang
        Set elementlarini ekranga chizing
        */
        Comparator<User> userComparator = new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                int nameComparison = u1.getName().compareTo(u2.getName());

                if (nameComparison != 0) {
                    return nameComparison;
                } else {
                    return u1.getPhoneNumber().compareTo(u2.getPhoneNumber());
                }
            }
        };

        Set<User> userTreeSet = new TreeSet<>(userComparator);

        User[] users = MockData.user();
        for (User user : users) {
            userTreeSet.add(user);
        }
        userTreeSet.forEach(user -> System.out.print(user.getNameAndPhoneNumber()));
    }
}
