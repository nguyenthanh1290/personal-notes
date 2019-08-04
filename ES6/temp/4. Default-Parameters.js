

/** Cách cũ **/
// function defaultP(message) {

//     message = message || "default parameters";
//     console.log(message);
// }
// defaultP();
// defaultP("hello ES6");





/** ES6 **/
var defaultPES6 = (message = 'default parameter') => console.log(message);
// defaultPES6();
defaultPES6("default parameter in ES6.");
