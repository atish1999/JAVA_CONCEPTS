package oops.interfaces;

public class Person implements Student,YouTuber {
//    static final int x =9;
	public static void main(String[] args) {
		Person obj = new Person();
		YouTuber obj2 = obj;
//		obj2.makeVideo();
//		obj2.editVideo();
		obj.uploadVideo();
		
	}

	@Override
	public void makeVideo() {
		System.out.println("person is making a youtube video");
	}

	@Override
	public void study() {
		System.out.println("person is studying");
	}

	@Override
	public void editVideo() {
		System.out.println("YouTuber is editing");
	}

	@Override
	public void uploadVideo() {
		// TODO Auto-generated method stub
		Student.super.uploadVideo();
		YouTuber.super.uploadVideo();
		System.out.println("Person is uploading the video");
	}

	

	

}
