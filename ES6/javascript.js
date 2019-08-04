// this vs self

// https://stackoverflow.com/questions/962033/what-underlies-this-javascript-idiom-var-self-this
// https://alistapart.com/article/getoutbindingsituations

var john = {
    name: 'John',
    greet: function(person) {
        console.log("Hi " + person + ", my name is " + this.name);
    }
};
// var fx = john.greet;
// fx("Mark");
// fx.call(john, "Mark");
var f = john.greet.bind(john);
f("fsdsfds");
f("23233232");