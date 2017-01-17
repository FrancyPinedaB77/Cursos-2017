// Filter ES5

var numeros=[10,5,2,22,30,50,13,11,21,8];
/*
var numeros_pares=[];

for (var i=numeros.length;i>=0;i--)
{
	var numero=numeros[i];
	if(numero % 2 ==0){
		numeros_pares.push(numero); // agregla solo los numeros pares 
	}
}

console.log(numeros_pares);
*/
// Metodo 2 para encontrar numeros pares 

var numeros_pares=numeros.filter(function (numero) {
	return numero % 2 ==0;
});

console.log(numeros_pares);