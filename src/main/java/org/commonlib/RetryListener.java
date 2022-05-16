package org.commonlib;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryListener implements IAnnotationTransformer {
	  @SuppressWarnings("rawtypes")
	public void transform(ITestAnnotation annotation, Class testClass,Constructor testConstructor, Method testMethod)
		  {
		     annotation.setRetryAnalyzer(Retryanalyzer.class);
		    }
		  }
