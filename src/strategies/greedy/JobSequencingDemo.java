package strategies.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class JobSequencingDemo {
    public static void main(String[] args) {
        JobSequencingDemo demo = new JobSequencingDemo();
        List<Job> availableJobs = List.of(
                new Job("job1", 100, 3),
                new Job("job2", 10, 1),
                new Job("job3", 80, 2),
                new Job("job4", 50, 2),
                new Job("job4", 70, 2)
        );
        int daysAvailable=2;
        JobSequencingResult result = demo.jobSequencing(availableJobs, daysAvailable);
        System.out.println("total profit=" + result.totalProfit);
        for (int day=0;day<result.selectedJobs.size();day++){
            Job job=result.selectedJobs.get(day);
            System.out.println("day ="+(day+1) +" job="+job);
        }

    }

    /**
     *
     *  Maximizes Profit by using Greedy Algorithm
     * Sort the Job in descending order of Profit
     * At every iteration add the profit(best value) to total Profit which become globally best result
     *
     * Worst case Time Complexity:
     * Auxiliary Space (not including input memory space): O(n^2)
     *
     * @param availableJobs
     * @return JobSequencingResult which contains jobs sequence and total result
     */
    JobSequencingResult jobSequencing(final Collection<Job> availableJobs, final int availableDays) {
        List<Job> orderedJobs = availableJobs.stream().sorted((job1, job2) -> Double.compare(job2.profit, job1.profit))
                .toList();
        Job[] days = new Job[availableJobs.size()];
        double totalProfit = 0;
        for (Job iteratedJob : orderedJobs) {
            int deadline=iteratedJob.deadLineDay;
            if(iteratedJob.deadLineDay>availableDays){
                deadline=availableDays;
            }
            for (int j = deadline; j >= 1; j--) {
                if (days[j] == null) {
                    days[j] = iteratedJob;
                    totalProfit = totalProfit + iteratedJob.profit;
                    break;
                }
            }

        }
        List<Job> sequencedJobs = Arrays.stream(days).filter(job -> job != null).toList();
        return new JobSequencingResult(sequencedJobs, totalProfit);

    }

    private static class JobSequencingResult {
        private final List<Job> selectedJobs;
        private final double totalProfit;

        public JobSequencingResult(final List<Job> selectedJobs, final double totalProfit) {
            this.selectedJobs = selectedJobs;
            this.totalProfit = totalProfit;
        }

    }

    private static class Job {
        private final String name;
        private final double profit;
        private final int deadLineDay;

        public Job(final String name, final double profit, final int deadLineDay) {
            this.name = name;
            this.profit = profit;
            this.deadLineDay = deadLineDay;
        }

        @Override
        public String toString() {
            return name + "-profit=" + profit + "-deadline=" + deadLineDay;
        }
    }
}
