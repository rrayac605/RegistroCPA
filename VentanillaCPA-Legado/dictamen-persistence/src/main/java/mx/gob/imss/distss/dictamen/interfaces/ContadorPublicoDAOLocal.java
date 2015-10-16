package mx.gob.imss.distss.dictamen.interfaces;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.distss.dictamen.modelo.entidad.NdcEstadoCpa;
import mx.gob.imss.distss.dictamen.modelo.entidad.NdtContadorPublicoAut;
import mx.gob.imss.distss.dictamen.modelo.entidad.NdtCpaEstatus;
import mx.gob.imss.distss.dictamen.modelo.entidad.NdvContadorPublicoAut;
import mx.gob.imss.distss.dictamen.table.model.Pagina;
import mx.gob.imss.distss.dictamen.table.model.Paginacion;

@Local
public interface ContadorPublicoDAOLocal {

	List<NdcEstadoCpa> catalogoEstadoContador();

	Pagina<NdvContadorPublicoAut> consultaContador(Paginacion paginacion);
	
	NdtContadorPublicoAut consultaContadorNumReg(Long numRegistro);
	
	NdtContadorPublicoAut consultaContadorIdCPA(Long idCPA);

	void actualizaContador(NdtContadorPublicoAut ndtContadorPublicoAut);

	void actualizaEstatus(NdtCpaEstatus ndtCpaEstatus);
	
	Long obtieneUltimoNumRegCPA();

}
