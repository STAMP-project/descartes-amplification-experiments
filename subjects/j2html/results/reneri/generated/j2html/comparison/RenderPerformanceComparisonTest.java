package j2html.comparison;


@org.junit.Ignore
@com.carrotsearch.junitbenchmarks.BenchmarkOptions(callgc = false, benchmarkRounds = 20000, warmupRounds = 200, concurrency = 2, clock = com.carrotsearch.junitbenchmarks.Clock.NANO_TIME)
public class RenderPerformanceComparisonTest {
    @org.junit.Rule
    public org.junit.rules.TestRule benchmarkRun = new com.carrotsearch.junitbenchmarks.BenchmarkRule();

    @org.junit.Test
    public void j2htmlPerformance() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.comparison.RenderPerformanceComparisonTest|j2htmlPerformance()|0", j2html.comparison.TestJ2html.helloWorld());
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.comparison.RenderPerformanceComparisonTest|j2htmlPerformance()|1", j2html.comparison.TestJ2html.fiveHundredEmployees());
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.comparison.RenderPerformanceComparisonTest|j2htmlPerformance()|2", j2html.comparison.TestJ2html.macros());
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.comparison.RenderPerformanceComparisonTest|j2htmlPerformance()|3", j2html.comparison.TestJ2html.multiplicationTable());
    }

    @org.junit.Test
    public void velocityPerformance() throws java.lang.Exception {
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.comparison.RenderPerformanceComparisonTest|velocityPerformance()|0", j2html.comparison.TestVelocity.helloWorld());
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.comparison.RenderPerformanceComparisonTest|velocityPerformance()|1", j2html.comparison.TestVelocity.fiveHundredEmployees());
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.comparison.RenderPerformanceComparisonTest|velocityPerformance()|2", j2html.comparison.TestVelocity.macros());
        eu.stamp_project.reneri.instrumentation.StateObserver.observe("j2html.comparison.RenderPerformanceComparisonTest|velocityPerformance()|3", j2html.comparison.TestVelocity.multiplicationTable());
    }
}

