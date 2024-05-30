import {useLocation} from 'react-router-dom';
function CustomerDetails(props){
    const location = useLocation();//Hook Function
    
    return (
        <>
        <h1>Customer Details</h1>
                <label>ID : </label>{location.state.id}<br />
                <label>First Name : </label><div>{location.state.firstName}</div><br />
                <label>Last Name : </label><div>{location.state.lastName}</div><br />
                <label>Email : </label><div>{location.state.email}</div><br />
        </>
    );
}
export default CustomerDetails;