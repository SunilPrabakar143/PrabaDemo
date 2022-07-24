package org.computer;

public class Desktop implements HardWare, Software {

	private void destop() {
		System.out.println("my desktop ");
	}

	@Override
	public void softwareResources() {
		System.out.println(" softwareResources are 1234 ");
	}

	@Override
	public void hardwareResources() {
		System.out.println(" hardwareResources are 5678 ");
		System.out.println(" hardwareResources are 5678 ");
		System.out.println(" hardwareResources are 5678 ");
	}

	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.destop();
		d.hardwareResources();
		d.softwareResources();
	}
}
