package mx.gob.imss.cit.de.dictaminacion.batch.validation.mapper;

import java.util.Date;

import org.springframework.batch.item.file.FlatFileParseException;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.transform.LineTokenizer;
import org.springframework.util.Assert;

import mx.gob.imss.cit.de.dictaminacion.batch.validation.enums.BatchAseveracionesEnum;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.A1TO;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.A2TO;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.BitacoraErroresTO;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.util.ValidatorTO;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.validators.A2Validator;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class AseveracionesMapper implements LineMapper<Object>{
    private LineTokenizer tokenizer;	
	private int idAseveracion;
	private int cveIdBitacoraCargaAsev;
	private int cveIdPatronDictamen;
	private ResourceFieldSetMapper fieldSetMapper;
	private BitacoraErroresTO bitacoraErroresTO;
	
	@Override
	public Object mapLine(String paramString, int paramInt) throws Exception {
		try {			
			switch (idAseveracion){
			case 1:
				A1TO a1TO = (A1TO)fieldSetMapper.mapFieldSet(tokenizer.tokenize(paramString), BatchAseveracionesEnum.A1, paramInt);
				a1TO.setCveIdPatronDictamen(cveIdPatronDictamen);
				a1TO.setCveIdAseveracion(idAseveracion);
				a1TO.setFecRegistroActualizado(new Date());
				a1TO.setFecRegistroAlta(new Date());
				a1TO.setCveIdUsuario("MASC870401GQ8");
				bitacoraErroresTO = ValidatorTO.validateA1((a1TO));
				bitacoraErroresTO.setCveIdBitacoraCargaAsev(Long.valueOf(cveIdBitacoraCargaAsev));
				a1TO.setBitacoraErroresTO(bitacoraErroresTO);				
				return a1TO;
			case 2:
				A2TO a2TO = (A2TO)fieldSetMapper.mapFieldSet(tokenizer.tokenize(paramString), BatchAseveracionesEnum.A2, paramInt);
				a2TO.setCveIdPatronDictamen(cveIdPatronDictamen);
				a2TO.setCveIdAseveracion(idAseveracion);
				a2TO.setFecRegistroActualizado(new Date());
				a2TO.setFecRegistroAlta(new Date());
				a2TO.setCveIdUsuario("MASC870401GQ8");					
				bitacoraErroresTO = A2Validator.validateA2((a2TO));
				bitacoraErroresTO.setCveIdBitacoraCargaAsev(Long.valueOf(cveIdBitacoraCargaAsev));
				a2TO.setBitacoraErroresTO(bitacoraErroresTO);				
				return a2TO;
			default:
				return null;
			}			
			
		} catch (Exception ex) {
			throw new FlatFileParseException("Parsing error at line: " + paramInt + ", input=[" + paramString + "]", ex,
					paramString, paramInt);
		}
	}
	
	public void setLineTokenizer(LineTokenizer tokenizer) {
        this.tokenizer = tokenizer;
    }

    public void setFieldSetMapper(ResourceFieldSetMapper fieldSetMapper) {
        this.fieldSetMapper = fieldSetMapper;
    }   
	
	public int getIdAseveracion() {
		return idAseveracion;
	}

	public void setIdAseveracion(int idAseveracion) {
		this.idAseveracion = idAseveracion;
	}
	
    public void afterPropertiesSet() {
        Assert.notNull(tokenizer, "The LineTokenizer must be set");
        Assert.notNull(fieldSetMapper, "The FieldSetMapper must be set");
    }

	public int getCveIdBitacoraCargaAsev() {
		return cveIdBitacoraCargaAsev;
	}

	public void setCveIdBitacoraCargaAsev(int cveIdBitacoraCargaAsev) {
		this.cveIdBitacoraCargaAsev = cveIdBitacoraCargaAsev;
	}

	public int getCveIdPatronDictamen() {
		return cveIdPatronDictamen;
	}

	public void setCveIdPatronDictamen(int cveIdPatronDictamen) {
		this.cveIdPatronDictamen = cveIdPatronDictamen;
	}
}

