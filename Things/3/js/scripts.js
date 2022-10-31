//  Seleccionar los elementos   //
//  titutlo//
/* const titulo = document.getElementById('titulo');
titulo.innerHTML = 'El titulo a sido cambiado' */

//  Por ID
/* 
let elementoPorId = document.getElementById('parrafo1');
elementoPorId.textContent = 'Seleccion por ID'; */
/* elementoPorId.innerHTML = 'html' */

//  Por clase

/* let elementoPorClase = document.getElementsByClassName('parrafos');
console.log(elementoPorClase.length);
elementoPorClase[1].innerHTML = 'Seleccion por clase <br> Y añadi estilos'
//modificacion de estilos
elementoPorClase[1].style.color = 'red'
elementoPorClase[1].style.background = 'black'
elementoPorClase[1].style.display = 'inline-block'
 */
//  Por etiqueta
/* let elementoPorEtiqueta = document.getElementsByTagName('p');
console.log(elementoPorEtiqueta.length);
elementoPorEtiqueta[2].innerHTML = 'Seleccion por etiqueta';
 */
//  Seleccion por NODOS    //

//  por ID
/* let elementoPorId = document.querySelector('#parrafo1');
elementoPorId.innerHTML = 'Lo he cambiado por segunda vez' */

//  por clase
 /* let elementoPorClase = document.querySelectorAll('.parrafos');
console.log(elementoPorClase)
const elementoPorClaseArreglo = [...elementoPorClase];
console.log(elementoPorClaseArreglo)
elementoPorClaseArreglo[1].innerHTML = ('El texto ha sido modificado') 
elementoPorClaseArreglo[1].style.color = ('red') */
//  por etiquetas
/* elementoPorEtiqueta[2] = document.querySelector('p')
elementoPorEtiqueta[2].innerHTML = ('Tambien en este ultimo he cambiando el texto por segunda vez')
elementoPorEtiqueta[2].style.color = ('blue')
 */

//---------------------------------------------------------------------//
//Crear NODOS}
const parrafoExtra = document.createElement('p');
const parrafoCero = document.createElement('p');
const parrafoUno = document.querySelector('#parrafo1')
const parrafoDos = document.querySelector('#parrafo2')
const parrafoTres = document.querySelector('#parrafo3')
const parrafoCuatro = document.createElement('p');
parrafoCuatro.innerHTML = 'parrafo 4';
parrafoCuatro.className = 'parrafos';
parrafoCero.innerHTML = 'parrafo 0'
parrafoExtra.innerHTML = 'parrafo extra'

const parrafoCinco = document.createElement('p');
parrafoCinco.innerHTML = '<strong>parrafo 5</strong>';
parrafoCinco.className = 'parrafos';
parrafoCinco.id = 'parrafo5';

//Seleccionar elemento padre con queryselector
const elementoPadre = document.querySelector('.parrafosContainer');

//Agregar nodos
/* elementoPadre.appendChild(parrafoCuatro); */
elementoPadre.appendChild(parrafoCuatro);
/* elementoPadre.appendChild(parrafoCinco); */
elementoPadre.append(parrafoCuatro,parrafoCinco);
elementoPadre.insertBefore(parrafoCero, parrafoDos);
//beforbegin,beforend,afterbegin,afterend,
/* elementoPadre.insertAdjacentElement('afterbegin',parrafoExtra); */

//añadir una clase
/* parrafoExtra.setAttribute('class','parrafos') */


//-----------------------------------------------------//
//  Eliminar NODOS // // 3 metodos para eliminar

//  ELIMINAR
//RemoveChild // Se debe aplicar sobre el elemento padre
elementoPadre.removeChild(parrafoCero);

//Remove // Este metodo debe aplicarse sobre el nodo a eliminar en si
parrafoCinco.remove();

//RemplaceChild

elementoPadre.replaceChild(parrafoTres,parrafoCuatro );


//-----------------------------------------------------//
//interactuar con los elementos del dom
//
const saludoBtn = document.querySelector('#saludoBtn');
saludoBtn.addEventListener('click', saludo);

/* saludoBtn.removeEventListener('click', saludo); */

function saludo(event){
    console.log(event.target.innerHTML)
}

const userInput = document.querySelector('#userInput');
userInput.addEventListener('keypress', (event)=>{
    if (event.key === 'Enter'){
        console.log(event.target.value);
    }
} )


