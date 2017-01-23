/**
 * Created by jkcd on 23/01/17.
 *
 *
 *
 * Given an integer, , perform the following conditional actions:

 If  is odd, print Weird
 If  is even and in the inclusive range of 2 to 5, print Not Weird
 If  is even and in the inclusive range of  6 to 20, print Weird
 If  is even and greater than 20, print Not Weird
 *
 */

var rawInput ='';
var inputLinesArray;

process.stdin.resume();
process.stdin.setEncoding('ascii');

process.stdin.on('data', function(data){
    rawInput += data;
});

process.stdin.on('end', function(){
    inputLinesArray = rawInput.split('\n');
    main();
})

function main(){
    var N = parseInt(inputLinesArray[0]);
    var remainder = N%2;
    var isEven = 0;

    isEven = remainder == 0?1:0;
    if ( !isEven ){
        console.log('Weird');
    }
    else if ( N>=2 && N<=5 ){
        console.log('Not Weird');
    }
    else if ( N >= 6 && N <= 20 ){
        console.log('Weird');
    }
    else if( N >= 20 ){
        console.log('Not Weird');
    }
}