/**
 * Block Scoped là phạm vi trong một khối, nghĩa là chỉ hoạt động trong phạm vi được khai báo bời cặp {}.
 * */

/** let: thường dùng để khai báo các biến mang tính chất tạm thời, nghĩa là nó chỉ sống trong một phạm vi hoạt động của khối đó thôi,
 *  không sử dụng qua vị trí khác. **/

// var a = 10;
// var b = 20;

// if (a < b) {
//     let tmp = a;
//     a = b;
//     b = tmp;
// }

// console.log("a " + a);
// console.log("b " + b);
// console.log("tmp " + tmp);


/** const **/

const a = 10;
console.log("before change: " + a);
a = 20;
console.log("after change: " + a);

// const info = {
//     name : "Nguyen Van A",
//     domain : "marketlive.net"
// };

// info = {
//     name : "Huynh Hoang Anh",
//     domain : "hoanganh.net"
// };

// console.log(info);