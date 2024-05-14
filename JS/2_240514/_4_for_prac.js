// 1
// for문
const cars = ["BMW", "Volvo", "Saab", "Ford", "Flat", "Audi"];

let text = "";

// text += '<section><h2>' + cars[0] + '</section></h2>';
// text += '<section><h2>' + cars[1] + '</section></h2>';
// text += '<section><h2>' + cars[2] + '</section></h2>';
// text += '<section><h2>' + cars[3] + '</section></h2>';
// text += '<section><h2>' + cars[4] + '</section></h2>';
// text += '<section><h2>' + cars[5] + '</section></h2>';

for (let i = 0; i < cars.length; i++) {
    text += '<section><h2>' + cars[i] + '</section></h2>';
}

console.log(text);
document.body.innerHTML = text;