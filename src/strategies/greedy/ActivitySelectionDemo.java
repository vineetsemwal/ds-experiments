package strategies.greedy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ActivitySelectionDemo {

    public static void main(String[] args) {
        ActivitySelectionDemo demo=new ActivitySelectionDemo();
        List<Activity>availableActivities=List.of(
                new Activity("a1",1,3),
                new Activity("a2",4,9),
                new Activity("a3",7,9),
                new Activity("a4",10,15),
                new Activity("a5",6,11),
                new Activity("a9",17,20),
                new Activity("a10",21,25)


        );

      List<Activity>selectedActivities = demo.selectedActivities(availableActivities,15);
      selectedActivities.forEach(System.out::println);
    }

    /**
     *  finds the activities which can be done within the deadline ,
     *  uses Greedy Algorithm
     *  1)Finds Best result in every Stage
     *  2) Add to final Solution
     *  Repeat from Step 1)
     *
     *  Worst Case Scenario Time Complexity  O(n) where n is the length of available activities collection
     *  Auxiliary Space (not including Input Space):   O(n)
     *
     * @param availableActivities available activities from which activities have to be chosen
     * @param deadLine number of days available before which we have to finish activities
     * @return activities selected sequentially
     */
    List<Activity> selectedActivities(final Collection<Activity> availableActivities, final int deadLine) {
        List<Activity> orderedActivities = availableActivities.stream()
                .sorted((activity1, activity2) -> activity1.endDay - activity2.endDay)
                .toList();
        List<Activity> desired = new ArrayList<>(availableActivities.size());
        Activity lastActivity = null;
        for (Activity iteratedActivity : orderedActivities) {
            if (iteratedActivity.endDay > deadLine) {
                return desired;
            }

            if (lastActivity == null || (iteratedActivity.startDay > lastActivity.endDay)) {
                desired.add(iteratedActivity);
                lastActivity = iteratedActivity;
            }
        }
        return desired;
    }

    private static class Activity {
        private final String name;
        private final int startDay;
        private final int endDay;
        public Activity(final String name,final int startDay,final int endDay){
            this.startDay=startDay;
            this.endDay=endDay;
            this.name=name;
        }

        @Override
        public String toString() {
            return name+"-startDay="+startDay+ "-endDay="+endDay;
        }
    }

}
