import {useState} from 'react';
import sendDetailsToServer from '../service/sendDetailsToServer';
export default function Login(){
  const [userRegData,setUserRegData] =useState({
    userName:"",
    password:"",
    email:"",
    firstName:"",
    lastName:"",
    mobile:"",
    dateOfBirth:""
});

const {userName,password,email,firstName,lastName,mobile,dateOfBirth}=userRegData;//destructuring

const changeHandler = e=>{
        setUserRegData(
            {
                ...userRegData,[e.target.name]: [e.target.value]
            }
        );
    }
    const submitHandler = e=>{
        e.preventDefault();
       sendDetailsToServer(userRegData);
        console.log(userRegData);
    }

    return(
        <div>
        <div>
            <form onSubmit={submitHandler}>
            <div class="form-group">
                <label>Username</label><br />
                <input type="text" class="form-control" placeholder="Enter username" name="userName" value={userName} onChange={changeHandler}/> <br />
            </div>
            <div class="form-group">
                <label>Email</label><br />
                <input type="text" class="form-control" placeholder="Enter email" name="email" value={email} onChange={changeHandler}/> <br />
            </div>
            <div class="form-group">
                <label>Password</label><br />
                <input type="password" class="form-control" placeholder="Password" name="password" value={password} onChange={changeHandler}/> <br />
            </div>
            <div class="form-group">
                <label>First Name</label><br />
                <input type="text" class="form-control" placeholder="Enter first name" name="firstName" value={firstName} onChange={changeHandler}/> <br />
            </div>
            <div class="form-group">
                <label>Last Name</label><br />
                <input type="text" class="form-control" placeholder="Enter last name" name="lastName" value={lastName} onChange={changeHandler}/> <br />
            </div>
            <div class="form-group">
                <label>Mobile</label><br />
                <input type="text" class="form-control" placeholder="Enter mobile" name="m obiler" value={mobile} onChange={changeHandler}/> <br />
            </div>
            <div class="form-group">
                <label>Date of Birth</label><br />
                <input type="text" class="form-control" placeholder="dd/mm/yyyy" name="dateOfBirth" value={dateOfBirth} onChange={changeHandler}/> <br />
            </div>
                {/** <input type="submit" name="submit"/>*/}
                <button type="submit" class="btn btn-primary">Register</button>
            </form>
        </div>
        </div>
);
}