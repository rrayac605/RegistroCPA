$(document).ready(function() {
	/*definicion de dialogFileUpload*/
    $("#idDivDocumentosAdjuntos").formFileUpload({
        url: context_path + "/fileUpload/controller/guardarDocumentoAdjunto.do",
        titulo:"",
        archivos:[
            {
                descripcion:"Documento que acredite la nacionalidad mexicana",
                clave:"cveIdDoc1"
            },{
                descripcion:"Acreditaci\u00F3n",
                clave:"cveIdDoc2"
            },{
                descripcion:"Membres\u00eda",
                clave:"cveIdDoc3"
            },{
                descripcion:"Certificaci\u00F3n expedida por colegio o asociaci\u00F3n",
                clave:"cveIdDoc4"
            },{
            	sublista:{
            		descripcion:"Opiniones de cumplimiento de obligaciones fiscales:",
            		clave:"cveIdSubtitulo1",
            		archivos:[
						{
						    descripcion:"SAT",
						    clave:"cveIdDoc5"
						},{
						    descripcion:"IMSS (En caso de contar con registro patronal vigente)",
						    clave:"cveIdDoc6"
						}
					]
            	}
            }
        ]
    });
});
