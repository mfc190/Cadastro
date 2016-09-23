package br.com.sisaca.exceptions;

import br.com.sisaca.model.Aluno;

public class AlunoNaoEncontradoException extends Exception{

	public AlunoNaoEncontradoException(Aluno aluno) {
		super("Aluno n�o encontrado" + aluno.getMatricula());
	}
}
