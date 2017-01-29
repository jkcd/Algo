/**
 * Created by jkcd on 27/01/17.
 *
 *
 * Given a string S , of length N that is indexed from 0 to N-1, print its even-indexed and odd-indexed characters as
 *  2 space-separated strings on a single line (see the Sample below for more detail).
 *

 *
 */



var rawInput = '';
var inputLinesArray;
var evenString = '';
var oddString = '';

process.stdin.resume();
process.stdin.setEncoding('ascii');


process.stdin.on('data', function(data){
    rawInput += data;
});

process.stdin.on('end', function(){
    inputLinesArray = rawInput.split('\n');
    console.log(rawInput);
    main();
});

function main(){
    var inputString = inputLinesArray[0];
    console.log(inputString);

    for ( var i = 0; i < inputString.length; i++ ){
        if ( i % 2 ){
            oddString += inputString[i];
        }
        else {
            evenString += inputString[i];
        }

    }
    console.log('even string: ' + evenString);
    console.log('odd string: ' + oddString );

}
