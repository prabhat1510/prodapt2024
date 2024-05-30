import HomePage from './components/HomePage';
import DisplayData from './components/DisplayData';
import Login from './components/Login';
import UserRegistration from './components/UserRegistration';
function App(){
    const emp ={
        firstName: "Amritha",
        lastName:"Kumari"
    }
    return (
        <>
            <p>Hello Emp App</p>
            {/**<HomePage />*/}
            {/**<DisplayData  firstName='Prabhat' lastName='Chandra'/>*/}
            <DisplayData  employee={emp}/>
            <Login />
            <UserRegistration />
        </>
    );
}

export default App;