var input = require('fs').readFileSync('./dev/stdin/file.txt', 'utf8');
var lines = input.split('\n');

var n = 3.14159;

var raio  = parseFloat(lines.shift());

console.log("A=" + (n * Math.pow(raio,2)).toFixed(4));