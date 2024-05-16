// 1
// while
let num = 0;
while (num < 11) {
    console.log(num);
    num++;
}

// 2
// 1부터 100까지의 숫자 중에서 모든 짝수의 합을 계산하고 출력하는 프로그램을 작성하세요.
let s2 = 0;
let j = 1;
while(j <= 100) {
    if (j % 2 == 0) {
        s2 += j;
    }
    j++;
}

console.log(s2);

// 3
// break
let n = 0;
while (n < 11) {
    console.log(n);
    n++;
    if (n > 5) {
        break;
    }
}

// 4
// break 2
let i = 0;
while (i < 100) {
    i++;
    if (i === 14) {
        console.log(i + '살 부터 중학생이 됩니다.');
        break;
    }
}
console.log('중학교 입학을 축하합니다');

// 5
// continue
for (let i = 0; i < 20; i++) {
    if (i < 13) continue;
    console.log(i + '살은 청소년입니다.');
}