package State;

public class MarioPequeno implements MarioState{

	@Override
	public MarioState pegarCogumelo() {
		System.out.println("Mario Grande");
		return new MarioGrande();
	}

	@Override
	public MarioState pegarFlor() {
		System.out.println("Mario grande com fogo");
		return new MarioFogo();
	}

	@Override
	public MarioState levarDano() {
		System.out.println("Mario morto");
		return new MarioMorto();
	}

}
