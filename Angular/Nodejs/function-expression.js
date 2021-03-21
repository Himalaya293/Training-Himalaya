//normal function statement
function sayHi() {
    console.log('hi');
}

sayHi();

//function Expression
var sayBye = function() {
    console.log('bye');
};

sayBye();


//function Expression using callfunction
function callfunction(fun) {
    fun();
}

var sayHello = function() {
    console.log('hello');
};

callfunction(sayHello);