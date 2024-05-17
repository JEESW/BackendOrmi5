// 1
// class 예제
const babaYaga = {
    name: "John Wick",
    age: 53,
    from: "벨라루스",
    askingHim(){
        console.log("Yeah, I'm thinking I'm back!");
    }
};

console.log(`${babaYaga.name} from ${babaYaga.from}`);
console.log(`${babaYaga['name']} from ${babaYaga['from']}`);

babaYaga.job = "Killer";

delete babaYaga.job;

console.log('age' in babaYaga);
console.log('mercy' in babaYaga);