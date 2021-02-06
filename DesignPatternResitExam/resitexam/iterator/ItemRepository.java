package resitexam.iterator;

import java.util.Iterator;

public class ItemRepository {
    private String[][][] items = {{{"item1", "item2", "item3", "item4"},
            {"item5", "item6"}},{
            {"item7", "item8", "item9"}},{{"item10","item11", "item12", "item13", "item14"},
            {"item15", "item16"}, {"item17", "item18", "item19"}} };

    public Iterator getIterator() {

        return new ItemIterator();
    }

    private class ItemIterator implements Iterator {

        int index1 = 0;
        int index2 = 0;
        int index3 = 0;

        @Override
        public boolean hasNext() {
            if ((index1+ 1) == items.length) {
                return index2 < items[index1].length;
            }
            else {
                return index1 < items.length;
            }
        }

        @Override
        public Object next() {
            String item = items[index1][index2][index3];
            index3++;

            if (index3 >= items[index1][index2].length) {
                index2++;
                index3 = 0;


                if (index2 >= items[index1].length) {
                    index1++;
                    index2 = 0;


                }

            }


            return item;
        }
    }

    public static void main(String... args){
        ItemRepository rep = new ItemRepository();
        Iterator itr = rep.getIterator();
        while (itr.hasNext())
            System.out.println(itr.next());

    }
}
