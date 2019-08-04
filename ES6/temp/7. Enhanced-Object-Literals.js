//Property value shorthand

// let person = (name, age, address, salary) => {
//     return {
//         name: name,
//         age: age,
//         address: address,
//         salary: salary
//     }
// };
// console.log(person('Nguyen Van A', 18, '2 Tan Vien', 3000));


let person = (name, age, address, salary) => {
    return {
        name,
        age,
        address,
        salary
    }
};
console.log(person('Nguyen Van A', 18, "2 Tan Vien", 3000));
