var events = require('events');

var eventEmitter = new events.EventEmitter();

var ringbell = function() {
    console.log("rings");
}

eventEmitter.on('open', ringbell);
eventEmitter.on('bellrings', function(message) {
    console.log(message);
})
eventEmitter.emit('open');
eventEmitter.emit('bellrings', 'welcome');