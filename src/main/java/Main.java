import gb.GBList;
import gb.list.GBArrayList;

public class Main {
    public static void main(String[] args) {
        GBList<Integer> gblist = new GBArrayList<>();
        gblist.add(2);
        gblist.add(3);
        gblist.add(1);

        System.out.println(gblist.size());
        System.out.println(gblist.get(0));
        gblist.remove(2);
        for (Integer i: gblist) {
            System.out.println(i);
            
        }
    }
}
