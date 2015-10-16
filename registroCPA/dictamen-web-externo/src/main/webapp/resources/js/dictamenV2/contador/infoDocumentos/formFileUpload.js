/*funcion para generar string de componentes fileupload*/
function _gen_table_(p) {
	var str = "";
	$.each(p.archivos, function(id, obj) {
		if (obj.sublista != null) {
			str += "<div class='form-group' id='sub"+id+"'>" +
				       "<table>" +
					       "<tr>" +
					           "<td width='430px'>" +
								   "<span id='id-span-"+obj.sublista.clave+"' class='glyphicon glyphicon-minus'>&nbsp;</span>" +
							       "<label style='text-align:left;' class='control-label'>" +
							       		obj.sublista.descripcion +
								   "</label>" +
								"</td>" +
							"</tr>" +
						"</table>";
    	    $.each(obj.sublista.archivos, function(idx, objx) {
    	    	str += "<div class='form-group' id='sub2"+id+"'>" +
			       	       "<table>" +
			       	           "<tr>" +
			       	               "<td width='445px'>" +
			    	    			   "<span id='id-span-"+objx.clave+"' class='col-sm-offset-1 glyphicon glyphicon-minus'>&nbsp;</span>" +
				    	    		   "<label style='text-align:left;' class='control-label'>" +
				    	    		       objx.descripcion +
				    			       "</label>" +
			    			       "</td>" +
				    			   "<td>" +
				    			       "<span class='glyphicon glyphicon-paperclip' name='file-"+objx.clave+"'>&nbsp;</span>" +
				    			   "</td>" +
				    			   "<td>" +
				    			       "<input id='file-"+objx.clave+"' style='display:none;' type='file' name='files[]' data-url='" + p.url + "'>" +
				    			       "<div id='progress-file-"+objx.clave+"' class='progressBar'><div></div></div>" +
				    			   "</td>" +
			    			   "</tr>" +
		    			   "</table>" +
    	    		   "</div>";
    	    });
    	    str += "</div>";
    	} else {
    		str += "<div class='form-group' id='"+id+"'>" +
	    			   "<table>" +
	    			       "<tr>" +
		    			       "<td width='430px'>" +
			    				   "<span id='id-span-"+obj.clave+"' class='glyphicon glyphicon-minus'>&nbsp;</span>" +
							       "<label style='text-align:left;' class='control-label'>" +
						       	       obj.descripcion +
								   "</label>" +
								"</td>" +
								"<td>" +
									"<span class='glyphicon glyphicon-paperclip' name='file-"+obj.clave+"'>&nbsp;</span>" +
								"</td>" +
								"<td>" +
									"<input id='file-"+obj.clave+"' style='display:none;' type='file' name='files[]' data-url='" + p.url + "'>" +
								    "<div id='progress-file-"+obj.clave+"' class='progressBar'><div></div></div>" +
							    "</td>" +
							"</tr>" +
						"</table>" +
					"</div>";
    	}
    });
    return str;
}

function progress(percent, $element) {
    var progressBarWidth = percent * ($element.width() - 50) / 100;
    $element.find('div').animate({ width: progressBarWidth + 50 }, 500).text(progressBarWidth+" % ");
}

$.fn.formFileUpload = function (a) {
	var errorAdjuntar = false;
    $(this).html(_gen_table_($.extend({}, $.fn.formFileUpload.defaults, a)));
    $("input[name^='files']").each(function() {
        var f=this;
        $(this).fileupload({
            dataType: 'json',
//            maxFileSize: 5000000, // Maximum File Size in Bytes - 5 MB
//            minFileSize: 100000, // Minimum File Size in Bytes - 100 KB
            acceptFileTypes: /(pdf)|(PDF)$/i,  // Allowed File Types
            done: function (e, data) {
            	errorAdjuntar = false;
            	console.log("EXITO: "+$(this).attr('id').substring(5));
            	$("#id-span-"+$(this).attr('id').substring(5)).removeClass("glyphicon-minus").addClass("glyphicon-ok");
                //aqui funcion despues de subir exitosamente el archivo
                /*$.each(data.result, function (index, file) {
                    $("#uploaded-files").append(
                        $('<tr/>')
                            .append($('<td/>').text(file.fileName))
                            .append($('<td/>').text(file.fileSize))
                            .append($('<td/>').text(file.fileType))
                    );
                });*/
            },
            fail: function (e, data) {
            	errorAdjuntar = true;
            	console.log("FALLO: "+$(this).attr('id').substring(5));
            	$("#id-span-"+$(this).attr('id').substring(5)).removeClass("glyphicon-minus").addClass("glyphicon-remove");
            },
            progressall: function (e, data) {
            	if (!errorAdjuntar) {
            		progress(parseInt(data.loaded / data.total * 100, 10), $('#progress-'+$(f).attr('id')));
				}
            }
        });
    });
    $("span[name^='file-']").click(function() {
    	$("#"+$(this).attr('name')).click();
	});
};

/*opciones por defecto*/
$.fn.formFileUpload.defaults = {
    titulo: "Archivo",
    archivos: [{
        descripcion: "Documento 1",
        clave:"d1"
    }]
};
