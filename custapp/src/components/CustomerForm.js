import React,{useState} from 'react';
export default function CustomerForm(){
  const [custData,setCustData] =useState({
    id:"",
    email:"",
    firstName:"",
    lastName:"",
});

const {id,email,firstName,lastName}=custData;//destructuring

let counterForId=0;
const changeHandler = e=>{
    
    setCustData(
        
            {
                ...custData,[e.target.name]: [e.target.value]
            }
        );
    }
    const submitHandler = e=>{
        e.preventDefault();
        
        console.log(custData);
    }

    
  return(
    <div>
        <h1>Add Customer</h1>
    <div>
        <form onSubmit={submitHandler}>
        
        <div class="form-group input-group input-group-sm mb-3 w-100">
            <label>First Name</label><br />
            <input type="text" class="form-control" placeholder="First Name" name="firstName" value={firstName} onChange={changeHandler}/> <br />
        </div>
        <div class="form-group input-group input-group-sm mb-3 w-100">
            <label>Last Name</label><br />
            <input type="text" class="form-control" placeholder="Last Name" name="lastName" value={lastName} onChange={changeHandler}/> <br />
        </div>
        <div class="form-group input-group input-group-sm mb-3 w-100">
            <label>Email</label><br />
            <input type="text" class="form-control" placeholder="Enter email" name="email" value={email} onChange={changeHandler}/> <br />
        </div>
            {/** <input type="submit" name="submit"/>*/}
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</div>
);
}

//export default CustomerForm;