//Function para permitir somente number
function onlyNumber(e) {
    const charCode = e.charCode ? e.charCode : e.KeyCode;

    if (charCode != 8 && charCode != 9) {
        if (charCode < 48 || charCode > 57) {
            return false;
        }
    }
}

//Function para permirtir somente char
function onlyChar() {
    tecla = event.keyCode;
    if (tecla >= 33 && tecla <= 64 || tecla >= 91 && tecla <= 93
        || tecla >= 123 && tecla <= 159 || tecla >= 162 && tecla <= 191) {
        return false;
    } else {
        return true;
    }
}


