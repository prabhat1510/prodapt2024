class Employee{
    constructor(empId,empName){
        this.id=empId;
        this.name=empName;
    }

    getId(){
        console.log("The employee id is :  "+this.id);
    }
    getName(){
        console.log("The employee name is :  "+this.name);
    }
}


function start(){
    var emp = new Employee(1,"Sidhartha");
    emp.getId();
    emp.getName();
}

start();