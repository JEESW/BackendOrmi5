// 1
// class
class Robot {
    constructor(name) {
        this.name = name;
    }

    sayYourName() {
        console.log(`삐리비리. 제 이름은 ${this.name}입니다. 주인님.`);
    }
}

const r = new Robot("A");
r.sayYourName();

// 2
// class 실습
class Student {
    constructor(name, age, nation) {
        this.name = name;
        this.age = age;
        this.nation =nation;
    }

    canWalk() {
        console.log(`{$this.name}(이)가 걷는다.`);
    }

    studying(subject) {
        subject.levelUp();
    }
}

class Subject {
    constructor() {
        this.level = 1;
    }

    levelUp() {
        this.level++
    }
}

const j = new Student('ji', 25, 'korea');
const algorithm = new Subject();
j.studying(algorithm);
console.log(algorithm.level);

// 3
// class 상속
class BabyRobot extends Robot {
    constructor(name) {
        super(name);
        this.ownName = 'Aike'
    }

    sayBabyName() {
        this.sayYourName();
        console.log('Suceeding you, Father!');
    }
}

const br = new BabyRobot('B');
console.log(r);
r.sayYourName();
console.log(br);
br.sayYourName();
br.sayBabyName();