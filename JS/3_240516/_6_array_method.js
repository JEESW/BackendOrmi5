// 1
// push, pop
const arr3 = [1, 2, 3];
arr3.push(4);
console.log(arr3); // [1, 2, 3, 4]
arr3.pop();
console.log(arr3); // [1, 2, 3]

// 2
// shift, unshift
const arr4 = [1, 2, 3];
arr4.unshift(100);
console.log(arr4);
arr4.shift();
console.log(arr4);

// 3
// splice
const arr5 = [1, 2, 3];
arr5.splice(1, 0, 4);
console.log(arr5); // [1, 4, 2, 3]
arr5.splice(2, 1, 5);
console.log(arr5); // [1, 4, 5, 3]
arr5.splice(1, 2, 100);
console.log(arr5); // [1, 100, 3]

// 4
// slice
const fruits = ["apple", "banana", "cherry", "durian", "elderberry"];
console.log(fruits.slice(1, 4));
console.log(fruits.slice());
console.log(fruits.slice(0, 10));

// 5
// sort
const avengers = ['아이언맨', '스파이더맨', '헐크', '토르'];
console.log(avengers.sort());

const nums = [1, 11, 3, 22, 2, 33];
console.log(nums.sort());
console.log(nums.sort((a,b) => a - b));
console.log(nums.sort((a,b) => b - a))

// 6
// forEach

const fruits2 = ['참외', '키위', '감귤'];
fruits2.forEach((item)=> console.log(item));

fruits2.forEach((item, index, arr) => {
    console.log(item);
    console.log(index);
    console.log(arr);
});

// 7
// map
const arr6 = [10, 20, 30];
const newArr = arr6.map((item, index) => {
    return item * index;
});

console.log(newArr);

const data = [
    {
        "_id": "642ba3980785cecff3f39a8d",
        "index": 0,
        "age": 28,
        "eyeColor": "green",
        "name": "Annette Middleton",
        "gender": "female",
        "company": "KINETICA"
    },
    {
        "_id": "642ba398d0fed6e17f2f50c9",
        "index": 1,
        "age": 37,
        "eyeColor": "green",
        "name": "Kidd Roman",
        "gender": "male",
        "company": "AUSTECH"
    },
    {
        "_id": "642ba39827d809511d00dd8d",
        "index": 2,
        "age": 39,
        "eyeColor": "brown",
        "name": "Best Ratliff",
        "gender": "male",
        "company": "PRISMATIC"
    }
];

const ages = data.map ((item) => item.age);
console.log(ages);

// 8
// filter
const arr7 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
const newArr2 = arr7.filter(el => el % 2 === 0);

console.log(newArr2);

// 9
// include
const arr8 = ['hello', 'world', 'hojun'];
console.log(arr8.includes('world'));