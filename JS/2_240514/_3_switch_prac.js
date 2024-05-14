// 1
// switch
switch (new Date().getDay()) {
    case 1:
        console.log('월요일입니다.');
        break;
    case 2:
        console.log('화요일입니다.');
        break;
    case 3:
        console.log('수요일입니다.');
        break;
    case 4:
        console.log('목요일입니다.');
        break;
    case 5:
        console.log('금요일입니다.');
        break;
    default:
        console.log('금금요일입니다. 주말이 뭐죠?');
        break;
}

// 2
// 예제
// 사용자로부터 입력받은 성적에 따라 등급을 출력하는 프로그램을 작성하라.
// 성적이 90점 이상이면 "A", 80점 이상이면 "B", 70점 이상이면 "C", 60점 이상이면 "D", 그 외에는 “강해져서 돌아와라”를 출력한다.

// prompt에서 읽는 방법.

let score = Number(prompt('성적을 입력하시오.'));

// if문

// if (score >= 90) {
//     console.log('A');
// }
// else if (score >= 80) {
//     console.log('B');
// }
// else if (score >= 70) {
//     console.log('C');
// }
// else if (score >= 60) {
//     console.log('D');
// }
// else {
//     console.log('강해져서 돌아와라');
// }

// switch문 방법 1

switch (parseInt(score / 10)) {
    case 10, 9:
        console.log('A');
        break;
    case 8:
        console.log('B');
        break;
    case 7:
        console.log('C');
        break;
    case 6:
        console.log('D');
        break;
    default:
        console.log('강해져서 돌아와라');
        break;
}

// switch문 방법 2

// switch (true) {
//     case score >= 90:
//         console.log('A');
//         break;
//     case score >= 80:
//         console.log('B');
//         break;
//     case score >= 70:
//         console.log('C');
//         break;
//     case score >= 60:
//         console.log('D');
//         break;
//     default:
//         console.log('강해져서 돌아와라');
//         break;
// }

// Node.js를 이용하여 console에서 읽는 방법.

// const readline = require('readline');
//
// const rl = readline.createInterface({
//     input: process.stdin,
//     output: process.stdout
// });
//
// rl.question('성적을 입력하시오: ', (s_input) => {
//     let score = Number(s_input);
//
//     switch (parseInt(score / 10)) {
//         case 10, 9:
//             console.log('A');
//             break;
//         case 8:
//             console.log('B');
//             break;
//         case 7:
//             console.log('C');
//             break;
//         case 6:
//             console.log('D');
//             break;
//         default:
//             console.log('강해져서 돌아와라');
//             break;
//     }
//
//     rl.close();
// })