import CustomerForm from './CustomerForm';
import CustomerDetails from './CustomerDetails';
import {useState} from 'react';
function CustomerList ({cust}){
    
    const [customer,setCustomer]=useState({
        firstName:"", 
        lastName:"",
        email:""});

    const addCustomer=()=>{
        setCustomer(cust);
    };
    return( 
            <div className="row">
                <div className="col-md-6">
                     <CustomerForm />
                </div>
                <div className="col-md-2"></div>
                <div className="col-md-4">
                    <CustomerDetails />
                </div>
            </div>
        );
}

export default CustomerList;