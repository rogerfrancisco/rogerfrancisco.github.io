$(document).ready(function (){
    $("#home").click(function(){
        $("section").load('home.html');

    });
    $("#perfil").click(function(){
        $("section").load('perfil.html');

    });
    $("#projetos").click(function(){
        $("section").load('projetos.html');

    });
    $("#contato").click(function(){
        $("section").load('contato.html');

    });
});