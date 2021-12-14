package com.myfirsttest.testing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootApplication
public class TestingApplication {

	public static void main(String[] args) {
		// start threads
		apiThread rapidThread = new apiThread(1);
		// once other API is implemented
//		apiThread otherThread = new apiThread(2);

		ExecutorService exec = Executors.newCachedThreadPool();

		exec.execute(rapidThread);
//		exec.execute(otherThread);

		exec.shutdown();

		while(!exec.isTerminated()){
			Thread.yield();
		}

		try{
		SpringApplication.run(TestingApplication.class, args);
	} catch (Exception e) {
		e.printStackTrace();
	}
	}

}
