package oops.interfaces;

public interface Student {
	abstract void study();
	default void uploadVideo() {
		 System.out.println("student is uploading the video");
	 }
}
