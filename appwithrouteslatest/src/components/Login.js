import React,{useState} from 'react';
import sendDetailsToServer from '../service/sendDetailsToServer';

export default function Login(){
  const [loginData,setLoginData] =useState({
    email:"",
    password:""
});

const {email,password}=loginData;//destructuring

const changeHandler = e=>{
        setLoginData(
            {
                ...loginData,[e.target.name]: [e.target.value]
            }
        );
    }
    const submitHandler = e=>{
        e.preventDefault();
       sendDetailsToServer(loginData);
        console.log(loginData);
    }

    
  return(
    <div className="row mb-3">
    <div>
        <form onSubmit={submitHandler} >
        <div className="form-group row">
            <label className="col-sm-2 col-form-label">User Name</label><br />
            <div class="col-sm-5">
            <input type="text" className="form-control form-control-sm" placeholder="Enter email" name="email" value={email} onChange={changeHandler}/> <br />
            </div>
        </div>
        <div className="form-group row">
            <label className="col-sm-2 col-form-label">Password</label><br />
            <div class="col-sm-5">
            <input type="password" className="form-control form-control-sm" placeholder="Password" name="password" value={password} onChange={changeHandler}/> <br />
            </div>
        </div>
            {/** <input type="submit" name="submit"/>*/}
            <button type="submit" className="btn btn-primary">Submit</button>
        </form>
    </div>
    </div>
    );
    }