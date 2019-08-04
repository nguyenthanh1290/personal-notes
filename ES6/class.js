// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Classes

/*
  - Classes are in fact "special functions" and
  - just as you can define:
    + function expressions and
    + function declarations,
  - the class syntax has two components:
    + class expressions and
    + class declarations.
*/

// 1. Class declarations
class Rectangle {
  constructor(height, width) {
    this.height = height;
    this.width = width;
  }
}

// function declarations are hoisted != class declarations are not
/*
  const p = new Rectangle(); // ReferenceError

  class Rectangle {}
*/

// 2. Class expressions
// unnamed
let Rectangle = class {
  constructor(height, width) {
    this.height = height;
    this.width = width;
  }
};
console.log(Rectangle.name);
// output: "Rectangle"

// named
let Rectangle = class Rectangle2 {
  constructor(height, width) {
    this.height = height;
    this.width = width;
  }
};
console.log(Rectangle.name);
// output: "Rectangle2"
