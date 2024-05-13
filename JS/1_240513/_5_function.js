function Hi(par){
    console.log(par);
    console.log('안녕!!');
    console.log('안녕!!');
    console.log('안녕!!');
    console.log('안녕!!');
    console.log('안녕!!');
    return 100;
}

let arg = 1000;
Hi(arg);
console.log(Hi(arg) + Hi(arg));

function 안녕() {
    console.log('Hello');
    return 10;
}

안녕();
console.log(String(안녕()) + String(안녕()));