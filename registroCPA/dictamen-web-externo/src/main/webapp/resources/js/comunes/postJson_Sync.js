$.postJSON_Sync = function(url, data, callback) {
    return jQuery.ajax({
        'type': 'POST',
        'url': url,
        'async': false,
        'contentType': 'application/json',
        'data': JSON.stringify(data),
        'dataType': 'json',
        'success': callback
    });
};