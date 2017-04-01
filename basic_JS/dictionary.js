/**
 * Created by jkcd on 01/04/17.
 *
 * Given  names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers.
 * You will then be given an unknown number of names to query your phone book for.
 * For each queried, print the associated entry from your phone book on a new line in the
 * form name=phoneNumber; if an entry for  is not found, print Not found instead.
 *
 * example
 * Sample Input------
 * 3
 * sam 99912222
 * tom 11122222
 * harry 12299933
 * sam
 * edward
 * harry
 *
 * Sample output -----
 * sam=99912222
 * Not found
 * harry=12299933
 *
 */

var rawInput = '';

process.stdin.resume();
process.stdin.setEncoding('ascii');

process.stdin.on('data', function(data){
    rawInput += data;

});

process.stdin.on('end', function(){
    rawInput = rawInput.split('\n');
    console.log(rawInput);
    main();
});

var phoneMap = [];

function main(){

    updateMap(phoneMap);
    searchKeys();

    //console.log(phoneMap);
}

function updateMap(phoneMap){

    var inputKeyValues = parseInt(rawInput[0]);
    var keyValue='';
    // adding phone numbers to the map
    for( var i = 0; i < inputKeyValues; i ++){
        keyValue = rawInput[i+1].split(' ');
        phoneMap[keyValue[0]] = keyValue[1];
    }
}

function searchKeys(){
    var inputKeyValues = parseInt(rawInput[0]);
    // search and output the finding
    for ( var i = inputKeyValues+1; i < rawInput.length-1; i ++){
        key = rawInput[i];
        if ( phoneMap[key] ){
            console.log(key + '='+phoneMap[key]);
        }
        else{
            console.log('Not Found');
        }
    }
}