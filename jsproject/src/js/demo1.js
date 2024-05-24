function forLoop(){
    let count =0;
    for(let i =0; i<10;i++){
         if(count === 5){
           // continue;
           break;       
         }
        count++;
        console.log("Inside for loop ---"+count);
    }
    console.log("Value of ---"+count);

    const fruits= new Array("Mango","Apple","Banana");
                console.log(fruits.join("*"));

}

//invoking the function
forLoop();

(function(x, f = () => x) {
    var x;
    var y = x;
    x = 2;
    return [x, y, f()];
  })(1)//calling the function without name and passing argument value 1

  function myFunc(x, f = () => x) {
    var x;
    var y = x;
    x = 2;
    return [x, y, f()];
  }
 console.log(myFunc(1));
  

  