package com.userUegistration.app;

import java.io.File;
import java.io.IOException;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.junit.internal.TextListener;
import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.springframework.boot.test.context.SpringBootTest;

import com.userUegistration.TestBoundary.TestBoundary;
import com.userUegistration.TestException.TestException;
import com.userUegistration.TestFunctional.TestFunctional;

@SpringBootTest
class UserRegistrationApplicationTests {

	@Test
	void contextLoads() {
		//fail("Not yet implemented");
				JUnitCore junit = new JUnitCore();
				junit.addListener(new TextListener(System.out));
				Result result = junit.run(TestFunctional.class);
				try {
					resultFunctionalReport(result);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				result = junit.run(TestException.class);
				try {
					resultExceptionConditionReport(result);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				result = junit.run(TestBoundary.class);

				try {
					resultBoundaryConditionReport(result);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			public static void resultFunctionalReport(Result result) throws IOException {
			    System.out.println("Finished... Result: Failures: " +
			      result.getFailureCount() + ". Ignored: " +
			      result.getIgnoreCount() + ". Tests run: " +
			      result.getRunCount() + ". Time: " +
			      result.getRunTime() + "ms." );
			    String res = "";
			    res += "Total="+result.getRunCount()+"\nFailed="+result.getFailureCount()+"\nIgnore="+result.getIgnoreCount()+"\nExecTime="+result.getRunTime();
			    FileUtils.writeStringToFile(new File("output.txt"), res);
			}
			public static void resultExceptionConditionReport(Result result) throws IOException {
			    System.out.println("Finished... Result: Failures: " +
			      result.getFailureCount() + ". Ignored: " +
			      result.getIgnoreCount() + ". Tests run: " +
			      result.getRunCount() + ". Time: " +
			      result.getRunTime() + "ms." );
			    String res = "";
			    res += "Total="+result.getRunCount()+"\nFailed="+result.getFailureCount()+"\nIgnore="+result.getIgnoreCount()+"\nExecTime="+result.getRunTime();
			    FileUtils.writeStringToFile(new File("output_exception.txt"), res);
			}
			public static void resultBoundaryConditionReport(Result result) throws IOException {
			    System.out.println("Finished... Result: Failures: " +
			      result.getFailureCount() + ". Ignored: " +
			      result.getIgnoreCount() + ". Tests run: " +
			      result.getRunCount() + ". Time: " +
			      result.getRunTime() + "ms." );
			    String res = "";
			    res += "Total="+result.getRunCount()+"\nFailed="+result.getFailureCount()+"\nIgnore="+result.getIgnoreCount()+"\nExecTime="+result.getRunTime();
			    FileUtils.writeStringToFile(new File("output_boundary.txt"), res);
			}

	}

}
