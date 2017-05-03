package LucasNumbers;

import java.util.ArrayList;

 class LucasServer {

     private static ArrayList<Integer> luci = new ArrayList<>();
     private static ArrayList<Integer> luciOfFive = new ArrayList<>();

    static void lucasNumbers(int count) {

        luci.clear();
        luciOfFive.clear();

        int x = 2, y = 1;
        luci.add(x);
        luci.add(y);

        for(int i = 2; i < count; i++){
            int z = x + y;
            luci.add(z);

            x = y;
            y = z;
        }

        System.out.println("The Lucas numbers up to " + count + "are: ");
        System.out.println(luci);
    }

    static void checkDivisibility(){

        for(int j : luci) {
            if (j % 5 == 0) {
                luciOfFive.add(j);
            }
        }

        if(luciOfFive.size() > 0) {
            System.out.println("Of those numbers these are divisible by 5: ");
            System.out.println(luciOfFive);
        }else {
            System.out.println("None of the numbers were divisible by 5");
        }
    }

}
