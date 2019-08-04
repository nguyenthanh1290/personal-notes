// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Using_promises

function doSomething() {
  return new Promise((resolve, reject) => {
    console.log("It is done.");
    // Succeed half of the time.
    if (Math.random() > .5) {
      resolve("SUCCESS")
    } else {
      reject("FAILURE")
    }
  })
}

function successCallback(result) {
  console.log("It succeeded with " + result);
}

function failureCallback(error) {
  console.log("It failed with " + error);
}

doSomething().then(successCallback, failureCallback);

// Guarantees
// Chaining

doSomething()
.then(result => doSomethingElse(result))
.then(newResult => doThirdThing(newResult))
.then(finalResult => {
  console.log(`Got the final result: ${finalResult}`);
})
.catch(failureCallback);

// Important: Always return results, otherwise callbacks won't catch the result of a previous promise.

// Chaining after a catch

new Promise((resolve, reject) => {
  console.log('Initial');

  resolve();
})
.then(() => {
  throw new Error('Something failed');
      
  console.log('Do this');
})
.catch(() => {
  console.log('Do that');
})
.then(() => {
  console.log('Do this, no matter what happened before');
});

// Initial
// Do that
// Do this, no matter what happened before