/**
 * Created by jkcd on 22/01/17.
 */

var rawInput ='';
var inputLines ='';

process.stdin.resume();
process.stdin.setEncoding('ascii');

process.stdin.on('data', function(data){
    rawInput += data;

});
// terminate stdin using ctrl + d
process.stdin.on('end',function(){
    inputLinesArray = rawInput.split('\n');
    main();

})

function main(){
    console.log('Hello World');
    console.log(inputLinesArray[0]);
    console.log('bye');
}