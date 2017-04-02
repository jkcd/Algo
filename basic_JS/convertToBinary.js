/**
 * Created by jramamoorthy on 02/04/17.
 *
 * Given a base- integer, , convert it to binary (base-). Then find and print the
 * base- integer denoting the maximum number of consecutive 's in 's binary representation.
 *
 * Sample Input -> 13
 * Sample output -> 2
 *
 * The binary representation of  13 is 1101, so the maximum number of consecutive 1's is 2.
 *
 */
var rawInput = '';
var inputData = '';
process.stdin.resume();
process.stdin.setEncoding('ascii');


process.stdin.on('data', function (data) {

    rawInput += data;

});

process.stdin.on('end', function () {
   inputData = rawInput.split('\n');
    main();
});

function main(){

    var binStr = convertToBinary(parseInt(inputData[0]));
    console.log('binary no: ' + binStr);
    console.log('max consective 1s: '+ maxOneCount);
}

var maxOneCount = 0;
var oneCount = 0;
function convertToBinary(decimalNo){
    var binaryNoInString = '';

    while( decimalNo > 0 ){

        var rem =  decimalNo % 2;
        binaryNoInString = rem + binaryNoInString;


        //  start - logic is to find max consecutive 1's
        if ( rem == 1 && oneCount == 0){
            oneCount++;
        }
        else if ( rem == 1 && oneCount > 0 ){
            oneCount++;
            if( maxOneCount < oneCount ){
                maxOneCount = oneCount;
            }

        }
        else if ( rem == 0){
            if ( maxOneCount == 0 && oneCount > 0){
                maxOneCount = oneCount;
            }
            oneCount = 0;
        }
        // end - logic is to find max consecutive 1's


        decimalNo = Math.floor(decimalNo/2);

    }

    return binaryNoInString;

}


