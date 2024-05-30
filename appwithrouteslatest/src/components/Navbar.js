import React from 'react';
import {Link} from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.css';

/**function Navbar(){
    return (
            <>
            <nav>
                <ul>
                <li>    
                <Link to ="/home"> Home </Link>
                </li>
                <li>
                <Link to ="/about"> About Us </Link>
                </li>
                <li>
                <Link to ="/login"> Login </Link>
                </li>
                <li>
                <Link to ="/register"> Register </Link>
                </li>
                
                </ul>
            </nav>    
            <Outlet />
            </>

    );
}*/

function Navbar(){
    return(
        <div>
        <nav className="navbar navbar-expand-sm navbar-dark bg-dark">
  <div className="container-fluid">
  <Link className="navbar-brand" href="#" to="/">Top Gun Bank</Link>
    <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span className="navbar-toggler-icon"></span>
  </button>
    <div className="collapse navbar-collapse" id="navbarSupportedContent">
      <ul className="navbar-nav">
        <li className="nav-item">
        <Link className="nav-link active" aria-current="page" href="#" to ="/home"> Home </Link>
        </li>
        <li className="nav-item">
          <Link className="nav-link" href="#" to="/login">Login</Link>
        </li>
        <li className="nav-item">
          <Link className="nav-link" href="#" to="/register">Register</Link>
        </li>
      </ul>
    </div>
  </div>
  
</nav>

</div>
    );
}
export default Navbar;