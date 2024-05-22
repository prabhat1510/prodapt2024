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