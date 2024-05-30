const sendDetailsToServer=(props)=>{
    let payload= {
        "email": props.email.toString(),
        "password":props.password.toString(),
        "userName": props.userName.toString(),
        "firstName":props.firstName.toString(),
        "lastName":props.lastName.toString(),
        "mobile":props.mobile.toString(),
        "dateOfBirth":props.dateOfBirth.toString()
        }
    console.log(payload);
}

export default sendDetailsToServer;