/* LINK */
/* const newLink = document.createElement('A');

//href
newLink.href = 'wwww.google.com';
//text
newLink.textContent = 'Link de google';
//clase
newLink.classList.add('navegacion__enlace');

const navegacion = document.querySelectorAll('.navegacion');

navegacion[0].appendChild(newLink); */

/* LINK */
/* const newLink2 = document.createElement('A');

//href
newLink2.href = 'wwww.google.com.ar';
//text
newLink2.textContent = 'Link de google';
//clase
newLink2.classList.add('navegacion__enlace');
newLink.style.margin='5rem';

navegacion[0].appendChild(newLink2); */




/* 
window.addEventListener('load',function(){ //load espera a que js y los archivos que dependen del html estne listos.
    alert('Presiona el Numero');
})

document.addEventListener('DOMContentLoaded', function(){ //solo espera que se descargue el html
    console.log(4);
})

window.onclick = function(){
    alert('Sos medio pelotudo eh!');
}
console.log(5)

const btnEnviar = document.querySelector('.boton__primario');

btnEnviar.addEventListener('click',function(evento){
    console.log(evento);
    evento.preventDefault();

    console.log("Enviando formulario...")
})
 */


//Creamos la variable datosForm(en este caso)  donde se van a gurdar los datos que el usuario ingresara en el form
const datosForm = {
    nombre: '',
    email:'',
    mensaje:'',

}
//Creamos cada una de las variables y seleccionamos su ID puesto en los html o si fueron creados js tambien se los puede meter en una variable ya que estos en si vuelven a ser una variable
//Tambien creamos la variable del formulario (el contenedor padre del form)
//
const nombre = document.querySelector('#nombre');
const email = document.querySelector('#email');
const mensaje = document.querySelector('#mensaje');
const formulario = document.querySelector('#formulario');
const contador = document.createElement('P');
const btnEnviar = document.querySelector('#boton__primario');

formulario.appendChild(contador);

/* nombre.addEventListener('input',function(e){//Pobar 'change'
    console.log(e.target.value);//probar el data
}); */

nombre.addEventListener('input', function(event){
    datosForm.nombre = event.target.value;
   /*  console.log(event.target.value); */
});

email.addEventListener('input', function(event){
    datosForm.email = event.target.value;
  /*   console.log(event.target.value); */
});

mensaje.addEventListener('input', function(event){
    datosForm.mensaje = event.target.value;
    //destructurar
    const {mensaje}= datosForm;
    
    if(mensaje.length >= 20){
        monstrarMensaje("El mensaje es demasiado largo.",true);
        return;
    }
});

btnEnviar.addEventListener('click',function(event){

    console.log('Enviando Formulario');
    event.preventDefault();
});

//Esta funcion crea un Parrafo por unos segundos para alertar al usuario de que el texto sobrepasa el limite de caracteres

function monstrarMensaje(mensaje,error){
    const respuesta = document.createElement('P');
    respuesta.textContent = mensaje;

    if(error){
        respuesta.classList.add('error');
    }else{
        respuesta.classList.add('correcto');
    }
    formulario.appendChild(respuesta);//añadimos respuesta al objeto formulario

    //con setTimeout le digo que haga tal cosa al pasar cierto tiempo
setTimeout(() => {
    respuesta.remove();//remove remueve el elemento que selecciono
},3000);
}

//-----------------------------------------------------------------------------------
//Alerta del sumbit correcto o incorrecto

btnEnviar.addEventListener('sumbit',function(event){
   event.preventDefault();
   //Aca se valida el formulario
    const{nombre, email, mensaje} = datosForm; //descructuring
   
    if(nombre === '' || email ==='' || mensaje ===''){
        monstrarMensaje("Alguno de los campos no se completo", true);
        return;
    }
    //Alerta de succes formulario
    monstrarMensaje("Los datos ingresaron correctamente");

});

function leerTexto(e) {
    datosForm[e.target.id] = e.target.value;

 
};