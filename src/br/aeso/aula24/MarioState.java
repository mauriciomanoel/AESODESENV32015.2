package br.aeso.aula24;
public interface MarioState {
	MarioState pegarCogumelo();
	MarioState pegarFlor();
	MarioState pegarPena();
	MarioState levarDano();
}
