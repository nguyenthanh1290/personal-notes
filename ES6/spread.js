function addNumbers(a, b, c) {
  console.log(a + b + c);
}

const nums = [2, 3, 5];
addNumbers(...nums);

//
const meats = ['heo', 'ga', 'bo', 'tom'];
const food = ['apple', ...meats, 'chuoi', 'bo'];

console.log(food);
