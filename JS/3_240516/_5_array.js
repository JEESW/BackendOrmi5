// 1
// const array
const myArr = [1, 2, 3, 4, 5];
console.log(myArr);
myArr.push(10);
console.log(myArr);

const myArr2 = myArr;
console.log(myArr2);
myArr.push(11);
console.log(myArr2);

// 2
// array
const arr = [1, 2, 3];
// 배열 안의 원소에 접근하기 위해서는 인덱스 번호를 이용합니다.
console.log(arr[0]); // 1
console.log(arr[1]); // 2
console.log(arr[2]); // 3
console.log(arr[3]); // 에러가 아니라 undefined가 듬.

// 3
// length
const myArray= [ 1, 2, 3, 4, 5];
console.log(myArray.length);

// 4
// tensor
const arr2 = [
    [10, 20, [100, 200]],
    [30, 40 ,[300, 400]],
    [50, 60, [500, 600]]
];

console.log(arr2);
console.log(arr2[0]);
console.log(arr2[0][0]);
console.log(arr2[1][2][1]);