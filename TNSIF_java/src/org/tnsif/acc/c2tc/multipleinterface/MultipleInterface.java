package org.tnsif.acc.c2tc.multipleinterface;


class Smartphone implements Camera,Musicplayer
{

	@Override
	public void playmusic() {
		// TODO Auto-generated method stub
		System.out.println("Playing Music");
	}

	public void takeephoto() {
		System.out.println("Taking photo");
		// TODO Auto-generated method stub
		
	}
	
}

public class MultipleInterface {

	public static void main(String[] args) {
		
		Smartphone smart=new Smartphone();
		smart.playmusic();
		smart.takeephoto();
		// TODO Auto-generated method stub

	}

}
