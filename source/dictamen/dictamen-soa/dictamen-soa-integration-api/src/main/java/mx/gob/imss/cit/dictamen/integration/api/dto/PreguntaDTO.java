package mx.gob.imss.cit.dictamen.integration.api.dto;

import java.util.List;

import mx.gob.imss.cit.dictamen.integration.api.dto.base.BaseDTO;

public class PreguntaDTO extends BaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2372740005419028723L;
	private Integer clave;
	private String pregunta;
	private List<RespuestaDTO> respuestas;
	private TipoPreguntaDTO tipo;
	private Boolean habilitaPregunta;
	private Boolean habilitaComentario;
	public Integer getClave() {
		return clave;
	}
	public void setClave(Integer clave) {
		this.clave = clave;
	}
	public String getPregunta() {
		return pregunta;
	}
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	public List<RespuestaDTO> getRespuestas() {
		return respuestas;
	}
	public void setRespuestas(List<RespuestaDTO> respuestas) {
		this.respuestas = respuestas;
	}
	public TipoPreguntaDTO getTipo() {
		return tipo;
	}
	public void setTipo(TipoPreguntaDTO tipo) {
		this.tipo = tipo;
	}
	public Boolean getHabilitaPregunta() {
		return habilitaPregunta;
	}
	public void setHabilitaPregunta(Boolean habilitaPregunta) {
		this.habilitaPregunta = habilitaPregunta;
	}
	public Boolean getHabilitaComentario() {
		return habilitaComentario;
	}
	public void setHabilitaComentario(Boolean habilitaComentario) {
		this.habilitaComentario = habilitaComentario;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clave == null) ? 0 : clave.hashCode());
		result = prime * result + ((habilitaPregunta == null) ? 0 : habilitaPregunta.hashCode());
		result = prime * result + ((habilitaComentario == null) ? 0 : habilitaComentario.hashCode());
		result = prime * result + ((pregunta == null) ? 0 : pregunta.hashCode());
		result = prime * result + ((respuestas == null) ? 0 : respuestas.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PreguntaDTO other = (PreguntaDTO) obj;
		if (clave == null) {
			if (other.clave != null)
				return false;
		} else if (!clave.equals(other.clave))
			return false;
		if (habilitaPregunta == null) {
			if (other.habilitaPregunta != null)
				return false;
		} else if (!habilitaPregunta.equals(other.habilitaPregunta))
			return false;
		if (habilitaComentario == null) {
			if (other.habilitaComentario != null)
				return false;
		} else if (!habilitaComentario.equals(other.habilitaComentario))
			return false;
		if (pregunta == null) {
			if (other.pregunta != null)
				return false;
		} else if (!pregunta.equals(other.pregunta))
			return false;
		if (respuestas == null) {
			if (other.respuestas != null)
				return false;
		} else if (!respuestas.equals(other.respuestas))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}
	
}
