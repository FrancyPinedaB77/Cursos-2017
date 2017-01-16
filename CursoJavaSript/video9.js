var arreglo = [20,10,5]; //Almacenanr cualquier valor 
var arreglo2 = [1,2,3,4,5]; //Almacenanr cualquier valor 

arreglo.push(7);//pone el elemento al final del arreglo
arreglo.unshift(2);// lo arregla al inicio
arreglo.pop(); //elimina e ultimo elemento del arreglo
console.log(arreglo);


for (var i=0;i<arreglo.lenght;i++){
	console.log(arreglo[i]);
}

for (var i =arreglo2.length;i>=0;i--){
	console.log(arreglo2[i]);
}