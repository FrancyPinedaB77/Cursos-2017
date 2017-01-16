function suma(a,b){
	b=b || 0;  // De esta manera permitira  
	return a+b ;
}

function ejecutar (funcion){
	return funcion();
}

var resultado = suma(2);

console.log(resultado);