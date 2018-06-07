package problems.job.custom.workflow;


import static java.lang.Integer.parseInt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import problems.job.custom.workflow.model.JobCandidateStatus;


/**
 * Created by jitesh-kumar on 7/6/18.
 */
public class JobCandidateStatusUtil {

  private static Map<Integer, JobCandidateStatus> jobCandidateStatusesByTransitionOrderMap = new HashMap<>();

  static {
    for (JobCandidateStatus jobCandidateStatus : JobCandidateStatus.values()) {
      jobCandidateStatusesByTransitionOrderMap.put(jobCandidateStatus.getTransitionOrder(), jobCandidateStatus);
    }
  }

  public static List<JobCandidateStatus> sortByTransitionOrder(List<String> jobCandidateStatusTransitionOrdersAsStrings) {
    return getJobCandidateStatuses(jobCandidateStatusTransitionOrdersAsStrings);
  }

  private static List<JobCandidateStatus> getJobCandidateStatuses(List<String> jobCandidateStatusTransitionOrdersAsStrings) {
    Set<Integer> jobCandidateStatusTransitionOrdersAsIntegers = getJobCandidateTransitionOrdersAsIntegers(
      jobCandidateStatusTransitionOrdersAsStrings);
    return prepareJobCandidateStatuses(jobCandidateStatusTransitionOrdersAsIntegers);
  }

  private static Set<Integer> getJobCandidateTransitionOrdersAsIntegers(final List<String> jobCandidateStatusTransitionOrdersAsStrings) {
    return jobCandidateStatusTransitionOrdersAsStrings.stream().
                                                                 map(t
                                                                       -> parseInt(t)).collect(Collectors.toSet());
  }

  private static List<JobCandidateStatus> prepareJobCandidateStatuses(final Set<Integer> jobCandidateStatusTransitionOrdersAsIntegers) {
    List<Integer> jobCandidateStatusTransitionOrders = new ArrayList<>(jobCandidateStatusTransitionOrdersAsIntegers);
    jobCandidateStatusTransitionOrders.sort(Comparator.naturalOrder());
    return jobCandidateStatusTransitionOrdersAsIntegers.stream().map(t -> jobCandidateStatusesByTransitionOrderMap.get(t)).collect(
      Collectors.toList());
  }
}
