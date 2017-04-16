/**
 * Created by jramamoorthy on 02/04/17.
 *
 * Write a factorial function that takes a positive integer,  as a parameter and prints the result of  ( factorial).
 *
 * 2 < N < 12
 *
 * Sample Input -> 3
 * Sample output -> 6
 *
 *  program must contain a recursive function named factorial.
 *
 *
 */

var rawInput ='';
var inputNo = 0;
process.stdin.resume();
process.stdin.setEncoding('ascii');

process.stdin.on('data', function(data){
    rawInput += data;
});

process.stdin.on('end', function(){

    rawInput = rawInput.split('\n');
    inputNo = parseInt(rawInput[0]);
    main();

});

function main(){
    var outputNo = 0;
    if ( inputNo > 0 ){
        outputNo = factorial(inputNo);
    }
    console.log('output: ' + outputNo);
}

function factorial(inputNo){
    if ( inputNo == 1 ){
        return 1;
    }
    return inputNo * factorial(inputNo - 1);

}