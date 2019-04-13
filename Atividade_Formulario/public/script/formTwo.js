const site = document.formTwo.site;
const texto = document.formTwo.texto;

const site_error = document.getElementById("site_error");
const texto_error = document.getElementById("texto_error");

site.addEventListener("blur", siteVerify, true);
texto.addEventListener("blur", textoVerify, true);

const validate = () => {
    if (site.value === "") {
        site.style.border = "2px solid red";
        site_error.textContent = "Campo Obrigatório";
        site.focus();
        return false;
    }

    if (texto.value === "") {
        texto.style.border = "2px solid red";
        texto_error.textContent = "Campo Obrigatório";
        texto.focus();
        return false;
    }
}

function siteVerify() {
    if (site.value !== "") {
        site.style.border = "none";
        site_error.innerHTML = "";
        return true;
    }
}

function textoVerify() {
    if (texto.value !== "") {
        texto.style.border = "none";
        texto_error.innerHTML = "";
        return true;
    }
}