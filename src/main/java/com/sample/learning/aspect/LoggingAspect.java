package com.sample.learning.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.util.StopWatch;

@Aspect
public class LoggingAspect {

	@Around("execution(* com.sample.learning.controller.SampleController.getSample(..)))")
	public Object profileAllMethods(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();

		// Get intercepted method details
		String className = methodSignature.getDeclaringType().getSimpleName();
		String methodName = methodSignature.getName();

		final StopWatch stopWatch = new StopWatch();

		// Measure method execution time
		stopWatch.start();
		Object result = proceedingJoinPoint.proceed();
		stopWatch.stop();

		System.out.println("***********************");
		
		// Log method execution time
		System.out.println("Execution time of " + className + "." + methodName + " " + ":: "
				+ stopWatch.getTotalTimeMillis() + " ms");

		return result;
	}
	
	@Before("execution(* com.sample.learning.controller.SampleController.getSample(..)))")
	public void sample(JoinPoint joinPoint) {
		System.out.println("FFFFFFFFFFFFFF");
	}

}
