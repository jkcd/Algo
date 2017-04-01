/**
 * Created by jkcd on 23/01/17.
 *
 *
 * Given the meal price (base cost of a meal), tip percent(the percentage of the meal price being added as tip),
 * and tax percent (the percentage of the meal price being added as tax) for a meal,
 * find and print the meal's total cost.
 *
 * Input Format
 * There are 3 lines of numeric input:
 * The first line has a double,  (the cost of the meal before tax and tip). ex: 13.00
 * The second line has an integer,  (the percentage of  being added as tip). ex: 10
 * The third line has an integer,  (the percentage of  being added as tax). ex: 5
 *
 *
 *
 *
 */

var rawInput = '';
var inputLinesArray;

var price = 0.0;
var tip = 0;
var tax = 0.0;

process.stdin.resume();
process.stdin.setEncoding('ascii');

process.stdin.on('data', function(data){
    rawInput += data;
});

process.stdin.on('end', function(){
    inputLinesArray = rawInput.split('\n');
    main();
});



function main(){
    price = parseFloat(inputLinesArray[0]);
    tip = parseFloat(inputLinesArray[1]);
    tax = parseFloat(inputLinesArray[2]);
    //console.log('price:' + price +' percent:' + percent + ' tax:' + tax);

    tip = (price * tip/100);
    tax  = (price * tax/100);
    price = Math.round(price + tip + tax);

    console.log('tip: ' + tip);
    console.log('tax: '+ tax);
    console.log('total cost is: '+ price);

}


