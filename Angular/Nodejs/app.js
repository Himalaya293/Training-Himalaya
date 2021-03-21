console.log('himalaya');

setTimeout(function() {
    console.log('Hello World');
}, 3000);

var time = 0;

var timer = setInterval(function() {
    time = time + 2;
    console.log(time + 'seconds have passed');
    if (time > 5) {
        clearInterval(timer);
    }
}, 2000);