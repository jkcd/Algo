/**
 * Created by jkcd on 28/01/17.
 *
 * Given an array, , of  integers, print 's elements in reverse order as a single line of space-separated numbers
 *
 *
 *
 */

var rawInput = '';
var inputLinesArray;
var outputArray = [];

process.stdin.resume();
process.stdin.setEncoding('ascii');

process.stdin.on('data', function(data){
    rawInput += data;
});

process.stdin.on('end', function(){
    inputLinesArray = rawInput.split('\n');
    inputLinesArray = rawInput.split(' ');
    inputLinesArray = inputLinesArray.map(Number);
    main();
})


function main(){
    console.log('input: ' + inputLinesArray);
    for ( var i = inputLinesArray.length- 1, j= 0; i >= 0; i--, j++){
        outputArray[j] = inputLinesArray[i];
    }
    console.log('output: ' + outputArray);

}