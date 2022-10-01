

/* 2.- Construye una función que reciba por parámetros un array de strings y lo imprima dentro de la lista (<ul></ul>) en el index.html. La función debe mostrar la lista en el HTML manipulando el DOM, cada string del arreglo debe imprimirse en un elemento **<li></li>**. El array que se recibe por parámetros debe ser un array resultante de utilizar la función anterior.

- Escribe una función que reciba 1 parámetro
   - Parámetro 1 - Un array de strings
- La función debe mostrar la lista en el HTML, cada string del arreglo debe imprimirse en un elemento **<li></li>**.
- Ejemplo:
   - `const myArray = ['insecto', 'bootcamp', 'escritorio'];`
   - `printArray(myArray);`
   - Output - `<li>insecto</li>
               <li>bootcamp</li>
               <li>escritorio</li> */


               let ul = document.getElementById("ul");
               let arreglo = ['insecto', 'bootcamp', 'escritorio', 'Mel'];
               
               fun(arreglo);
               
               function fun(Lista){
                   Lista.forEach(element => {
                       ul.innerHTML += `<li>${element}</li>`        
                   });
               }
               
               
               
               
               