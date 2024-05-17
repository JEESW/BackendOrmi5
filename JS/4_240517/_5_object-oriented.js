// 1
// object
const me = {
    name : '한재현',
    address : '제주도 제주시 인다 1길',
    phoneNum : '010-8000-0000',
    canWalk : function(){
        console.log('재현이가 걷는다.');
    },
    teaching : function(student){
        student.levelUp();
    }
}

const ormi = {
    level: 1,
    levelUp : function(){
        this.level++;
    }
}

me.teaching(ormi);
console.log(ormi.level);

// 2
// object 실습
// const j = {
//     name : 'ji',
//     age : 25,
//     nation : 'Korea',
//     studying : function (subject) {
//         subject.levelUp();
//     }
// }
//
// const algorithm = {
//     level: 1,
//     levelUp: function () {
//         this.level++;
//     }
// }
//
// j.studying(algorithm);
// console.log(algorithm.level);

// 3
// 생성자
let myArr = new Array(1, 2, 3); // 내장 생성자, let myArr = [1, 2, 3]와 같음.
let myArr2 = new Array(4, 5, 6);

console.log(myArr.length);
console.log(myArr2.length);

myArr.forEach(item => console.log(item));
myArr2.forEach(item => console.log(item));

// 4
// 생성자 예제
function Factory(){}
const robot1 = new Factory();

console.log(robot1 instanceof Factory);

// 5
// 생성자 예제
function NewFactory(name){
    this.name = name;
    this.sayYourName = function(){
        console.log(`삐리비리. 제 이름은 ${this.name}입니다. 주인님.`);
    }
}

const robot2 = new NewFactory();
console.log(robot2);
const robot3 = new NewFactory('브랜든');
console.log(robot3);
robot3.sayYourName();
const robot4 = new NewFactory();
console.log(robot2.sayYourName === robot3.sayYourName);

// 4
// prototype
function NewFactory2(name) {
    this.name = name;
}

NewFactory2.prototype.sayYourName = function() {
    console.log(`삐리비리. 제 이름은 ${this.name}입니다. 주인님.`);
}

const robot5 = new NewFactory2();
const robot6 = new NewFactory2();
console.log(robot5.sayYourName === robot6.sayYourName);

// 5
// 생성자와 prototype 실습
function Student(name, age, nation) {
    this.name = name;
    this.age = age;
    this.nation = nation;
}

Student.prototype.canWalk = function (name) {
    console.log(`{$name}가 걷는다.`);
}

Student.prototype.studying = function (subject) {
    subject.levelUp();
}

function Subject() {
    this.level = 1;
}

Subject.prototype.levelUp = function () {
    this.level++;
}

const j = new Student('ji', 25, 'korea');
const algorithm = new Subject();
j.studying(algorithm);
console.log(algorithm.level);

// 6
// 상속
const obj = {
    name: 'test'
}

console.log(obj.hasOwnProperty('name'));

const arr = [1, 2, 3];
console.log(arr.hasOwnProperty('name'));