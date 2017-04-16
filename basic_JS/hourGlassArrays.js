/**
 * Created by jramamoorthy on 16/04/17.
 */

process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});

process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();
});

function readLine() {
    return input_stdin_array[input_currentline++];
}


function main() {
    var arr = [];
    for(arr_i = 0; arr_i < 6; arr_i++){
        arr[arr_i] = readLine().split(' ');
        arr[arr_i] = arr[arr_i].map(Number);
    }
    //console.log(arr[0][2]);
    var max;
    var sum = 0;
    for( var row = 0; row < 4; row++){
        for(var col = 0; col < 4; col++){
            // for each hourglass
            var str = '';
            for ( var i = 0; i < 3 ; i++){
                for ( var j = 0; j < 3; j++){
                    if ( !( (i == 1) && ((j ==0 || j==2)) ) ){
                        sum += arr[row+i][col+j];
                        str += ':'+arr[row+i][col+j];
                    }
                }
            }
            //console.log('hourglass:'+ str + ' sum:' + sum);

            if ( sum > max  || max == undefined){
                max = sum;
            }
            sum = 0;
        }
    }
    console.log(max);

}
