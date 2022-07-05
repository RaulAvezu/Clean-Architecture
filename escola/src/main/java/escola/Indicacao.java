package escola;

import java.time.LocalDateTime;

public class Indicacao {

	private Aluno indicado;
	private Aluno indicador;
	private LocalDateTime dataIndicacao;

	public Indicacao(Aluno indicado, Aluno indicador) {
		this.indicado = indicado;
		this.indicador = indicador;
		this.dataIndicacao = LocalDateTime.now();
	}

	public Aluno getIndicado() {
		return indicado;
	}

	public Aluno getIndicador() {
		return indicador;
	}

	public LocalDateTime getDataIndicacao() {
		return dataIndicacao;
	}

}
