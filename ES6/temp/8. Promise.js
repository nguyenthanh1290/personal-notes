/**
Khi một Promise được khởi tạo thì nó có một trong ba trạng thái sau:

    Fulfilled Hành động xử lý xông và thành công
    Rejected Hành động xử lý xong và thất bại
    Pending Hành động đang chờ xử lý hoặc bị từ chối
**/

var promise = new Promise((resolve, reject) => {
    // resolve(`This is resolve.`);
    reject(`Error!`);
});

let promiseSuccess = (message) => console.log(`Result is: ${message}`);
let promiseError = (message) => console.log(`Error is: ${message}`);
let promiseCatch = (message) => console.log(`Catch is: ${message}`);


// promise.then(promiseSuccess, promiseError).catch(promiseCatch);
// promise.then(promiseSuccess).catch(promiseCatch);
promise
    .then(
        (successData) => {
            console.log(`success of thenable 1: ${successData}`);
            return successData;
        }
    ).then(
        (successData) => {
            console.log(`success of thenable 2: ${successData}`);
            return successData;
        }
    ).catch(promiseCatch);