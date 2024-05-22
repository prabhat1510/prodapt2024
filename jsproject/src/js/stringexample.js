/**
 * JS strings are for storing and manipulating text.
 * A JS string is zero or more characters written inside quotes
 */
/**
 * Hello How are you ?
 * 0123456789101112131415161718
 * index start with zero and ends length-1
 */
let text = "Hello How are you ?";
let greetings = 'I am good';
console.log(typeof(text));
console.log(typeof(greetings));

// To find the length of a string , use built-in length property
let lengthOfText= text.length;
console.log(lengthOfText);
//Escape characters-- JS will misunderstand below string so we should use escape characterss

let sentence= "We are the so-called \"Vi\"k\"ings\" from the north";
console.log(sentence);


let sentence1= "We are the so-called 'Vikings' from the north";
console.log(sentence1);


let words = 'For new line characters you * should use \\n . So it is good It\'s nice';
console.log(words);

let words1 = 'For new line characters you * should use \n . So it is good It\'s nice';
console.log(words1);

/**
 * Six other escape sequences valid in JS are :
 * \b    Backspace
 * \f    Form Feed
 * \n    New Line
 * \r    Carriage Return
 * \t Horizontal Tabulator
 * \v Vertical Tabulator
 * 
 * These characters above were originally designed to control typewriters, 
 * teletypes and fax machines.
 * They do not make any sense in HTML
 */
console.log("***************************");
let wordss = 'For new line characters \
you * should use \n . So it is good It\'s nice \
\\r Hope everything is fine.';
console.log(wordss);
console.log("***************************");
let texts ="Hello \
Karthik";
console.log(texts);

/**
 * JS Strings as Object
 * new String()
 */

let name = new String("Karthik");
let n= "Karthik";
console.log(typeof(name));
console.log(name instanceof String);
console.log(typeof(n));
//=== is the strict equality comparison operator
console.log(name === n); //false here name and n are not equal
//== is the abstract equality comparison operator or loosley equality comparator
console.log(name == n);


/***
 * It is know as loose equality operator because it checks abstract equality i.e.
 * it tends to convert the data types of operands in order to carry the comparison
 * when two operands aren't of the same data type.
 * 
 * != checks whether two values are not equal
 * == checks whether two values are not equal
 * x == y
 * x != y
 *  
 * */  
console.log("******************************");
let a = 10;
let b = '10';
console.log(typeof(b));
console.log(a == b); // output is true
console.log("******************************");
let c ='abc';
console.log(typeof(c));
console.log(b == c);// output is false


/**
 * === compares operand and returns true if both operands are of the same data type and have some value
 * otherwise, it returns false
 */
console.log(b === c);
console.log(b === a);
let d ='def';
console.log(typeof(c));
console.log(typeof(d));
console.log(c === d);
console.log("******************************");
