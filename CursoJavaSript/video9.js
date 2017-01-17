// Metodo foreach en arreglos 

var numeros=[2,4,5,6,7,9,10];

numeros.forEach(function(elemento, index,arreglo){
	arreglo[index]=Math.pow(elemento,2);
});

console.log(numeros);