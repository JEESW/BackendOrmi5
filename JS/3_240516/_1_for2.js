//1
// for 문
for (let i = 0; i < 10; i++) {
    console.log(i);
}

// 2
// 1부터 100까지 짝수의 합
let s = 0;
for (let i = 0; i < 101; i+=2) {
    console.log(i);
    s += i;
}
console.log(s);

// 3
// 구구단
for (let i = 2; i < 10; i++) {
    for (let j = 1; j < 10; j++) {
        console.log(`${i} X ${j} = ${i*j}`);
    }
}

// 4
// 100보다 작은 3의 배수와 5의 배수의 합
let s1 = 0;
for (let i = 0; i < 100; i++) {
    if (i % 3 == 0 || i % 5 == 0){
        console.log(i);
        s1 += i;
    }
}
console.log(s1);