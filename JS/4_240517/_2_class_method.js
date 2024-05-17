// 1
// aespa
const aespa = {
    members: ['카리나', '윈터', '지젤', '닝닝'],
    from: '광야',
    sing: function(){
        return "적대적인 고난과 슬픔은 널 더 popping 진화시켜!"
    }
};

console.log(aespa.hasOwnProperty('itzy'));
console.log(aespa.hasOwnProperty('from'));

// 2
// for ... in
const person = {
    name: '재현',
    age: 20,
    gender: 'male'
};

for (let key in person) {
    console.log(`${key}: ${person[key]}`);
}

// 3
// 문자열로 된 key 값을 사용해야 할 때
const testObj = {
    "val1": 10,
    "val2": 20
};

console.log(testObj.val1);
console.log(testObj.val2);

const testObj2 = {
    "1val": 10,
    "2val": 20
};

console.log(testObj2['1val']);
console.log(testObj2['2val']);

// 4
// keys, values
console.log(Object.keys(aespa));
console.log(Object.values(aespa));

// 5
// string의 autoboxing
let val = 'hello!';
console.log(val.toUpperCase());

// 위의 코드가 내부적으로는 아래처럼 실행됩니다. 이것이 바로 autoboxing 입니다.
//
// let val = 'hello!';
// let temp = new String('hello!');
// console.log(temp.toUpperCase());
// temp = null;