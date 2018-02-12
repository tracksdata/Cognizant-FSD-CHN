/*
how to create functions in .js lang?
2 ways
-------
way 1: Function delaration/Named function
==> function object get created at
    context-creation phase
==> Always get hosisted with fun-object

Way-2: Function expression/Anonymos function
==> Function object get created at
    context-execution phase.
==> will not get hosited with fun-object,
    we should invoke after expression
==> To create funtion-obj based on input
    params or conditions
*/


//--------------------------------------

// Way -1 : Function Declaration/named fun


/*function add(x,y){
    console.log('-- add function '+(x+y));
}

add(10,20);
*/

// Way-2: Function Expresions

/*
var f=function(){
  console.log("Welcome to Expressions");    
}
f();
*/
/*
var add=function(x,y){
   // console.log("Sum is "+(x+y));
    return x+y;
}
//console.log(add(100,200));

var s=add(100,200);
*/
/*
var teach=function(){
    console.log('--- Teaching');

    var learn=function(){
        console.log('--- learning')
    }   
    return learn;
}
var l=teach();
l();
*/
//----------------------------------------
// Function as values

/*function sayHello(){
    console.log('hello');
}

//sayHello();

var sayHi=sayHello;
sayHi();
*/

/*var arr=[2,8,3,10,5,4,9];
//arr.sort();
var custom=function(a,b){
    return a-b;
}
arr.sort(custom);
console.log(arr);   
*/

// Function as return type

/*function teach(){
    console.log('teaching..');
    function learn(){
        console.log('learning..')
    }
    return learn;
}

var learnFun=teach();
learnFun();
learnFun();
*/

//------------------------------------
function giveBack(a,b,c){
  console.log(arguments);
}

//giveBack(10,20,30,40);

function sum(){
    var i=0;
    var len=arguments.length;
    var result=0;
    while(i<len){
        result=result+arguments[i];
        i++;
    }
    return result;
}

var s=sum(10,20);
//console.log('Sum is '+s);

{
  let age=20;
  //console.log('Age: '+age);
}

function f1(){
    console.log('f1 function');
}

function f1(x){
    console.log('X: '+x);
}

f1(10);


// -----------* ---------------


















