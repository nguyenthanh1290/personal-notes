/**
 * Arrow functions
**/

/** Normal way **/
// var hello = function (name, message) {
//     console.log(`Hello ${name}: ${message}`);
// }
// hello("HAnh", "Welcome to Javascript.");











/** Arrow **/
// var helloArrow = (name, message) => console.log(`Hello ${name}: ${message}`);
// helloArrow("HAnh", "Welcome to Arrow function in ES6.");

// var mapArrow = ['demo map 1', 'demo map 2', 'demo map 3'];
// mapArrow.map((value, key) => {
//     console.log(`key: ${key}`);
//     console.log(`value: ${value}`);
// });
var sumab = (a, b) => a + b;
console.log(`tong la: ${sumab(1,5)}`);


/** convention **/
// var func = (x, y) //sai
// => {
//     return x + y;
// };

// var func = (x, y) => // đúng
// {
//     return x + y;
// };

// var func = (x, y) => { // chuẩn
//     return x + y;
// };

// var func = (x, y) => x + y;


