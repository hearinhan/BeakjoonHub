import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt(); 
        int thing = sc.nextInt(); 

        ArrayList<Integer> pcList = new ArrayList<>(); 
        ArrayList<Integer> pList = new ArrayList<>(); 
        ArrayList<Integer> cList = new ArrayList<>(); 

        int tempTotal = 0;

        for (int i = 0; i < thing*2; i++) {
            pcList.add(sc.nextInt());
        }
        for (int i =0; i < thing*2; i+=2) {
            pList.add(pcList.get(i));
        }
        for (int i =1; i < thing*2; i+=2) {
            cList.add(pcList.get(i));
        }
        for (int i = 0; i <thing; i++) {
            tempTotal += cList.get(i) * pList.get(i);
        }

        if (total == tempTotal) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}