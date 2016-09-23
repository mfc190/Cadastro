package br.com.sisaca.exceptions;

import br.com.sisaca.model.Professor;

public class ProfessorNaoEncontradoException extends Exception {

	public ProfessorNaoEncontradoException(Professor prof) {
		super("Professor n�o encontrado" + prof.getId());
	}
}
