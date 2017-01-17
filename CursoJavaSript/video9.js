// Metodos para arreglos

function ordenacion(a,b)
{
if (a>b){return 1;}
else if (a<b){return -1;}
else if (a==b){return 0;}
}

var arreglo=[2,,10,5,20,1,50];
arreglo.sort(ordenacion); //ordena el arreglo
arreglo.reverse();

console.log(arreglo);