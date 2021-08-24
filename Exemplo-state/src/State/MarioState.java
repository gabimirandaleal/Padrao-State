package State;

public interface MarioState {
	MarioState pegarCogumelo();
	
	MarioState pegarFlor();

	MarioState levarDano();
}
