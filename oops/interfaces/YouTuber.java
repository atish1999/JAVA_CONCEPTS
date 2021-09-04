package oops.interfaces;

public interface YouTuber extends VideoEditor{
	 void makeVideo();
	 int y=10;
	 default void uploadVideo() {
		 System.out.println("YouTuber is uploading the video");
	 }
	 
}
