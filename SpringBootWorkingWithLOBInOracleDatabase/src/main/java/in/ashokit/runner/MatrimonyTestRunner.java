package in.ashokit.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ashokit.entity.MarriageSeeker;
import in.ashokit.service.IMarriageSeeker;

//@Component
public class MatrimonyTestRunner implements CommandLineRunner {

	@Autowired
	private IMarriageSeeker service;
	
	@Override
	public void run(String... args) throws Exception {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=sc.nextLine();
		
		System.out.println("Enter the address:");
		String addrs=sc.nextLine();
		
		System.out.println("Enter the DOB");
		System.out.println("Enter the year in value:");
		int year=sc.nextInt();
		System.out.println("Enter the month in value:");
		int month=sc.nextInt();
		System.out.println("Enter the day in value:");
		int day=sc.nextInt();
		System.out.println("Enter the hours in value:");
		int hour=sc.nextInt();
		System.out.println("Enter the minutes in value:");
		int minutes=sc.nextInt();
		System.out.println("Enter the seconds in value");
		int second=sc.nextInt();
		sc.nextLine();
		
		LocalDateTime dob=LocalDateTime.of(year, month, month, hour, minutes, second);
        
		System.out.println("Enter is customer indian?");
		boolean indian=sc.nextBoolean();
		sc.nextLine();
		
		System.out.println("Enter the photo file path:");
		String photoPath=sc.nextLine();
		
		System.out.println("Enter resume file path");
		String resumePath=sc.nextLine();
		
		FileInputStream fis=new FileInputStream(photoPath);
		byte[] photoContent=fis.readAllBytes();
		
		File file=new File(resumePath);
		FileReader reader=new FileReader(resumePath);
		char[] resumeContent=new char[(int)file.length()];
		reader.read(resumeContent);
		
		
		MarriageSeeker seeker=new MarriageSeeker(name,addrs,dob,photoContent,resumeContent,indian);
		
		System.out.println(service.registerMarriageSeeker(seeker));
	}

}
