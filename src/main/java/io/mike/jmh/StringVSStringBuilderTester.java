package io.mike.jmh;

import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Threads;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 3)
@Measurement(iterations = 10, time = 5, timeUnit = TimeUnit.SECONDS)
@Threads(16)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class StringVSStringBuilderTester {

	@Benchmark
	public void testStringAdd() {
		String a = "";
		for (int i = 0; i < 10; i++) {
			a += i;
		}
		print(a);
	}
	
	@Benchmark
	public void testStringBuilderAdd() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 10; i++) {
			sb.append(i);
		}
		print(sb.toString());
	}
	
	private void print(String a) {
    }
	
	public static void main(String[] args) {
		Options options = new OptionsBuilder()
				.include(StringVSStringBuilderTester.class.getSimpleName())
				.output("./benchmark.log")
				.forks(1)
				.build();
		try {
			new Runner(options).run();
		} catch (RunnerException e) {
			e.printStackTrace();
		}
	}
}
