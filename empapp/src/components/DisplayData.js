/**
function DisplayData(){
    const employee ={
        firstName: "Amritha",
        lastName:"Kumari"
    }
    return (
        <>
            Hello Ms {employee.firstName} {employee.lastName}
        </>
    );
} */

function DisplayData(props){
    
    return (
        <>
            {/**Hello Mr {props.firstName} {props.lastName}*/}
            Hello Ms {props.employee.firstName} {props.employee.lastName}
        </>
    );
}
export default DisplayData;