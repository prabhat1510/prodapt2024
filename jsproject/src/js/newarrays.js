var arr =["HTML","CSS","Bootstrap","Java Script","Bootstrap"];

function display(y,x){
    console.log("index value = "+x+" item value = "+y);
}
//forEach
arr.forEach(display); 


//find()
function searchTechnology(tech){
    return tech=="Bootstrap";
}
console.log("***********************************************");
//console.log(arr.find("CSS"));
console.log(searchTechnology("CSS"));

console.log("***********************************************");
console.log(arr.find(searchTechnology));
console.log("***********************************************");

console.log("***********************************************");
var searchTech =arr.find(searchTechnology);
console.log(searchTech);

//filter()
function checkTechs(tech){
    return tech!="Bootstrap";
}
console.log(arr.filter(checkTechs));

//map

function changetoUpperCase(tech){
    return tech.toUpperCase();
}

console.log(arr.map(changetoUpperCase));


var numArray=[24,27,20,12,28];
console.log(numArray.reverse());
console.log(numArray.sort());
console.log(numArray.reverse());
console.log(numArray.toString());
console.log(numArray);