/**
 * Created by jramamoorthy on 16/04/17.
 */


var rawInput ='';
var inputNo = 0;
var head = null;
process.stdin.resume();
process.stdin.setEncoding('ascii');

process.stdin.on('data', function(data){
    rawInput += data;
});

process.stdin.on('end', function(){

    rawInput = rawInput.split('\n');
    inputNo = parseInt(rawInput[0]);
    main(displayList);


});

function myNode(val){
    this.value = val;
    this.next = null;
}


function main(callback){

    for (var i = 0; i < inputNo; i++){
        var data = parseInt(rawInput[i+1]);
        head = insertNode(head, data);
    }

    callback();

}


function insertNode(head, val){
    var newNode = new myNode(val);
    if ( head == null ){
        head = newNode;
    }
    else {
        for ( var currNode = head; currNode.next != null; currNode = currNode.next){
            // traverse to the end
        }
        currNode.next = newNode;
    }
    return head;
}

function displayList(){

    console.log('displaying linked list');
     for ( var node = head; node!= null; node = node.next){
     console.log('data: '+ node.value);
     }
}