package strategies.greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class MaxTotalValueUtil2 {

    public static void main(String[] args) {
        MaxTotalValueUtil2 demo = new MaxTotalValueUtil2();
        List<Item> list = new ArrayList<>();
        list.add(new Item("apple", 500d, 5));
        list.add(new Item("mango", 3000d, 15));
        list.add(new Item("banana", 850, 17));
        list.add(new Item("guvava", 400, 20));
        ContainerValue containerValue = demo.totalMax(list, 25);
        double totalResultValue=containerValue.totalValue;
        System.out.println("total result Value="+totalResultValue);
        containerValue.filledItems.forEach(orderedItem -> {
            double weightPerKG = orderedItem.item.value / orderedItem.item.weight;
            double orderedValue = orderedItem.orderedWeight * weightPerKG;
            System.out.println("ordered item=" + orderedItem.orderedWeight + "--" + orderedItem.item.name + " ordered value=" + orderedValue);
        });

    }

    /**
     *  Follows Greedy Algorithm
     *  Finds best value in each iteration/stage
     *  Add to the total Solution
     *  Repeat again
     *
     * finds Total value after filling container
     * <p>
     * Worst case Scenario  Time Complexity : O(nLog(n,2))
     * Auxiliary Space (not including input): O(1)
     *
     * @param items
     * @param capacity
     * @return total Value after filling items
     */
    ContainerValue totalMax(List<Item> items, int capacity) {
        items.sort((item1, item2) -> {
            double item1PerKgValue = item1.value / item1.weight;
            double item2PerKgValue = item2.value / item2.weight;
            return Double.compare(item2PerKgValue, item1PerKgValue);
        });
        System.out.println("sorted list" + items);
        List<ChosenItem> chosenItems = new ArrayList<>();
        double totalValue = 0;
        for (Item item : items) {
            if (capacity == 0) {
                return new ContainerValue(totalValue,chosenItems);
            }
            double perKgValue = item.value / item.weight;
            if (item.weight < capacity) {
                totalValue = totalValue + (item.weight * perKgValue);
                capacity = capacity - item.weight;
                chosenItems.add(new ChosenItem(item, item.weight));
                continue;
            }
            totalValue = totalValue + (capacity * perKgValue);
            chosenItems.add(new ChosenItem(item, capacity));
            capacity = 0;

        }
        ContainerValue containerValue=new ContainerValue(totalValue,chosenItems);
        return containerValue;
    }

    private static class ContainerValue {
        private final double totalValue;
        private final List<ChosenItem> filledItems;
        public ContainerValue(final double totalValue, final List<ChosenItem>filledItems){
            this.totalValue=totalValue;
            this.filledItems=filledItems;
        }
    }

    private static class ChosenItem {
        private final Item item;
        private final int orderedWeight;

        public ChosenItem(final Item item, final int orderWeight) {
            this.item = item;
            this.orderedWeight = orderWeight;
        }

    }

    private static class Item {
        final String name;
        final double value;
        final int weight;

        public Item(final String name, final double value, final int weight) {
            this.value = value;
            this.weight = weight;
            this.name = name;
        }

        @Override
        public String toString() {
            return name + "-" + value + "-" + weight;
        }
    }

}