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

    const getSubmitHandler =e=>{
        e.preventDefault();
       sendDetailsToServer(loginData);
        console.log(loginData);
    }
  return(
    <div>
    <div>
        <form onSubmit={submitHandler}>
        <div class="form-group">
            <label>User Name</label><br />
            <input type="text" class="form-control" placeholder="Enter email" name="email" value={email} onChange={changeHandler}/> <br />
        </div>
        <div class="form-group">
            <label>Password</label><br />
            <input type="password" class="form-control" placeholder="Password" name="password" value={password} onChange={changeHandler}/> <br />
        </div>
            {/** <input type="submit" name="submit"/>*/}
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
{/**
<div>
<form onSubmit={getSubmitHandler}>
<label>User Name</label><br />
<input type="text" name="email" value={email} onChange={changeHandler}/> <br />
<input type="submit" name="submit"/>
</form>
</div> */}
</div>
);
}

//export default Login;