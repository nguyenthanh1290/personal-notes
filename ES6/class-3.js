class Person {
  constructor(name, age) {
    this.name = name;
    this.age = age;
  }

  sayHi () {
    console.log(`Hi, I'm ${this.name}.`);
  }

  displayAge() {
    console.log(`I'm ${this.age} years old.`);
  }
}

class Programer extends Person {
  constructor(name, age, language) {
    super(name, age);
    this.language = language;
  }

  sayHi () {
    console.log(`Hi, I'm ${this.name}, a programer.`);
  }
}

const ju = new Person('Ju', 30);
ju.sayHi();
ju.displayAge();

console.log('----');

const john = new Programer('John', 28, 'JavaScript');
john.sayHi();
john.displayAge();