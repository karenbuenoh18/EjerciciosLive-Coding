// API
const API_ENDPOINT = 'https://yesno.wtf/api';
let btnAnswer = document.getElementById("button");
let respuesta = document.getElementById("answer");


btnAnswer.addEventListener ("click", function (e) {
    e.preventDefault();
    fetchAnswer(); 
});//btnAswer

function fetchAnswer(){
    let promesa = fetch (API_ENDPOINT, {
        method: "GET"
    });
    
    promesa.then ((response) => {
        response.json().then ((data) =>{
            console.log(data);
             
            respuesta.innerHTML += `Tu respuesta es: ${data.answer}, ${data.forced}, ${data.image}`; 
            
            }).catch((error) => {
                console.error("Hay algún problema con tu respuesta" + error);
        });//catch
        }).catch((error) =>{
            console.log("Error en tu solicitud" + error);
    });//catch
    /* ball__answer.style.display ="block"; 
            setTimeout(() => {ball__answer.style.display = "none"}, 7*1000); */
};


/**
 * STEPS:
 *
 * 1. Create a fetchAnswer function and call the API
 * 2. Output the API's response
 * 3. Attach fetchAnswer to an event listener
 * 4. Clear output after 3 seconds
 * 5. Optional: add loading/error states
 *
 */
