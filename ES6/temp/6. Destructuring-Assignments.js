/**
 * Destructuring Assignments:
 * chức năng này giống hàm list trong PHP vậy, nghĩa là nó sẽ phân các giá trị trong mảng vào các biến theo thứ tự được truyền vào.
 *
 **/


// let date = [24, 5, 2018];

// let [d, m, y] = date;

// console.log(`day: ${d}`);
// console.log(`month: ${m}`);
// console.log(`year: ${y}`);






let date = {
    day: 24,
    month: 5, 
    year: 2018
};

let {day: d, month: m} = date;

console.log(`day: ${d}`);
console.log(`month: ${m}`);
// console.log(`year: ${y}`);








// let date = ["24 May"];
// let [d, m] = date;
// console.log(`day: ${d}`);
// console.log(`month: ${m}`);