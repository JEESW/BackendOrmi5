//1
// if - else
let x = 3;
let y = 7;

if (x == y) {
    console.log('if문으로 실행되었습니다.');
}
else {
    console.log('else문으로 실행되었습니다.');
}

//2
// if - else if - else
let score = 69;
let money = 1000;

if (score > 90){
    console.log('참 잘했습니다!<br>');
    money += 100000
} else if (score > 80){
    console.log('잘했습니다!<br>');
    money += 10000
} else if (score > 70){
    console.log('했습니다!<br>');
    money += 1000
} else {
    money = 0
}

console.log(money);

// 3
// if문 예제
// 두 가지 수를 전달하면 두 수의 합을 반환하는 함수를 만들려고 한다.
// 이때, 두 가지 수를 전달하지 못했을 경우 “두 가지 수를 전달해야 합니다” 라는 메시지를 출력해야 한다.

function add(val1, val2) {
    if (!(val1 + val2)) {
        console.log("두 가지 수를 전달해야 합니다.")
    }

    return val1 + val2;
}

console.log(add(1));
console.log(add(1, 2));

// 4
// 삼항연산자
let item = true ? console.log('true') : console.log('false');
console.log(item);  // console.log()의 반환값이 undefined임.

let i = (10 > 6) ? 2 : 5;
console.log(i);

// 5
// 삼항연산자와 if문
let price = 5000;

let message = (price > 6000) ? '비싸요!' :
    (price < 3000) ? '엄청싸요!' : '적당해요!';

// 위의 코드는 아래와 같다.
let price1 = 5000;
let message1 = '';

if (price1 > 6000) {
    message1 = '비싸요!';
} else if (price1 < 3000) {
    message1 = '엄청싸요!';
} else {
    message1 = '적당해요!';
}

// 6
// 삼항연산자 예제
// 두 수 a와 b를 입력받고, a와 b 중 더 큰 수를 출력하는 코드를 만들어보자.
// 이때, a와 b가 같은 경우 "같은 숫자입니다"라는 문장을 출력하라.

// prompt에서 읽는 방법.

let a = Number(prompt('첫 번째 값을 입력하세요.'));
let b = Number(prompt('두 번째 값을 입력하세요.'));

console.log((a > b) ? a : (a === b) ? '같은 숫자 입니다' : b);

// Node.js를 이용하여 console에서 읽는 방법.

// const readline = require('readline');
//
// const rl = readline.createInterface({
//     input: process.stdin,
//     output: process.stdout
// });
//
// rl.question('첫 번째 값을 입력하세요: ', (firstInput) => {
//     rl.question('두 번째 값을 입력하세요: ', (secondInput) => {
//         const a = Number(firstInput);
//         const b = Number(secondInput);
//
//         const result = (a > b) ? a : (a === b) ? '같은 숫자 입니다' : b;
//         console.log(result);
//
//         rl.close();
//     });
// });

'10'.charCodeAt();