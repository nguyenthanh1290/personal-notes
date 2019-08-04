// 1. destructuring
var foo = {
    bar: 1,
    baz: 2
}

var {bar, baz } = foo;

// with array
var tenses = ["me", "you", "he"];
var [ firstPerson ] = tenses;
var [ firstPerson, secondPerson ] = tenses;

//
Promise.all([promise1, promise2]).then(function([result1, result2]) {

});

// object
var foo = 2;
var obj = {
    bar: 1,
    foo
}

//
function calcBmi(weight, height) {
    var bmi = weight / Math.pow(height, 2);
}
calcBmi(weight, height);
// ->
function calcBmi(weight, height, callback) {
    var bmi = weight / Math.pow(height, 2);
    if (callback) {
        callback(bmi);
    }
}
calcBmi(weight, height, function() {});
// ->
function calcBmi(weight, height, max, callback) {
    var bmi = weight / Math.pow(height, 2);
    if (bmi > max) {
        console.log("You are overweight");
    }
    if (callback) {
        callback(bmi);
    }
}
calcBmi(weight, height, 25);
calcBmi(weight, height, null, function() {});
// ->
function calcBmi({weight, height, max = 25, callback}) {
    var bmi = weight / Math.pow(height, 2);
    if (bmi > max) {
        console.log("You are overweight");
    }
    if (callback) {
        callback(bmi);
    }
}
calcBmi({weight, height, max: 25});
calcBmi({weight, height, callback: function() {} });
// ->
function calcBmi({weight: w, height: h, max = 25, callback}) {
    var bmi = w / Math.pow(h, 2);
    if (bmi > max) {
        console.log("You are overweight");
    }
    if (callback) {
        callback(bmi);
    }
}
calcBmi({weight, height, max: 25});
calcBmi({weight, height, callback: function() {} });


// 2. template strings
var name = "will";
var thing = "party";
var greet = `hi, my name is ${name} and I like to ${thing}!`;

// 3. block scoping (#function scope)
var a = 1;

for (20) {
    let b = 2;
}

console.log(b);
// let is the new var
// const is exactly the same as let, except it cannot be changed

for (20) {
    const bar = {a: 1};
    bar.a = 2;
}

// use case: const -> let -> var

// 4. class
class Parent {
    constructor() {}

    static foo() {}

    baz() {}
}

class Child extends Parent {
    constructor() {}

    baz() {}
}

Parent.foo();

const child = new Child();
child.baz();

// 5. arrow function
var foo = function(a, b) {
    return a + b;
}
// =>
var foo = (a, b) => {
    return a + b;
}

abc.something((a, b) => a + b);

[0,1,2].map(val => val++);