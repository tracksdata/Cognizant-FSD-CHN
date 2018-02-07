/*
data Types
-----------
1. Simple types / primitive types ==> values
    a. string
    b. number
    c. boolean
    d. undefined
    e. null
2. complex-types/references ==> objects

*/

//======================================
// 1. Simple Types
//=======================================

// a. sring

var name="Praveen";
var selection='M';
name='Ozviktha';
//---------------------------------------
// b. number

var count=12;
var cost=12.76;

//--------------------------------------

// c. boolean

var found=true;
/*
values in .js-lang
==> false ,0 ,"",undefined,null, NaN

*/

//-------------------------------
// d.undefined

var v;
//-------------------------------
// e. null

var person=null;

//=====================================
//2. reference Types ==> object
//======================================

/*
how to create an object in .js lang?
syntax

==> var ref=new ConstructorFunction();

*/

var person=new Object();
person.name='Praveen';
person.age=87;
person.doWork=function(){
    console.log('Its Working');
}

var arr=new Array();
//arr[0]=100;
//arr[1]=200;
arr.push(10);
arr.push(20);
arr.push('Praveen');
//arr.pop();
//arr.pop();

//------------------------------------
// literal-style object
//------------------------------------

//var p=new Object();
// a. objects
//var config=new Object();
//config.url="http://www.abc.com";
//config.type="JSON";

// or literal style
var config={
    url:"http://xyz.com",
    type:'Json',
    method:'GET' 
};

//-------------------------------------
// b. arrays
//var arr=new Array();
//arr.push('Item-1');
//arr.push('Item-2');

// or using literal style

var arr=['Item-1','Item-2'];

// c. RegExp

//var ssn=new RegExp("\\d{3}-\\d{3}-\\d{4}");
// 123-456-8765
// or 
var ssn=/\d{3}-\d{3}-\d{4}/;

// ----------------------------------------
// d. functions
// Imp Note: every fun in .js lang is an object

//var add=new Function("n1","n2","var result=n1+n2;return result");
// olr literal style

function add(n1,n2){
    var result=n1+n2;
    return result;
}

//------------------------------------------

// How to access .js object properties?

/*
2 Ways
==>'.' for valid indentofier(s)
==> '[]' for invalid indentifier(s)
*/

/*var person={
    name:"Praveen",
    'full-name':""
};

person.name="Praveen Reddy";
person['full-name']="Ozvitha Fernz";
*/
// by default in .js every object is extensible and configurable
var person={name:'James'};
person.age=98;
delete person.age;

//console.log(age);

//-------------------------------------------------------


















































































