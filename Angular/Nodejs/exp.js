var express = require('express');

var app = express();

app.get('/', function(req, res) {
    res.send('this is the homepage');
});

app.get('/contact', function(req, res) {
    res.send('this is the contact page');
});
app.get('/index/:name', function(req, res) {
    var data = { age: 29, job: 'hima', hobbies: ['eating'] }
    res.render('index', { person: req.params.name, data: data });
});
app.listen(4000);