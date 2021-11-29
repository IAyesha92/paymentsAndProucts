package engine;

<<<<<<< Updated upstream
public class Video {

=======
import java.awt.List;
import java.util.ArrayList;

public class Video  extends Payment implements PaymentOperations{
	public String videoName;
//	public ArrayList aListOfVideos;

	public Video(String name){
		this.videoName=name;
	}
	
	public String getVideoName() {
		return videoName;
	}

	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}
	
	public ArrayList videoList() {
	ArrayList aList = new ArrayList();
	if(this.getVideoName().equals("Learning to Ski")) {
		aList.add(videoName);
	}
		return aList;
	}
>>>>>>> Stashed changes
}
