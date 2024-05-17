// 1
// this 예제
function testfunc() {
    console.log(this);
}

testfunc();
window.testfunc();  // window는 생략이 가능하다. 따라서 위의 결과와 같다.

// 2
// this 예제
let myObj = {
    val1: 100,
    func1: function () {
        console.log(this);
    }
}

// 이 경우는 test에 func1의 내용을 복사하므로 전역 공간인 window를 가르킨다.

let test = myObj.func1;
test();

// 이 경우는 this가 myObj를 가르켜 myObject를 출력하고 undefined를 반환한다.

let test2 = myObj.func1();

myObj.func1();
console.log(test2);

// 3
// this 예제
function sayName(){
    console.log(this.name);
}

var name = 'Hero';
// 전역으로 선언한 name 변수의 앞에는 window 가 생략되어 있습니다.
// 때문에 window.name === "Hero" 가 성립합니다.

let peter = {
    name : 'Peter Parker',
    sayName : sayName
}

let bruce = {
    name : 'Bruce Wayne',
    sayName : sayName
}

sayName();
peter.sayName();
bruce.sayName();

/* sayName() 함수를 실행했을 때와
peter, bruce 객체의 sayName 함수를 호출했을 때의 결과를 비교해 보세요 */

// 4
// 객체 배열에서 this

let 호텔 = [{
    '이름' : '하나호텔',
    '위치' : '제주도 제주시 001',
    '가격' : {'A':50000, 'B':30000, 'C':15000},
    '방의개수' : 50,
    '예약자수' : 25,
    '남은방의개수' : function(){return this.방의개수 - this.예약자수}
},{
    '이름' : '둘호텔',
    '위치' : '제주도 제주시 002',
    '가격' : {'A':100000, 'B':60000, 'C':30000},
    '방의개수' : 100,
    '예약자수' : 30,
    '남은방의개수' : function(){return this.방의개수 - this.예약자수}
},{
    '이름' : '셋호텔',
    '위치' : '제주도 제주시 003',
    '가격' : {'A':80000, 'B':50000, 'C':30000},
    '방의개수' : 120,
    '예약자수' : 80,
    '남은방의개수' : function(){return this.방의개수 - this.예약자수}
}];
console.log(호텔[0].남은방의개수());
console.log(호텔[1].남은방의개수());
console.log(호텔[2].남은방의개수());

// 5
// this 예제
function sayName(){
    console.log(this.name);
}
var name = 'Hero';

let peter = {
    name : 'Peter Parker',
    sayName : sayName
};

let bruce = {
    name : 'Bruce Wayne',
    sayName : peter.sayName
};

bruce.sayName();