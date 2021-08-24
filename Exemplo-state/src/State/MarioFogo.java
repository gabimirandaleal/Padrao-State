package State;

public class MarioFogo implements MarioState{

	@Override
	public MarioState pegarCogumelo() {
		System.out.println("Mario GANHOU 1000 pontos");
		return this;
	}

	@Override
	public MarioState pegarFlor() {
		System.out.println("Mario GANHOU 1000 pontos");
		return this;
	}

	@Override
	public MarioState levarDano() {
		System.out.println("Mario grande");
		return new MarioGrande();
	}

}
