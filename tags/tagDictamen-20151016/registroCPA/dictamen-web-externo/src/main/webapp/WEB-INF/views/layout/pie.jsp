<%@ include file="../general/taglibs.jsp"%>

<script>
	$(function(){
		$.ajax({
			url : '${staticResourcesPath}/html/layout/footer.html',
			dataType : 'html',
			success : function(html) {
				$('div#footerWrapper').html(html);
			}
		});
	});
</script>

<div id="footerWrapper"></div>