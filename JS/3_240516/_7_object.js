// 1
// object
const obj = {
    'name': 'jeesw',
    'age' : 27,
    test_function: function () {
        console.log('hello');
    }
    /*
    이것과 같음.
    test_function {
        console.log('hello');
    }
    */
}

console.log(obj['name']);
obj.test_function();