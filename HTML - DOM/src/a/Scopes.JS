"use strict"
var x =5;//global scope

function f1(){
	var y=10; //function scope. 
	//if you dont use "use strict", then after you used the function f1, y turned to be global
	{
		let z=15 //use "let" to avoid z to be in the whole function
	}
	const pi=3.14 //const is like final in JAVA
	//pi++=9, will be error, because the const decliration
	
	console.log(10=="10"); // TRUE, because JS make casting for the type and checks onli the value
	console.log(10==="10"); //
}