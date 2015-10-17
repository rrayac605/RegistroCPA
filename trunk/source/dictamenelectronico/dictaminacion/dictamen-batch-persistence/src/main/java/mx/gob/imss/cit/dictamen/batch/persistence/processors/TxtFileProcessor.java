package mx.gob.imss.cit.dictamen.batch.persistence.processors;

import java.util.Random;
import java.util.regex.Pattern;

import org.springframework.batch.item.ItemProcessor;

import mx.gob.imss.cit.dictamen.batch.persistence.to.A1TO;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class TxtFileProcessor implements ItemProcessor<A1TO, A1TO> {

	@Override
	public A1TO process(A1TO paramI) throws Exception {
        String expresionRegular = "[^([A-ZÑ\\x26]{3,4}([0-9]{2})(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1]))([A-Z\\d]{3})?$]";
        String cadenaAEvaluar = paramI.getRegPatronal();
        boolean b = Pattern.matches(expresionRegular,cadenaAEvaluar);
        if(b){
            System.out.println("La expresion SI representa la cadena a evaluar: "+cadenaAEvaluar);
        }else{
            System.out.println("La expresion NO representa la cadena a evaluar: "+cadenaAEvaluar);
        }
        paramI.setCveIdA1PercepTrab(""+new Random().nextInt(10000)+"");
//        paramI.setFecRegistroActualizado(new Date().toString());
//        paramI.setFecRegistroAlta(new Date().toString());
        paramI.setCveIdPatronDictamen("63");
        paramI.setCveIdUsuario("MASC870401GQ8");
		return paramI;
	}

}

