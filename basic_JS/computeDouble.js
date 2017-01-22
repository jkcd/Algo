/**
 * Created by jkcd on 22/01/17.
 *
 *
 *
 * Declare  variables: one of type int, one of type double, and one of type String.
 * Read  lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your  variables.
 * Use the  operator to perform the following operations:
 * Print the sum of  plus your int variable on a new line.
 * Print the sum of  plus your double variable to a scale of one decimal place on a new line.
 * Concatenate  with the string you read as input and print the result on a new line.


 * Input Format
 * The first line contains an integer that you must sum with .
 * The second line contains a double that you must sum with .
 * The third line contains a string that you must concatenate with .

 * Output Format
 * Print the sum of both integers on the first line, the sum of both doubles (scaled to  decimal place) on the second line,
 * and then the two concatenated strings on the third line.
 *
 */

// local variables and values
var myInt = 4;
var myDub = 2.2;
var myStr = 'learning is ';

var inputInt = 0;
var inputDub = 0.0;
var inputStr = '';

var rawInput ='';
var inputLinesArray = '';

// set up stdin
process.stdin.resume();
process.stdin.setEncoding('ascii');

// read input
process.stdin.on('data', function(data){
    rawInput += data;
});

process.stdin.on('end', function(){
    inputLinesArray = rawInput.split('\n');
    main();
});


function main(){

    myInt += parseInt(inputLinesArray[0]);
    myDub = (parseFloat(inputLinesArray[1]) + myDub).toFixed(1);
    myStr += inputLinesArray[2];

    console.log(myInt);
    console.log(myDub);
    console.log(myStr);
}