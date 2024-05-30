import EmpDirHeader from './EmpDirHeader';
import Search from './Search';
import EmployeeList from './EmployeeList';
function HomePage(){
    const name='Ramanujan';
    return (
        <>
        <p>Home Page</p>
        <EmpDirHeader />
        <Search />
        <EmployeeList />
        <p>Hello , Mr {name}</p>
        </>
    );
}

export default HomePage;