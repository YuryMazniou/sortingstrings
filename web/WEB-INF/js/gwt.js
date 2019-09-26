function remember() {
    if (typeof(Storage) !== "undefined") {
        localStorage.setItem('userinput', document.getElementById("textArea").value);
    }
    else {
        document.getElementById("textArea").value = "Sorry, your browser does not support web storage.";
    }
}

window.onload = function retrieve() {
    if (typeof(Storage) !== "undefined") {
        if (localStorage.userinput) {
            document.getElementById("textArea").value = localStorage.userinput;
        }
    }
};

$(document).ready(function() {
    $(window).unload(saveSettings);
    loadSettings();
});

function loadSettings() {
    $('input, select').each(function(i,o) {
        $(o).val(localStorage[$(o).attr('id')])
    });
}

function saveSettings() {
    $('input, select').each(function(i,o) {
        localStorage[$(o).attr('id')] = $(o).val();
    });
}