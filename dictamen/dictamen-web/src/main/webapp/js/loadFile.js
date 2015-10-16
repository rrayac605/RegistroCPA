Dropzone.options.dictaminacionWizard = {
		  paramName: "file", // The name that will be used to transfer the file
		  maxFilesize: 500, // MB
		  accept: function(file, done) {
		    if (file.name == "justinbieber.jpg") {
		      done("Naha, you don't.");
		    }
		    else { done(); }
		  }
		};
 
 
function xDa(){
	alert("load js!!!!");
}