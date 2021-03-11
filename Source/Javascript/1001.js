var input = require('fs').readFileSync('./dev/stdin/file.txt', 'utf8');
var lines = input.split('\n');

var sum = parseInt(lines.shift())+parseInt(lines.shift());

console.log("X = " + sum);

