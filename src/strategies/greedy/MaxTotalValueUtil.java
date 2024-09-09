package strategies.greedy;

import java.util.ArrayList;
import java.util.List;

public class MaxTotalValueUtil {

    public static void main(String[] args) {
        MaxTotalValueUtil demo = new MaxTotalValueUtil();
        List<Item> list = new ArrayList<>();
        list.add(new Item(500d, 5));
        list.add(new Item(3000d,15));
        list.add(new Item(850,17));
        double result=demo.totalMax(list, 25);
        System.out.println("total container result="+result);
    }

    /**
     * Follows Greedy Algorithm
     *  Finds best value in each iteration/stage
     *  Add to the total Solution
     *  Repeat again
     *
     * Worst case Scenario  Time Complexity : O(nLog(n,2))
     * Auxiliary Space (not including input): O(1)
     * @param items
     * @param capacity
     * @return
     */
    double totalMax(List<Item> items, int capacity) {
        items.sort((item1, item2) -> {
            double item1PerKgValue = item1.value / item1.weight;
            double item2PerKgValue = item2.value / item2.weight;
            return Double.compare(item2PerKgValue, item1PerKgValue);
        });
        System.out.println("sorted list"+items);
        double totalValue = 0;
        for (Item item : items) {
            if (capacity == 0) {
                return totalValue;
            }
            double perKgValue =  item.value/item.weight;
            if (item.weight < capacity) {
                totalValue = totalValue + (item.weight * perKgValue);
                capacity = capacity - item.weight;
                continue;
            }
            totalValue = totalValue + (capacity * perKgValue);
            capacity = 0;

        }
        return totalValue;
    }

   private static class Item {
        final double value;
        final int weight;

        public Item(final double value, final int weight) {
            this.value = value;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "value="+value+" weight="+weight;
        }
    }

}

