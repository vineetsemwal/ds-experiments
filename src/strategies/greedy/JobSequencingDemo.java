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
                new Job("job4", 50, 2)
        );
        //int daysAvailable=10;
        JobSequencingResult result = demo.jobSequencing(availableJobs);
        System.out.println("total profit=" + result.totalProfit);
        for (int day=0;day<result.selectedJobs.size();day++){
            Job job=result.selectedJobs.get(day);
            System.out.println("day ="+(day+1) +" job="+job);
        }

    }

    JobSequencingResult jobSequencing(final Collection<Job> availableJobs) {
        List<Job> orderedJobs = availableJobs.stream().sorted((job1, job2) -> Double.compare(job2.profit, job1.profit))
                .toList();
        Job[] days = new Job[availableJobs.size()];
        double totalProfit = 0;
        for (Job iteratedJob : orderedJobs) {
            for (int j = iteratedJob.deadLineDay; j >= 1; j--) {
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
