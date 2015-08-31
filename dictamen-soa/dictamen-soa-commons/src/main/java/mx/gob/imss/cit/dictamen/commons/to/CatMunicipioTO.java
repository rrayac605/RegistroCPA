package mx.gob.imss.cit.dictamen.commons.to;

import java.util.List;

public class CatMunicipioTO extends BaseTO    {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4288736337144334076L;

	private String nomMun;

	private List<AsentamientoTO> dgAsentamientos;

	private List<CatLocalidadTO> dgCatLocalidads;

	private CatEstadoTO dgCatEstado;

	private List<ActaConstitutivaTO> ditActaConstitutivas;

	private List<PersonaDefuncionTO> ditPersonaDefuncions;

	/**
	 * @return the nomMun
	 */
	public String getNomMun() {
		return nomMun;
	}

	/**
	 * @param nomMun the nomMun to set
	 */
	public void setNomMun(String nomMun) {
		this.nomMun = nomMun;
	}

	/**
	 * @return the dgAsentamientos
	 */
	public List<AsentamientoTO> getDgAsentamientos() {
		return dgAsentamientos;
	}

	/**
	 * @param dgAsentamientos the dgAsentamientos to set
	 */
	public void setDgAsentamientos(List<AsentamientoTO> dgAsentamientos) {
		this.dgAsentamientos = dgAsentamientos;
	}

	/**
	 * @return the dgCatLocalidads
	 */
	public List<CatLocalidadTO> getDgCatLocalidads() {
		return dgCatLocalidads;
	}

	/**
	 * @param dgCatLocalidads the dgCatLocalidads to set
	 */
	public void setDgCatLocalidads(List<CatLocalidadTO> dgCatLocalidads) {
		this.dgCatLocalidads = dgCatLocalidads;
	}

	/**
	 * @return the dgCatEstado
	 */
	public CatEstadoTO getDgCatEstado() {
		return dgCatEstado;
	}

	/**
	 * @param dgCatEstado the dgCatEstado to set
	 */
	public void setDgCatEstado(CatEstadoTO dgCatEstado) {
		this.dgCatEstado = dgCatEstado;
	}

	/**
	 * @return the ditActaConstitutivas
	 */
	public List<ActaConstitutivaTO> getDitActaConstitutivas() {
		return ditActaConstitutivas;
	}

	/**
	 * @param ditActaConstitutivas the ditActaConstitutivas to set
	 */
	public void setDitActaConstitutivas(
			List<ActaConstitutivaTO> ditActaConstitutivas) {
		this.ditActaConstitutivas = ditActaConstitutivas;
	}

	/**
	 * @return the ditPersonaDefuncions
	 */
	public List<PersonaDefuncionTO> getDitPersonaDefuncions() {
		return ditPersonaDefuncions;
	}

	/**
	 * @param ditPersonaDefuncions the ditPersonaDefuncions to set
	 */
	public void setDitPersonaDefuncions(
			List<PersonaDefuncionTO> ditPersonaDefuncions) {
		this.ditPersonaDefuncions = ditPersonaDefuncions;
	}


	

}
