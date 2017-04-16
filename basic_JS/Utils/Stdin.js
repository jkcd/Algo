/**
 * Created by jramamoorthy on 02/04/17.
 *
 *
 */


function processInput() {


    var rawInput = '';
    var inputData = '';
    process.stdin.resume();
    process.stdin.setEncoding('ascii');


    process.stdin.on('data', function (data) {

        rawInput += data;

    });

    process.stdin.on('end', function () {
        processRawInput();
    });

    function processRawInput() {
        inputData = rawInput.split('\n');

    }

    return {
        s
        readInputData: function readInputData() {
            return inputData;
        }
    }


}

module.exports.processInput = processInput;

