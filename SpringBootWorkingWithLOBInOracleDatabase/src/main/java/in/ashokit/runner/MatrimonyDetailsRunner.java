package in.ashokit.runner;

import java.io.FileOutputStream;
import java.io.FileWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ashokit.entity.MarriageSeeker;
import in.ashokit.service.IMarriageSeeker;

@Component
public class MatrimonyDetailsRunner implements CommandLineRunner {

	@Autowired
	private IMarriageSeeker service;
	
	@Override
	public void run(String... args) throws Exception {
		
      MarriageSeeker seeker=service.getMarriageSeekerDetailsByiId(1l);
      System.out.println(seeker.getMid()+"\n"+seeker.getName()+"\n"+seeker.getAddrs()+"\n"+seeker.getDob());
      byte[] photoContent=seeker.getPhoto();
      char[] resumeContent=seeker.getResume();
      
      FileOutputStream fos=new FileOutputStream("retrieve_photo.jpg");
      fos.write(photoContent);
      fos.flush();
      fos.close();
      
      FileWriter writer=new FileWriter("retrieve_resume.pdf");
      writer.write(resumeContent);
      writer.flush();
      writer.close();
	}

}
