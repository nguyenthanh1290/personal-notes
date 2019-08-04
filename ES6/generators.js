// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Iterators_and_Generators

// Iterators
// Generator
console.log("------Generator.\n");
function* idMaker() {
  let index = 0;
  while (true) {
    yield index++;
  }
}

const gen = idMaker();

console.log(gen.next()); // { value: 0, done: false }
console.log(gen.next().value); // 1
console.log(gen.next().value); // 2

// Iterables
// - User-defined iterables
console.log("------User-defined iterables.\n");
var myIterable = {};
myIterable[Symbol.iterator] = function*() {
  yield 1;
  yield 2;
  yield 3;
};

for (let value of myIterable) {
  console.log(value);
}
// 1
// 2
// 3

//   or

console.log([...myIterable]); // [1, 2, 3]

// - Built-in iterables
/*
    String, Array, TypedArray, Map and Set are all built-in iterables, because their prototype objects all have a Symbol.iterator method.
*/

// - Syntaxes expecting iterables
console.log("------Syntaxes expecting iterables.\n");
for (let value of ["a", "b", "c"]) {
  console.log(value);
}
// "a"
// "b"
// "c"

console.log([..."abc"]); // ["a", "b", "c"]

function* genn() {
  yield* ["a", "b", "c"];
}
genn().next(); // { value: "a", done: false }

let [a, b, c] = new Set(["z", "e", "w"]);
console.log(a); // "z"
