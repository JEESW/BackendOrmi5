// 1
// return 종료
function Hello() {
    console.log('hello');
    console.log('hello');
    console.log('hello');
    return;
    console.log('hello');
    console.log('hello');
    console.log('hello');
}

Hello();

// 2
// argument 개수에 따른 반환
function f1 (a, b, c) {
    console.log(c);
    return a + b + c;
}
console.log(f1);
console.log(f1(10, 20, 30, 40));
console.log(f1(10, 20));    // c가 undefined이므로 NaN을 반환함.

// 3
// 함수 선언문과 함수 표현식
function sum(x, y) {
    return x + y;
}

let sumXY = function (x, y) {
    return x + y;
};

console.log(sum(10, 20));
console.log(sumXY(10, 20));

// 4
// 화살표 함수
function f2(x, y) {
    return x + y;
}

// 위 함수를 화살표 함수로 작성하면 아래와 같다.
let ft1 = (x, y) => x + y;

// 만악 함수 실행시 전달하는 인자가 한 개라면 소괄호를 생략할 수 있다.
let ft2 = x => x + 10;

// 화살표 함수 내부에서 한 줄 표현식만 반환한다면 return 키워드를 생략해도 된다.
let ft3 = x => x + 10;

let result = ft3(2);
console.log(result);

// 5
// 즉시실행함수 (IIFE 패턴)
(function() {
    console.log('이 함수는 만들어지자마자 바로 실행됩니다!');
})();

(function() {
    document.querySelector(".btn").addEventListener("click", function(){
        console.log('click!');
    });
})();