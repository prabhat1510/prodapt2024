import React from 'react';
import {Link} from 'react-router-dom';
import Navbar from './Navbar';
import CustomerList from './CustomerList';
function Home(){
    return (
        <>
    <Navbar />
    <div className="row">
    <div className="row">
        <Link className="nav-link" to="/addCustomer">Creat new customer</Link>
    </div>
    <div className="row">
        <CustomerList />
    </div>
</div>
</>
    );
}

export default Home;