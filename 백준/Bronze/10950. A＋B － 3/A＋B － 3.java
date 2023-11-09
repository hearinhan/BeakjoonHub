import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();

        for (int i = 0; i<t*2; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i<list.size(); i+=2) {
            listA.add(list.get(i));
        }
        for (int i = 1; i<list.size(); i+=2) {
            listB.add(list.get(i));
        }

        for (int i = 0; i<t; i++) {
            System.out.println(listA.get(i) + listB.get(i));
        }
    }
}