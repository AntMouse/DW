package m2_02_21;

abstract class Pencil {
	// 1
	abstract void write();
}
//2 class CharcoalPencil extends Pencil {}
//3
abstract class WaterColorPencil extends Pencil {
	
}
class GraphitePencil extends Pencil {
	@Override
	void write() {
		System.out.println("GraphitePencil::write()");
	}
}

public class Test9_9 {

	public static void main(String[] args) {
		//4 Pencil pp = new Pencil();
		Pencil pdp = new GraphitePencil();
		pdp.write();

	}

}
