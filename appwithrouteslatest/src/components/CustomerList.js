import customers from '../customers.json';
import CustomerDetails from './CustomerDetails';
import CustomerForm from './CustomerForm';
import {Link,useNavigate} from 'react-router-dom';

function CustomerList(props) {
    let custs = customers;
    
const navigate = useNavigate();//Hook function
//let custt;
const onShowSelect=(customer)=>{
    navigate('/customerdetails',{state:customer});
  };

  const onEditAndDeleteSelect=(customer)=>{
    navigate('/deletecustomer',{state:customer});
  };


/**    const onCustomerSelect =(e,customer,flag) =>{
        console.log(flag);        
       // custt=customer;
        if(flag === 'edit' || flag ==='delete'){
            toCustomerFormEditAndDelete(customer)
        }else{
            toCustomerDetails(customer);
        }
        
        
    } */
/**
    const onShowSelect=(e,customer)=>{
        toCustomerDetails(customer);
    } 
    
    const onEditAndDeleteSelect=(e,customer)=>{
        toCustomerFormEditAndDelete(customer);
    }*/
    const tabRows = custs.map((cust,i)=>{
        return(
           
            <tr>
                <td>{cust.id}</td>
                <td>{cust.firstName}</td>
                <td>{cust.lastName}</td>
                <td>{cust.email}</td>
                <td><Link to ="/customerdetails" state={{cust}}>show</Link> <br /><Link to ={onEditAndDeleteSelect(cust)}> edit</Link> <Link to ={onEditAndDeleteSelect(cust)} >delete</Link></td>
            </tr>
        );
    });
    
    return ( 
        
        <div>
        <h1>Customer List</h1>
        <table class="table table-hover table-bordered table-sm">
                    <thead class="thead-light">
                        <tr>
                            <th>
                                Id
                            </th>
                            <th>
                                First Name
                            </th>
                            <th>
                            Last Name
                            </th>
                            <th>
                            Email
                            </th>
                            <th>
                            Actions
                            </th>
                        </tr>
                    </thead>
                    <tbody>
                        {tabRows}
                    </tbody>
                </table>
        
        
    </div>    
    );
    
}


export default CustomerList;