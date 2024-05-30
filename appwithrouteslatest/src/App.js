import React from 'react';
import Home from "./components/Home";
import AboutUs from "./components/AboutUs";
import Errors from "./components/Errors";
import Navbar from "./components/Navbar";
import Login from "./components/Login";
import UserRegistration from "./components/UserRegistration";
import CustomerForm from "./components/CustomerForm";
import CustomerDetails from "./components/CustomerDetails";
import CustomerList from "./components/CustomerList";
import DeleteCustomer from "./components/DeleteCustomer";
import {BrowserRouter,Routes,Route} from 'react-router-dom';

function  App () {
        return (
            <BrowserRouter>
            <Routes>
                        <Route path="/" element={<Navbar />} />
                        <Route path="/home" element={<Home />} />
                        <Route path="/about" element={<AboutUs />}  />
                        <Route path="/login" element={<Login />}  />
                        <Route path="/register" element={<UserRegistration />}  />
                        <Route element={<Errors />} />
                        <Route path="/addCustomer" element={<CustomerForm />}  />
                        <Route path="/customerdetails" element={<CustomerDetails />}  />
                        <Route path="/customers" element={<CustomerList />}  />
                        <Route path="/deletecustomer" element={<DeleteCustomer />}  />
            </Routes>
            </BrowserRouter>
         
        )


}

export default App;